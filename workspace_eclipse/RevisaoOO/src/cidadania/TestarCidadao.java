package cidadania;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe de teste para as classes Pessoa e Cidadao. Exercício: Herança.
 */
class TestarCidadao {

    /**
     * Testa a funcionalidade da classe Cidadao.
     */
	@Test
	void TestandoCidadao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Entre com o sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Entre com a idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Entre com o CPF: ");
        scanner.nextLine();
        String cpf = scanner.nextLine();

        Cidadao cidadao = new Cidadao(nome, sexo, idade, cpf);

        System.out.println("Nome: " + cidadao.nome);
        System.out.println("Sexo: " + cidadao.sexo);
        System.out.println("Idade: " + cidadao.idade);
        System.out.println("CPF: " + cidadao.cpf);

        scanner.close();
    }

}
