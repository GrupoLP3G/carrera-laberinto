package pe.ucsm.epis.carreralaberinto.modelo;

public enum TipoCelda 
{
    TRAMPA(true,false,4,0,'^'),
    CAMINO(true,false,0,0,'-'),
    DESTRUCTIBLE(false,true,0,3,'*'),
    PARED(false,false,0,0,'#'),
    INICIO(true,false,0,0,'I'),
    FINAL(true,false,0,0,'F');
    private final int resistencia,penalizacion;
    private final boolean caminable,rompible;
    private final char letra;
    TipoCelda(boolean caminable ,boolean rompible,int penalizacion,int resistencia, char letra)
    {
        this.caminable=caminable;
        this.rompible=rompible;
        this.penalizacion=penalizacion;
        this.resistencia=resistencia;
        this.letra=letra;
    }
    public boolean esCaminable(){return this.caminable;}
    public boolean esRompible(){return this.rompible;}
    public int getPenalizacion(){return this.penalizacion;}
    public int getResistencia(){return this.resistencia;}
    public char getLetra(){return this.letra;}
}
