// Definição da classe Vendedor, que herda da classe Funcionario.
// A palavra-chave 'extends' indica que Vendedor é uma subclasse de Funcionario,
// herdando assim os atributos e métodos da classe Funcionario.
public class Vendedor extends Funcionario {

    // Atributo privado para armazenar a comissão do vendedor.
    // Esse valor será somado ao salário base para calcular o salário final.
    private double comissao;

    // Construtor da classe Vendedor.
    // Recebe quatro parâmetros: nome, CPF, salário e comissão.
    // O nome, CPF e salário são passados para o construtor da classe base (Funcionario) usando 'super()',
    // enquanto o atributo específico comissao é inicializado diretamente.
    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario.
        this.comissao = comissao;  // Inicializa o atributo comissao.
    }

    // Sobrescrita do método calcularSalario, que foi definido como abstrato na classe Funcionario.
    // Para o Vendedor, o salário é calculado somando o salário base (herdado de Funcionario) com a comissão.
    @Override
    public double calcularSalario() {
        return salario + comissao;  // Retorna o salário base mais a comissão.
    }

    // Getter para o atributo comissao.
    // Retorna o valor da comissão do vendedor.
    public double getComissao() {
        return comissao;
    }

    // Setter para o atributo comissao.
    // Permite alterar o valor da comissão do vendedor.
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

