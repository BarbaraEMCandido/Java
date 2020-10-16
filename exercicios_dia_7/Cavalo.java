package Atividades_dia_7;

public class Cavalo extends Animal {
	
	private String locomocao;
	
	public Cavalo (String locomocao) {
		super("Cavalo", 10, "iiirrirrirri");
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
