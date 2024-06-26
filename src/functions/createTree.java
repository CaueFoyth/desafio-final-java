package functions;

import objects.Tree;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
public class createTree {
    public static Tree Tree(int position, String name) {
        Tree tree = new Tree();
        tree.name = JOptionPane.showInputDialog(null, "Qual o nome da "+(position+1)+"° árvore do terreno "+name+"?", "Nome da árvore", JOptionPane.QUESTION_MESSAGE);
        tree.care = JOptionPane.showInputDialog(null, "Qual o cuidado da "+(position+1)+"° árvore do terreno "+name+"?", "Cuidado da árvore", JOptionPane.QUESTION_MESSAGE);
        JPanel panel = new JPanel();
        JCheckBox prune = new JCheckBox("Exige poda?");
        JCheckBox fruits = new JCheckBox("Tem frutos?");
        panel.add(prune);
        panel.add(fruits);
        int result = JOptionPane.showConfirmDialog(null, panel, "Cuidado", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            tree.prune = prune.isSelected();
            tree.fruits = fruits.isSelected();
        }

        while (true) {
            try {
                int size = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o tamanho da "+(position+1)+"° árvore do terreno "+name+" (Informe o número correspondente)?\n1- Pequeno\n2- Médio\n3- Grande", "Porte", JOptionPane.QUESTION_MESSAGE));
                while (size < 1 || size > 3) {
                    JOptionPane.showMessageDialog(null, "Opcão inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    size = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o tamanho da "+(position+1)+"° árvore do terreno "+name+" (Informe o número correspondente)?\n1- Pequeno\n2- Médio\n3- Grande", "Porte", JOptionPane.QUESTION_MESSAGE));
                }
                if (size == 1) {
                    tree.size = "Pequeno";
                } else if (size == 2) {
                    tree.size = "Medio";
                } else {
                    tree.size = "Grande";
                }
                return tree;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "A entrada deve ser um número inteiro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
