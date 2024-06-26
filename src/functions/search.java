package functions;

import javax.swing.JOptionPane;
import objects.Land;

public class search {

    public static void search(Land[] lands) {
        String searchOption = JOptionPane.showInputDialog(null,"Qual nome deseja pesquisar (Informe o número correspondente)?\n1- Todas as árvores;\n2- Árvores por terreno;\n3- Árvores que exigem poda\n4- Árvores que possuem frutos;\n5- Porte da árvore", "Pesquisar", JOptionPane.QUESTION_MESSAGE);
        while (!searchOption.equals("1") && !searchOption.equals("2") && !searchOption.equals("3") && !searchOption.equals("4") && !searchOption.equals("5")) {
            JOptionPane.showMessageDialog(null, "Opcão inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
            searchOption = JOptionPane.showInputDialog(null,"Qual nome deseja pesquisar?\n1- Todas as árvores;\n2- Árvores por terreno;\n3- Árvores que exigem poda\n4- Árvores que possuem frutos;\n5- Porte da árvore", "Pesquisar", JOptionPane.QUESTION_MESSAGE);
        }

        switch (searchOption) {
            case "1":
                searchAll(lands);
                break;
            case "2":
                searchByLand(lands);
                break;
            case "3":
                searchByPrune(lands);
                break;
            case "4":
                searchByFruits(lands);
                break;
            case "5":
                searchBySize(lands);
                break;
        }
    }

    public static void searchAll(Land[] lands) {
        String text = "";
        for (int i = 0; i < lands.length; i++) {
            text += "Terreno " + lands[i].name + ": \n";
            for (int j = 0; j < lands[i].amountTrees; j++) {
                text += "Nome: " + lands[i].trees.get(j).name + " | Cuidados: " + lands[i].trees.get(j).care + " | Porte: " + lands[i].trees.get(j).size + " | Exige poda: " + (lands[i].trees.get(j).prune ? "Sim":"Não") + " | Possui frutos: " + (lands[i].trees.get(j).fruits ? "Sim":"Não") + "\n";
            }
            text += "\n";
        }

        JOptionPane.showMessageDialog(null, text, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchByLand(Land[] lands) {
        String text = "";
        for (int i = 0; i < lands.length; i++) {
            text += (i+1)+"- " + lands[i].name + "\n";
        }
        int land = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual terreno deseja pesquisar (Informe o número correspondente)?\n" + text, "Pesquisa", JOptionPane.QUESTION_MESSAGE));

        while (land < 1 || land > lands.length) {
            JOptionPane.showMessageDialog(null, "Opcão inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
            land = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual terreno deseja pesquisar (Informe o número correspondente)?\n" + text, "Pesquisa", JOptionPane.QUESTION_MESSAGE));
        }
        text = "Árvores do terreno "+lands[land-1].name+"\n";

        for (int i = 0; i < lands[land-1].amountTrees; i++) {
            text += "Nome: " + lands[land-1].trees.get(i).name + " | Cuidados: " + lands[land-1].trees.get(i).care + " | Porte: " + lands[land-1].trees.get(i).size + " | Exige poda: " + (lands[land-1].trees.get(i).prune ? "Sim":"Não") + " | Possui frutos: " + (lands[land-1].trees.get(i).fruits ? "Sim":"Não") + "\n";
        }

        JOptionPane.showMessageDialog(null, text, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchByPrune(Land[] lands) {
        String text = "";
        boolean found = false;
        for (int i = 0; i < lands.length; i++) {
            text += "Terreno " + lands[i].name + ": \n";
            for (int j = 0; j < lands[i].amountTrees; j++) {
                if (lands[i].trees.get(j).prune) {
                    text += "Nome: " + lands[i].trees.get(j).name + " | Cuidados: " + lands[i].trees.get(j).care + " | Porte: " + lands[i].trees.get(j).size + " | Exige poda: " + (lands[i].trees.get(j).prune ? "Sim":"Não") + " | Possui frutos: " + (lands[i].trees.get(j).fruits ? "Sim":"Não") + "\n";
                    found = true;
                    text += "\n";
                }
                
            }
        }

        if (!found) {
            text += "Nenhuma árvore tem poda.\n";
        }
        
        JOptionPane.showMessageDialog(null, text, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchByFruits(Land[] lands) {
        String text = "";
        boolean found = false;
        for (int i = 0; i < lands.length; i++) {
            text += "Terreno " + lands[i].name + ": \n";
            for (int j = 0; j < lands[i].amountTrees; j++) {
                if (lands[i].trees.get(j).fruits) {
                    text += "Nome: " + lands[i].trees.get(j).name + " | Cuidados: " + lands[i].trees.get(j).care + " | Porte: " + lands[i].trees.get(j).size + " | Exige poda: " + (lands[i].trees.get(j).prune ? "Sim":"Não") + " | Possui frutos: " + (lands[i].trees.get(j).fruits ? "Sim":"Não") + "\n";
                    found = true;
                    text += "\n";
                }
            }
        }

        if (!found) {
            text += "Nenhuma árvore tem frutos.\n";
        }

        JOptionPane.showMessageDialog(null, text, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchBySize(Land[] lands) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Informe o porte da árvore para ver todas as árvores com este porte (Informe o número correspondente):\n1- Pequeno\n2- Médio\n3- Grande"));
        while (size != 1 && size != 2 && size != 3) {
            JOptionPane.showMessageDialog(null, "Opcão inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
            size = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da árvore?\n1- Pequeno\n2- Médio\n3- Grande"));
        }

        boolean found = false;
        String text = "";
        for (int i = 0; i < lands.length; i++) {
            text += "Terreno " + lands[i].name + ": \n";
            for (int j = 0; j < lands[i].amountTrees; j++) {
                if (lands[i].trees.get(j).size == (size == 1 ? "Pequeno" : size == 2 ? "Medio" : "Grande")) {
                    text += "Nome: " + lands[i].trees.get(j).name + " | Cuidados: " + lands[i].trees.get(j).care + " | Porte: " + lands[i].trees.get(j).size + " | Exige poda: " + (lands[i].trees.get(j).prune ? "Sim":"Não") + " | Possui frutos: " + (lands[i].trees.get(j).fruits ? "Sim":"Não") + "\n";
                    found = true;
                    text += "\n";
                }
            }
        }
        
        if (!found) {
            text += "Nenhuma árvore tem frutos.\n";
        }

        JOptionPane.showMessageDialog(null, text, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
    }
}