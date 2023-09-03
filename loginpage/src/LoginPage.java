import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginbutton=new JButton("LOGIN");
    JButton resetbutton=new JButton("RESET");
    JTextField useridfield = new JTextField();
    JPasswordField userpasswordfield=new JPasswordField();
    JLabel useridlabel=new JLabel("USERID:");
    JLabel userpasswordlabel=new JLabel("PASSWORD:");
    JLabel messagelabel=new JLabel("Login page");
    HashMap<String,String> logininfo = new HashMap<String, String>();
    public LoginPage(HashMap loginInfoOrginal) {
            logininfo=loginInfoOrginal;
            useridlabel.setBounds(50,100,75,25);
            userpasswordlabel.setBounds(50,150,75,25);
            messagelabel.setBounds(125,250,250,35);
            useridfield.setBounds(125,100,200,25);
            userpasswordfield.setBounds(125,150,200,25);
            loginbutton.setBounds(125,200,100,25);
            loginbutton.setFocusable(false);
            loginbutton.addActionListener(this);
            resetbutton.setBounds(225,200,100,25);
            resetbutton.setFocusable(false);
            resetbutton.addActionListener(this);
            frame.add(loginbutton);
            frame.add(resetbutton);
            frame.add(useridlabel);
            frame.add(userpasswordlabel);
            messagelabel.setFont(new Font(null,Font.ITALIC,25));
            //frame.add(messagelabel);
            frame.add(useridfield);
            frame.add(userpasswordfield);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
        if(e.getSource()==resetbutton){
            useridfield.setText("");
            userpasswordfield.setText("");
        }
        if(e.getSource()==loginbutton){
            String userid=useridfield.getText();
            String password=String.valueOf(userpasswordfield.getPassword());
            if(logininfo.containsKey(userid)){
                if(logininfo.get(userid).equals(password)){
                    messagelabel.setForeground(Color.green);
                    messagelabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage=new WelcomePage(userid);
                }
                else{
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Login unsuccessful");

                }
            }
            else{
                messagelabel.setForeground(Color.red);
                messagelabel.setText("username not found");

            }
        }
    }
}
