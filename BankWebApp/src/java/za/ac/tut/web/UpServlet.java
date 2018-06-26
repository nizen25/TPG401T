/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.jrs.NewJerseyClient;
import za.ac.jrs.client.NewJerseyClient4;

/**
 *
 * @author student
 */
public class UpServlet extends HttpServlet {

    NewJerseyClient4 client = new NewJerseyClient4();
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        
        String userr = client.find_JSON(String.class, id);
        
        System.out.println("User that is about to get Updated : " + userr);
        
        HttpSession session = request.getSession();
        session.setAttribute("userr", userr);
        
        
        
        RequestDispatcher dis = request.getRequestDispatcher("/update.jsp");
        dis.forward(request, response);
        
    }

   
}
