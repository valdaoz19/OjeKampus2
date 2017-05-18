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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

public class OjekLoginGUI extends JFrame {

    private JMenuBar menuBar;
    private JButton ButtonAccept;
    private JButton ButtonDecline;
    private JButton ButtonEnter;
    private JTextField TextIdOjek;
    private JTextField TextInfo;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    //Constructor 
    public OjekLoginGUI(){

        this.setTitle("OjekLoginGUI");
        this.setSize(300,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(300,400));
        contentPane.setBackground(new Color(192,20,20));


        ButtonAccept = new JButton();
        ButtonAccept.setBounds(60,249,90,35);
        ButtonAccept.setBackground(new Color(214,217,223));
        ButtonAccept.setForeground(new Color(0,0,0));
        ButtonAccept.setEnabled(true);
        ButtonAccept.setFont(new Font("sansserif",0,12));
        ButtonAccept.setText("Accept");
        ButtonAccept.setVisible(true);
         ButtonAccept.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText()));
                TextInfo.setText((DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())).toString()));
            }
        });
        
        ButtonDecline = new JButton();
        ButtonDecline.setBounds(158,248,90,35);
        ButtonDecline.setBackground(new Color(214,217,223));
        ButtonDecline.setForeground(new Color(0,0,0));
        ButtonDecline.setEnabled(true);
        ButtonDecline.setFont(new Font("sansserif",0,12));
        ButtonDecline.setText("Decline");
        ButtonDecline.setVisible(true);
         ButtonDecline.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                Administrasi.pesananDibatalkan(DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())));
            }
        });
        
        ButtonEnter = new JButton();
        ButtonEnter.setBounds(192,101,90,35);
        ButtonEnter.setBackground(new Color(214,217,223));
        ButtonEnter.setForeground(new Color(0,0,0));
        ButtonEnter.setEnabled(true);
        ButtonEnter.setFont(new Font("sansserif",0,12));
        ButtonEnter.setText("Enter");
        ButtonEnter.setVisible(true);
        ButtonEnter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText()));
                TextInfo.setText((DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())).toString()));
            }
        });
        
        TextIdOjek = new JTextField();
        TextIdOjek.setBounds(66,106,120,25);
        TextIdOjek.setBackground(new Color(255,255,255));
        TextIdOjek.setForeground(new Color(0,0,0));
        TextIdOjek.setEnabled(true);
        TextIdOjek.setFont(new Font("sansserif",0,12));
        TextIdOjek.setText("ID");
        TextIdOjek.setVisible(true);
         TextIdOjek.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextIdOjek.setText("");
                TextIdOjek.setForeground(new Color(0,102,102));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        TextInfo = new JTextField();
        TextInfo.setBounds(76,200,150,25);
        TextInfo.setBackground(new Color(255,255,255));
        TextInfo.setForeground(new Color(0,0,0));
        TextInfo.setEnabled(true);
        TextInfo.setFont(new Font("sansserif",0,12));
        TextInfo.setText("Pesanan");
        TextInfo.setVisible(true);
        TextInfo.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextInfo.setText("");
                TextInfo.setForeground(new Color(0,102,102));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        label1 = new JLabel();
        label1.setBounds(89,29,131,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(255,255,255));
        label1.setEnabled(true);
        label1.setFont(new Font("Mohave",0,30));
        label1.setText("Ojek Login");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(27,101,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(255,255,255));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("ID");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(93,168,117,29);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(255,255,255));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Informasi Pesanan");
        label3.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(ButtonAccept);
        contentPane.add(ButtonDecline);
        contentPane.add(ButtonEnter);
        contentPane.add(TextIdOjek);
        contentPane.add(TextInfo);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);

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
                new OjekLoginGUI();
            }
        });
    }

}