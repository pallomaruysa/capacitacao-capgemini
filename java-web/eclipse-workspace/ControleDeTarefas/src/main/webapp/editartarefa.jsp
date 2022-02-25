<%@ page import="java.util.ArrayList"%>
<%@ page import="model.dao.TarefaDAO"%>
<%@ page import="model.entity.Tarefa"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%> --Esse @ junto de do símbolo de menor com  % é para importar algo
<%@ page import="java.util.Date"%>
<%
  	int id=Integer.parseInt(request.getParameter("idTarefa"));
	String descricao= request.getParameter("descricao");
	String statusTarefa=request.getParameter("statusTarefa");
	String prioridade=request.getParameter("prioridade");
	TarefaDAO tarefaDAO=new TarefaDAO();
	Tarefa tarefa=new Tarefa();
	tarefa.setDescrTarefa(descricao);
	tarefa.setStatusTarefa(statusTarefa);
	tarefa.setPrioridadeTarefa(prioridade);
	tarefa.setIdTarefa(id);
	if (tarefaDAO.alterarTarefa(id, tarefa)) {
        response.sendRedirect("alterartarefa.jsp?pmensagem=Tarefa alterada com sucesso");
    } else {
        response.sendRedirect("alterartarefa.jsp?pmensagem=Problemas ao tentar alterar Tarefa");
    }
%>