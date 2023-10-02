package model;

public class Output {

    public void exibirPlayer(Player player){
        System.out.println("--------------- Exibir Informações ----------------");
        System.out.println("O nome do Player é: " + player.getNome());
        System.out.println("A Skin do Player é: " + player.getSkin());
        System.out.println("A vida inicial do Player é: " + player.getVida());
        System.out.println("---------------------------------------------------");
    }

    public void exibirEnemy(Enemy enemy){
        System.out.println("/////////////// Exibir Informações ////////////////");
        System.out.println("O nome do Enemy é: " + enemy.getNome());
        System.out.println("A Skin do Enemy é: " + enemy.getSkin());
        System.out.println("A vida inicial do Enemy é: " + enemy.getVida());
        System.out.println("///////////////////////////////////////////////////");
    }


}
