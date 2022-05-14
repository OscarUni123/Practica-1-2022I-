package uni.edu.pe;

public class implementacion {

    public implementacion (int tamanio){
        for (int i = 1; i <= tamanio; i++) {
            double espacios =  (Math.pow(2, tamanio) - Math.pow(2,i))/(2);
            for (int j = 0; j< espacios; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<  Math.pow(2,i); k++){
                System.out.print("*");
            }
            for (int j = 0; j<espacios; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
