<%-- 
    Document   : apply
    Created on : 06 Jun 2018, 11:37:55 PM
    Author     : sydney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apply for loan</title>
    </head>
    <body>
        <h1>Loan Application</h1>
        <form method="POST" action="ApplyServlet.do">
            <table>
                <tr>
                    <td>Customer Number</td>
                    <td><input type="text" name="id" required="" /></td>
                </tr>
                
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" required="" /></td>
                </tr>
                
                <tr>
                    <td>Surname</td>
                    <td><input type="text" name="surname" required="" /></td>
                </tr>
                
                <tr>
                    <td>ID Number</td>
                    <td><input type="text" name="idno" required="" /></td>
                </tr>
                
                <tr>
                    <td>Loan Amount</td>
                    <td><input type="text" name="loanAmount" required="" /></td>
                </tr>
                
            </table>
            <input type="submit" value="SUBMIT" />
        </form>
    </body>
</html>
