import javax.swing.JOptionPane;

public class Exemplo05Conversoes{
	public static void main(String[] args){
		int numero = Integer.parseInt("2");
		double salario = Double.parseDouble("2.30");
		boolean vivo = Boolean.parseBoolean("true");
		String numeroTexto = String.valueOf(numero);

		JOptionPane.showMessageDialog(null,
			"Número: " + numero +
			"\nSalário: " + salario +
			"\nVivo : " + vivo +
			"\nNúmero em texto: " + numeroTexto);
 	}
}