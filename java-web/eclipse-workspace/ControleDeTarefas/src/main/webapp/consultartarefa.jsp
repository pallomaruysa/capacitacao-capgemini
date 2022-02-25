<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>
<%@ page import="model.dao.TarefaDAO"%>
<%@ page import="model.entity.Tarefa"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONTROLE DE TAREFAS - CAPGEMINI</title>
        <link rel="stylesheet" href="Styles/padraotelagrid.css">
        <!-- bootstrap -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet"/>        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <!-- Fontawesome' -->
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    </head>
    <body>
    <%
    	TarefaDAO consultaTarefa = new TarefaDAO();
    	ArrayList<Tarefa> listaTarefas = consultaTarefa.consultarTarefas();
    	ColaboradorDAO c = new ColaboradorDAO();
    	Colaborador col = new Colaborador();
    	SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    %>
	<h4 class="text-center">Tarefa</h4>
         
        <%-- label para lançar mensagem de feedback da atualização --%>
        <label class="cabecalho" id="msg"> 
            <%
                if(request.getParameter("pmensagem") != null)         
                out.write(request.getParameter("pmensagem"));
            %>
        </label>
        <table id="consulta" class="table">
            <!-- cabecalho da tabela -->
            <thead class="thead-dark">
            	<th> Colaborador(a) </th>
                <th> Descrição </th>
                <th> Data e hora de início </th>
                <th> Data e hora de finalização </th>
                <th> Status da Tarefa </th>
                <th> Prioridade da Tarefa </th>
                <th> Alterar </th>
                <th> Excluir </th>
            </thead>
            <!-- corpo da tabela -->
            <tbody>
            	<%for(Tarefa t: listaTarefas){%>
            	<tr>
            		<%col=c.consultarColaborador(t.getIdColaborador());%>
            		<td><%=col.getNomeColaborador()%></td>
            		<td><% out.write(t.getDescrTarefa()); %></td>
            		<td><%=formata.format(t.getDataHoraInicio()) %></td>
            		<td><%=formata.format(t.getDataHoraFim()) %></td>
            		<td><% out.write(t.getStatusTarefa()); %></td>
            		<td><% out.write(t.getPrioridadeTarefa()); %></td>
                    <td><a href="alterartarefa.jsp?idTarefa=<%= t.getIdTarefa()%>"><i class='far fa-edit' style='color:blue'></i> </a></td>
                    <td><button type="button" id="botaoexcluir"  onclick="mostrarExclusao(<%out.write("" + t.getIdTarefa());%>)"><i class='far fa-trash-alt' style='color:red'></i> </button></td>
                </tr>
                <%}%>
            </tbody>
        </table>
 <!-- POPUP DE CONFIRMAÇÃO DE EXCLUSÃO -->                
        
        <div class="msg-popup2">
            <h5 class="text-center" style="color: #ffffff; font-family: arial-bold ">EXCLUSÃO</h5>
            <h5 class="text-center" style="color: #ffffff;">Confirma a <b>exclusão</b> do registro ?</h5>
            <div class="text-center">                
                <a href=""><button class="btn btn-dark" click="cancela()"> Não </button></a>
                <a id="exclui" href="#"><button class="btn btn-danger" id="excluir"> Sim </button></a>                    
            </div>
        </div>                    
        <script>
            function cancela() {
                document.getElementsByClassName("msg-popup2")[0].style.display = "none";
            }
        
            function mostrarExclusao(t) {
                document.getElementsByClassName("msg-popup2")[0].style.display = "block";
                 var link = document.getElementById("exclui");
                link.href = "excluirtarefa.jsp?idTarefa=" + t;
            }
        </script>                               
</body>
</html>