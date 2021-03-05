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
       
       if (c1.getIdade() >= 18)
       {
           System.out.println("Você é maior de idade");
       }
       else 
       {
           System.out.println("Você é menor de idade");
       }
       
       if (c1.getRenda() > 15000)
       {
           System.out.println("Você é RICOOOO");
       }
       else 
       {
           System.out.println("Você é igual eu. POBRE");
       }
       
               
                
    }
    
}
