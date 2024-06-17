public class Cliente {

     //Atributos
     private String nome;
     private String cpf;
     
     //Getters
     public String getNome(){
        return nome;
     }
     public String getCPF(){
        return cpf;
     }
 
     //Setters
     public void setNome(String newName){
        nome = newName;
     }
     public void setCPF(String newCPF){
        cpf = newCPF;
     }

     //toString
    @Override
    public String toString() {
        return
         "Cliente [nome=" + nome
         + ", cpf=" + cpf + "]";
    }

     

}
