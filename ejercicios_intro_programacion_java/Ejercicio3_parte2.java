public class Ejercicio3_parte2 {

    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println("El numero de puertas de mi auto es: " + miCoche.puertas);
    }

    }

        class Coche {
        public int puertas = 4;

        public void masPuertas(){
            this.puertas++;
        }
    }