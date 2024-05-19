package application;

import entities.ParametrosInvalidosException;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        System.out.println();
        System.out.println("Primeiro número: " + parametroUm);
        System.out.println("Segundo número: " + parametroDois);

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        } finally {
            sc.close();
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O Segundo tem que ser maior que o Primeiro!");
        }else {
            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; i++){
                System.out.println("Número: "+i);
            }
        }
    }
}