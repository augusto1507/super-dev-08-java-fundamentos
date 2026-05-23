import javax.swing.JOptionPane;

public class Exemplo03If{
    public static void main(String[] args){
        exemploIfOperadorLogicoOu();
    }

    public static void exemploIfBasico(){
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero. dca 437, 438, 439, outro")
        );

        if (numero == 437){
            JOptionPane.showMessageDialog(null, "Quatrocentos e trinta e sete");
        }else if(numero == 438){
            JOptionPane.showMessageDialog(null, "Quatrocentos e trinta e oito");
        }else if(numero == 439){
            JOptionPane.showMessageDialog(null, "Quatrocentos e trinta e nove");
        }else{
            JOptionPane.showMessageDialog(null, "Outro número");
        }

        /*
        Operadores Relacionais:
        Igual ==
        Diferente !=
        menor < 
        menor igual <=
        maior >
        maior igual >
        */
    }

    public static void exemploIfOperadorLogicoE(){
        int idade = 17;
        String tipoIngresso = "";
        double precoIngresso = 0;

        if(idade > 0 && idade < 18){
            tipoIngresso = "Meia entrada";
            precoIngresso = 15;
        } else{
            tipoIngresso = "Inteira";
            precoIngresso = 30;
        }

        JOptionPane.showMessageDialog(null,
            "Tipo do ingresso: " + tipoIngresso +
            "\nPreço: " + precoIngresso);
    }

    public static void exemploIfOperadorLogicoOu(){

        String desejaComprarImovel = JOptionPane.showInputDialog("Deseja comprar imovel?");

        if(desejaComprarImovel.equals("s") || desejaComprarImovel.equals("sim")){
            double valorImovel = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor do imovel"));
            
        }
    }
}