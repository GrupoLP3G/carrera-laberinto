package pe.ucsm.epis.carreralaberinto.excepcion;
public class JuegoException extends Exception 
{
    public JuegoException(String msg){super(msg);}
    public JuegoException(String msg,Throwable causa){super(msg,causa);}
}