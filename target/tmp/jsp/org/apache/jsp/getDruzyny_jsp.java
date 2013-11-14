package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getDruzyny_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      com.example.servletjspdemo.service.StorageTeams storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageTeams) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageTeams();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny druzyny = null;
      synchronized (session) {
        druzyny = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("druzyny", PageContext.SESSION_SCOPE);
        if (druzyny == null){
          druzyny = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("druzyny", druzyny, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny plec = null;
      synchronized (session) {
        plec = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("plec", PageContext.SESSION_SCOPE);
        if (plec == null){
          plec = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("plec", plec, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny osiagniecia = null;
      synchronized (session) {
        osiagniecia = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("osiagniecia", PageContext.SESSION_SCOPE);
        if (osiagniecia == null){
          osiagniecia = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("osiagniecia", osiagniecia, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny kraj = null;
      synchronized (session) {
        kraj = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("kraj", PageContext.SESSION_SCOPE);
        if (kraj == null){
          kraj = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("kraj", kraj, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Druzyny komentarz = null;
      synchronized (session) {
        komentarz = (com.example.servletjspdemo.domain.Druzyny) _jspx_page_context.getAttribute("komentarz", PageContext.SESSION_SCOPE);
        if (komentarz == null){
          komentarz = new com.example.servletjspdemo.domain.Druzyny();
          _jspx_page_context.setAttribute("komentarz", komentarz, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\n");
      out.write("\t<h2>Dodanie druzyny</h2>\n");
      out.write("\t<form action=\"addDruzyny.jsp\" method=\"get\">\n");
      out.write("\t\tkraj: <br/>\n");
      out.write("  \t\t<select name=\"kraj\" size=\"3\" multiple = \"multiple\">\n");
      out.write("        <option value=\"Polska\">Polska</option>\n");
      out.write("        <option value=\"Niemcy\">Niemcy</option>\n");
      out.write("        <option value=\"Anglia\">Anglia</option>\n");
      out.write("        <option value=\"Hiszpania\">Hiszpania</option>\n");
      out.write("      \t</select>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<br/>Plec druzyny:<br/>\n");
      out.write("  \t\t<input type=\"radio\" name=\"plec\" value=\"meska\">Meska druzyna<br/>\n");
      out.write("  \t\t<input type=\"radio\" name=\"plec\" value=\"kobieca\">Kobieca druzyna<br/>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("  \t\tNazwa druzyny :<input type=\"text\" name=\"nazwa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.nazwa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br/>\n");
      out.write("  \t\tTrener :<input type=\"text\" name=\"trener\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.trener}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br/>\n");
      out.write("  \t\tStadion :<input type=\"text\" name=\"stadion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.stadion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br/>\n");
      out.write("  \t\tRok zalozenia :<input type=\"text\"  name=\"rok\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.rok}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /><br/>\n");
      out.write("  \t\t\n");
      out.write("  \t\t\n");
      out.write("  \t\t\n");
      out.write("  \t\t\n");
      out.write("  \t\tOsiagncia:<br/>\n");
      out.write("  \t\t<input type=\"checkbox\" name=\"osiagniecia\" value=\"Mistrzostwo kraju\">Mistrzostwo kraju<br/>\n");
      out.write("  \t\t<input type=\"checkbox\" name=\"osiagniecia\" value=\"Puchar kraju\">Puchar kraju<br/>\n");
      out.write("  \t\t<input type=\"checkbox\" name=\"osiagniecia\" value=\"Puchar Ligi Europejskiej\">Puchar Ligi Europejskiej<br/>\n");
      out.write("  \t\t<input type=\"checkbox\" name=\"osiagniecia\" value=\"Puchar Ligi Mistrzow\">Puchar Ligi Mistrzow<br/>\n");
      out.write("  \t\t\n");
      out.write("  \t\n");
      out.write("  \t\t\n");
      out.write("  \t\t <br /> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<textarea name=\"komentarz\" rows=\"10\" cols=\"90\" >\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${druzyny.komentarz}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t</textarea>\n");
      out.write("\t\t<br />\n");
      out.write("  \t\t\n");
      out.write("  \t\t\n");
      out.write("  <input type=\"submit\" value=\" OK \">\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("\t\n");
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
