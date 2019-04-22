
public class Produto {
	private String nome;
	private String codigo;
	private double precoCompra;
	private double precoVenda;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(String nome, String codigo, double precoCompra, double precoVenda, int quantidade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void removerQuantidade(int numero) {
		if(numero <= this.quantidade){
			this.quantidade -= numero;
		}
	}
	

	
	

}
