package co.com.sofka.ejercicio2;

import java.util.List;

public class Chat {
    private List<String> mensajes;

    public Chat(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    public void agregarMensaje(String mensaje){
        this.mensajes.add(mensaje+"\n");
    }

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "mensajes=" + mensajes +
                '}';
    }
}
