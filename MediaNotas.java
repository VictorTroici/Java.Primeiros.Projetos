import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args){
    
        double nota1, nota2, nota3;
        double mediatotal;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota?"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota?"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a terceira nota?"));
        
        mediatotal = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / (3 + 3 + 4);
        
        JOptionPane.showMessageDialog(null, "A media do aluno foi de: " + mediatotal);
    
    
    
    
    }
}