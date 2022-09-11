package lista2.pkg1;

import javax.swing.JOptionPane;

public class Media_Aritimedica {
    public static void main(String[] args) {
    
        double media1, media2;
        double mediaTotal;
        
        media1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a media 1?"));
        media2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a media 2?"));
        
        mediaTotal = (media1 + media2) / 2;
        
        System.out.println(mediaTotal);
        
        if (mediaTotal >= 6){
            System.out.println("Voce esta aprovado!!!");
        } else {
            System.out.println("Voce esta reprovado");
        }
          
    
    }
}

