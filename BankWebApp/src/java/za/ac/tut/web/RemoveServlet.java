/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
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
public class RemoveServlet extends HttpServlet {
    NewJerseyClient4 client = new NewJerseyClient4();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
        
        
        
        System.out.println("Id : " +id);
       
        client.remove(id);
        
        String userrs = client.findAll_JSON(String.class);
        
        HttpSession session = request.getSession();
        session.setAttribute("userrs", userrs);
        
        RequestDispatcher dis = request.getRequestDispatcher("/view.jsp");
        dis.forward(request, response);
    }

    

    
}
