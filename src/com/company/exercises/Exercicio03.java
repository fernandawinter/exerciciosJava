package com.company.exercises;
import java.util.Scanner;

public class Exercicio03 {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Festa adulta! Qual é a sua idade?");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Bem vinda a festa!");
        } else {
            System.out.println("Infelizmente você não pode entrar na festa no momento");
        }
    }

}
