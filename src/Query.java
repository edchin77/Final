import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ECHIN on 5/19/2015.
 */
public class Query extends JFrame {
    public Query()
    {
        super("Query");
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
        JLabel Text = new JLabel("Welcome! Please enter all information as required. And hit Search");
        layout.setConstraints(Text, constraints);
        contentPane.add(Text);


        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(1,2,1,2);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        JLabel jobTitleL = new JLabel("Job:");
        layout.setConstraints(jobTitleL, constraints);
        contentPane.add(jobTitleL);

        constraints.gridx = 6;
        constraints.gridy = 2;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        final JTextField jobTitleT = new JTextField(10);
        layout.setConstraints(jobTitleT, constraints);
        contentPane.add(jobTitleT);





        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 10;
        constraints.gridheight = 1;


        constraints.insets = new Insets(10,0,0,0);

        JButton numb = new JButton("Number of people in Specific Job");
        numb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        layout.setConstraints(numb, constraints);
        contentPane.add(numb);

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 10;
        constraints.gridheight = 1;


        JButton percentage = new JButton("Percentage");
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        layout.setConstraints(percentage, constraints);
        contentPane.add(percentage);

        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 10;
        constraints.gridheight = 1;


        JButton avgage = new JButton("Average Age");
        avgage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        layout.setConstraints(avgage, constraints);
        contentPane.add(avgage);

        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 10;
        constraints.gridheight = 1;


        JButton avgincome = new JButton("Average Income");
        avgincome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        layout.setConstraints(avgincome, constraints);
        contentPane.add(avgincome);

        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(contentPane);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        pack();

    }

    public static void main(String[] args) {
        (new Query()).setVisible(true);
    }
}

