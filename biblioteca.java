import java.util.ArrayList;
import java.util.Random;

public class biblioteca
{
    private ArrayList<String> canciones;  
    public Reproductor reproductor;
    public Random aleatorios;
        
    public biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
        Random aleatorios = new Random();
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
        for(int i=0; i < canciones.size(); i++)
        {
            totalCanciones = totalCanciones + 1;
        }
        return totalCanciones;
   }
   
   public void reproduceTodo()
   {
       for(int i=0; i < canciones.size(); i++)
       {
           reproductor.reproducir(canciones.get(i) );
       }
   }
   
   public int busca(String nombre)
   {
       for(int i=0; i < canciones.size(); i++)
        {
            if(nombre == canciones.get(i))
            {
                return i;
            }
        }
        return -1;
   }
   
      public void borraUna(String nombre)
    {
        for(int i=0; i < canciones.size(); i++)
        {
            if(nombre == canciones.get(i))
            {
                canciones.remove(i);
            }
        }
    }
    
       public void borraTodo(String nombre)
    {
        for(int i=0; i < canciones.size(); i++)
        {
            canciones.remove(i);
        }
    }
    
    public void reproducirRandom()
    {
        int aleatorio = aleatorios.nextInt(canciones.size());
        reproductor.reproducir(canciones.get(aleatorio));
    }
}

