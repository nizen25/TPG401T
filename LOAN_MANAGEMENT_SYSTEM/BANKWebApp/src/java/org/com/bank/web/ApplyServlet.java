/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.bank.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.com.bank.client.BankRESTClient;

/**
 *
 * @author sydney
 */
public class ApplyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final BankRESTClient client = new BankRESTClient();
        
        final Long id = Long.parseLong(request.getParameter("id"));
        final String name = request.getParameter("name");
        final String surname = request.getParameter("surname");
        final Long idNumber = Long.parseLong(request.getParameter("idno"));
        final Double amount = Double.parseDouble(request.getParameter("loanAmount"));
        
        try {
            final String customerXML = generateCustomerXML(id, name, surname, idNumber, amount);
            System.out.println("XML: " + customerXML);
            client.create_XML(customerXML);
        } catch (Exception ex) {
            Logger.getLogger(ApplyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateCustomerXML(Long id, String name, String surname, Long idNumber, Double amount) throws Exception {
        final String customerXML="<customer>" +
                             "<id>"+ id +"</id>" +
                             "<name>"+ name +"</name>" +
                             "<surname>"+ surname +"</surname>" +
                             "<idNumber>"+ idNumber +"</idNumber>" +
                             "<loanAmount>"+ amount +"</loanAmount>" +
                           "</customer>";
        return customerXML;
    }

}
