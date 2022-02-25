<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>
<%@ page import="model.dao.TarefaDAO"%>
<%@ page import="model.entity.Tarefa"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link   rel="stylesheet" href="styles/padraotelacadastro.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <%
        int idTarefa=0;
        if(request.getParameter("idTarefa")!=null){
        	idTarefa=Integer.parseInt(request.getParameter("idTarefa"));
        }
        %>
        <div>
            <div class="container" >
                 <label class="mensagem" id="msg">
                    <%
                        if(request.getParameter("pmensagem") != null)
                            out.write(request.getParameter("pmensagem"));  
                    %>
                </label>
                <form id="matchtech" action="editartarefa.jsp" method="POST"> 
                    <h3>Alterar Tarefa</h3> 
                    <p> </p>

                    <fieldset>
                        <div class="idtarefa">
                            <label></label>
                            <input type="text" name="idTarefa" value="<%=idTarefa%>" readonly hidden/>
                        </div>
                    </fieldset>

                    <fieldset>
                        <div class="descricao">
                            <label for="descricao">Descrição</label>
                            <input type="text" name="descricao" id="descricao">
                        </div>
                        <label for="statusTarefa">Status da Tarefa</label>
                        <select id="statusTarefa" name="statusTarefa">
			<option></option>
			<option value="Iniciada">Iniciada</option>
			<option value="Cancelada">Cancelada</option>
			<option value="Executada">Executada</option>
		</select>
		<label for="prioridade">Prioridade</label>
		<select id="prioridade" name="prioridade">
			<option></option>
			<option value="Baixa">Baixa</option>
			<option value="Média">Média</option>
			<option value="Alta">Alta</option>
			<option value="Urgente">Urgente</option>
		</select>
                    </fieldset>

                    <div class="row">
                        <div class="form-group col-md-3 h-10">
                            <input type="submit" value="Alterar" class="btn btn-primary"/>
                        </div>
                        <div class="form-group col-md-3 h-10">                                 
                            <input type="reset"  value="Cancelar" class="btn btn-danger"/>                        
                        </div>                        
                    </div>
                </form>
            </div>
        </div>                              
    </body>
</html>
