package cidadania;

class Cidadao extends Pessoa {
    String cpf;

    Cidadao(String nome, String sexo, Integer idade, String cpf) {
        super(nome, sexo, idade); 
        this.cpf = cpf;
    }
}