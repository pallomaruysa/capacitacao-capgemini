<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>

<%
	String vNomecolaborador = request.getParameter("nomecolaborador");
	Colaborador col=new Colaborador();
	col.setNomeColaborador(vNomecolaborador);
	ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
	if(colaboradorDAO.incluirColaborador(col)){
		response.sendRedirect("cadastrarcolaborador.jsp?pmensagem=Colaborador cadastrado com sucesso!");
	}else{
		response.sendRedirect("cadastrarcolaborador.jsp?pmensagem=Problemas ao tentar cadastrar Colaborador.");
	}
 %>
