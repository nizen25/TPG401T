/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

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
import za.ac.jrs.NewJerseyClient;
import za.ac.jrs.client.NewJerseyClient4;

/**
 *
 * @author student
 */
public class AddServlet extends HttpServlet {

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
        String name = request.getParameter("name");
        String surname =  request.getParameter("surname");
        Long id = Long.parseLong(request.getParameter("id"));
        
        String status = "false";
        
        try {
            String userr = generateUser(id,name,surname,status);
            client.create_JSON(userr);
            RequestDispatcher dis = request.getRequestDispatcher("/done.jsp");
            dis.forward(request, response);
        } catch (JSONException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateUser(Long id, String name, String surname, String status) throws JSONException {
        JSONObject user =  new JSONObject();
        user.put("id",id);
        user.put("name", name);
        user.put("surname",surname);
        user.put("status", status);
        
        
        return user.toString();
    }

   
}
