import javax.swing.*;

class newstudent {
    newstudent() {
        JFrame frame= new JFrame();
        JButton enter = new JButton("ADD STUDENT");
        JButton re = new JButton("BACK");
        re.addActionListener(e->{new WelcomePage("");frame.dispose();});
        JLabel studentid = new JLabel("STUDENT ID:");
        JLabel rollno = new JLabel("ROLLNO:");
        JLabel dept = new JLabel("DEPARTMENT:");
        JLabel year = new JLabel("YEAR:");
        JTextField studentidfield = new JTextField();
        JTextField rollnofield = new JTextField();
        JTextField deptfiels = new JTextField();
        JTextField yearfield = new JTextField();
        enter.setBounds(100, 300, 300, 25);
        re.setBounds(100, 350, 300, 25);
        studentid.setBounds(50, 100, 150, 25);
        rollno.setBounds(50, 150, 100, 25);
        dept.setBounds(50, 200, 100, 25);
        year.setBounds(50, 250, 100, 25);
        studentidfield.setBounds(200, 100, 100, 25);
        rollnofield.setBounds(200, 150, 100, 25);
        deptfiels.setBounds(200, 200, 100, 25);
        yearfield.setBounds(200, 250, 100, 25);
        frame.add(studentid);
        frame.add(enter);
        frame.add(re);
        frame.add(rollno);
        frame.add(dept);
        frame.add(year);
        frame.add(studentidfield);
        frame.add(rollnofield);
        frame.add(yearfield);
        frame.add(deptfiels);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
