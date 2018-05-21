/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sydney
 */
public class RegisterServlet extends HttpServlet {

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
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        System.out.println("PASS: " + password);
        try {
            final String memberJSON = generateMemberJSON(id, name, surname, cells, street, code, area, emails, username, password);
            System.out.println("JSON: " + memberJSON);
            client.create_JSON(memberJSON);
            final RequestDispatcher dispatcher = request.getRequestDispatcher("registration_success.jsp");
            dispatcher.forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    private String generateMemberJSON(Long id, String name, String surname, String[] cellNos, String street, String code, String area, String[] emails, String username, String password) throws JSONException {
        JSONObject member = new JSONObject();
        member.put("id", id);
        member.put("name", name);
        member.put("surname", surname);
        member.put("username", username);
        member.put("password", password);
        member.put("historyDate", new Date().toString());
        
        JSONObject address = new JSONObject();
        address.put("street", street);
        address.put("area", area);
        address.put("code", code);
        member.put("address", address);
        
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
        System.out.println("MEMBER: " + member);
        return member.toString();
    }

}
