/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sydney
 */
public class EditMemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        
        final String memberNumber = request.getParameter("memberNumber");
        final String memberJSON = client.find_JSON(String.class, memberNumber);
        request.setAttribute("memberJSON", memberJSON);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit_member.jsp");
        dispatcher.forward(request, response);
    }

}
