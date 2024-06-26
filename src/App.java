import javax.swing.JOptionPane;

import Objects.*;
import functions.*;

public class App {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao programa de cadastro de árvores por terrenos");
        
        int amountLands = createLands.amountLands();
        
        Land[] lands = new Land[amountLands]; 
        for (int i = 0; i < amountLands; i++) {
            lands[i] = createLands.listLands(i);
        }

        JOptionPane.showMessageDialog(null, "Agora vamos cadastrar as árvores.");

        for (int i = 0; i < lands[i].amountTrees; i++) {
            lands[i].trees[i] = createTree.Tree();
        }

        for (int i = 0; i < amountLands; i++) {
            JOptionPane.showMessageDialog(null, "O terreno "+(i+1)+" tem "+lands[i].amountTrees+" árvores");
        }
    }
}
