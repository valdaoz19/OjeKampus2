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


public class CustomerGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton ButtonPesan;
    private JButton ButtonRegis;
    private JButton ButtonTunggu;
    private JLabel label1;

    //Constructor 
    public CustomerGUI(){

        this.setTitle("CustomerGUI");
        this.setSize(300,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(300,400));
        contentPane.setBackground(new Color(190,20,20));


        ButtonPesan = new JButton();
        ButtonPesan.setBounds(99,171,96,31);
        ButtonPesan.setBackground(new Color(190,150,20));
        ButtonPesan.setForeground(new Color(0,0,0));
        ButtonPesan.setEnabled(true);
        ButtonPesan.setFont(new Font("sansserif",0,12));
        ButtonPesan.setText("Pemesanan");
        ButtonPesan.setVisible(true);
        ButtonPesan.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new PesananGUI();
			}
			});
        

        ButtonRegis = new JButton();
        ButtonRegis.setBounds(98,120,96,31);
        ButtonRegis.setBackground(new Color(190,150,20));
        ButtonRegis.setForeground(new Color(0,0,0));
        ButtonRegis.setEnabled(true);
        ButtonRegis.setFont(new Font("sansserif",0,12));
        ButtonRegis.setText("Registrasi");
        ButtonRegis.setVisible(true);
        ButtonRegis.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new RegistGUI();
			}
			});



        ButtonTunggu = new JButton();
        ButtonTunggu.setBounds(100,219,96,31);
        ButtonTunggu.setBackground(new Color(190,150,20));
        ButtonTunggu.setForeground(new Color(0,0,0));
        ButtonTunggu.setEnabled(true);
        ButtonTunggu.setFont(new Font("sansserif",0,12));
        ButtonTunggu.setText("Menunggu");
        ButtonTunggu.setVisible(true);
        ButtonTunggu.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new TungguGUI();
			}
			});

        label1 = new JLabel();
        label1.setBounds(89,46,124,31);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(255,255,255));
        label1.setEnabled(true);
        label1.setFont(new Font("Mohave",0,30));
        label1.setText("Customer");
        label1.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(ButtonPesan);
        contentPane.add(ButtonRegis);
        contentPane.add(ButtonTunggu);
        contentPane.add(label1);

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
                new CustomerGUI();
            }
        });
    }

}