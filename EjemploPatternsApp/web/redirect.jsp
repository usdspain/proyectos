<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page import="pojo.Customer"%>
<%@page import="java.util.List"%>
<%@page import="FaCADE.CustomerFacade"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--% response.sendRedirect("index.htm"); %-->
<html>
    
    <head><title>Hola customer</title></head>
    <body>
        <h1>Customers</h1>
        <%
            CustomerFacade customerFacade= new CustomerFacade();
            List<Customer> customers= customerFacade.getListaCliente();            
        %>
        <%for (Customer c: customers){%>
        <p><%= c.getName() +"Has vist que guapo!!"%>  </p><!--  -->         
       <% }%>
        <% out.print("yeeeeeeeeeeeeeeeeee manolo!!!"); %>
        
    </body>
</html>
