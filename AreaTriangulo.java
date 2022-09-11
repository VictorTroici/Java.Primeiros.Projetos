import javax.swing.JOptionPane;


public class AreaTriangulo {
    
    public static void main(String[] args) {
     
        double altura;
        double base;
        double area;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do triangulo?"));
        base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do triangulo?"));
        
        area = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null, "A area do triangulo é de: " + area);
    
    
    
    
    }
    
}