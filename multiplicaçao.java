import javax.swing.JOptionPane;

public class multiplicaçao {
    
    
    
    public static void main(String[]args){
        
        double numero1, numero2, numero3, resultado;
    
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do primeiro numero"));
        
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do segundo numero"));
        
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do terceiro numero"));
        
        resultado = numero1 * numero2 * numero3;
                
        
       JOptionPane.showMessageDialog(null, "O resultado da multiplicaçao é: " + resultado);
        
        
        
    }
}