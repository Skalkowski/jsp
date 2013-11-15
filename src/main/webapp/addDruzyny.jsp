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
<jsp:setProperty name="druzyny" property="*" /> 
<jsp:useBean id="druzyny" class="com.example.servletjspdemo.domain.Druzyny" scope="session" />
<h2>Dane ktore wprowadziles:</h2>
	<form action="getDruzynyTemp.jsp" method="get">
		Nazwa druzyny :<input type="text" name="nazwa" value="${druzyny.nazwa}" /><br/>
  		Trener :<input type="text" name="trener" value="${druzyny.trener}" /><br/>
  		Stadion :<input type="text" name="stadion" value="${druzyny.stadion}" /> <br/>
  		Rok zalozenia :<input type="text"  name="rok" value="${druzyny.rok}" /><br/>
  		<p>Plec:</p>
  		<%
      		String temp = druzyny.getPlec();
			for(PlecEnum e: PlecEnum.values()){
          	if(e.toString().equals(temp))
         		out.println("<input type='radio' name='plec' value=" + e.toString() + " CHECKED >" + e.toString() + "<br />");
          	else
             	out.println("<input type='radio' name='plec' value=" + e.toString() + ">" + e.toString() + "<br />");
                                }
      	%>
  		<br/>
	<p>Zdobyte osiagniecia:</p>
	<%
  	String[] osia = druzyny.getOsiagniecia();
	boolean jest = false;
	for (OsiagnieciaEnum e : OsiagnieciaEnum.values()) {
   		for (int i = 0; i < osia.length; i++)
    		if (osia[i].equals(e.toString())) {
         		out.print("<input type='checkbox' name='osiagniecia' value=" + e.toString() + " CHECKED>" + e.toString() + "<br /> ");
                jest = true;
         	}
            if (!jest)
          		out.print("<input type='checkbox' name='osiagniecia' value=" + e.toString() + ">" + e.toString() + "<br /> ");
				jest = false;
         	}
   	%>
	<p>Kraj:<br/>
	<select size="3" name="kraj" multiple="multiple">
	<%
 		boolean jest2 = false;
     	String[] cap = druzyny.getKraj();
		for (KrajEnum e : KrajEnum.values()) {
   			for (int i = 0; i < cap.length; i++)
          		if (cap[i].equals(e.toString())) {
              		out.print("<option SELECTED value=" + e.toString() + ">" + e.toString() + "</option>");
                    jest2 = true;
           		}
				if (!jest2)
             		out.print("<option value=" + e.toString() + ">" + e.toString() + "</option>");
					jest2 = false;

    	}
 	%>
 	</select>
 	<br/>
	
	</p>
	<p>Komentarz:</p>
	<textarea name="komentarz" rows="10" cols="90" >
				${druzyny.komentarz}
	</textarea>
	<br/>
	<input type="submit" value="potwierdz">
	</form>
	
	
	
	<form action="indexdruzyny.jsp">
  		<input type="submit" value="wroc">
  	</form>
</body>
</html>