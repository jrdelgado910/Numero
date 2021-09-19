
import javax.swing.JOptionPane;


public class divicion extends numeroN{

    @Override
    public void numero(int n) {
    envio e = new envio();
    int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
    float res;
    res=n/m;
    String r=String.valueOf(res);
    envio.setResultado(r);
    }
    
}
