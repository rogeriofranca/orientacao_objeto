package entidade_IV;

import entidade_IV.entidades.Banco;
import entidade_IV.entidades.Cargo;
import entidade_IV.entidades.Cliente;
import entidade_IV.entidades.Funcionario;
import entidade_IV.enums.Setor;
import entidade_IV.enums.TipoConta;

import java.time.LocalDate;
import java.util.List;

public class Executavel {

    public static void main(String[] args) {
        Cargo c1 = new Cargo("Gerente");
        Cargo c2 = new Cargo("TecBancário");
        Cargo c3 = new Cargo("Coordenador");
        Cargo c4 = new Cargo("Caixa");
        Cargo c5 = new Cargo("Atendente");


        Funcionario f1 = new Funcionario(" Jean", LocalDate.of(1977, 8, 9), "Rua 3", "21-883839474", c4, Setor.PENHOR, 3909, 3998.91, false);
        Funcionario f2 = new Funcionario("Roger", LocalDate.of(1980, 4, 10), "Rua 4", "22-999098898", c1, Setor.SIACI, 99498, 4440.56, true);
        Funcionario f3 = new Funcionario("Gal", LocalDate.of(1982, 12, 3), "Rua 19", "21-898989800", c2, Setor.SIAPI, 7777, 39988.09, true);
        Funcionario f4 = new Funcionario("Lia", LocalDate.of(1973, 11, 14), "Rua X", "21-899091119", c3, Setor.SIAPI, 9999, 12004.77, true);
        Funcionario f5 = new Funcionario("Ana", LocalDate.of(1968, 4, 19), "Rua Dev", "21-880010229", c5, Setor.PENHOR, 11194, 6500.09, false);

        Cliente cl1 = new Cliente(" Pedro", LocalDate.of(1980, 6, 10), "Rua XIV", "21 9898000987", TipoConta.CONTA_CORRENTE, "2929-2", "0769");
        Cliente cl2 = new Cliente(" Poll", LocalDate.of(1981, 7, 11), "Rua 100", "24 9898009999", TipoConta.CONTA_POUPANCA, "3939-1", "0889");
        Cliente cl3 = new Cliente(" Bella", LocalDate.of(1982, 8, 12), "Rua Stop", "21 98333337", TipoConta.CONTA_CORRENTE, "5555-9", "0194");
        Cliente cl4 = new Cliente(" Duda", LocalDate.of(1983, 9, 14), "Rua Power", "21 984444987", TipoConta.CONTA_CORRENTE, "7777-8", "0175");
        Cliente cl5 = new Cliente(" Guto", LocalDate.of(1984, 10, 15), "Rua clea", "21 9893332987", TipoConta.CONTA_SALARIO, "445455-4", "0811");

        Banco itau = new Banco(List.of(f1, f2, f3, f4, f5), List.of(cl1, cl2, cl3, cl4, cl5), "Itau", "www.itau.com", "873-4", true);
        System.out.println(itau);

        f1.setCargo(c1);
        System.out.println(itau);

        f4.setDataNascimento(LocalDate.of(1980, 11, 14));
        System.out.println(f4.getDataNascimento());

        Cargo c6 = new Cargo("Superitendente");

        f2.setCargo(c6);
        f2.setSalario(15000.01);

        itau.setNome("Unibanco Itau");
        System.out.println(itau);

        Cargo c7 = new Cargo("Auditor======="); // CRIEI O CARGO AUDITOR
        itau.setNome("BRADESCO==========");  // TROQUEI O NOME DO BANCO
        f5.setCargo(c7);

        f5.setSalario(20100.99); // MUDEI O SALARIO
        f5.setMatricula(9999-9); // MUDEI A MATRICULA

        cl3.setCodigoAgencia("5555-0==========");
        cl1.setNumeroConta("3330-3============");

        System.out.println(itau);



    }

}