package functions;

import Objects.Tree;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
public class createTree {
    public static Tree Tree() {
        Tree tree = new Tree();
        tree.name = JOptionPane.showInputDialog("Qual o nome da árvore?");
        tree.care = JOptionPane.showInputDialog("Qual o cuidado da árvore?");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Tem folhas?"));
        panel.add(new JCheckBox());
        panel.add(new JLabel("Tem frutos?"));
        panel.add(new JCheckBox());
        JOptionPane.showMessageDialog(null, panel);
        if () == JOptionPane.YES_OPTION) {
            tree.prune = true;
        } else {
            tree.prune = false;
        }
        if (JOptionPane.showConfirmDialog(null, "Tem frutos?") == JOptionPane.YES_OPTION) {
            tree.fruits = true;
        } else {
            tree.fruits = false;
        }

        // tree.prune = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem folhas?"));
        // tree.fruits = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem frutos?"));
        tree.size = JOptionPane.showInputDialog("Qual o tamanho da árvore?");
        return tree;
    }
}
