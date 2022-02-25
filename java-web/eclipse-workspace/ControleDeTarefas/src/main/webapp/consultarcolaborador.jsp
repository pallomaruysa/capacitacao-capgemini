<%@page import="java.util.ArrayList"%>
<%@ page import="model.dao.ColaboradorDAO"%>
<%@ page import="model.entity.Colaborador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            ColaboradorDAO col = new ColaboradorDAO();
            ArrayList<Colaborador> listaColaboradores = col.consultarColaboradores();
        %>
        <h4 class="text-center">Colaborador</h4>
         
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
                <th> Colaborador </th>
                <th> Alterar </th>
                <th> Excluir </th>
            </thead>
            <!-- corpo da tabela -->
            <tbody>
                <% for (Colaborador c: listaColaboradores) { %>
                <tr>
                	<td><% out.write(c.getNomeColaborador()); %></td>
                    <td><a href="alterarcolaborador.jsp?idColaborador=<%= c.getIdColaborador()%>"><i class='far fa-edit' style='color:blue'></i> </a></td>
                    <td><button type="button" id="botaoexcluir"  onclick="mostrarExclusao(<%out.write("" + c.getIdColaborador());%>)"><i class='far fa-trash-alt' style='color:red'></i> </button></td>
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
        
            function mostrarExclusao(colaborador) {
                document.getElementsByClassName("msg-popup2")[0].style.display = "block";
                 var link = document.getElementById("exclui");
                link.href = "excluircolaborador.jsp?idcolaborador=" + colaborador;
            }
        </script>                               
</body>
</html>