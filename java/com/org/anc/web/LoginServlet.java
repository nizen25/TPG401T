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
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sydney
 */
public class LoginServlet extends HttpServlet {

    private final String ROLE_USER = "USER";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        
        final String loginObj = client.login_JSON(String.class, username, password);
        RequestDispatcher dispatcher;
        
        try {
            if (loginObj != null && !loginObj.equals("")) {
                String memberJson = client.findAll_JSON(String.class);
                HttpSession session = request.getSession();
                String memberJSONObject = client.find_JSON(String.class, username);
                session.setAttribute("name", getName(memberJSONObject));
                request.setAttribute("errorMessage", null);
                request.setAttribute("memberJSON", memberJSONObject);
                session.setAttribute("memNo", getMemNo(client.find_JSON(String.class, username)));
                
                request.getSession().setAttribute("memCount", generateMembers(memberJson));
                request.getSession().setAttribute("admCount", generateAdmin(memberJson));
                final String role = getRole(loginObj);
                System.out.println("R: " + role);
                if (role.equals(ROLE_USER)) {
                    dispatcher = request.getRequestDispatcher("welcome_user.jsp");
                    dispatcher.forward(request, response);
                } else{
                    dispatcher = request.getRequestDispatcher("index_1.jsp");
                    dispatcher.forward(request, response);
                }
            } else {
                request.setAttribute("errorMessage", "Invalid login credentials entered!");
                dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            }
        } catch (JSONException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getRole(String loginObj) throws JSONException {
        final JSONObject login = new JSONObject(loginObj);
        return login.getString("role");
    }

    private Object getName(String memberJson) throws JSONException {
        JSONObject member = new JSONObject(memberJson);
        return member.get("name").toString();
    }
    
    private Object getMemNo(String memberJson) throws JSONException {
        JSONObject member = new JSONObject(memberJson);
        return member.get("id");
    }
    
    
     private String generateMembers(String memberJson) throws JSONException {
        
        JSONArray array = new JSONArray(memberJson);
        int adminCount = 0;
        for (int i = 0; i < array.length(); i++) {
            JSONObject member = array.getJSONObject(i);
            if(member.getJSONObject("login").getString("role").equals("USER")){
                adminCount = adminCount + 1;
            }
        }
        return adminCount + "";
    }
     
     private String generateAdmin(String memberJson) throws JSONException {
        
        JSONArray array = new JSONArray(memberJson);
        int adminCount = 0;
        for (int i = 0; i < array.length(); i++) {
            JSONObject member = array.getJSONObject(i);
            if(member.getJSONObject("login").getString("role").equals("ADMIN")){
                adminCount = adminCount + 1;
            }
        }
        return adminCount + "";
    } 
}
