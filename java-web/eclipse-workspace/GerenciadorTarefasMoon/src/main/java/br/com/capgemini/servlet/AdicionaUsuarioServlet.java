package br.com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.capgemini.model.dao.UsuarioDAO;
import br.com.capgemini.model.entity.Usuario;

@WebServlet("/AdicionaUsuario")
public class AdicionaUsuarioServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        // busca o writer
        PrintWriter out = response.getWriter();
        Usuario usuario=new Usuario();
        // buscando os parâmetros no request
        String nome = request.getParameter("nome");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        Date dataNascimento = null;
        try {
			dataNascimento=new Date(formato.parse(request.getParameter("dataNascimento")).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String cpf=request.getParameter("cpf");
        String senha=usuario.calculoSHA1(request.getParameter("senha"));
        
        usuario.setNome(nome);
        usuario.setTelefone(telefone);
        usuario.setEmail(email);
        usuario.setDataNascimento(dataNascimento);
        usuario.setCpf(cpf);
        usuario.setSenha(senha);
        usuario.setAtivo(true);
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        usuarioDAO.incluir(usuario);
        // imprime o nome do contato que foi adicionado
        out.println("<html>");
        out.println("<body>");
        out.println("Usuário " + usuario.getNome() +
        		" adicionado com sucesso");
        out.println("Usuário " + usuario.getDataNascimento() +
        		" adicionado com sucesso");
        out.println("Senha " + usuario.getSenha() +
                " adicionado com sucesso");
        out.println("</body>");
        out.println("</html>");
    }
}