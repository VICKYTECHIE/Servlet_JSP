<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
     <%
       if(session.getAttribute("uname")==null){
           response.sendRedirect("Login.jsp");
       }
       else{
            out.print("Welcome everyOne..........");
          }
          %>
          <form action ="logout" method="post">
          <br>
          <input type="submit" value="logout">
          </form>


 </body>
   </html>