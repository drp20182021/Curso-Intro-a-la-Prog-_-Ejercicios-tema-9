public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Juan";
        cliente.edad = 20;
        cliente.telefono = 666555444;
        cliente.credito = (float)985.45;

        System.out.println("Nombre :" + cliente.nombre);
        System.out.println("Edad :" + cliente.edad);
        System.out.println("Telefono :" + cliente.telefono);
        System.out.println("Credito :" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Pedro";
        trabajador.edad = 25;
        trabajador.telefono = 666444333;
        trabajador.salario = (float)1560.45;

        System.out.println("Nombre :" + trabajador.nombre);
        System.out.println("Edad :" + trabajador.edad);
        System.out.println("Telefono :" + trabajador.telefono);
        System.out.println("Credito :" + trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    float credito;
}

class Trabajador extends Persona{
    float salario;
}