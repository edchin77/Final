import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame
{
    public Form()
    {
        super("Social Survey");
        initComponents();
    }

    private void initComponents()
    {

        JPanel contentPane = new JPanel();
        GridBagLayout layout = new GridBagLayout();

        contentPane.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;


        constraints.anchor = GridBagConstraints.CENTER;

        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        JLabel Text = new JLabel("Welcome! Please enter all information as required.");
        layout.setConstraints(Text, constraints);
        contentPane.add(Text);

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        JLabel Text2 = new JLabel("Don't enter the '$' for income and don't leave anything blank.");
        layout.setConstraints(Text2, constraints);
        contentPane.add(Text2);

        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        JLabel Text3 = new JLabel("If you have no job, please enter NONE. Thank you for taking this Survey!");
        layout.setConstraints(Text3, constraints);
        contentPane.add(Text3);

        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(1,2,1,2);

        constraints.gridx = 1;
        constraints.gridy = 9;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel firstNameL = new JLabel("First name:");
        layout.setConstraints(firstNameL, constraints);
        contentPane.add(firstNameL);

        constraints.gridx = 6;
        constraints.gridy = 9;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField firstNameT = new JTextField(10);
        layout.setConstraints(firstNameT, constraints);
        contentPane.add(firstNameT);

        constraints.gridx = 1;
        constraints.gridy = 10;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel lastNameL = new JLabel("Last name:");
        layout.setConstraints(lastNameL, constraints);
        contentPane.add(lastNameL);

        constraints.gridx = 6;
        constraints.gridy = 10;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField lastNameT = new JTextField();
        layout.setConstraints(lastNameT, constraints);
        contentPane.add(lastNameT);

        constraints.gridx = 1;
        constraints.gridy = 11;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel ageL = new JLabel("Age:");
        layout.setConstraints(ageL, constraints);
        contentPane.add(ageL);

        constraints.gridx = 6;
        constraints.gridy = 11;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField ageT = new JTextField(10);
        layout.setConstraints(ageT, constraints);
        contentPane.add(ageT);

        constraints.gridx = 1;
        constraints.gridy = 12;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel incomeL = new JLabel("Primary Income:");
        layout.setConstraints(incomeL, constraints);
        contentPane.add(incomeL);

        constraints.gridx = 6;
        constraints.gridy = 12;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField incomeT = new JTextField(10);
        layout.setConstraints(incomeT, constraints);
        contentPane.add(incomeT);

        constraints.gridx = 1;
        constraints.gridy = 13;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel primJobL = new JLabel("Primary Occupation:");
        layout.setConstraints(primJobL, constraints);
        contentPane.add(primJobL);

        constraints.gridx = 6;
        constraints.gridy = 13;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField primJobT = new JTextField(10);
        layout.setConstraints(primJobT, constraints);
        contentPane.add(primJobT);

        constraints.gridx = 1;
        constraints.gridy = 14;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel secJobL = new JLabel("Secondary Job (if any):");
        layout.setConstraints(secJobL, constraints);
        contentPane.add(secJobL);

        constraints.gridx = 6;
        constraints.gridy = 14;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField secJobT = new JTextField(10);
        layout.setConstraints(secJobT, constraints);
        contentPane.add(secJobT);

        constraints.anchor = GridBagConstraints.CENTER;


        constraints.gridx = 1;
        constraints.gridy = 15;
        constraints.gridwidth = 10;
        constraints.gridheight = 1;


        constraints.insets = new Insets(30,0,0,0);

        JButton insertB = new JButton("Submit");
        insertB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aage = Integer.parseInt(ageT.getText());
                double income1 = Double.parseDouble(incomeT.getText());
                Person person = new Person(firstNameT.getText(),
                        lastNameT.getText(),aage, income1, primJobT.getText(), secJobT.getText() );
                person.write();

            }
        });
        layout.setConstraints(insertB, constraints);
        contentPane.add(insertB);

        /*
        constraints.gridx = 7;
        constraints.gridy = 15;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;


        JButton searchB = new JButton("Search");
        searchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aage = Integer.parseInt(ageT.getText());
                double income1 = Double.parseDouble(incomeT.getText());
                Person person = new Person(firstNameT.getText(),
                        lastNameT.getText(),aage, income1, primJobT.getText(), secJobT.getText() );
                String s;
                boolean b = person.find();
                if (b == true)
                    s = "Record exists";
                else
                    s = "Record does not exist";
                JOptionPane.showMessageDialog(Form.this, s);
            }
        });
        layout.setConstraints(searchB, constraints);
        contentPane.add(searchB);
        */

        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(contentPane);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        pack();

    }

    public static void main(String[] args) {
        (new Form()).setVisible(true);
    }
}
