public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante (String nombre, int edad, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante o) {
        int resultado = 0;

        if(this.altura > o.altura){
            resultado = 1;
        }else if (this.altura < o.altura){
            resultado = -1;
        }else if (this.altura == o.altura){
            if(this.edad > o.edad){
                resultado = 1;
            }else if (this.edad < o.edad){
                resultado = -1;
            }else {
                resultado = 1;
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }
}
