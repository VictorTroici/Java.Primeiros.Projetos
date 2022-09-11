
package lista2.pkg1;

import javax.swing.JOptionPane;


public class Aprovacao {
    
    public static void main(String[] args){
    
    double trab1, trab2, trab3;
    double mediaFinal;
    double a1, a2, a3;
    
    a1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno na primeira prova (MAX 3)"));
    a2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno na segunda prova (MAX 3)"));
    
    trab1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno no primeiro trabalho (MAX 4)"));
    trab2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno no segundo trabalho (MAX 4)"));
    trab3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno no terceiro trabalho (MAX 4)"));
    
    a3 = (trab1 + trab2 + trab3) / 3;
    
    mediaFinal = a1 + a2 + a3;
    
        if (mediaFinal < 4){
    
        System.out.println(mediaFinal);
        System.out.println("O aluno esta reprovado :(");
        
        } if ((mediaFinal >= 4) && (mediaFinal < 6)){
    
        System.out.println(mediaFinal);    
        System.out.println("O aluno esta de exame :(");
        
        } if ((mediaFinal >= 6) || (mediaFinal >= 10)){
    
        System.out.println(mediaFinal);    
        System.out.println("O aluno esta aprovado!!! :)");
        
        } 
       
    }
    
    
}
