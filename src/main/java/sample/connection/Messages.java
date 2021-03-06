package sample.connection;

import com.desitsa.websocketmanager.MessagesHandler;

public class Messages extends MessagesHandler {

    public static String name = "";
    public static String pass = "";

    private boolean autentified;

    @Override
    public void onConnected(String connectionID) {

        System.out.println("Conectado! ID: " + connectionID);

        // CENTRAL DE MONITOREO
        /*invoke("Handshake", 0, name, pass).result((r, e) -> {
            if (e != null || r == null) return;

            autentified = (boolean)r;
            if (autentified) {
                System.out.println("Autenticado!!");
            }
        });*/

        // ADMINISTRADOR
        /*invoke("Handshake", 69, "franco0", "asdasd").result((r, e) -> {
            if (e != null || r == null) return;

            if ((boolean)r)
                System.out.println("Autenticado!!");
        });*/

    }

    public void intSecuencial(int reintento) {
        //System.out.println("anda" + reintento);
        //invokeOnly("IntSecuencial");
        //if (reintento == 2) invokeOnly("IntSecuencial");
    }

    @Override
    public void onTextMessage(String message) {
        System.out.println("Sv msg: " + message);
    }

    public void receiveMessage(String id, String msg) {
        System.out.println(id + " - " + msg);
    }

    public void mensaje(String msg) {
        System.out.println(msg);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("cerrado");
    }


}
