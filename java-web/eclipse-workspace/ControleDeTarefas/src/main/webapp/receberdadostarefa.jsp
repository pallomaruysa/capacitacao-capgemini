<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.TarefaDAO"%>
<%@ page import="model.entity.Tarefa"%>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.util.Date" %>

<%
	int idColaborador=Integer.parseInt(request.getParameter("colaborador"));//aqui chamo no request.getParameter o nome ou id que peguei no formulário
	String descrTarefa=request.getParameter("descricao");
	Date date = new Date();
	long time=date.getTime();
	Timestamp dataHoraInicio = new Timestamp(time);
	Timestamp dataHoraFim=Timestamp.valueOf(request.getParameter("dataHoraFim").replace("T"," ")+":00");
	String statusTarefa =request.getParameter("statusTarefa");
	String prioridadeTarefa =request.getParameter("prioridadeTarefa");
	Tarefa novaTarefa = new Tarefa();
	novaTarefa.setIdColaborador(idColaborador);
	novaTarefa.setDescrTarefa(descrTarefa);
	novaTarefa.setDataHoraInicio(dataHoraInicio);
	novaTarefa.setDataHoraFim(dataHoraFim);
	novaTarefa.setStatusTarefa(statusTarefa);
	novaTarefa.setPrioridadeTarefa(prioridadeTarefa);
	TarefaDAO salvarTarefa = new TarefaDAO();
	if(salvarTarefa.incluirTarefa(novaTarefa)){
		response.sendRedirect("cadastrartarefa.jsp?pmensagem=Tarefa cadastrada com sucesso!");
	}else{
		response.sendRedirect("cadastrartarefa.jsp?pmensagem=Problemas ao tentar cadastrar Tarefa.");
	}
 %>
