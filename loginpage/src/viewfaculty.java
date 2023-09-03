import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class view {
    view(){
        JFrame frame=new JFrame();
        JLabel welcome=new JLabel("ENTER THE FACULTY DETAILS");
        welcome.setBounds(0,50,300,25);
        frame.add(welcome);

        JButton enter =new JButton("GET INFO");
        JButton re=new JButton("BACK");
        re.addActionListener(e->{new WelcomePage("");});
        JLabel studentid = new JLabel("FACULTY ID:");
        JLabel dept=new JLabel("DEPARTMENT:");
        JLabel year=new JLabel("YEAR:");
        JTextField studentidfield=new JTextField();
        JTextField rollnofield=new JTextField();
        JTextField deptfiels=new JTextField();
        JTextField yearfield=new JTextField();
        enter.setBounds(100,300,100,25);
        re.setBounds(100,350,100,25);
        studentid.setBounds(50,100,150,25);
        //rollno.setBounds(50,150,100,25);
        dept.setBounds(50,150,100,25);
        year.setBounds(50,200,100,25);
        studentidfield.setBounds(200,100,100,25);
        //rollnofield.setBounds(200,150,100 ,25);
        deptfiels.setBounds(200,150,100,25);
        yearfield.setBounds(200,200,100,25);
        frame.add(studentid);
        frame.add(enter);
        frame.add(re);
        //frame.add(rollno);
        frame.add(dept);
        frame.add(year);
        frame.add(studentidfield);
        //frame.add(rollnofield);
        frame.add(yearfield);
        frame.add(deptfiels);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}

