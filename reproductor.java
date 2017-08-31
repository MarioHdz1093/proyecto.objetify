
public class reproductor

{
    private String nomCancion;
    
    public reproductor(int totalEstudiantes, String nomMateria)
    {
        biblioteca = new Biblioteca[totalcanciones];
        this.nomCancion = nomMateria;
    }

    
    
    /**
     * inscribe un estudiante
     * @param unEstudiante Es el objeto estudiante en el grupo
     * @return Regresa regresa verdadero si fue inscrito
     */
    public int buscaCancion(String nombreCancion)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if( nombreCancion == biblioteca[i].dimeNombre())
            {
                return biblioteca[i].dimeNombre();
            }
        }
        return -1;
    }
    
    private int buscaEspacioDisponible()
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if(estudiantes[i] == null)
            {
                return 1;
            }
        }
        return -1;
    }
    
    public void darBaja(int clave)
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