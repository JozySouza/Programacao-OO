package Heranca_Parte2;
//classe de exemplo para o exercicio da aula 4 de OO
public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

       // Vendedor vendedor1 = (Vendedor) new Funcionario(); ClasscastException downcast deve ser evitado em java

    }

}
