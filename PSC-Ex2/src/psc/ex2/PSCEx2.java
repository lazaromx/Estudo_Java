/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psc.ex2;

import java.util.Scanner;

/**
 *
 * @author lazar
 */
public class PSCEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        escreva("Digite um valor:");
        double num1 = obterDouble();

        escreva("Digite outro valor:");
        double num2 = obterDouble();

        String opcao = obterString("Escolha uma opcao:"
                + "\nM - Media entre os numeros digitados"
                + "\nS - Diferenca do maior pelo menor"
                + "\nP - Produto entre os numeros"
                + "\nD - Divisao do primeiro pelo segundo");

        switch (opcao.toUpperCase()) {
            case "M":
                escreva((num1 * num2) / 2);
                break;

            case "S":
                escreva(num1 - num2);
                break;

            case "P":
                escreva(num1 * num2);
                break;

            case "D":
                escreva(num1 / num2);
                break;

            default:
                escreva("digite uma opcao valida");

        }

        // TODO code application logic here
    }

    public static void escreva(Object valor) {
        System.out.println(valor);
    }

    public static String obterString(String valor) {
        escreva(valor);
        Scanner e = new Scanner(System.in);
        return e.next();
    }

    public static double obterDouble() {
        Scanner e = new Scanner(System.in);
        return e.nextDouble();
    }

}
