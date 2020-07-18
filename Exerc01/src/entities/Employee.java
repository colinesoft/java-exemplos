package entities;

public class Employee {
	private int id;
	private String nome;
	private double salario;
	
	//CONSTRUTORES
	public Employee(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	//GETTERS SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//METODOS ADICIONAIS
	public void ajustaSalario(double porcentagem) {
		salario += porcentagem/100 * salario;
	}
	
	//METODOS SOBRESCRITO
	public String toString() {
		String retorno = "\nID: " + id;
		retorno += "\nNome: " + nome;
		retorno += "\nSalário: " + String.format("%.2f", salario);
		return retorno;
	}
}
