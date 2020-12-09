/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Douglas Willian CB3005348
 * João Vitor Gino CB3005488
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.UUID;


public class View implements ActionListener {
    
	private JFrame frame = new JFrame();
	private JLabel l1 = new JLabel("Nome:");
	private JTextField t1 = new JTextField(12);
        private JLabel l2 = new JLabel("Idade:");
	private JTextField t2 = new JTextField(12);
        private JLabel l3 = new JLabel("Endereço:");
	private JTextField t3 = new JTextField(12);
	private JButton b1 = new JButton();
        private JButton b2 = new JButton();
        private JButton b3 = new JButton();
        private JButton b4 = new JButton();
        private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
        private JPanel p2 = new JPanel();
        private List<Aluno> alunos = new ArrayList<Aluno>();
        private GridLayout grid = new GridLayout(3, 2, 10, 10);
        
        
        View(){
            b1.setText("OK");
            b2.setText("Limpar");
            b3.setText("Mostrar");
            b4.setText("Sair");
	    b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
	    
	    frame.setSize(400,180);
	    frame.setLocation(200,200);
	    frame.setTitle("TP02 - LP2I4");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
	    p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(l3);
            p1.add(t3);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            p1.setLayout(new GridLayout(3,2,10,10));  
            p.add(p1);
            p.add(p2);
            frame.add(p);
            
	    frame.setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if("OK".equals(command)){
                alunos.add(new Aluno(t1.getText(),Integer.parseInt(t2.getText()),t3.getText()));
                t1.setText("");
                t2.setText("");
                t3.setText("");
                
            }
            if("Limpar".equals(command)){
                alunos.clear();
                //t2.setText("mudou");
            }
            if("Mostrar".equals(command)){
                String mensagem = "";
                for(Aluno a : alunos){
                    
                    mensagem += "Id:" + a.getUuid() + ", ";
                    mensagem += "Nome:" + a.getNome() + ", ";
                    mensagem += "\n";
                }
                JOptionPane.showMessageDialog(null, mensagem);

            }
            if("Sair".equals(command)){
                frame.dispose();                
            }
            
        }
    
	public static void main(String[] args) {
	    
	    View v = new View();
	    
	    
	}
}
