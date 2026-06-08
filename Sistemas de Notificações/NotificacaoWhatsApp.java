// NOTIFICAÇÃO POR WHATSAPP
// ja e o terceiro galego que ta assinando o mesmo contrato, herdando da interface
public class NotificacaoWhatsApp implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
