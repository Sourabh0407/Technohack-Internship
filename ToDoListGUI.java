

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    JButton editButton;
    static int counter=1;
    Font f;
    Color c,C2,C3;
    int x=500,y=400;

    public ToDoListGUI() {
        setTitle("To-Do List");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(x, y);
        setBackground(Color.cyan);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        f=new Font("Courier", Font.PLAIN, 18);
        c=new Color(195, 239, 213);//195, 239, 213
        C2=new Color(199, 250, 220);
        C3=new Color(41, 206, 112, 200);

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setSize(x,50);
        inputPanel.setBackground(c);

        JLabel inputLabel = new JLabel("Task:");
        inputLabel.setFont(f);
        inputField = new JTextField(20);
        //inputField.setSize();
        inputField.setFont(f);
        JButton addButton = new JButton("Add");
        addButton.setSize(50,20);
        addButton.setBackground(C3);
        addButton.addActionListener(this);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        // Output Area
//        JLabel outLabel = new JLabel("Task To Do :");
//        outLabel.setFont(f);
//        add(outLabel,BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(f);
        outputArea.setBackground(C2);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(scrollPane, BorderLayout.CENTER);

        editButton = new JButton("Edit");
        editButton.addActionListener(this);
        editButton.setEnabled(false);
        editButton.setBackground(C3);

        add(editButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getActionCommand().equals("Add")) {
            String task = inputField.getText();

            if (!task.isEmpty()) {
                outputArea.append(" "+counter +". " +task + "\n");
                outputArea.append("---------------------------------------------------------------------------\n");
                counter++;
                inputField.setText("");
            }
        } else if (e.getActionCommand().equals("Edit")) {
            String selectedTask = outputArea.getSelectedText();
            if (selectedTask != null) {
                String editedTask = JOptionPane.showInputDialog(this, "Enter the edited task:", selectedTask);
                if (editedTask != null) {
                    outputArea.replaceRange(editedTask, outputArea.getSelectionStart(), outputArea.getSelectionEnd());
                }
            }
            editButton.setEnabled(false);
        }

        if (outputArea.getText().isEmpty()) {
            editButton.setEnabled(false);
        } else {
            editButton.setEnabled(true);
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ToDoListGUI();
            }
        });
    }
}
