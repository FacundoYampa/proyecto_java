import java.time.LocalDateTime;

public class Vehiculo {
    /*Atributos */
    private String marca;
    private String modelo;
    private Integer anio;
    private String chasis;
    private Integer velocidad;
    private Integer vmax;
    private Boolean encendido;
    private LocalDateTime fechaCreacion; 

    /*Constructores */
    //Java ya da un constructor por defecto

    public Vehiculo(String marca, String modelo, Integer anio, String chasis, Integer vmax){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.vmax = vmax;
        this.encendido = false;
        this.velocidad = 0;
        this.fechaCreacion = LocalDateTime.now();
    }

    /*Metodos */
    public void encender(){
        if(!this.encendido){
            this.encendido = true;
        }else{
            System.out.println("El auto ya está encendido");
        }
    }

    public void apagar(){
        if(this.encendido){
            this.encendido = false;
        }else{
            System.out.println("auto apagado");
        }
    }

    public void acelerar(){
        if(this.encendido){
            if(this.velocidad < this.vmax){
                this.velocidad ++;
            }else{
                System.out.println("Velocidad Máxima");
            }
        }else{
            System.out.println("El auto está apagado, no puede acelerar");
        }
    }

    public void frenar(){
        if(this.encendido){
            if(this.velocidad>0){
                this.velocidad --;
            }else{
                System.out.println("El auto está detenido");
            }
        }else{
            System.out.println("El auto está apagado, ya está detenido.");
        }
    }

    public Integer obtenerVelocidad() {
        return this.velocidad;
    }

    public LocalDateTime obtenerFechaCreacion(){
        return this.fechaCreacion;
    }

    public void mostrarDatos(){
        System.out.println("Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", chasis=" + chasis
                + ", velocidad=" + velocidad + ", vmax=" + vmax + ", encendido=" + encendido + ", fechaCreacion="
                + fechaCreacion + "]"); ;
    }

}
