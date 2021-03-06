package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {

	private String name;
	private byte age;
	private int qtdWin;
	private int qtdLoss;

	public Atleta(String name, byte age, int qtdWin, int qtdLoss) {
		super();
		this.name = name;
		this.age = age;
		this.qtdWin = qtdWin;
		this.qtdLoss = qtdLoss;
	}

	public Atleta() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getQtdWin() {
		return qtdWin;
	}

	public void setQtdWin(int qtdWin) {
		this.qtdWin = qtdWin;
	}

	public int getQtdLoss() {
		return qtdLoss;
	}

	public void setQtdLoss(int qtdLoss) {
		this.qtdLoss = qtdLoss;
	}

	public void comemorarVitoria() {
		System.out.println("Parab?ns");
		this.qtdWin++;
	}
	
	public void aprenderComDerrota() {
		System.out.println("Quem sabe na proxima :/");
		this.qtdLoss++;// this.qtdLoss = qtdLoss + 1;
	}
}
