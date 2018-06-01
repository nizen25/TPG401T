/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.web;

import com.org.anc.client.ANCRestClient;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sydney
 */
@WebServlet(name = "AllDelegatesServlet", urlPatterns = {"/AllDelegatesServlet.do"})
public class AllDelegatesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        String memberJSON = client.findAll_JSON(String.class);
        request.setAttribute("memberJSON", memberJSON);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/widgets.jsp"); //all_delegates.jsp
        dispatcher.forward(request, response);
    }

}
