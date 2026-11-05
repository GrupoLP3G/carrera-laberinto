package pe.ucsm.epis.carreralaberinto.modelo;
public class Mapa 
{
    private final TipoCelda[][] celdas;
    public Mapa(int filas,int columnas)
    {
        if(filas <=0|| columnas<=0)throw new IllegalArgumentException("El mapa debe de tener al menos una fila y una columna ");
        this.celdas=new TipoCelda[filas][columnas];
        for(int f=0;f<filas;f++)
            {
                for(int c=0;c<columnas;c++)
                    {
                        this.celdas[f][c]=TipoCelda.CAMINO;
                    }
            }
    }
    public int getFilas(){return this.celdas.length;}
    public int getColumnas(){return this.celdas[0].length;}
    public boolean estaDentro(Posicion p)
    {
        if(p.getFila()>-1&& p.getFila()<getFilas()
        && p.getColumna()>-1&&p.getColumna()<getColumnas())return true;
        return false;
    }
}
