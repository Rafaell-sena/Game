package model;

import java.util.Scanner;

public class Cenario {

    Scanner scanner = new Scanner(System.in);

    public String selecionrCenario(){

        System.out.println("Escolha o Cenario: ");
        System.out.println("1-Carapicuiba 2-Itapevi Né 3-Arabia Junto com o Ney");

        int optionCenario = scanner.nextInt();
        scanner.nextLine();

        String cenario = "Senai Osasco";

        switch (optionCenario){

            case 1:
                cenario = "Carapicuiba";
                break;

            case 2:
                cenario = "Itapevi Né";
                break;

            case 3:
                cenario = "Arabia Junto com o Ney";
                break;
        }

        return cenario;

    }
}
