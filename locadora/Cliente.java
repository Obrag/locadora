public class Cliente{

    //atributos de classe
    String nome;
    int idade;
    String email;
    int telefone;


    // metodos construtor apenas no ato da instancia
    public Cliente(String nome, int idade, String email, int telefone){

        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;

    }

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Idade: " + idade + "\n" +
        "Email: " + email + "\n" +
        "Telefone: " + telefone + "\n" + "\n");
    }


    public static void main(String[] args) {

        Cliente C1 = new Cliente("luiz", 18, "luiz@hotmail.com.br", 9130961534);
        Cliente C2 = new Cliente("felipe", 38, "felipe@gmail.com", 548941237);

        C1.Informacao();
        C2.Informacao();
        
    }

}