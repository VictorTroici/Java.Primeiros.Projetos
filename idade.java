import javax.swing.JOptionPane;

public class idade {
    
    public static void main(String[] args){
    
    int ano = 2022;
    int idade1;
    int idadetotal;
    
    idade1 = Integer.parseInt(JOptionPane.showInputDialog("Qual ano voce nasceu?"));
    
    idadetotal = ano - idade1;
    
    JOptionPane.showMessageDialog(null, "A sua idade é :" + idadetotal);
    
    }
}