import java.util.ArrayList;
import java.util.List;

// Classe principal SistemaEmpresa
public class SistemaEmpresa {
    public static void main(String[] args) {
        // Criando uma lista para armazenar objetos do tipo Funcionario.
        // ArrayList é utilizado para permitir o armazenamento dinâmico de objetos.
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando diferentes tipos de funcionários à lista.
        // Cada funcionário é instanciado de acordo com sua classe específica (FuncionarioAdministrativo, Vendedor, Gerente).
        // Apesar de todos serem adicionados como Funcionario (classe base), eles mantêm os comportamentos específicos.
        
        // FuncionarioAdministrativo recebe nome, CPF e salário base.
        funcionarios.add(new FuncionarioAdministrativo("Ana", "123.456.789-00", 3000.0));
        
        // Vendedor recebe nome, CPF, salário base e uma comissão.
        funcionarios.add(new Vendedor("Bruno", "987.654.321-00", 2000.0, 500.0));
        
        // Gerente recebe nome, CPF, salário base, bônus, usuário e senha para autenticação.
        funcionarios.add(new Gerente("Carlos", "111.222.333-44", 5000.0, 2000.0, "carlos", "senha123"));

        // Laço for para iterar sobre cada funcionário na lista.
        // Usa o polimorfismo: mesmo que a lista seja de objetos Funcionario, as subclasses implementam o método calcularSalario.
        for (Funcionario f : funcionarios) {
            // Para cada funcionário, é exibido o nome e o salário calculado.
            // O método calcularSalario() será chamado de forma polimórfica, invocando o comportamento específico da subclasse (por exemplo, salário com comissão para Vendedor).
            System.out.println("Nome: " + f.getNome() + " - Salário: R$ " + f.calcularSalario());
        }

        // Exemplo de autenticação utilizando o objeto Gerente.
        // Aqui, acessamos diretamente o Gerente que foi inserido na lista na posição 2 (índice começa em 0).
        Gerente gerente = (Gerente) funcionarios.get(2);  // Realizamos o cast, já que a lista contém o tipo genérico Funcionario.
        
        // O método autenticar() verifica se o nome de usuário e senha estão corretos.
        // Tentamos autenticar o gerente com as credenciais fornecidas.
        boolean autenticado = gerente.autenticar("carlos", "senha123");
        
        // Exibimos o resultado da autenticação. Se autenticado for true, exibimos "Sim", caso contrário, "Não".
        System.out.println("Gerente autenticado: " + (autenticado ? "Sim" : "Não"));
    }
}
