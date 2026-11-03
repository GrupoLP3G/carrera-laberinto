package pe.ucsm.epis.carreralaberinto;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->
        {
            JFrame menu=new JFrame("Carrera y laberinto");
            menu.setSize(800,600);
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        });   
    } 
}
