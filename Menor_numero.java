
package lista2.pkg1;

import javax.swing.JOptionPane;


public class Menor_numero {
    
    public static void main(String[] args){
    
        double num1, num2;
        
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do numero 1?"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do numero 2?"));
        
        if (num1 < num2){
            
            System.out.printf("%.2f", num1);
            
            System.out.println(" --->  O numero 1 e o menor numero!!!!");
        
        } else {
        
             System.out.printf("%.2f", num2);
             System.out.println(" --->  O numero 2 e o menor numero!!!!");
        
        }
        
        
        
    
    }
}