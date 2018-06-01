/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sydney
 */
public class NominateServlet extends HttpServlet {

    private final String IS_NOMINEE = "YES";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        final String memberNumber = request.getParameter("memberNumber");
        final String member = client.find_JSON(String.class, memberNumber);
        try {
            final String memberJSON = generateJSON(member);
            client.edit_JSON(memberJSON, memberNumber);
            request.setAttribute("member", client.find_JSON(String.class, memberNumber));
            final RequestDispatcher dispatcher = request.getRequestDispatcher("/WelcomeServlet.do");
            dispatcher.forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(NominateServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateJSON(String memberJSON) throws JSONException {
        JSONObject member = new JSONObject(memberJSON);
        if (!member.getString("isNominee").equals(IS_NOMINEE)) {
            member.put("isNominee", IS_NOMINEE); 
        }
        int nomitationCount = (Integer) member.getInt("nomitationCount") + 1;
        member.put("nomitationCount", nomitationCount);
        return member.toString();
    }

}
