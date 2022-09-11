
package lista2.pkg1;

import javax.swing.JOptionPane;

public class Categoria {
    
    public static void main(String[] args){
    
    int idade;
    
    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
    
    if (idade <= 10){
        
            System.out.println("Voce esta na categoria infantil!!");
            
    } if ((idade == 11) && (idade <= 14)){
        
        System.out.println("Voce esta na categoria Junior!!");
    }
     
    if ((idade == 15) && (idade <= 20)){
        
        System.out.println("Voce esta na categoria Adolescente!!");
     } if ((idade == 21) && (idade <= 35)){
        
        System.out.println("Voce esta na categoria Jovem!!");
     
     } if (idade > 35){
        
        System.out.println("Voce esta na categoria Master!!");
     }
   }    
}
 
    


