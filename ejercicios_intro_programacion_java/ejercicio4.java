public class ejercicio4 {
    public static void main (String[] args){
        int numeroIf = 56;

            if (numeroIf > 0){
                System.out.println("El numero es positivo");
            } else if (numeroIf == 0){
                System.out.println("El numero es cero");
            } else{
                System.out.println("El numero es negativo");
            }
    

        int numeroWhile = -1;

            while(numeroWhile < 3){
                System.out.println(numeroWhile);
                numeroWhile++;
            }

        int numeroWhile_v1 = 2;

            do{
                System.out.println(numeroWhile_v1);
                numeroWhile_v1++;
            } while(numeroWhile_v1 < 3);


            for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
                System.out.println(numeroFor);
            }    
        
        var estacion = "va";

            switch(estacion){
                case "verano":
                    System.out.println("es verano");
                break;
                
                case "otoño":
                    System.out.println("es otoño");
                break;

                case "invierno":
                    System.out.println("es invierno");
                break;

                case "primavera":
                    System.out.println("es primavera");
                break;

                default:
                    System.out.println("No es una estación");
            }

    }    
}
