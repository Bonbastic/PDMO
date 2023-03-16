package testeDeUnidade;

public class CalculadoraTeste {

	private Calculadora calculadora;
	
	public void testaCalculadoraSoma() {
		
		calculadora = new Calculadora();
		int resultadoEsperado = 4;
		
		int resultado = calculadora.somar(2, 2);
		
		if (resultado == resultadoEsperado) {
			System.out.print("Teste OK");
		} else {
			System.out.print("Teste Falhou");
		}
	}
}
