package ar.com.poo;

public class Articulo {
    //Atributos
    private String titulo;
    private String autor;
    private Float precio;
    private String img;

    //Constructores
    public Articulo(String titulo, String autor, Float precio, String img){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.img = img;
    }
    
    //Metodos - getters y setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
