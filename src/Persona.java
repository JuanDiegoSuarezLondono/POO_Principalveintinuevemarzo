public class Persona {
    private int codigo;
    private String nombre;
    private int sueldo;

    /*Metodo constructor
    public Persona (int cod, String nom, int sue)
    {
        codigo=cod;
        nombre=nom;
        sueldo=sue;
    } */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sue) {
        this.sueldo = sue;
    }

    public void cambiarSueldo (int ns)
    {
        sueldo=ns;

    }

}
