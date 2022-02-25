<%@ page import="java.util.List"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%> --Esse @ junto de do símbolo de menor com  % é para importar algo

<% 
	int idColaborador = Integer.parseInt(request.getParameter("idcolaborador"));
	String nomeAlterado = request.getParameter("nomecolaborador");
	ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
	colaboradorDAO.alterarColaborador(idColaborador, nomeAlterado);
	response.sendRedirect("consultarcolaborador.jsp");
%>
