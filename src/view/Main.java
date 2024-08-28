package view;

import javax.swing.JOptionPane;

import controller.Ex4;

public class Main {

	public static void main(String[] args) {
		Ex4 sort = new Ex4();
		
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite qual exercício deseja ordernar 1, 2 ou 3: "));
			switch(opc) {
				case 1: int[] vet1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
					sort.quick(vet1);
					break;
				case 2:	int[] vet2 = {44, 43, 42, 41, 40, 39, 38};
					sort.quick(vet2);
					break;
				case 3: int[] vet3 = {31, 32, 33, 34, 99, 98, 97, 96};
					sort.quick(vet3);
					break;
				case 9: JOptionPane.showMessageDialog(null, "FIM!");
					break;
				default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");	
			}
		
		}
		
	}

}
