// Definição da classe FuncionarioAdministrativo, que herda da classe Funcionario.
// A palavra-chave 'extends' indica que FuncionarioAdministrativo é uma subclasse de Funcionario,
// herdando assim os atributos e métodos definidos na classe Funcionario.
public class FuncionarioAdministrativo extends Funcionario {

    // Construtor da classe FuncionarioAdministrativo.
    // Este construtor recebe três parâmetros: nome, CPF e salário, e os passa para o construtor da classe pai (Funcionario) usando a função 'super()'.
    // A chamada a 'super()' garante que os atributos nome, cpf e salario sejam inicializados corretamente na classe base Funcionario.
    public FuncionarioAdministrativo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);  // Chamada ao construtor da classe Funcionario (classe base).
    }

    // Implementação do método abstrato calcularSalario, que foi definido na classe Funcionario.
    // Como Funcionario é uma classe abstrata, as subclasses (como FuncionarioAdministrativo) são obrigadas a implementar esse método.
    // Neste caso, o salário é simplesmente o valor armazenado no atributo 'salario', herdado da classe Funcionario.
    @Override
    public double calcularSalario() {
        return salario;  // Retorna o salário diretamente, sem nenhum cálculo adicional.
    }
}

