package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_menu_0(_jspx_page_context))
        return;
      out.write("</div>");
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

  private boolean _jspx_meth_menu_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.menu_tagx.class) : new org.apache.jsp.tag.web.menu.menu_tagx();
    _jspx_th_menu_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_menu_0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    _jspx_th_menu_menu_0.setId("_menu");
    _jspx_th_menu_menu_0.setJspBody(new menu_jspxHelper( 0, _jspx_page_context, _jspx_th_menu_menu_0, null));
    _jspx_th_menu_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_0.setParent(_jspx_parent);
    _jspx_th_menu_category_0.setZ("yTpmmNMm/hWoy3yf+aPcdUX2At8=");
    _jspx_th_menu_category_0.setId("c_base");
    _jspx_th_menu_category_0.setJspBody(new menu_jspxHelper( 1, _jspx_page_context, _jspx_th_menu_category_0, null));
    _jspx_th_menu_category_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_0.setParent(_jspx_parent);
    _jspx_th_menu_item_0.setZ("+i6N/uFq65rRQkyN9G93ZSDxIec=");
    _jspx_th_menu_item_0.setUrl("/bases?form");
    _jspx_th_menu_item_0.setMessageCode("global_menu_new");
    _jspx_th_menu_item_0.setId("i_base_new");
    _jspx_th_menu_item_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_1.setParent(_jspx_parent);
    _jspx_th_menu_item_1.setZ("IjVNhoTFsVL/VpAHVFlKm0YDCNs=");
    _jspx_th_menu_item_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/bases?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_1.setMessageCode("global_menu_list");
    _jspx_th_menu_item_1.setId("i_base_list");
    _jspx_th_menu_item_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_1.setParent(_jspx_parent);
    _jspx_th_menu_category_1.setZ("Xm13w68rCIyzL6WIzqBtcpfiNQU=");
    _jspx_th_menu_category_1.setId("c_topping");
    _jspx_th_menu_category_1.setJspBody(new menu_jspxHelper( 2, _jspx_page_context, _jspx_th_menu_category_1, null));
    _jspx_th_menu_category_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_2.setParent(_jspx_parent);
    _jspx_th_menu_item_2.setZ("e1a5iGUXU+AnmE3TsSiRG0anau4=");
    _jspx_th_menu_item_2.setUrl("/toppings?form");
    _jspx_th_menu_item_2.setMessageCode("global_menu_new");
    _jspx_th_menu_item_2.setId("i_topping_new");
    _jspx_th_menu_item_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_3.setParent(_jspx_parent);
    _jspx_th_menu_item_3.setZ("XzlIdR9bro/F4JpeR+A0AAJ/u7g=");
    _jspx_th_menu_item_3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/toppings?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_3.setMessageCode("global_menu_list");
    _jspx_th_menu_item_3.setId("i_topping_list");
    _jspx_th_menu_item_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_2.setParent(_jspx_parent);
    _jspx_th_menu_category_2.setZ("wYo8hLqPDKDZwF+2vPLUsa7Z4lw=");
    _jspx_th_menu_category_2.setId("c_kuytor");
    _jspx_th_menu_category_2.setJspBody(new menu_jspxHelper( 3, _jspx_page_context, _jspx_th_menu_category_2, null));
    _jspx_th_menu_category_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_4.setParent(_jspx_parent);
    _jspx_th_menu_item_4.setZ("ncN62rw6YdqPvdATTz0UOM93wIk=");
    _jspx_th_menu_item_4.setUrl("/kuytors?form");
    _jspx_th_menu_item_4.setMessageCode("global_menu_new");
    _jspx_th_menu_item_4.setId("i_kuytor_new");
    _jspx_th_menu_item_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_5.setParent(_jspx_parent);
    _jspx_th_menu_item_5.setZ("4MIrtoRMU2K2WLahXk081fAJXmY=");
    _jspx_th_menu_item_5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/kuytors?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_5.setMessageCode("global_menu_list");
    _jspx_th_menu_item_5.setId("i_kuytor_list");
    _jspx_th_menu_item_5.doTag();
    return false;
  }

  private class menu_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public menu_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_category_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
