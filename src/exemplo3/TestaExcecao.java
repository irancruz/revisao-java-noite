package exemplo3;

public class TestaExcecao {

	public static void main(String[] args) {
//		int [] numeros = new int[4];
//		
//		try {
//			int n = 7/0;
//			numeros[7] = 10;
//		}catch (ArithmeticException ex) {
//				System.out.println("Estou de Array");
//		}catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Estou de Array");
//		}finally {
//			System.out.println("Bloco sempre executado");
//		}
//				
	
		int x = 2;
		int y = 0;
		try {
			
			System.out.println(dividir(x,y));
		}catch (ErroException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int dividir (int a, int b) throws ErroException{ //gerando uma execeção existetne
		if (a == b) {
			throw new ErroException("Não pode dividr por ZERO");			
		}
		return a / b;
	}

}
