import java.util.ArrayList;


public class biblioteca
{
    private ArrayList<String> canciones;  
    private Reproductor reproductor;
    
    public biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    public void reproducir(int numeroCancion)
    {
        reproductor.reproducir(canciones.get(numeroCancion) );
    }
}
