/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.service;

import com.org.anc.entities.Email;
import com.org.anc.entities.Member;
import com.sun.net.ssl.internal.ssl.Provider;
import java.util.List;
import java.util.Properties;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sydney
 */
@Stateless
@Path("ANCPartyRESTService")
public class MemberFacadeREST extends AbstractFacade<Member> {

    @PersistenceContext(unitName = "ANCPartyRESTServicePU")
    private EntityManager em;

    public MemberFacadeREST() {
        super(Member.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Member entity) {
        super.create(entity);
        Email email = (Email) entity.getEmails().get(0);
        sendEmail(email);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Member entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Member find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Member> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Member> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    private void sendEmail(Email email) {
        final String host = "smtp.gmail.com";
        final String user = "bs.molobela@gmail.com";
        String from = user;
        final String to = email.getEmailId();
        final String pass = "Syd639@nizen";
        final String subject = "Account Confirmation";
        final String body = "Hello, this is confirmation that your account has successfully been registered.\n\nBest regards,\nANC Admins.";
        final boolean sessionDebug = false;
        
        Properties properties = System.getProperties();
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.required", "true");
        
        java.security.Security.addProvider(new Provider());
        final Session session = Session.getDefaultInstance(properties, null);
        session.setDebug(sessionDebug);
        Message message = new MimeMessage(session);
        
        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress address = (new InternetAddress(to));
            message.setRecipient(Message.RecipientType.TO, address);
            message.setSubject(subject);
            message.setText(body);

            final Transport transport = session.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent successfully.");
        } catch (AddressException ae){
            System.out.println("Address Exception occurred!" + ae.getCause());
        } catch (MessagingException me){
            System.out.println("Messaging Exception occurred!" + me.getCause());
        }
    }
}
