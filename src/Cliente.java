
public class Cliente {
	private Pessoa dados;
	private double debito;
	private Venda compras[];
	
	
	
	
	public Pessoa getDados() {
		return dados;
	}
	public void setDados(Pessoa dados) {
		this.dados = dados;
	}
	public double getDebito() {
		return debito;
	}
	public Venda[] getCompras() {
		return compras;
	}
	public void setCompras(Venda[] compras) {
		this.compras = compras;
	}
	
	public void pagamento(double valor) {
		this.debito -= valor;
	}
	
	
	
}
