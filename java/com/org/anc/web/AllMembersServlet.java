/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
import java.net.IDN;
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
public class AllMembersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        final String memberNumber = request.getParameter("memberNumber");
        String exclusionJSON = client.find_JSON(String.class, memberNumber);
        
        String membersJSON = client.findAll_JSON(String.class);
        try {
            String finalJSON = finalizeJSON(membersJSON, exclusionJSON);
            request.setAttribute("finalJSON", finalJSON);
            request.getSession().setAttribute("memNo", memberNumber);
            RequestDispatcher dispatcher = request.getRequestDispatcher("pages/widgets3.jsp");//all_members.jsp
            dispatcher.forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(AllMembersServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private String finalizeJSON(String membersJSON, String exclusionJSON) throws JSONException {
        JSONArray members = new JSONArray(membersJSON);
        for (int i = 0; i < members.length(); i++) {
            JSONObject currObj = members.getJSONObject(i);
            long id = currObj.getLong("id");
            JSONObject exclusionObj = new JSONObject(exclusionJSON);
            long excId = exclusionObj.getLong("id");  
            if (id == excId) {
                members.remove(i);
            }
        }
        return members.toString();
    }

}
