<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>

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
        int idColaborador = Integer.parseInt(request.getParameter("idColaborador"));
        Colaborador c = new Colaborador();
        c.setIdColaborador(idColaborador);
        c.setNomeColaborador("");
        %>
        
        <div>
            <div class="container" >
                <form id="matchtech" action="editarcolaborador.jsp" method="POST"> 
                    <h3>Alterar Colaborador</h3> 
                    <p> </p>

                    <fieldset>
                        <div class="idcolaborador">
                            <label>Colaborador</label>
                            <input type="text" name="idcolaborador" readonly hidden value="<%= c.getIdColaborador()%>"/>
                        </div>
                    </fieldset>

                    <fieldset>
                        <div class="nomecolaborador">
                            <label>Nome</label>
                            <input type="text" name="nomecolaborador" required maxlength="50" value="<%= c.getNomeColaborador()%>"/>
                        </div>
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
