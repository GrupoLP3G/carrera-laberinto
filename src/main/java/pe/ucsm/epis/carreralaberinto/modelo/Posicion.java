package pe.ucsm.epis.carreralaberinto.modelo;
import java.util.Objects;
public class Posicion 
{
    private final int fila,columna;
    public  Posicion(int fila,int columna)
    {
        this.fila=fila;
        this.columna=columna;
    }
    public int getFila(){return this.fila;}
    public int getColumna(){return this.columna;}
    @Override
    public boolean equals(Object otro)
    {
        if(this==otro)return true;
        if(!(otro instanceof Posicion))return false;
        Posicion p=(Posicion) otro;
        return this.columna==p.getColumna()&&this.fila==p.getFila();
    }
    @Override 
    public String toString(){return "("+this.fila+","+this.columna+")";}
    @Override 
    public int hashCode(){return Objects.hash(this.fila,this.columna);}
}

