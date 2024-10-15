// Definição de uma classe abstrata chamada Funcionario.
// Uma classe abstrata não pode ser instanciada diretamente, mas pode ser herdada por outras classes.
// O objetivo aqui é definir um modelo genérico de funcionário, com alguns atributos e comportamentos
// que podem ser comuns a todos os tipos de funcionários.
public abstract class Funcionario {

    // Atributos privados da classe, que só podem ser acessados diretamente dentro da própria classe.
    // 'nome' armazena o nome do funcionário.
    private String nome;
    
    // 'cpf' armazena o CPF do funcionário (documento de identificação no Brasil).
    private String cpf;
    
    // 'salario' é um atributo protegido, ou seja, pode ser acessado pelas subclasses diretamente.
    // Isso permite que subclasses de Funcionario possam usar o salário sem a necessidade de usar getters e setters.
    protected double salario;

    // Construtor da classe Funcionario, que será chamado pelas subclasses quando criarem um funcionário.
    // O construtor inicializa os atributos nome, cpf e salario.
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;  // Inicializa o nome do funcionário
        this.cpf = cpf;    // Inicializa o CPF do funcionário
        this.salario = salario;  // Inicializa o salário do funcionário
    }

    // Método abstrato 'calcularSalario'.
    // Isso significa que as subclasses são obrigadas a implementar esse método.
    // Cada tipo de funcionário pode ter uma forma diferente de calcular o salário, 
    // por isso deixamos o método abstrato aqui, sem implementação.
    public abstract double calcularSalario();

    // Getters e Setters são métodos usados para acessar e modificar os atributos privados da classe.

    // Getter para o nome do funcionário. Permite que outras classes leiam o nome do funcionário.
    public String getNome() {
        return nome;
    }

    // Setter para o nome do funcionário. Permite que outras classes alterem o nome do funcionário.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o CPF do funcionário. Permite que outras classes leiam o CPF do funcionário.
    public String getCpf() {
        return cpf;
    }

    // Setter para o CPF do funcionário. Permite que outras classes alterem o CPF do funcionário.
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para o salário do funcionário. Permite que outras classes leiam o valor do salário.
    public double getSalario() {
        return salario;
    }

    // Setter para o salário do funcionário. Permite que outras classes alterem o valor do salário.
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
