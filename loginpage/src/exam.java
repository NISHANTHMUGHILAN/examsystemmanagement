import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class exam {
    exam() {
        JFrame frame = new JFrame();
        JLabel room = new JLabel("ROOM SETUP");
        JLabel invigilation = new JLabel("INVIGILATION SETUP");
        JLabel student = new JLabel("STUDENT SEATING ARRANGEMENT");
        room.setBounds(50,100,300,25);
        invigilation.setBounds(50,150,300,25);
        student.setBounds(50,200,300,25);
        frame.add(room);
        frame.add(invigilation);
        frame.add(student);
        JButton b1=new JButton("NEW");
        JButton b2=new JButton("NEW");
        JButton b3=new JButton("NEW");
        b1.setBounds(300,100,100,25);
        b2.setBounds(300,150,100,25);
        b3.setBounds(300,200,100,25);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        JButton c1=new JButton("UPDATE");
        JButton c2=new JButton("UPDATE");
        c1.setBounds(400,100,100,25);
        c2.setBounds(400,150,100,25);
        frame.add(c1);
        frame.add(c2);
        JButton d1=new JButton("VIEW");
        JButton d2=new JButton("VIEW");
        JButton d3=new JButton("VIEW");
        JButton d4=new JButton("EXIT");
        d4.addActionListener(e->{new WelcomePage("");frame.dispose();});
        d1.setBounds(500,100,100,25);
        d2.setBounds(500,150,100,25);
        d3.setBounds(500,200,100,25);
        d4.setBounds(500,250,100,25);
        frame.add(d1);
        frame.add(d2);
        frame.add(d3);
        frame.add(d4);
        JButton view=new JButton("TIMETABLE");
        view.addActionListener(e->{new MyCanvas();frame.dispose();});
        view.setBounds(500,300,100,25);
        frame.add(view);
        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}