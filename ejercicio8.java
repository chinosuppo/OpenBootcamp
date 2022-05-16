public class  ejercicio8 {
    
    public static void main (String[] args){
        Persona person = new Persona();
        person.setEdad(28);
        person.setNombre("Carlos Ariel");
        person.setApellido("Suppo");
        person.setTelefono(994472273);
        String nombre = person.getNombre();
        String apellido = person.getApellido();
        int edad = person.getEdad();
        int telefono = person.getTelefono();
        System.out.println("El nombres es: "+ nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("La edad es: "+ edad);
        System.out.println("El telefono es: "+ telefono);
    }
}    

    class Persona{
        private int edad;
        private String nombre;
        private String apellido;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
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
        public String getApellido(){
            return this.apellido;
        }
        public int getTelefono(){
            return this.telefono;
        }
    }