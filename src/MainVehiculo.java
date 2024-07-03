public class MainVehiculo {
    public static void main(String[] args) {
        // Acá creamos el objeto, (auto)
        //Instancia la clase vehiculo
        Vehiculo clio = new Vehiculo("renault","clio",2022,"AF335LB",5);
        //El auto está vivo!!
        clio.encender();
        System.out.println(clio.obtenerVelocidad());
        clio.acelerar();
        System.out.println(clio.obtenerVelocidad());
        clio.mostrarDatos();
    }

}
