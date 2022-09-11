
package lista2.pkg1;

import javax.swing.JOptionPane;


public class Base_Triangulo {
    
    public static void main(String[] args){
    
        
        double altura1, altura2, altura3;
        double base1, base2, base3;
        double resultado1, resultado2, resultado3;
        
        altura1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do tringulo 1"));
        base1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do tringulo 1"));
        
        altura2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do tringulo 2"));
        base2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do tringulo 2"));
        
        altura3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do tringulo 3"));
        base3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do tringulo 3"));
        
        resultado1 = (altura1 * base1) / 2;
        resultado2 = (altura2 * base2) / 2;
        resultado3 = (altura3 * base3) / 2;
        
        if ((resultado1 > resultado2) && (resultado1 > resultado3)) {
    
            System.out.printf("%.2f",resultado1);
            System.out.println(" ---> O tringulo com maior area e o A");
    
    
        } if ((resultado2 > resultado1) && (resultado2 > resultado3)) {
    
            System.out.printf("%.2f",resultado2);
            System.out.println(" ---> O tringulo com maior area e o B");
        
        } if ((resultado3 > resultado1) && (resultado3 > resultado2)) {
        
            System.out.printf("%.2f",resultado3);
            System.out.println(" ---> O tringulo com maior area e o C");
        
        } 
        
    }
}

