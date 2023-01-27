public class Main {
    public static void imprimirEstudiantes(Estudiante[] estudiantes){
        for(int i = 0; i < estudiantes.length; i++){
            System.out.println((i + 1) + ". " + estudiantes[i].getNombre() + " - Altura: " + estudiantes[i].getAltura() + " - Edad: " + estudiantes[i].getEdad());
        }
    }

    public static Estudiante[] ordenarEstudiantes(Estudiante[] estudiantes){
        Estudiante aux;

        for (int i = 0; i < estudiantes.length - 1; i++){
            if(estudiantes[i].compareTo(estudiantes[i+1]) == -1){
                aux = estudiantes[i];
                estudiantes[i] = estudiantes[i+1];
                estudiantes[i+1] = aux;
                i = -1;
            }
        }
        return estudiantes;
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante("Patri",12, 170);
        estudiantes[1] = new Estudiante("Manuel", 43, 173);
        estudiantes[2] = new Estudiante("Javier", 72, 189);
        estudiantes[3] = new Estudiante("Alicia", 52, 168);
        estudiantes[4] = new Estudiante("Alberto", 35, 189);

        System.out.println("Estudiantes sin ordenar: ");
        imprimirEstudiantes(estudiantes);
        System.out.println();
        ordenarEstudiantes(estudiantes);
        System.out.println("Estudiantes ordenados: ");
        imprimirEstudiantes(estudiantes);

    }
}
