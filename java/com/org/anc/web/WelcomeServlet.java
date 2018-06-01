/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
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
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ANCRestClient client = new ANCRestClient();
        String memberNumer = request.getSession().getAttribute("memNo").toString();
        System.out.println("NUM: " + memberNumer);
        String memberJSON = client.find_JSON(String.class, memberNumer);
        request.setAttribute("memberJSON", memberJSON);
        try {
            request.getSession().setAttribute("name", getName(memberJSON));
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome_user.jsp");
        dispatcher.forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(WelcomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Object getName(String memberJson) throws JSONException {
        JSONObject member = new JSONObject(memberJson);
        return member.get("name").toString();
    }
}
