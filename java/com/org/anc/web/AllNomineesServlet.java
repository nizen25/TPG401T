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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sydney
 */
public class AllNomineesServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ANCRestClient client = new ANCRestClient();
        String nomineesJSON = client.findAll_JSON(String.class);
        request.setAttribute("nomineesJSON", nomineesJSON);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/widgets2.jsp"); //all_nominees.jsp
        dispatcher.forward(request, response);
     }
}
