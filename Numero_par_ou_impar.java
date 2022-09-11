
package lista2.pkg1;

import javax.swing.JOptionPane;


public class Numero_par_ou_impar {
    public static void main(String[] args){
    
    int num;
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do numero??"));
    
    if (num %2==0){
       
        System.out.println(num);
        System.out.println("Esse numero e par!!!");
    
    } else {
    
        System.out.println(num);
        System.out.println("Esse numero e impar!!");
    
    }
    
    
    
    
    
    }
}
