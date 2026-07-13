package com.minispotify.service;

import com.minispotify.model.Cancion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CancionService {

    private final List<Cancion> canciones = new ArrayList<>();
    private int contadorId = 1;

    public CancionService() {

        canciones.add(new Cancion(
                contadorId++,
                "DTMF",
                "Bad Bunny",
                "Single",
                "imagen12.png",
                "Cancion1.mp3"
        ));

        canciones.add(new Cancion(
                contadorId++,
                "ESCLAVA REMIX",
                "Anuel AA",
                "Single",
                "imagen11.png",
                "Cancion2.mp3"
        ));

        canciones.add(new Cancion(
                contadorId++,
                "CUANDO NO ERA CANTANTE REMIX",
                "Fuerza Regida",
                "Single",
                "imagen13.png",
                "Cancion3.mp3"
        ));
    }

    public List<Cancion> listarTodas() {
        return canciones;
    }

    public Cancion buscarPorId(int id) {
        return canciones.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void agregar(Cancion cancion) {
        cancion.setId(contadorId++);
        canciones.add(cancion);
    }

    public void editar(Cancion cancionEditada) {
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getId() == cancionEditada.getId()) {
                canciones.set(i, cancionEditada);
                return;
            }
        }
    }

    public void eliminar(int id) {
        canciones.removeIf(c -> c.getId() == id);
    }
}