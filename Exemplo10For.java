import javax.swing.JOptionPane;
import java.nio.file.Path;
import java.nio.file.Files;

public class Exemplo10For {
    public void executar() {
        salvarDadosEmArquivo();
    }

    private void forBasico() {
        for (int i = 0; i < 5; i++) {
            JOptionPane.showInputDialog("Ola Mundo ");
        }
    }

    private void forPedindoQuantidade() {
        int quantidadeFrutas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidaade de frutas"));

        double total = 0;

        for (int i = 0; i < quantidadeFrutas; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da fruta ");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da fruta "));
            
            total = total + preco;
        }
        JOptionPane.showMessageDialog(null, "Total: " + total);
    }

    private void salvarDadosEmArquivo(){
        try {
            String textoArquivo = "Nome;Quantidade;Preço;Total\n";

            for (int i = 0; i < 2; i++) {
                String nome = JOptionPane.showInputDialog("Nome da fruta ");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade da fruta "));
                double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da fruta "));

                double total = quantidade * preco;

                textoArquivo = textoArquivo + nome + ";" + quantidade + ";" + preco + ";" + total + "\n";
            }
            Path caminhoArquivo = Path.of(System.getProperty("user.home"), "Desktop", "frutas.csv");
            Files.writeString(caminhoArquivo, textoArquivo);
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso em :" + caminhoArquivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados em arquivo.");
        }
    }
    
}