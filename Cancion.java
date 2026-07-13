package com.minispotify.model;

public class Cancion {

    private int id;
    private String titulo;
    private String artista;
    private String album;
    private String imagen;
    private String audio;

    public Cancion() {
    }

    public Cancion(int id, String titulo, String artista,
                   String album, String imagen, String audio) {

        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.imagen = imagen;
        this.audio = audio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}