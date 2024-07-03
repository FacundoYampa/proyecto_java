package ar.com.poo;

public class Libro extends Articulo {
    //Atributos
    private String atributoLibro;

    //Constructores
    public Libro(
        String titulo, String autor, Float precio, String img, //atributos del padre
        String atributoLibro
    ){
        //nace el padre
        super(titulo,autor,precio,img);

        //despues! nace el hijo
        this.atributoLibro = atributoLibro;

    }

    //Metodos, getters y setters
    public String getAtributoLibro() {
        return atributoLibro;
    }

    public void setAtributoLibro(String atributoLibro) {
        this.atributoLibro = atributoLibro;
    }
    


}
