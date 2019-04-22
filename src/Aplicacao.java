
public class Aplicacao {

	public static void main(String[] args) {
		
		Produto prod01 = new Produto("Cimento", "554412", 12.50, 25.00, 10);
		Produto prod02 = new Produto("Cola", "6451132", 10.00, 15.90, 10);
		
		
		Venda vend1 = new Venda();
		vend1.adicionaProduto(prod01, 5);
		vend1.adicionaProduto(prod02, 5);
		System.out.println(vend1.getTotal());
		System.out.println(prod01.getQuantidade());
		System.out.println(prod02.getQuantidade());
		
		

	}

}
