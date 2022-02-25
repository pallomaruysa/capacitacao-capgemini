<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="model.dao.ColaboradorDAO"%>
<%@page import="model.entity.Colaborador"%>
<%@page import="model.entity.Tarefa"%>
<%@page import="model.dao.TarefaDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONTROLE DE TAREFAS - CAPGEMINI</title>
        <link   rel ="stylesheet" href="Styles/padraotelacadastro.css">
        <script src ="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src ="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body> 
        <div class="container">
            <form id="matchtech" action="receberdadostarefa.jsp" method="POST">
                <h3>Cadastro de Tarefas</h3>
                <p></p>           
                <label class="mensagem" id="msg">
                    <%
                        if(request.getParameter("pmensagem") != null)
                            out.write(request.getParameter("pmensagem"));  
                    %>
                </label>
                <fieldset>
                    <label for="colaborador">Escolha um cooperador para essa tarefa</label>
                    <select id="colaborador" name="colaborador">
                    	<option>Selecione um(a) cooperador(a)</option>
                    		<%
                    		ColaboradorDAO col = new ColaboradorDAO();
                    		ArrayList<Colaborador> listaPesquisada = col.consultarColaboradores();
                    		%>
                    		<% for (Colaborador Colaborador:listaPesquisada) {%>
                    			<option value="<%=Colaborador.getIdColaborador()%>">
                    				<% out.write(Colaborador.getNomeColaborador());%>
                    			</option>

                    		<%}%>
                    </select>
                    <div class="descricaotarefa">
                    	<label for="descricao">Descrição da Tarefa</label>
                        <input id="descricao" name="descricao" type="text" maxlength="50" required size=50>
                    </div>
                    <div>
                    	<label for="dataHoraFim">Data e Horário definidos para finalização da tarefa</label>
                    	<input type="datetime-local" id="dataHoraFim" name="dataHoraFim">
                    </div>
                    <div>
                		<label for="statusTarefa">Status da Tarefa</label>
                		<select id="statusTarefa" name="statusTarefa">
                    	<option value="Iniciada">Iniciada</option>
                    	<option value="Cancelada">Cancelada</option>
                    	<option value="Executada">Executada</option>
                    </select>
                    </div>
                    <div>
                		<label for="prioridadeTarefa">Status da Tarefa</label>
                		<select id="prioridadeTarefa" name="prioridadeTarefa">
                    	<option value="Baixa">Baixa</option>
                    	<option value="Média">Média</option>
                    	<option value="Alta">Alta</option>
                    	<option value="Urgente">Urgente</option>
                    	</select>
                    </div>
                </fieldset>
                <br>
              
                <div>
                    <div class="form-group col-md-2 h-8">
                        <input type="submit" value="Cadastrar" class="btn btn-success "/>
                    </div>
                    <div class="form-group col-md-2 h-8">                                 
                        <input type="reset"  value="Cancelar" class="btn btn-danger"/>                        
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
