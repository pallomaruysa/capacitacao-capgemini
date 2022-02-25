<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>

<%
	int idColaborador = Integer.parseInt(request.getParameter("idcolaborador"));
	Colaborador col=new Colaborador();
	col.setIdColaborador(idColaborador);
	ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
	if(colaboradorDAO.excluirColaborador(idColaborador)){
		response.sendRedirect("consultarcolaborador.jsp?pmensagem=Colaborador excluído com sucesso!");
	}else{
		response.sendRedirect("consultarcolaborador.jsp?pmensagem=Problemas ao tentar excluir Colaborador.");
	}
 %>
