//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno Aluno_1 = new Aluno("Maria",17,"Sistema de Informação");
        Aluno_1.matricular();
        Aluno_1.cadastrarNotas(5.5,4.5);
        Aluno_1.exibirInformacoes();
        Aluno_1.calcularMedia();
        Aluno_1.verificarAprovacao();
        Aluno_1.cancelarMatricula();

    }
}