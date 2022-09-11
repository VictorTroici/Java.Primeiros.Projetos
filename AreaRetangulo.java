import javax.swing.JOptionPane;

public class AreaRetangulo {
    
    public static void main(String[] args){
    
         double altura;
         double base;
         double area;
         
         base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do retangulo?"));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do retangulo?"));
         
         area = altura * base;
         
         JOptionPane.showMessageDialog(null, "A area do retangulo é: " + area);
         
    
    
    }
    
}