import javax.swing.JOptionPane;

public class AreaDoCirculo {
    
    public static void main(String[] args){
    
        double pi = 3.14;
        double area;
        double areaDoCirculo;
        
        area = Double.parseDouble(JOptionPane.showInputDialog("Qual a area do ciruclo?"));
        
        areaDoCirculo = pi * Math.pow(area, 2);
        
        JOptionPane.showMessageDialog(null, "A area do circulo é de: " + areaDoCirculo);
        
    
    
    
    
    }
    
}