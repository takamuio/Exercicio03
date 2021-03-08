import java.util.Scanner;

public class Teste 
{
    
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        
        System.out.println("Digite seu nome: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite sua renda: ");
        c1.setRenda(ler.nextDouble());
        
        
         System.out.println("Visualiando dados!");
       
       System.out.println("Nome: " + c1.getNome());
       
       c1.classificarIdade();
       c1.classificarRenda();
    }
    
}
