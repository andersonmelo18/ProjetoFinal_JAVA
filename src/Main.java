import model.Aluno;
import model.Disciplina;
import model.Pessoa;
import model.Professor;
import enums.CARGO;
import Controller.ProfessorController; // Importa o Controller para usá-lo

public class Main {
    public static void main(String[] args) {

        // 1. Instanciação e Polimorfismo
        Pessoa a = new Aluno("João da Silva", "20251001");
        Professor p1 = new Professor("Maria Oliveira", "Matemática", CARGO.Professor);
        Professor p2 = new Professor("Carlos Souza", "Física", CARGO.Coordenador);

        // 2. Demonstração de Associação e toString()
        Disciplina disciplina = new Disciplina("Cálculo I", "60h", p1, (Aluno) a);
        System.out.println("--- Dados da Disciplina ---");
        System.out.println(disciplina);
        System.out.println("---------------------------\n");

        // 3. Demonstração de Polimorfismo
        System.out.println("--- Atividades (Polimorfismo) ---");
        a.quemSouEu();
        a.minhaAtividade();
        p1.quemSouEu();
        p1.minhaAtividade();
        System.out.println("---------------------------------\n");

        // 4. Demonstração da Camada de Serviço/Controle
        ProfessorController controller = new ProfessorController();
        System.out.println("--- Demonstração Controller/Service ---");

        // Cadastrar Professores
        controller.cadastrarProfessor(p1);
        controller.cadastrarProfessor(p2);

        // Listar Professores
        System.out.println("\nLista Atual:");
        controller.listarProfessores().forEach(System.out::println);

        // Atualizar Professor
        controller.atualizarProfessor("Maria Oliveira", "Maria da Costa");

        // Deletar Professor
        controller.deletarProfessor("Carlos Souza");

        // Listar Professores (após operações)
        System.out.println("\nLista Final:");
        controller.listarProfessores().forEach(System.out::println);
    }
}