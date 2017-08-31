public class cancion
{
    private String nombre;
    
    public cancion(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    public String dimeDetalles()
    {
        return "Cancion: " +nombre;
    }
    
    
}