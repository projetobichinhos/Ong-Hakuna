package Generation;

public class ANIMAL {

	private String nome;
	private int idade;
	private String cor;
	private String vacina;
	private String castrado;
	private String comportamento;
	private String endereco;
	private int telefone;
	private String sexo;

	public ANIMAL(String nome, int idade, String cor, String vacina, String castrado, String comportamento,
			String endereco, int telefone, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.castrado = castrado;
		this.comportamento = comportamento;
		this.cor = cor;
		this.endereco = endereco;
		this.telefone = telefone;
		this.vacina = vacina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
