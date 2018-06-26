<%-- 
    Document   : done
    Created on : May 22, 2018, 12:54:10 AM
    Author     : leseg
--%>

<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        <%
         String userss = (String)session.getAttribute("userrs");
         JSONArray array = new JSONArray(userss);
         
         
         for(int i = 0; i<array.length();i++)
         {
            JSONObject jSONObject = array.getJSONObject(i);
            
            Long id = jSONObject.getLong("id");
            String name = jSONObject.getString("name");
            String surname = jSONObject.getString("surname");
            String status = jSONObject.getString("status");
            String  idd = id.toString();
       %> 
       
       
       <table border="1">
           <tr>
               <td>ID :</td>
               <td><input type="text" value="<%=id%>"</td>
           </tr>
          
           <tr>
               <td>Name :</td>
               <td><input type="text" value="<%=name%>"</td>
           </tr>
           <tr>
               <td>Surname :</td>
               <td><input type="text" value="<%=surname%>"</td>
           </tr>
           <tr>
               <td>Status :</td>
               <td><input type="text" value="<%=status%>"</td>
           </tr>
           <tr>
           <td><form action="RemoveServlet.do" method="POST">
                  <input type="hidden" value="<%=id%>" name="id">
                  <input type="submit" value="remove">
               </form>
           </td>
           </tr>
           
           
           <tr>
           <td><form action="UpServlet.do" method="POST">
                  <input type="hidden" value="<%=id%>" name="id">
                  
                  <input type="submit" value="update">
               </form>
           </td>
           </tr>
           
           
          
           <p>------------------------------</p>
       </table>
       
       <%}%>
    </body>
</html>
