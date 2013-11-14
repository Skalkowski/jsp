<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<jsp:setProperty name="person" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<% 
  storage.add(person);
%>

<p>Following person has been added to storage: </p>
<p>First name: ${person.firstName} </p>
<p>Last name: ${person.lastName}</p>
<p>Plec: ${person.plec}</p>
<p>Year of birth: <jsp:getProperty name="person" property="yob"></jsp:getProperty></p>

<form action="showAllPersons.jsp">
	<input type="submit" value="zobacz wszystki">
</form>
  <form action="getPersonData.jsp">
  	<input type="submit" value="Popraw">
  </form>

</body>
</html>