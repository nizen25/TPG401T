<%-- 
    Document   : update
    Created on : 23 Jun 2018, 8:24:26 PM
    Author     : student
--%>

<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
          String userrr = (String)session.getAttribute("userr");
          JSONObject userr = new JSONObject(userrr);
          
           Long id = userr.getLong("id");
           String name = userr.getString("name");
           String surname = userr.getString("surname");
           Boolean status = userr.getBoolean("status");
           
           
           
            
            
            
        %>   
        <table border="1">
        <form action="UpdateServlet.do" method="POST">
            
            <tr>
                <td> ID </td>
                <td><input type="text" value="<%=id%>" name="id"></td>
                
            </tr>
             <tr>
                <td> Name </td>
                <td><input type="text" value="<%=name%>" name="name"></td>
                
            </tr>
            <tr>
                <td> Surname </td>
                <td><input type="text" value="<%=surname%>" name="surname"></td>
                
            </tr>
            <tr>
                <td> Status </td>
                <td><input type="text" value="<%=status%>" name="status"></td>
                
            </tr>
            
            <tr>
                <td><input type="submit" value="update"></td>
            </tr> 
            
            
        </form>
                
                
        </table>
                
                <p> User was added click <a href="index.html">here</a> to go back to home.</p>        
        
    </body>
</html>
