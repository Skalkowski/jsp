package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class potwierdzenie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Druzyny!!!</title>\n");
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
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("druzyny"), request);
      out.write(' ');
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny druzyny = null;
      synchronized (session) {
        druzyny = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("druzyny", PageContext.SESSION_SCOPE);
        if (druzyny == null){
          druzyny = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("druzyny", druzyny, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<h2>Dane ktore wprowadziles:</h2>\n");
      out.write("\t\n");
      out.write("\t<p>Nazwa druzyny: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.nazwa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("\t<p>Trener: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.trener}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("\t<p>Stadion: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.stadion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \t\n");
      out.write("\t<p>Rok założenia: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.rok}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t<p>Plec druzyny: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.plec}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("\t<p>Zdobyte osiagniecia:  ");
 out.println(druzyny.toString(druzyny.getOsiagniecia())); 
      out.write("</p>\n");
      out.write("\t<p>Kraj: ");
 out.println(druzyny.toString(druzyny.getKraj())); 
      out.write("</p>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<p>Komentarz: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.komentarz}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t<form action=\"showAllDruzyny.jsp\" method=\"get\">\n");
      out.write("\t\t");
storage.add(druzyny); 
      out.write("\n");
      out.write(" \t\t<input type=\"submit\" value=\"pokaz wszystko\">  \n");
      out.write("\t</form>\n");
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
