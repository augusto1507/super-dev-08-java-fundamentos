import javax.swing.JOptionPane;

public class Exemplo09Switch {
    public void executar() {
        exemploEscolha();
    }

    private void exemploEscolha() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
            1 - Somar
            2 - Subtrair
            3 - Multiplicar
            4 - Dividir
            """));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 + numero2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 - numero2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 * numero2));
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 / numero2));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
    }
}