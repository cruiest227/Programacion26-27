package Tema2;


public class Ejercicio13 {


    int pila[] = new int[10];
    int contador = 0;




    public void apilar(int numero) {


        if (contador < 10) {
            pila[contador] = numero;
            contador++;
        } else {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        }


    }


    public void desapilar() {


        if (contador > 0) {
            contador--;


        } else {
            System.out.println("No hay elementos en la pila");
        }
        System.out.println(java.util.Arrays.toString(pila));//Se utiliza para mostrar correctamente un Array
    }


    public class pila {


        int pila[] = new int[10];
        int contador = 0;


        // Metodo para añadir elementos
        public void apilar(int numero) {


            if (contador < 10) {


                pila[contador] = numero;
                contador++;


                System.out.println("Pila: " +
                        java.util.Arrays.toString(
                                java.util.Arrays.copyOf(pila, contador)
                        ));


            } else {


                System.out.println("La pila está llena, no puedo apilar el elemento");


            }
        }


        // Metodo para eliminar el ultimo elemento
        public void desapilar() {


            if (contador > 0) {


                contador--;


                System.out.println("Pila: " +
                        java.util.Arrays.toString(
                                java.util.Arrays.copyOf(pila, contador)
                        ));


            } else {


                System.out.println("No hay elementos en la pila");


            }
        }


    }




}


      /* Metodo principal
       public static void main(String[] args) {


           pila p = new pila();


           System.out.println("Pila original -> []");


           p.apilar(3);
           p.apilar(12);


           p.desapilar();
           p.desapilar();
           p.desapilar();


       }*/








