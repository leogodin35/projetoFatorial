public class Fatorial {
	
	// Vers�o iterativa do c�lculo do fatorial
	public int calcularFatorial(int n) throws IllegalArgumentException{

		if (n<0)
			throw new IllegalArgumentException("Nao existe fatorial de numero negativos");
		int resultado = 1;
		
		for (int i = 2; i <= n; i++)
			resultado *= i;
		return resultado;
	}
}