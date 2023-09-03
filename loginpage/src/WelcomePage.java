import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class WelcomePage implements ActionListener {
    JFrame frame=new JFrame();
    JButton examinfo;
    WelcomePage(){}
    JLabel welcomelabel=new JLabel("WELCOME-");
    WelcomePage(String userid){
        welcomelabel.setBounds(0,0,300,25);
        welcomelabel.setFont(new Font(null,Font.PLAIN,25));
        welcomelabel.setText("WELCOME-"+userid);
        JButton studentbutton = new JButton(" VIEW STUDENT");
        studentbutton.addActionListener(this);
        JLabel studentlabel=new JLabel("STUDENT");
        JTextField studentfield = new JTextField();
        frame.add(welcomelabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        studentbutton.setBounds(150,50,300,25);
        studentbutton.setFocusable(false);
        frame.add(studentbutton);
        //studentbutton.addActionListener(this);
        frame.add(studentlabel);
        frame.add(studentfield);
        JButton faculty=new JButton("VIEW FACULTY");
        faculty.addActionListener(e->{new view();frame.dispose();});
        faculty.setBounds(150,100,300,25);
        faculty.setFocusable(false);
        frame.add(faculty);
        JButton addstudent=new JButton("ADD STUDENT");
        addstudent.addActionListener(e->{ new newstudent();frame.dispose();});
        addstudent.setBounds(150,150,300,25);
        addstudent.setFocusable(false);
        frame.add(addstudent);
        JButton addfacylty=new JButton("ADD FACULTY");
        addfacylty.addActionListener(e->{ new addfaculty();frame.dispose();});
        addfacylty.setBounds(150,200,300,25);
        addfacylty.setFocusable(false);
        frame.add(addfacylty);
        examinfo=new JButton("EXAM INFO");
        examinfo.addActionListener(e->{new exam();frame.dispose();});
        examinfo.setBounds(150,250,300,25);
        examinfo.setFocusable(false);
        frame.add(examinfo);
        frame.setSize(500,500);
    }
 public void actionPerformed(ActionEvent ae) {
        new studentpage();
        frame.dispose();
 }
 }

