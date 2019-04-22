import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<Produto> produtos;
	private double total;
	
	
	public Venda() {
		this.produtos = new ArrayList<>();
		this.total = 0.0;
	
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public void calculoTotal(){
		for(Produto prod : this.produtos) {
			this.total += prod.getPrecoVenda();
			
		}
	}
	
	public void adicionaProduto(Produto produto, int quantidade) {
		this.produtos.add(produto);
		this.total += produto.getPrecoVenda() * quantidade;
		produto.removerQuantidade(quantidade);
	}
	
}
