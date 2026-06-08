// NOTIFICAÇÃO POR SMS
//  assina o contrato da interface  e cumpre, vai ter metodo  enviar()
public class NotificacaoSms implements Notificacao {
    // implement herda de notificação, e possui o metodo ja q notificação e inteface

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
