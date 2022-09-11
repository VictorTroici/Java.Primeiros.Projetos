
package lista2.pkg1;

import javax.swing.JOptionPane;

public class Dois_numeros_inteiros{
    
    public static void main(String[] args){
    
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do numero 1")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do numero 2"));
        
        if (num1 > num2) {
            
            System.out.println(num1);
            System.out.println("O numero 1 e o maior!!!");
        
        } else {
 
            System.out.println(num2);
            System.out.println("O numero 2 e o maior!!!");
        
        }
    
    }
    
}
