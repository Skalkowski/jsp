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
	<form action="addDruzyny.jsp" method="get">
		kraj: <br/>
  		<select name="kraj" size="3" multiple = "multiple">
        <option value="Polska">Polska</option>
        <option value="Niemcy">Niemcy</option>
        <option value="Anglia">Anglia</option>
        <option value="Hiszpania">Hiszpania</option>
      	</select>
		
		
		<br/>Plec druzyny:<br/>
  		<input type="radio" name="plec" value="meska">Meska druzyna<br/>
  		<input type="radio" name="plec" value="kobieca">Kobieca druzyna<br/>
	
	
	
  		Nazwa druzyny :<input type="text" name="nazwa" value="${druzyny.nazwa}" /><br/>
  		Trener :<input type="text" name="trener" value="${druzyny.trener}" /><br/>
  		Stadion :<input type="text" name="stadion" value="${druzyny.stadion}" /> <br/>
  		Rok zalozenia :<input type="text"  name="rok" value="${druzyny.rok}" /><br/>
  		
  		
  		
  		
  		Osiagncia:<br/>
  		<input type="checkbox" name="osiagniecia" value="Mistrzostwo kraju">Mistrzostwo kraju<br/>
  		<input type="checkbox" name="osiagniecia" value="Puchar kraju">Puchar kraju<br/>
  		<input type="checkbox" name="osiagniecia" value="Puchar Ligi Europejskiej">Puchar Ligi Europejskiej<br/>
  		<input type="checkbox" name="osiagniecia" value="Puchar Ligi Mistrzow">Puchar Ligi Mistrzow<br/>
  		
  	
  		
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