public class ejercicio9 {
    public static void main (String[] args){
        
        Cliente cliente = new Cliente();
        cliente.setEdad(33);
        cliente.setNombre("Leonela");
        cliente.setTelefono(28741200);
        cliente.setCredito(450000);
        int edadCliente = cliente.getEdad();
        String nombreCliente = cliente.getNombre();
        int telefonoCliente = cliente.getTelefono();
        int creditoCliente = cliente.getCredito();

        System.out.println("La edad del cliente es: " + edadCliente);
        System.out.println("El nombre del cliente es: " + nombreCliente);
        System.out.println("El telefono del cliente es: " + telefonoCliente);
        System.out.println("El credito que el cliente ha solicitado es de: " + "$" + creditoCliente);


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(28);
        trabajador.setNombre("Carlos");
        trabajador.setTelefono(114536988);
        trabajador.setSalario(150000);
        int edadTrabajador = trabajador.getEdad();
        String nombreTrabajador = trabajador.getNombre();
        int telefonoTrabajador = trabajador.getTelefono();
        int salarioTrabajador = trabajador.getSalario();

        System.out.println("La edad del trabajador es: " + edadTrabajador);
        System.out.println("El nombre del trabajador es: " + nombreTrabajador);
        System.out.println("El telefono del trabajador es: " + telefonoTrabajador);
        System.out.println("El salario del trabajador es: " + "$" + salarioTrabajador);
    }
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }

}


class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return credito; //Revisar si no se antepone this. 
    }
}


class Trabajador extends Persona {
    private int salario;
    
    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return salario; //Revisar si no se antepone this. 
    }
}