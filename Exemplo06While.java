import javax.swing.JOptionPane;

public class Exemplo06While {
    public static void main(String[] args){
        RepetirEnquantoForDiferente();
    }

    public static void exemplo01basico(){
        int indice = 0;
        while(indice < 3){
            String nome = JOptionPane.showInputDialog("Digite o nome");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
            double media = (nota1 + nota2 + nota3) / 3;
            JOptionPane.showMessageDialog(null, "Média: " + media);

            indice++;
        }
    }

    public static void RepetirEnquantoForDiferente(){

        String opcao = "";
        int total = 0;

        while(!opcao.equals("não")){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));

            total = total + numero;

            opcao = JOptionPane.showInputDialog("Deseja continuar? sim/não");
        }

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}