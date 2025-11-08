public class Aluno {

    private String nomeAluno;
    private int idadeAluno;
    private String curso;
    private boolean matriculado;
    private double nota1;
    private double nota2;

    // Construtor

    public Aluno(String nomeAluno, int idadeAluno, String curso){
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.curso = curso;
        this.matriculado = false;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    //Métodos Getters e Setters


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Métodos Comportamentais

    public void matricular(){
        if(this.matriculado){
            this.matriculado = true;
            System.out.println("Aluno Matriculado com Sucesso");

        }else{
            System.out.println("Aluno já está Cadastrado");
        }

    }
    public void cancelarMatricula() {
        if (this.matriculado) {
            System.out.println("Matricula Cancelada");

        } else {
            System.out.println("Aluno já está com matricula inativa");
        }

    }

    public void verificarMaiorIdade(){
        if (this.idadeAluno > 18) {
            System.out.println("Aluno é maior de idade e pode participar de cursos noturnos.");
        }else {
            System.out.println("Aluno é menor de idade e não pode participar de cursos noturnos.");
        }
    }

    public void cadastrarNotas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        System.out.println("Aluno Cadastrado com Sucesso");
        System.out.println("Aluno Cadastrado com Sucesso");
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public void verificarAprovacao() {
        if (this.nota1 == 0.0 && this.nota2 == 0.0) {
            System.out.println("Notas não cadastradas.");
            return;
        }

        double media = calcularMedia();

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void exibirInformacoes (){
        System.out.println("Nome: " + this.nomeAluno);
        System.out.println("Idade: " + this.idadeAluno);
        System.out.println("Curso: " + this.curso);
        System.out.println("Notas: " + this.nota1);
        System.out.println("Notas: " + this.nota2);
        System.out.println("Media: " + this.calcularMedia());
    }






}