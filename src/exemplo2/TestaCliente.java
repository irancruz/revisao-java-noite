package exemplo2;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente natan = new Cliente();
		natan.setNome("Natan");
		System.out.println(natan.getNome());
		
		int resultado = subtrair("jose", "5");
		
		System.out.println(resultado);
	}
	
	
	
	private static int subtrair(String n1, String n2) {
		try {
			return Integer.parseInt(n1) - Integer.parseInt(n2);			
		}catch (NumberFormatException ex) {
			System.out.println("Não pode ser texto");
		}
		return 0;
	
	}

}
