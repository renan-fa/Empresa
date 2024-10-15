// Definição da interface Autenticavel
// Uma interface em Java define um contrato que as classes que implementam devem seguir.
// Isso significa que qualquer classe que implementar a interface Autenticavel será obrigada
// a fornecer uma implementação para o método autenticar().
public interface Autenticavel {

    // Declaração do método autenticar.
    // Qualquer classe que implementar essa interface deve fornecer uma implementação para esse método.
    // O método aceita dois parâmetros: uma String 'usuario' e uma String 'senha'.
    // Retorna um booleano, que indica se a autenticação foi bem-sucedida (true) ou não (false).
    boolean autenticar(String usuario, String senha);
}