package Atividades_dia_7;

public class Cachorro extends Animal {
	private String locomocao;
	
	public Cachorro (String locomocao) {
		super("Cachorro", 5, "Au au au");
		this.locomocao = locomocao;
	}

	@Override
	public void SomAnimal(String som) {
		System.out.println("O " + getNome() + " emite o som: " + som );
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}

}
