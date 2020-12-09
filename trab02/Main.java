/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Main implements ActionListener
{
    
    public void actionPerformed(ActionEvent e){
        
    }
    
	public static void main(String[] args) {
	    //Aluno a = new Aluno();
	    Main m = new Main();
	    JFrame frame = new JFrame();
	    JLabel l = new JLabel();
	    JTextField t = new JTextField();
	    JButton b = new JButton();
	    JPanel p = new JPanel();
	    
	    p.add(new JLabel("Digite o seu Nome:"));
	    p.add(new JTextField(10));
	    
	    b.setText("Salvar");
	    //b.addActionListener(a.setNome("aaaaa"));
	    
	    t.setText("Texto Digitado");
	    t.setColumns(15);
	    
	    l.setText("Texto de um Jlabel");
	    
	    
	    frame.setSize(300,300);
	    frame.setLocation(100,100);
	    frame.setTitle("Janela Principal");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(l);
	    frame.add(t);
	    frame.add(p);
	    frame.add(b);
	    
	    frame.setVisible(true);
	    
	}
}
