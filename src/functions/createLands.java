package functions;

import javax.swing.JOptionPane;

import Objects.Land;

public class createLands {
    public static int amountLands() {
        int amountLands = Integer.parseInt(JOptionPane.showInputDialog("Quantos terrenos deseja cadastrar?"));
        return amountLands;
    }

    public static Land listLands(int i) {
        Land land = new Land();
        land.name = JOptionPane.showInputDialog("Qual o nome do "+(i+1)+"° terreno?");
        land.area = JOptionPane.showInputDialog("Qual a area do "+(i+1)+"° terreno?");
        land.amountTrees = Integer.parseInt(JOptionPane.showInputDialog("Quantas árvores o "+(i+1)+"° terreno tem?"));
        return land;
    }
}
