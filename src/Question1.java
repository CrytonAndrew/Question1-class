import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Question1 {

    JFrame f;
    Question1() {
        f=new JFrame("Cartridge Usage");

        String[][] usage = {{"10", "35", "30"},
                {"15", "22", "12"},
                {"30", "31", "33"}};

        JLabel selectPrinter = new JLabel("Select Year:");
        selectPrinter.setBounds(50, 100, 100, 20);

        String printers[]={"Cannon Z100", "HP Deskjesk 650", "Epson K750"};
        final JComboBox printersCombo=new JComboBox(printers);
        printersCombo.setBounds(200, 100,200,20);


        JLabel selectYear = new JLabel("Select Printer:");
        selectPrinter.setBounds(50, 150, 100, 20);

        String years[]={"2018", "2019", "2020"};
        final JComboBox yearsCombo=new JComboBox(years);
        yearsCombo.setBounds(200, 150,200,20);


        JButton submit = new JButton("Submit");
        submit.setBounds(100, 200, 90, 20);

        final JToolBar toolBar = new JToolBar();

        final JPopupMenu popup = new JPopupMenu();
        popup.add(new JMenuItem(new AbstractAction("Submit") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"PRINTER: "+ printers[printersCombo.getSelectedIndex()] + "\n YEAR: " + years[yearsCombo.getSelectedIndex()] + "\n USAGE: " + usage[printersCombo.getSelectedIndex()][printersCombo.getSelectedIndex()] );
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Yearly Usage") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Total Catridge usage for the HP Deskjesk 650 is 65" + "" +
                        "\n Total Cartridge usage for the Epson K750 is 49" +
                        "\n Total Cartridge usage for the Cannon Z100 is 94");
            }
        }));

        final JButton button = new JButton("Tools");
        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        final JButton button1 = new JButton("File");
        button1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
               JOptionPane.showMessageDialog(f, "The file Option was clicked");
            }
        });
        toolBar.add(button1);
        toolBar.add(button);

        f.getContentPane().add(toolBar, BorderLayout.NORTH);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        f.add(yearsCombo);
        f.add(printersCombo);
        f.add(selectPrinter);
        f.add(selectYear);
        f.add(submit);
        f.setLayout(null);
        f.setSize(500,350);
        f.setVisible(true);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(f,"PRINTER: "+ printers[printersCombo.getSelectedIndex()] + "\n YEAR: " + years[yearsCombo.getSelectedIndex()] + "\n USAGE: " + usage[printersCombo.getSelectedIndex()][printersCombo.getSelectedIndex()] );
            }
        });



    }

    public static void main(String[] args) {
        new Question1();
    }
}
