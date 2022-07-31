package models;

public class ModelProduto {
	private int codProduto;
	private String nomeProd;
	private String marca;
	private String modelo;
	private double preco;
	private int quantidade;
	
	public ModelProduto(int codProduto, String nomeProd, String marca, String modelo, double preco, int qtd) {
		this.codProduto = codProduto;
		this.nomeProd = nomeProd;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.quantidade = qtd;
	}
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
