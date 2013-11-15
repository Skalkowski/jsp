<%@page import="com.example.servletjspdemo.domain.Druzyny.OsiagnieciaEnum"%>
<%@page import="com.example.servletjspdemo.domain.Druzyny.KrajEnum"%>
<%@page import="com.example.servletjspdemo.domain.Druzyny.PlecEnum"%>

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
<jsp:useBean id="druzyny" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<jsp:useBean id="plec" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<jsp:useBean id="osiagniecia" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<jsp:useBean id="kraj" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<jsp:useBean id="komentarz" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
	
	<h2>Dodanie druzyny</h2>
	<form action="getDruzynyTemp.jsp" method="get">
		kraj: <br/>
		<select size="3" name="kraj" multiple="multiple">
  		<%
  			for (KrajEnum e: KrajEnum.values())
  				out.print("<option value=" + e.toString() + ">" + e.toString() + "</option>");
		%>
		</select>
		<br/>Plec druzyny:<br/>
  		<%
      		for(PlecEnum e: PlecEnum.values())         
      		out.print("<input type='radio' name='plec' value=" + e.toString() + ">" + e.toString() + "<br />");
      	%>
	
	
	
  		Nazwa druzyny :<input type="text" name="nazwa" value="${druzyny.nazwa}" /><br/>
  		Trener :<input type="text" name="trener" value="${druzyny.trener}" /><br/>
  		Stadion :<input type="text" name="stadion" value="${druzyny.stadion}" /> <br/>
  		Rok zalozenia :<input type="text"  name="rok" value="${druzyny.rok}" /><br/>
  		
  		
  		
  		
  		Osiagncia:<br/>
  		<%
    		for(OsiagnieciaEnum e: OsiagnieciaEnum.values())         
      			out.print("<input type='checkbox' name='osiagniecia' value=" + e.toString() + ">" + e.toString() +"<br /> ");
     	%>
  	
  		
  		 <br /> 
			
			
			<textarea name="komentarz" rows="10" cols="90" >
				${druzyny.komentarz}
			</textarea>
		<br />
  		
  		
  <input type="submit" value=" OK ">
  
</form>
	
	<form action="indexdruzyny.jsp">
  		<input type="submit" value="wroc">
  	</form>
</body>
</html>