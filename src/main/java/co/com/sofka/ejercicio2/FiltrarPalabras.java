package co.com.sofka.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarPalabras {
    public List<String> filtrarMalasPalabras(List<String> mensajes) {
        List<String> malasPalabras = new ArrayList<>();
        malasPalabras.add("gg");
        malasPalabras.add("ez");
        malasPalabras.add("easy");
        malasPalabras.add("troll");
        malasPalabras.add("manco");
        malasPalabras.add("jugador de temmo");
        malasPalabras.add("tonto");
        malasPalabras.add("rata");
        malasPalabras.add("queso");
        malasPalabras.add("bronce");
        List<String> nuevosMensajes = new ArrayList<>();

        nuevosMensajes = mensajes.stream()
                .map(m -> {
                    if(m.equals(malasPalabras.get(0)) || m.equals(malasPalabras.get(1)) ||
                            m.equals(malasPalabras.get(2)) || m.equals(malasPalabras.get(3)) ||
                            m.equals(malasPalabras.get(4)) || m.equals(malasPalabras.get(5)) ||
                            m.equals(malasPalabras.get(6)) || m.equals(malasPalabras.get(7)) ||
                            m.equals(malasPalabras.get(8)) ||m.equals(malasPalabras.get(9))){
                        return "****";
                    }
                    return m;
                })
                .collect(Collectors.toList());

        return nuevosMensajes;
    }
}
