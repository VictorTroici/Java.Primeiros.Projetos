import javax.swing.JOptionPane;


public class Gasolina {
    public static void main(String[] args) {
    
        double distancia;
        double litros;
        double percurso;
        
        distancia = Double.parseDouble(JOptionPane.showInputDialog("Qual a distancia percorrida?"));
        litros = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de litros gasto"));
        
        percurso = distancia / litros;
        
        JOptionPane.showMessageDialog(null, "A quantidade litros por km foi de: " + percurso);
    
    
    
    }
    
}