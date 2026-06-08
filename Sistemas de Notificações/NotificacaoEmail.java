// NOTIFICAÇÃO POR E-MAIL
// "implements Notificacao" = "assino o contrato" ou seja, aceito que vou usar interface e implementar o metodo enviar mensagem
// Agora essa classe ta sendo OBRIGADA a ter o método enviar() 
public class NotificacaoEmail implements Notificacao {
    // implement pq ta herdando

    @Override
    public void enviar(String mensagem) {
        // aqui o metodo enviar mensagem, ta aq pq e obrigatorio
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
