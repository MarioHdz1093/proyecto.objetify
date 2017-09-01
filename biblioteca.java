import java.util.ArrayList;


public class biblioteca
{
    private ArrayList<String> canciones;  
    public Reproductor reproductor;
    
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
    
   public int totalArchivos(int totalCanciones)
   {        
        for(int i=0; i < canciones.length; i++)
        {
            totalCanciones = totalCanciones + 1;
        }
        return totalCanciones;
   }
   
   public void reproduceTodo()
   {
       for(int i=0; i < canciones.length; i++)
       {
           reproductor.reproducir(canciones.get(i) );
       }
   }
   
   public void borraUna(String nombre)
    {
        for(int i=0; i < canciones.length; i++)
        {
            if(nombre == canciones.size())
            {
                canciones = null;
            }
        }
    }
}

