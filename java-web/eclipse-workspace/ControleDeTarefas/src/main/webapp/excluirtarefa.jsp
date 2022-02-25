<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.TarefaDAO"%>
<%@ page import="model.entity.Tarefa"%>

<%
	int id = Integer.parseInt(request.getParameter("idTarefa"));
	Tarefa tarefa=new Tarefa();
	tarefa.setIdTarefa(id);
	TarefaDAO tarefaDAO = new TarefaDAO();
	if(tarefaDAO.excluirTarefa(id)){
		response.sendRedirect("consultartarefa.jsp?pmensagem=Tarefa excluída com sucesso!");
	}else{
		response.sendRedirect("consultartarefa.jsp?pmensagem=Problemas ao tentar excluir Tarefa.");
	}
 %>
