public class Alumno {
    public static void main(String[] args) {
        String Alumno = "Jorge Villarreal";
        int[] calificaciones = {100, 100, 80, 85, 100};
        double promedio = getPromedio(calificaciones);
        char calificacion = getCalificacion(promedio);
        getImprime(Alumno, promedio, calificacion, calificaciones);
    }

    // Método para calcular promedio
    public static double getPromedio(int[] calificaciones) {
        double promedio=0;
        for(int i =0; i<5; i++)
        {
            promedio = promedio+calificaciones[i];
        }
        promedio = promedio / 5;
        return promedio;
    }

    // Método para asignar Calificacion
    public static char getCalificacion(double promedio) {
        /*if(promedio > 90){
        }else */
        char calif = 'A';
        if(promedio <= 50){
            calif = 'F';
        }else if(promedio <= 60){
            calif = 'E';
        }else if(promedio <= 70){
            calif = 'D';
        }else if(promedio <= 80){
            calif = 'C';
        }else if(promedio <= 90){
            calif = 'B';
        }
        return calif;
    }

    // Método para imprimir informacion
    public static void getImprime(String nombre, double promedio, char calificacion, int[] calificaciones) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: "+ calificaciones[0]);
        System.out.println("Calificación 2: "+ calificaciones[1]);
        System.out.println("Calificación 3: "+ calificaciones[2]);
        System.out.println("Calificación 4: "+ calificaciones[3]);
        System.out.println("Calificación 5: "+ calificaciones[4]);
        System.out.println("Promedio: "+ getPromedio(calificaciones));
        System.out.println("Calificación: "+ getCalificacion(promedio));
    }
}
