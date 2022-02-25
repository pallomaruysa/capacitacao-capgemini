package com.br.orientacaooo.exercicioresolvido;

import com.br.orientacaooo.exercicioresolvido.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos funcionários serão cadastrados?");
        int N = scanner.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.println();
            System.out.println("Funcionário: " + i);

            System.out.print("Id: ");
            int idCadastrado = scanner.nextInt();
            while (hasId(employeeList, idCadastrado)) {
                System.out.println("Id já cadastrado, tente novamente");
                idCadastrado = scanner.nextInt();
            }

            System.out.print("Nome: ");
            String name = scanner.next();
            System.out.print("Salário: ");
            double salary = scanner.nextDouble();
            employeeList.add(new Employee(idCadastrado, name, salary));
        }

        // Atualização de salário por id e porcentagem X
        System.out.println();
        System.out.println();
        System.out.println("Entre com o código do funcionário para receber o aumento.");
        int idAumento = scanner.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if(emp == null){
            System.out.println("O id informado não existe! ");
        } else {
            System.out.println("Entre com o percentual de aumento");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        scanner.close();

        System.out.println();
        System.out.println("Lista de funcionários atualizada:");
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }

    public static boolean hasId(List<Employee> employeeList, int id) {
        Employee employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}