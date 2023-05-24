import javax.swing.*;

public class Dialog extends JDialog{
    private JPanel panel1;
    private JLabel eVelocidad;

    /**
     * Constructor de la ventana
     */
    public Dialog(){
        setContentPane(panel1);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     *
     * @param mensajito
     */
    public static void vDialogo(String mensajito){
        Dialog dialogo = new Dialog();
        dialogo.pack();
        dialogo.eVelocidad.setText(mensajito);
        dialogo.setVisible(true);
    }
}