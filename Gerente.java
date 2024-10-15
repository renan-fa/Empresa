// Definição da classe Gerente, que herda da classe Funcionario e implementa a interface Autenticavel.
// Isso significa que Gerente possui todos os atributos e métodos de Funcionario, além de ser obrigada
// a fornecer uma implementação do método autenticar() definido pela interface Autenticavel.
public class Gerente extends Funcionario implements Autenticavel {

    // Atributo privado que representa o bônus anual do gerente.
    private double bonusAnual;

    // Atributos privados para armazenar as credenciais de autenticação do gerente: o nome de usuário e a senha.
    private String usuario;
    private String senha;

    // Construtor da classe Gerente.
    // Recebe cinco parâmetros: nome, CPF, salário, bônus anual, nome de usuário e senha.
    // O nome, CPF e salário são passados para o construtor da classe base (Funcionario) usando 'super()',
    // enquanto o bônus anual e as credenciais (usuario, senha) são inicializados diretamente.
    public Gerente(String nome, String cpf, double salario, double bonusAnual, String usuario, String senha) {
        super(nome, cpf, salario);  // Chama o construtor da classe Funcionario.
        this.bonusAnual = bonusAnual;  // Inicializa o atributo bonusAnual.
        this.usuario = usuario;  // Inicializa o atributo usuario.
        this.senha = senha;  // Inicializa o atributo senha.
    }

    // Sobrescrita do método calcularSalario, que foi definido como abstrato na classe Funcionario.
    // Para o Gerente, o salário é calculado somando o salário base com o bônus anual.
    @Override
    public double calcularSalario() {
        return salario + bonusAnual;  // Retorna o salário base mais o bônus anual.
    }

    // Implementação do método autenticar, conforme exigido pela interface Autenticavel.
    // O método autenticar compara o nome de usuário e a senha fornecidos com os armazenados no objeto Gerente.
    // Se ambos coincidirem, retorna true, indicando que a autenticação foi bem-sucedida.
    @Override
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);  // Verifica se as credenciais estão corretas.
    }

    // Getter para o atributo bonusAnual.
    // Retorna o valor do bônus anual do gerente.
    public double getBonusAnual() {
        return bonusAnual;
    }

    // Setter para o atributo bonusAnual.
    // Permite modificar o valor do bônus anual do gerente.
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    // Getter para o atributo usuario.
    // Retorna o nome de usuário do gerente.
    public String getUsuario() {
        return usuario;
    }

    // Setter para o atributo usuario.
    // Permite modificar o nome de usuário do gerente.
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Getter para o atributo senha.
    // Retorna a senha do gerente.
    public String getSenha() {
        return senha;
    }

    // Setter para o atributo senha.
    // Permite modificar a senha do gerente.
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
