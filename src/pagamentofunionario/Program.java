/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentofunionario;

import Entidade.Empregado;
import Entidade.EmpregadoTerceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        System.out.print("Digite a quatidade de empregados: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Empregado N#" + (i + 1));
            System.out.print("Terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 'n') {
                Empregado e = new Empregado(nome, horas, valorPorHora);
                empregados.add(e);
            } else {
                System.out.print("Despesa adicional: ");
                double despesa = sc.nextDouble();
                Empregado e = new EmpregadoTerceirizado(despesa, nome, horas, valorPorHora);
                empregados.add(e);
            }
            System.out.println("");
        }
        System.out.println("Pagamentos");
        for (Empregado e : empregados) {
            System.out.println(e.getNome() + " - R$" + e.pagamento());
        }
    }

}
