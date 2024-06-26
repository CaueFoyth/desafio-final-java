import javax.swing.JOptionPane;

import objects.*;
import functions.*;

public class App {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao programa de cadastro de árvores por terrenos", "Cadastro de árvores", JOptionPane.INFORMATION_MESSAGE);
        
        int amountLands = createLands.amountLands();
        
        Land[] lands = new Land[amountLands]; 
        for (int i = 0; i < amountLands; i++) {
            lands[i] = createLands.listLands(i);
        }

        JOptionPane.showMessageDialog(null, "Agora vamos cadastrar as árvores.", "Cadastro de árvores", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < lands.length; i++) {
            for (int j = 0; j < lands[i].amountTrees; j++) {
                lands[i].trees.add(createTree.Tree(j, lands[i].name));
            }
        }

        int result = 1;
        while (result == 1) {
            result = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja realizar uma pesquisa (Informe o número correspondente)?\n1- Sim\n2- Não", "Pesquisa", JOptionPane.QUESTION_MESSAGE));
            if (result == 2) { break; }
            while (result != 1 && result != 2) {
                JOptionPane.showMessageDialog(null, "Opcão inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
                result = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja realizar uma pesquisa (Informe o número correspondente)?\n1- Sim\n2- Não", "Pesquisa", JOptionPane.QUESTION_MESSAGE));
            }
            search.search(lands);
        }
    }
}
