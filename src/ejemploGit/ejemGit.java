package ejemploGit;

/*Ejercicio de Ejemplo con Git.
  Programa que pida al usuario un valor por teclado y haga la suma y resta dos variables.
  Mostaremos el resultado de la suma y resta por pantalla.  	
*/
import javax.swing.JOptionPane;
public class ejemGit {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(null, "Introduzca el primer valor: ");
		String num2 = JOptionPane.showInputDialog(null, "Introduzca el segundo valor: ");
		float aa, bb;
		aa = Float.parseFloat(num1);
		bb = Float.parseFloat(num2);
		float suma, resta, producto, division;
		suma = aa + bb;
		resta = aa - bb;
		producto = aa * bb;
		division = aa / bb;
		JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);
		JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta);
		JOptionPane.showMessageDialog(null,"El resultado del producto es: " + producto);
		JOptionPane.showMessageDialog(null,"El resultado de la division es: " + division);
	}

}

