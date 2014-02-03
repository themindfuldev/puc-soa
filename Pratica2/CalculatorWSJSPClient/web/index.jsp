<%-- 
    Document   : index
    Created on : 09/04/2012, 20:50:34
    Author     : 37287
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.calculator.CalculatorWSService service = new org.me.calculator.CalculatorWSService();
	org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
	 // TODO initialize WS operation arguments here
	int i = 3;
	int j = 4;
	// TODO process result here
	int result = port.add(i, j);
	out.println("Result = "+result);
    } catch (Exception ex) {
	out.println("exception: " + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
