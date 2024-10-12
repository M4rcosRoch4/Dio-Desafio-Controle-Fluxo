package DesafioControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite seu segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // imprimir os números entre os parâmetros
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

// Definir a exceção customizada fora da classe Contador
class ParametrosInvalidosException extends Exception {
}
