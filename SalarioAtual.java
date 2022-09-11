import javax.swing.JOptionPane;

public class SalarioAtual {
    
    
    public static void main(String[] args){
    
        float salario;
        double conversao;
        double porcentagem = 25.00 / 100.00;
        
        
        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor do salario atual do funcionario?"));
        
        conversao = salario + (salario * porcentagem)  ;
        
        JOptionPane.showMessageDialog(null, "O novo valor do salario é de: " + conversao);
        
    }
    
}