public class cancion
{
    private String nombre;
    
    public cancion(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
    }
    
    public String dimeDetalles()
    {
        return "Cancion: " +nombre;
    }
    
    
}