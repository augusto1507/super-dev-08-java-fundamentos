import javax.swing.JOptionPane;

public class Exemplo08TratamentoExcecoes {
    
    public void executar() {
        exemploComWhile();
    }

    private void tratamentoErrosBasico() {
        try {
            int numero = Integer.parseInt("2");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao converter o número1");
        }
        JOptionPane.showMessageDialog(null, "Obrigado!");
    }

    public void exemploComWhile() {
        for(int i = 0; i < 3; i++) {
            double peso = 0;

            while(peso <= 0 || peso > 400) {
                try {
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: " + i).trim().replace("," , "."));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao converter o peso. Digite um número válido.");
                }
            }
        }
    }
}