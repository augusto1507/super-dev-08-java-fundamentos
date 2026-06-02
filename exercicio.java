import javax.swing.JOptionPane;

public class exercicio {

    public static void main(String[] args){
        exemplo02();
    }


    public static void cadastroPessoa(){
        String opcao = "";
        while (!opcao.equals("não")) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa (metros)"));
            boolean estudante = Boolean.parseBoolean(JOptionPane.showInputDialog("A pessoa é estudante? [sim/não]"));

            boolean maiorIdade = false;
            boolean grande = false;

            if(idade >= 18){
                maiorIdade = true;
            }

            if(altura >= 1.70){
                grande = true;
            }

            JOptionPane.showMessageDialog(null,
                 "Nome: " + nome +
                 "\nIdade: " + idade +
                 "\nAltura: " + altura +
                 "\nestudante? " + estudante +
                 "\nMaior de idade? " + maiorIdade +
                 "\nMaior que 1.70? " + grande
            );

            opcao = JOptionPane.showInputDialog("Deseja continuar?  [sim/não]");
        };
    };

    public static void exemplo02(){
        String opcao = "";
        while (!opcao.equals("não")) {
            int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            double numeroDecimal = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero com casas decimais").replace(",", "."));

            int dobro = numeroInteiro * 2;
            double metade = numeroDecimal / 2;
            String numeroE = "";
            boolean maiorcem = false;

            if (numeroInteiro > 0) {
                numeroE = "Positivo";   
            
            }else if (numeroInteiro == 0) {
                numeroE = "Zero";
            }else{
                numeroE = "Negativo";
            }

            if(numeroDecimal < 100){
                maiorcem = true;
            }

            JOptionPane.showMessageDialog(null,
                "Numero Inteiro: " + numeroInteiro +
                "\nDobro: " + dobro +
                "\nNumero decimal: " + numeroDecimal +
                "\nMetade: " + metade +
                "\nNumero inteiro é: " + numeroE +
                "\nNumero decimal é maior que 100? " + maiorcem
            );

            opcao = JOptionPane.showInputDialog("Deseja continuar? [sim/não]");
        }
    }
}