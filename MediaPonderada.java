import javax.swing.JOptionPane;

public class MediaPonderada {
    
    public static void main(String[] args){
    
        double media1;
        double media2;
        double mediaTotal;
        
        media1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da media 1?"));
        media2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da media 2?"));
        
        mediaTotal = ((media1 * 2) + (media2 * 3)) / (3 + 2);
        
        JOptionPane.showMessageDialog(null, "A media total da nota foi de:" + mediaTotal);
        
    
    
    
    }
    
    
}