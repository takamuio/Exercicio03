
public class Cliente 
{
    private String nome;
    private int idade;
    private double renda;

    String classificarIdade (){
        String resposta;        
        if (this.idade >= 18)
       {
           resposta = "Você é maior de idade";
       }
       else 
       {
           resposta = "Você é menor de idade";
       }
        return resposta;
    }
    
    String classificarRenda (){
        String resposta;
        if (this.renda > 15000)
       {
           resposta = "Você é RICOOOO";
       }
       else 
       {
           resposta = "Você é igual eu. POBRE";
       }
        return resposta;
    }
    
    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public double getRenda() 
    {
        return renda;
    }

    public void setRenda(double renda) 
    {
        this.renda = renda;
    }
    
    
}
