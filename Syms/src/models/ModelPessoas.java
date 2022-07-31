package models;

import java.util.Date;

public class ModelPessoas {
	private String nome;
	private String CPF;
	private String sexo;
	private Date dataNascimento;
	private String logradouro;
	private String bairro;
	private int numero;
	private String CEP;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	
	public ModelPessoas(String nome, String CPF, String sexo, Date dtNascimento, String logradouro,
			String bairro, int numero, String CEP, String cidade, String estado, String telefone, String email) {
		this.nome = nome;
		this.CPF = CPF;
		this.sexo = sexo;
		this.dataNascimento = dtNascimento;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.CEP = CEP;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
