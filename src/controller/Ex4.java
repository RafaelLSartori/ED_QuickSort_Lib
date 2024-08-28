package controller;

import br.edu.fateczl.quicksort.Ordenacao_QuickSort;

public class Ex4 {
	public Ex4() {
		super();
	}
	
	public void quick(int [] vet) {
		Ordenacao_QuickSort m = new Ordenacao_QuickSort();
		
		int inicio = 0;
		int fim = vet.length - 1;
		m.quickSort(vet, inicio, fim);
		System.out.println(" ");
		System.out.println("-----------------------------");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
