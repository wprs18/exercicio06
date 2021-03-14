package exercicio.main;

public class main {
	
	public static void main(String[] args) {
		
		main app = new main();
		app.start();
		
	}
	private void start() {
		String[] array = new String[5];
		array [0] = " Civic; \n";
		array [1] = " Gol; \n";
		array [2] = " Palio; \n";
		array [3] = " Uno; \n";
		array [4] = "  ";
		
		System.out.println("Nome do carro : \n" + array[0] + array[1] + array[2] + array[3]);
		for (int i = 0; i< array.length; i++);
			array[1] = " L200";
			System.out.println("Nome do carro : \n" + array[0] + array[1] + array[2] + array[3]);
			array[4] = " Gol";
			System.out.println("Nome do carro : \n" + array[0] + array[1] + array[2] + array[3] + array[4]);	
	}
}