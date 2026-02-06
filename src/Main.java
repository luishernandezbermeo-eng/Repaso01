//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria( id: "1", saldoInicial: 100);
        cuenta1.retirar(valorARetirar: 100);
        cuenta1.consignar ( valorAConsignar: 150);
        System.out.println("Elsaldo de la cuenta es: " + cuenta1.getSaldo());

        Notificacion [ ] notificacion = new Notificacion [ 2];
        Notificacion [ 0] new = NotificacionCorreo ( receptorNotifiacion : "Pepito");
        Notificacion [1] new NotificacionSMS (receptorNotificacion: "Juanillo");

        notificacion[0 ].enviarMensaje( "hola mi amigo");
        notificacion[1].enviarMensaje( "Hola mi broco");
    }
}