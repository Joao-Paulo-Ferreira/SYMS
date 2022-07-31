package models;

public class ModelFornecedor {
	private int idFornecedor;
	private String nome;
	private String CNPJ;
	private String telefone;
	private String email;
	
	public ModelFornecedor(int idFornecedor, String nome, String CNPJ, String telefone, String email) {
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.telefone = telefone;
		this.email = email;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
