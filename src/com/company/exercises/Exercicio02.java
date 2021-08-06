package com.company.exercises;
import java.util.Scanner;

public class Exercicio02 {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é seu livro favorito?");
        String livro = scanner.nextLine();
        System.out.println("Meu livro favorito é " + livro);
    }

}


