<%@page import="com.example.servletjspdemo.domain.Druzyny"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Druzyny</title>
</head>
<body>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageTeams" scope="application" />

	<h2>Wszystkie druzyny:</h2>
	<%	
		for (Druzyny druzyny : storage.getAllDruzyny()) {
	  		out.println("<p>Druzyna: " + druzyny.getNazwa() + "<br/>Trener: " 
			+ druzyny.getTrener() + "<br/>Stadion: " + druzyny.getStadion() + 
			"<br/>Rok zalozenia: " + druzyny.getRok() + "<br/>Plec: " + druzyny.getPlec() + 
			"<br/>Kraj: " + druzyny.toString(druzyny.getKraj()) + "<br/>Komentarz:"+druzyny.getKomentarz() +
			"<br/>Osiagniecia: "+druzyny.toString(druzyny.getOsiagniecia()) + "</p><br/>");
  		}
		session.removeAttribute("druzyny");
	%>
	<form action="getDruzyny.jsp">
  		<input type="submit" value="dodaj nowego">
  	</form>
	<form action="indexdruzyny.jsp">
  		<input type="submit" value="wroc">
  	</form>
</body>
</html>