// SERVIÇO DE NOTIFICAÇÃO
// Essa classe é o distribuidor de mensagem, como eu coloquei em seu nome serviço de notificação: não importa se é e-mail, SMS ou WhatsApp,
// ela pega qualquer uma Notificacao que chegar  e manda a mensagem
public class ServicoNotificacao {

    // Recebe QUALQUER tipo de Notificacao seja gmail sms ou zap zap
    public void notificarCliente(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem); // chama o método de quem foi passado o metodo enviar mensagem
    }
}
