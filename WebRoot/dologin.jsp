<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
  <%
    String path=request.getContextPath();
    String basePath=
    request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username="";
    String password="";
    request.setCharacterEncoding("UTF-8");
    username=request.getParameter("username");
    password=request.getParameter("password");
    
    if("nalanmo".equals(username)&&"753zxc".equals(password)){
    	session.setAttribute("loginUser","nalanmo");
    	request.getRequestDispatcher("login_success.jsp").forward(request,response);
    }
    else{
    	response.sendRedirect("login_failure.jsp");
    }
     %>
  