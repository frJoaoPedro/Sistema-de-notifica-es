// Meu codigo começa com a Interface
// A interface e um tipo de contrato no codigo
// quem possui o contrato a INTERFACe ta "prometendo" que vai ter um método enviar(String mensagem)
public interface Notificacao {
    // aqui digo que interface tem metodo enviar mensagem e quem herdar isso tem que ter esse metodo
    void enviar(String mensagem);
}
