public class Funcionario{

    //atributos de classe
    String nome;
    int idade;
    String email;
    int telefone;
    String funcao;


    // metodos construtor apenas no ato da instancia
    public Funcionario(String nome, String funcao, int idade, String email, int telefone){

        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;

    }

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Função: " + funcao + "\n" +
        "Idade: " + idade + "\n" +
        "Email: " + email + "\n" +
        "Telefone: " + telefone + "\n" + "\n");
    }


    public static void main(String[] args) {

        Funcionario C1 = new Funcionario("braga", "consultor", 13, "braga@hotmail.com.br", 158752697);
        Funcionario C2 = new Funcionario("gonçalves", "analista", 22, "gonçalves@gmail.com", 158496587);

        C1.Informacao();
        C2.Informacao();
        
    }

}