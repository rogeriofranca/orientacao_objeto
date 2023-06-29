package entidade_III;

import entidade_III.entidades.Escola;
import entidade_III.entidades.Funcionario;
import entidade_III.enums.Turma;
import entidade_IV.entidades.Aluno;

import java.util.List;

public class Executavel {
    public static void main(String[] args) {

        Funcionario allan = new Funcionario("Allan", 1212, "Pofessor", 2240.03, 20, true);
        Funcionario bella = new Funcionario("Bella", 2020, "Inspetora", 1400.44, 160, false);
        Funcionario thomas = new Funcionario("Thomas", 309, "Diretor", 2879.33, 120, true);

        Aluno aluno1 = new Aluno("GIL",2323, Turma.TURMA_A, "PRIMEIRO ANO");
        Aluno aluno2 = new Aluno("GOMES",2325, Turma.TURMA_B, "PRIMEIRO ANO");
        Aluno aluno3 = new Aluno("DUDA",2326, Turma.TURMA_C, "SEGUNDO ANO");
        Aluno aluno4 = new Aluno("GAL",2327, Turma.TURMA_D, "PRIMEIRO ANO"); // OLHE NO ENUM TURMA
        Aluno aluno5 = new Aluno("CAT",2328, Turma.TURMA_D, "PRIMEIRO ANO");

    /*

        System.out.println(allan);
        System.out.println("===========================");
        System.out.println(bella);
        System.out.println("===========================");
        System.out.println(thomas);
     */
        Escola anexo = new Escola(
                List.of(allan, bella, thomas),
                List.of(aluno1, aluno2, aluno3),
                "anexo",
                1448234,
                36,
                "Rua Aleluia",
                12333.33,
                true);
        System.out.println(anexo);


        System.out.println("getMatricula: " + allan.getMatricula());

        allan.setMatricula(1215);
        System.out.println("Depois do setMatricula: " + allan.getMatricula());
        System.out.println(anexo);
    }


}
