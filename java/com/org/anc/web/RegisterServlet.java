/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import com.org.anc.client.NewJerseyClient;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import za.ac.dha.validator.DepartmentSOAPTransformer_Service;
import za.ac.dha.validator.ExceptionException;

/**
 *
 * @author sydney
 */
public class RegisterServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/Lesego_8080/DepartmentSOAPTransformer/DepartmentSOAPTransformer.wsdl")
    private DepartmentSOAPTransformer_Service service;

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        final Long   id = Long.parseLong(request.getParameter("id"));
        final String name = request.getParameter("name");
        final String surname = request.getParameter("surname");
        final String[] cells = request.getParameterValues("cells");
        final String[] emails = request.getParameterValues("emails");
        final String street = request.getParameter("street");
        final String code = request.getParameter("code");
        final String area = request.getParameter("area");
        final String password = request.getParameter("password");
        final String idNumber = request.getParameter("idNumber");
        Long idd = Long.parseLong(idNumber);
        final String role = "USER";
        
        try {
            boolean status =  fowardPerson(idd);
            
            if(status)
            {
                    final String memberJSON = generateMemberJSON(id, name, surname, cells, street, code, area, emails, password, idNumber, role);
                    client.create_JSON(memberJSON);
                    final RequestDispatcher dispatcher = request.getRequestDispatcher("loginn.jsp");
                    System.out.print("Status found!");
                    request.setAttribute("success", "Successfuly reguistered!");
                    dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("error", "ID does not exist. Please enter a valid SOuth African ID.");
                final RequestDispatcher dispatcher = request.getRequestDispatcher("add_member.html");
                System.out.print("Status not found!");
                dispatcher.forward(request, response);
            }
        } catch (JSONException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExceptionException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    private String generateMemberJSON(Long id, String name, String surname, String[] cellNos, String street, String code, String area, String[] emails, 
            String password, String idNumber, String role) throws JSONException {
        JSONObject member = new JSONObject();
        member.put("id", id);
        member.put("name", name);
        member.put("surname", surname);
        member.put("historyDate", new Date().toString());
        member.put("idNumber", idNumber);
        member.put("isNominee", "NO");
        member.put("isDelegate", "NO");
        member.put("nomitationCount", 0);
        
        JSONObject address = new JSONObject();
        address.put("street", street);
        address.put("area", area);
        address.put("code", code);
        member.put("address", address);
        
        JSONObject login = new JSONObject();
        login.put("username", id);
        login.put("password", password);
        login.put("role", role);
        member.put("login", login);
        
        JSONArray cells = new JSONArray();
        for (String cellNo : cellNos) {
            JSONObject cell = new JSONObject();
            cell.put("cellNo", cellNo);
            cells.put(cell);
        }
        member.put("cells", cells);
        
        JSONArray emailAddresses = new JSONArray();
        for (String emailId : emails) {
            JSONObject emailObj = new JSONObject();
            emailObj.put("emailId", emailId);
            emailAddresses.put(emailObj);
        }
        member.put("emails", emailAddresses);
        return member.toString();
    }

    private boolean fowardPerson(java.lang.Long id) throws ExceptionException {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.dha.validator.DepartmentSOAPTransformer port = service.getDepartmentSOAPTransformerPort();
        return port.fowardPerson(id);
    }
    
    
}