
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tutorial extends JFrame

{
       JPanel jp = new JPanel();
       JLabel jl = new JLabel();

       public Tutorial()
       
       {
              setTitle("Tutorial");
              setVisible(true);
              setSize(400, 200);
              setDefaultCloseOperation(EXIT_ON_CLOSE);

              jl.setIcon(new ImageIcon("/Users/hudson.leon/Desktop/tc.png"));
              jp.add(jl);
              add(jp);

              validate();
       }

       public static void main(String[] args)
       {
             Tutorial t = new Tutorial();
       }
}

