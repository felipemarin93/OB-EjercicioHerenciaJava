public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Datos del Cliente");
        System.out.println("Edad: "+ (cliente.edad=15));
        System.out.println("Nombre: "+ (cliente.nombre="Carlos"));
        System.out.println("Teléfono: "+ (cliente.telefono= 31056285));
        System.out.println("Crédito Por: "+ (cliente.credito= 50000));

        Trabajador trabajador = new Trabajador();
        System.out.println("\nDatos del Trabajador");
        System.out.println("Edad: "+ (trabajador.edad=25));
        System.out.println("Nombre: "+ (trabajador.nombre="Juan"));
        System.out.println("Teléfono: "+ (trabajador.telefono= 3565216));
        System.out.println("Crédito Por: "+ (trabajador.salario= 1500000));
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}


class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}

