package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class SistemaDeCompras {

	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);}
	//Int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));}	
	//Double
	static double quebrado(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));}
	
	
	public static void main(String[] args) {
		//Instanciar Objetos
		
		Produto[] vetorProdutos = new Produto[3];
		
		int indice = 0;
		
		
		do {
			vetorProdutos[indice] = new Produto();
			vetorProdutos[indice].setCodigo(inteiro("Digite o Codigo do Produto"));
			vetorProdutos[indice].setTipo(texto("Tipo de Produto"));
			vetorProdutos[indice].setMarca(texto("Marca"));
			vetorProdutos[indice].setQuantidade(inteiro("Quantidade"));
			vetorProdutos[indice].setValor(quebrado("Valor do Produto"));
			
			indice ++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar mais produtos?",
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		
		for(int contador = 0; contador < indice; contador ++) {
			
			System.out.println("\n\nCodigo: " + vetorProdutos[contador].getCodigo() +
					"\nTipo: " + vetorProdutos[contador].getTipo() +
					"\nMarca: " + vetorProdutos[contador].getMarca() +
					"\nQuantidade: " + vetorProdutos[contador].getQuantidade() +
					"\nValor: " + vetorProdutos[contador].getValor());
		}
	}

}
