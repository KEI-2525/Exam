<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../header.html" %>

<%
	int x =(int) (Math.random() *5);
	String[] unsei = {"大吉","吉","中吉","小吉","凶"};
%>


<h1><%=unsei[x] %></h1>



<%@include file="../footer.html" %>