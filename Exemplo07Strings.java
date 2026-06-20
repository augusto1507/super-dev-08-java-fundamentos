import javax.swing.JOptionPane;

public class Exemplo07Strings {
    public void executar() { 
        pegarParteString();
    }

    private void exemploRemoverEspacos() {
        String texto = "   Aniversario do Professor Francisco sem mensagem    ";
        String semEspacosComecoFim = texto.trim();

        JOptionPane.showMessageDialog(
            null,
             "Texto: '" + texto + "Texto sem espaços: '" + semEspacosComecoFim);    
    }

    private void substituir(){
        String texto = "Minha cassa eh amarela";
        texto = texto
            .replace("cassa", "casa")
            .replace("eh", "é");
        JOptionPane.showMessageDialog(null, "Texto corrigido: " + texto);
    }

    private void verificarComecaCom(){
        String produto = "Ipad";

        if (produto.startsWith("IP") == true ||
            produto.startsWith("Mac") == true) {
                JOptionPane.showMessageDialog(null, "Produto Apple");
            } else {
                JOptionPane.showMessageDialog(null, "Outra Empresa");
            }
    }

 private void verificarTerminaCom(){
        String empresa = "Batatinha do Lorenzo S.A.";

        String tipoEmpresa = "";

        if(empresa.endsWith("LTDA") == true){
            tipoEmpresa = "Limitada";
        }else if(empresa.endsWith("S.A.")){
            tipoEmpresa = "Sociedade Anonima";
        }else {
            tipoEmpresa = "MEI";
        }
        JOptionPane.showMessageDialog(null, "Empresa: " + tipoEmpresa);
    }

    private void tamanho() {
        String login = "João_silva";

        if(login.length() >= 20) {
            JOptionPane.showMessageDialog(null, "O nome da empresa deve conter no máximo 20 caracteres");
        }
    }

    private void contemTexto() {
        String mensagem = "João eSilva e Souza";

        boolean ehBrasileiro;

        if (mensagem.contains("Silva")) {
            ehBrasileiro = true;
        } else {
            ehBrasileiro = false;
        }

        JOptionPane.showMessageDialog(null, "Brasileiro? " + ehBrasileiro);
    }

    private void exemploComparacao() {
        String login = "abacate";

        if (login.equals("ABACATE")){
            JOptionPane.showMessageDialog(null, "'É ABACATE'");
        } else {
            JOptionPane.showMessageDialog(null, "'Não é ABACATE'");
        }

        // Comparar ignorando maiúsculas e minúsculas
        if (login.equalsIgnoreCase("ABACATE")){
            JOptionPane.showMessageDialog(null, "foi ignorado as letras maiúsculas e minúsculas'");
        } else {
            JOptionPane.showMessageDialog(null, "'Não é ABACATE'");
        }
    }

    private void descobrirPosicao() {
        String nome = "Paçoca";

        int indeicePosicaoC = nome.indexOf("Ç");

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nPosição: " + indeicePosicaoC);
    }

    private void descobrirCaracter(){
        char caracter = 'B';

        int codigoAscii = (int) caracter;

        JOptionPane.showMessageDialog(null, "Caracter: " + caracter + "\nCódigo ASCII: " + codigoAscii);
    }

    private void pegarCaractereDaString(){
        String mensagem = "Oi, rs";

        char segundoCaracter = mensagem.charAt(1);

        JOptionPane.showMessageDialog(null, "Mensagem: " + mensagem + "\nSegundo caracter: '" + segundoCaracter + "'");
    }

    private void dividirString() {
        String palavraComposta = "beija-flor";
        String[] partes = palavraComposta.split("-");

        String parte1 = partes[0];
        String parte2 = partes[1];

        JOptionPane.showMessageDialog(null, "Palavra composta: " + palavraComposta +
        "\n Quantidade de partes: " + partes.length +
        "\nParte 1: " + parte1 + "\nParte 2: " + parte2);
    }

    private void exemploSubstring() {
        String palavraComposta = "guarda-chuva";
        String parte1 = palavraComposta.substring(0, 6);
        String parte2 = palavraComposta.substring(7, 12);

        JOptionPane.showMessageDialog(null, "Palavra composta: " + palavraComposta +
        "\nParte 1: " + parte1 + "\nParte 2: " + parte2);
    }

    private void pegarParteString() {
        String palavraComposta = "guarda-chuva";
        
        int indiceHifen = palavraComposta.indexOf("-");
        int tamanhoString = palavraComposta.length();

        String parte2 = palavraComposta.substring(indiceHifen + 1, tamanhoString);

        JOptionPane.showMessageDialog(null, "Palavra composta: " + "'" + palavraComposta +
        "\nParte 2: " + parte2 + "'");
    }
}