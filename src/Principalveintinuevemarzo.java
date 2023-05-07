import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principalveintinuevemarzo {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int cod;
        String nom;
        int sue;
        Persona p;
        p=new Persona ();

        cod=Integer.parseInt(br.readLine());
        nom=br.readLine();
        sue=Integer.parseInt(br.readLine());
        p.setCodigo(cod);
        p.setNombre(nom);
        p.setSueldo(sue);
        //p.cambiarSueldo(1000);
        System.out.println(p.getNombre()+" "+p.getCodigo()+" "+p.getSueldo());
    }
}

/* Comprimido
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Principalveintinuevemarzo {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Persona p=new Persona (Integer.parseInt(br.readLine()),br.readLine(),Integer.parseInt(br.readLine()));
        //p.cambiarSueldo(1000);
        System.out.println(p.getNombre()+" "+p.getCodigo()+" "+p.getSueldo());
    }
}
*/