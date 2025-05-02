package exp10;

import javax.swing.*;

class TodoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        taskField.setBounds(20, 20, 200, 30);
        addButton.setBounds(230, 20, 80, 30);
        removeButton.setBounds(320, 20, 90, 30);
        list.setBounds(20, 60, 390, 200);

        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(list);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) model.addElement(task);
            taskField.setText("");
        });

        removeButton.addActionListener(e -> {
            int index = list.getSelectedIndex();
            if (index != -1) model.remove(index);
        });

        frame.setSize(450, 320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}