package FinalBuild.FrontEnd;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class page3 extends JPanel implements ActionListener
{
    static JPanel topBar = new JPanel();
    static JPanel sideBar = new JPanel();
    static JFrame thirdframe = new JFrame ("Third Frame");
    static JLabel jcomp1;
    private JLabel jcomp2;
    private JButton jcomp10;
    private JButton jcomp11;
    private JButton jcomp5;
    public static JLabel jcomp0;
    
    public page3() 
    {
    	setBackground(new Color(255, 160, 160));
        //construct components
        jcomp1 = new JLabel ("Day");
        jcomp1.setText(compile.day);
        jcomp1.setFont(new Font("Castellar", Font.BOLD,18));
		jcomp1.setFont(jcomp1.getFont().deriveFont(25.0f));
        jcomp1.setForeground(new Color(0,0,0));

        jcomp2 = new JLabel ("Do You Want To Start This Day");
        jcomp2.setForeground(new Color(0,0,0));
        jcomp2.setFont(new Font("Cambria", Font.PLAIN,23));

        jcomp10 = new JButton ("Yes");
        jcomp10.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp10.setBackground(new Color(162, 219, 250));
        jcomp10.setForeground(new Color(0,0,0));

        jcomp11 = new JButton ("No");
        jcomp11.setFont(new Font("Cambria", Font.PLAIN,23));
        jcomp11.setBackground(new Color(162, 219, 250));
        jcomp11.setForeground(new Color(0,0,0));

        jcomp5 = new JButton ("VIEW");

        //set components properties
        jcomp5.setToolTipText ("Press here to view whole day (all events)");
        
        JLabel mylogo = new JLabel(new ImageIcon("Pictures\\Logo-05.png"));
        add(mylogo);
        

        //adjust size and set layout
        setPreferredSize (new Dimension (600, 616));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp10);
        add (jcomp11);
        //add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (180, 10, 200, 30);
        jcomp2.setBounds (95, 150, 450, 25);
        jcomp10.setBounds (110 , 200, 100, 50);
        jcomp11.setBounds (275 , 200, 100, 50);
        jcomp5.setBounds (605, 355, 100, 25);
        mylogo.setBounds(580,470,150,150);

        jcomp10.addActionListener(this);
        jcomp11.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Yes"))
        {
            page4.create();
            thirdframe.setVisible (false);
        }
        if(e.getActionCommand().equals("No"))
        {
            page2.secondframe.setVisible (true);
            thirdframe.setVisible (false);
        }      
    }
    public static void create()
    {
        page3.topBar.setPreferredSize (new Dimension (900,50));
        page3.topBar.setBackground(new Color(10, 25, 49));
        jcomp0 = new JLabel ("CALENDER");
        jcomp0.setFont(new Font("Castellar", Font.BOLD,18));
		jcomp0.setFont(jcomp0.getFont().deriveFont(25.0f));
        jcomp0.setForeground(new Color(162, 219, 250));
        jcomp0.setBounds (450, 10, 115, 65); 
        page3.topBar.add(jcomp0);

        sideBar.setPreferredSize (new Dimension (200, 636));
        sideBar.setBackground(new Color(196, 182, 182));
        sideBar.setBounds(0,0,200, 636);
        sideBar.setLayout(new BorderLayout());
        JLabel icon = new JLabel(new ImageIcon("Pictures\\icon.png"));
        sideBar.add(icon,BorderLayout.NORTH);

        thirdframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        thirdframe.setSize(900,636);
        thirdframe.setUndecorated(true);
        thirdframe.setShape(new RoundRectangle2D.Double(0,0, 900,636, 30,30));
        thirdframe.setLocationRelativeTo(page2.secondframe);
        thirdframe.setContentPane(new JLabel(new ImageIcon("Pictures\\Logo-05.png")));
        thirdframe.setLayout(new BorderLayout());
        thirdframe.getContentPane().add (new page3());
        thirdframe.setLocationRelativeTo(null);
        thirdframe.add(topBar,BorderLayout.NORTH);
        thirdframe.add(sideBar,BorderLayout.WEST);
        thirdframe.setVisible (true);
    }
}
