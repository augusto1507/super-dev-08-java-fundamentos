public class Exemplo02Variaveis {
	public static void main(String[] args){
		String nome = "Claudinho";
		String sobrenome = "da Silva";
		String nomeCompleto = nome + " " + sobrenome;
		
		int idade = 21;
		double salario = 2100.95;
		boolean empregado = true;
		char letraFavorita = 'Ç';
		
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Empregado? " + empregado);
		System.out.println("Letra favorita: " + letraFavorita);
	}
}