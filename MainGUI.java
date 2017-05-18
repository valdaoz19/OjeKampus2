/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class MainGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton ButtonLogin;
    private JButton ButtonReg;
    private JLabel label1;
    private JLabel label2;

    //Constructor 
    public MainGUI(){

        this.setTitle("MainGUI");
        this.setSize(300,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(300,400));
        contentPane.setBackground(new Color(190,22,22));


        ButtonLogin = new JButton();
        ButtonLogin.setBounds(106,209,90,35);
        ButtonLogin.setBackground(new Color(220,190,22));
        ButtonLogin.setForeground(new Color(190,20,20));
        ButtonLogin.setEnabled(true);
        ButtonLogin.setFont(new Font("sansserif",0,12));
        ButtonLogin.setText("Ojek");
        ButtonLogin.setVisible(true);
        ButtonLogin.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent click) 
			{
				new OjekGUI();
			}
		});

        ButtonReg = new JButton();
        ButtonReg.setBounds(105,158,90,35);
        ButtonReg.setBackground(new Color(220,190,22));
        ButtonReg.setForeground(new Color(192,20,20));
        ButtonReg.setEnabled(true);
        ButtonReg.setFont(new Font("sansserif",0,12));
        ButtonReg.setText("Pelanggan");
        ButtonReg.setVisible(true);
        ButtonReg.setEnabled(true);
        ButtonReg.addMouseListener(new MouseAdapter() 
        {
			public void mouseClicked(MouseEvent click) 
			{
				new CustomerGUI();
			}
		});

        label1 = new JLabel();
        label1.setBounds(88,35,140,34);
        label1.setBackground(new Color(100,100,223));
        label1.setForeground(new Color(255,255,255));
        label1.setEnabled(true);
        label1.setFont(new Font("Mohave",0,30));
        label1.setText("OjeKampus");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(106,112,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(255,255,255));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Masuk sebagai :");
        label2.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(ButtonLogin);
        contentPane.add(ButtonReg);
        contentPane.add(label1);
        contentPane.add(label2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI();
            }
        });
    }

}