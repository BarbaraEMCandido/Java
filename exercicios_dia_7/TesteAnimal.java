package Atividades_dia_7;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro ("Corre");
		Cavalo cav = new Cavalo ("Corre");
		Preguica preg = new Preguica ("Sobe em árvores");
		
		Animal animal = null;
		
		int n = (int) (Math.random() * 3);
		
		switch (n) {
		
		case 0: animal = cao; break;
		case 1: animal = cav; break;
		case 2: animal = preg; break;
		default: System.out.println("Nenhum animal encontrado");
		}
		
		if (animal != null) {
			animal.SomAnimal(animal.getSom());
		}
	}
}
