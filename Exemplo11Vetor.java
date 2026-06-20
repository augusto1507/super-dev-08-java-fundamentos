import javax.swing.JOptionPane;

public class Exemplo11Vetor {
    public void executar() {
        vetorFor();
    }


private void vetorString() {
    String[] nomes = new String[4];

    nomes[0] = "Ana";
    nomes[1] = "Lorenzo";
    nomes[2] = "Pedro";
    nomes[3] = "Mario";

    nomes[3] = "Luigi";

    JOptionPane.showMessageDialog(null, "Nomes: \n" + 
    nomes[0] + 
    "\n" + nomes[1] + 
    "\n" + nomes[2] + 
    "\n" + nomes[3] + "\nQuantidade de nomes: " + nomes.length);
}

private void vetorFor() {
    String[] modelos = new String[5];
    int[] memoriasRam = new int[5];

    for(int i = 0; i < modelos.length; i++) {
        String modelo = JOptionPane.showInputDialog("Modelo do notebook");
        int memoriaRam = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de memoria RAM"));

        modelos[i] = modelo;
        memoriasRam[i] = memoriaRam;
    }

    String notebooks = "";
    for(int i = 0; i < modelos.length; i++) {
        notebooks = notebooks + "Modelo: " + modelos[i] + " - Memoria RAM: " + memoriasRam[i] + "GB\n";
    }
    JOptionPane.showMessageDialog(null, "Notebooks: \n" + notebooks);
}
}