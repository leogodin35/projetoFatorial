public class Fatorial {
	
	// Versao iterativa do calculo do fatorial, incluindo teste para n = 0
	public int calcularFatorial(int n) throws IllegalArgumentException{

		if (n < 0)
		   throw new IllegalArgumentException("Nao existe fatorial de numero negativos");
		
		int resultado = 1;
		
		if (n != 0) {
		   for (int i = 2; i <= n; i++)
			resultado *= i;
		};

		return resultado;
	}
}