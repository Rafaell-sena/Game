package model;

import java.util.Scanner;

public class Battle {
    String cenarioBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy){

        boolean continuar = true;

        while (true){

            int lifePlayer = player.getVida();
            int lifeEnemy = enemy.getVida();

            if (lifeEnemy <= 0) {
                System.out.println("O Player" + player.getNome() + " é o Vencedor !!!");
                break;

            }else if (lifePlayer <= 0) {
                System.out.println("O Enemy " + enemy.getNome() + " é o Vencedor !!!");
                break;
            }

            System.out.println("////-------------------/////// BATTLE ///////--------------------////");
            System.out.println(" Ataque Player [ V ] " + player.getNome() + " Life: " + lifePlayer);
            System.out.println(" Ataque Enemy [ A ] " + enemy.getNome() + " Life: " + lifeEnemy);
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("V")) {
                System.out.println("/------ 0 Player Atacou ------/");

                int danoPlayer = ((int) (Math.random() * 20) + 1);

                enemy.subtrairLife(danoPlayer);
                System.out.println("O Dano gerado foi de: " + danoPlayer);

            }else if (attack.equalsIgnoreCase("A")) {
                System.out.println("/-/-/-/-/- O Enemy Atacou -/-/-/-/-/");

                int danoEnemy = (int) (Math.random() * 20 + 1);
                player.subtrairLife(danoEnemy);
                System.out.println("O Dano gerado foi de: " + danoEnemy);
                System.out.println("------------------------------------");

            }else {
                System.out.println("Digite uma tecla válida seu BOSTA !!!");
              }
            }
          }
        }

