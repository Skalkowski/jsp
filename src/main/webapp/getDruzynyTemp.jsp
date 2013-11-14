<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Druzyny!!!</title>
</head>
<body>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageTeams" scope="application" />
<jsp:setProperty name="druzyny" property="*" /> 
<jsp:useBean id="druzyny" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<h2>Dane ktore wprowadziles:</h2>
	<form action="showAllDruzyny.jsp" method="get">
	<p>Nazwa druzyny: ${druzyny.nazwa}</p> 
	<p>Trener: ${druzyny.trener} </p>
	<p>Stadion: ${druzyny.stadion}</p> 	
	<p>Rok założenia: ${druzyny.rok}</p>
	<p>Plec druzyny: ${druzyny.plec}</p> 
	<p>Zdobyte osiagniecia:  <% out.println(druzyny.toString(druzyny.getOsiagniecia())); %></p>
	<p>Kraj: <% out.println(druzyny.toString(druzyny.getKraj())); %></p>
	
	
	
	<p>Komentarz: ${druzyny.komentarz}</p>
	
	<%storage.add(druzyny); %>
	
	<input type="submit" value="zobacz wszystki">
	</form>
	
	<form action="indexdruzyny.jsp">
  		<input type="submit" value="wroc">
  	</form>
</body>
</html>