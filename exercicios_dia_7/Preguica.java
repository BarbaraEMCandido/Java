package Atividades_dia_7;

public class Preguica extends Animal {
	
private String locomocao;
	
	public Preguica (String locomocao) {
		super("Preguiça", 2, "auiiiiiiiiiii");
		this.locomocao = locomocao;
	}

	@Override
	public void SomAnimal(String som) {
		System.out.println("A " + getNome() + " emite o som: " + som );
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}

	
}
