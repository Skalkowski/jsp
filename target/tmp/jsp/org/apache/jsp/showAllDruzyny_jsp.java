package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.servletjspdemo.domain.Druzyny;

public final class showAllDruzyny_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Druzyny</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      com.example.servletjspdemo.service.StorageTeams storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageTeams) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageTeams();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\t<h2>Wszystkie druzyny:</h2>\n");
      out.write("\t");
	
		for (Druzyny druzyny : storage.getAllDruzyny()) {
	  		out.println("<p>Druzyna: " + druzyny.getNazwa() + "<br/>Trener: " 
			+ druzyny.getTrener() + "<br/>Stadion: " + druzyny.getStadion() + 
			"<br/>Rok zalozenia: " + druzyny.getRok() + "<br/>Plec: " + druzyny.getPlec() + 
			"<br/>Kraj: " + druzyny.toString(druzyny.getKraj()) + "<br/>Komentarz:"+druzyny.getKomentarz() +
			"<br/>Osiagniecia: "+druzyny.toString(druzyny.getOsiagniecia()) + "</p><br/>");
  		}
		session.removeAttribute("druzyny");
	
      out.write("\n");
      out.write("\t<form action=\"getDruzyny.jsp\">\n");
      out.write("  \t\t<input type=\"submit\" value=\"dodaj nowego\">\n");
      out.write("  \t</form>\n");
      out.write("\t<form action=\"indexdruzyny.jsp\">\n");
      out.write("  \t\t<input type=\"submit\" value=\"wroc\">\n");
      out.write("  \t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
