package functions;

import javax.swing.JOptionPane;

import objects.Land;

public class createLands {
    public static int amountLands() {
        while (true) {
            try {
                int amountLands = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos terrenos deseja cadastrar?", "Quantidade de terrenos", JOptionPane.QUESTION_MESSAGE));
                while (amountLands < 1) {
                    JOptionPane.showMessageDialog(null, "A quantidade de terrenos deve ser maior que 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                    amountLands = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos terrenos deseja cadastrar?", "Quantidade de terrenos", JOptionPane.QUESTION_MESSAGE));
                }

                return amountLands;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A quantidade de terrenos deve ser um número inteiro", "ERROR", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }

    public static Land listLands(int position) {
        Land land = new Land();
        land.name = JOptionPane.showInputDialog(null, "Qual o nome do "+(position+1)+"° terreno?","Nome do terreno",JOptionPane.QUESTION_MESSAGE);
        land.area = JOptionPane.showInputDialog(null, "Qual a área do "+(position+1)+"° terreno?","Área do terreno",JOptionPane.QUESTION_MESSAGE);

        while (true){
            try{
                land.amountTrees = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas árvores o "+(position+1)+"° terreno tem?","Quantidade de árvores",JOptionPane.QUESTION_MESSAGE));
                while (land.amountTrees < 1) {
                    JOptionPane.showMessageDialog(null, "A quantidade de árvores deve ser maior que 0","ERROR",JOptionPane.ERROR_MESSAGE);
                    land.amountTrees = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas árvores o "+(position+1)+"° terreno tem?", "Quantidade de árvores",JOptionPane.QUESTION_MESSAGE));
                }
                return land;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A quantidade de árvores deve ser um número inteiro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
