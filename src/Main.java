public class Main {
    public static void main(String[] args) {
        /*TODO: CLIENTE*/
        Cliente cliente = new Cliente();
        cliente.nombre = "Jesus";
        cliente.edad = 23;
        cliente.telefono = "5638484048";
        cliente.credito = 120000;
        System.out.println("El cliente es: " + cliente.nombre + ".\nTiene "+ cliente.edad + " años de edad. \nSu número de teléfono es: "+ cliente.telefono +".\nEl limite de su crédito es de: "+cliente.credito);
        /*TODO: TRABAJADOR*/
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Khabib";
        trabajador.edad = 32;
        trabajador.telefono = "8745957847";
        trabajador.salario= 1500000;
        System.out.println("\nEl trabajador es: " + trabajador.nombre + ".\nTiene "+ trabajador.edad + " años de edad. \nSu número de teléfono es: "+ trabajador.telefono +".\nTiene un salario de: "+trabajador.salario);

    }
}
class Persona {
    int edad;
    String nombre, telefono;
}
class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona{
    double salario;
}