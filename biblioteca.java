import java.util.ArrayList;

public class biblioteca
{
    private arrayList<String> canciones;  
    
    public biblioteca(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        
    }
    
    public int buscaCancion(String nombreCancion)
    {
        for(int i=0; i < biblioteca.length; i++)
        {
            if( nombreCancion == biblioteca[i].dimeNombre())
            {
                return biblioteca[i].dimeNombre();
            }
        }
        return -1;
    }
    
    public boolean inscrbir(cancion unaCancion)
    {
        int existe = this.buscaCancion(unaCancion.dimeDetalles());
        if (existe == 1)
        {
            return false; //cancion ya existe
        }    
        
        int posDisponible = this.buscaEspacioDisponible();
        if (posDisponible != -1)
        {
            return false;
        }
        biblioteca[posDisponible] = unaCancion;
        
        return true;
    }
    
    private int buscaEspacioDisponible()
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if([i] == null)
            {
                return 1;
            }
        }
        return -1;
    }
    
    public void borrarCancion(int clave)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if( clave == estudiantes[i].dimeClave())
            {
                estudiantes[i] = null;
            }
        }
    }
}
