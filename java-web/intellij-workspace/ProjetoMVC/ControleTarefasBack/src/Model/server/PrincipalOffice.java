package Model.server;

import Model.dao.ColaboradorDAO;
import Model.entity.Colaborador;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class PrincipalOffice {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ArrayList<Colaborador>listaColaborador = new ArrayList<>();
        Integer loop;
        Colaborador colaborador;
        do{
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String cpf = JOptionPane.showInputDialog("Digite seu CPF");
            colaborador = new Colaborador(nome, cpf);

            ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
            colaboradorDAO.incluirColaborador(colaborador);
            loop = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais algum colaborador?");
        }while (loop == 0);

        System.out.println(colaborador);
    }
}
