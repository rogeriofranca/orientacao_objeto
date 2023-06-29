package entidade_II;

import java.util.List;

public class Executavel {
    public static void main(String[] arqs) {
        Contato roger = new Contato("Roger", "21 999999999", "Rua Resiliencia 22", "roger@email.com", "Sou Eu");
        Contato jean = new Contato("Jean", "21 988888888", "Rua Charlles 300", "jean@email.com", "My Brother");
        Contato jeck = new Contato("Jeck", "21 982828282", "Rua Stop 44", "jeck@email.com", "Um Louco");

        Agenda agenda1 = new Agenda(List.of(jean, roger, jeck), "Azul", 333, true);
        Agenda agenda2 = new Agenda(List.of(roger, jean), " amarela", 197, false);
        Agenda agenda3 = new Agenda(List.of(jeck, jean), "Verde", 1123, true);
        System.out.println(agenda1.toString());
        System.out.println("X-X-X-X-X-X-X-X-X-X-X");
        System.out.println(agenda2.toString());
        System.out.println(agenda3.toString());

    }
}
