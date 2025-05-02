package exp10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {

    private static JTextField display;
    private static StringBuilder currentInput = new StringBuilder();
    private static double firstNumber = 0;
    private static String operator = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);
            frame.setLayout(new BorderLayout());

            display = new JTextField();
            display.setFont(new Font("Arial", Font.BOLD, 24));
            display.setHorizontalAlignment(SwingConstants.RIGHT);
            display.setEditable(false);
            frame.add(display, BorderLayout.NORTH);

            JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
            String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
            };

            for (String text : buttons) {
                JButton button = new JButton(text);
                button.setFont(new Font("Arial", Font.BOLD, 20));
                button.addActionListener(new ButtonListener());
                panel.add(button);
            }

            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }

    static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            if (command.matches("[0-9]")) {
                currentInput.append(command);
                display.setText(currentInput.toString());
            } else if (command.matches("[+\\-*/]")) {
                if (currentInput.length() > 0) {
                    firstNumber = Double.parseDouble(currentInput.toString());
                    operator = command;
                    currentInput.setLength(0);
                    display.setText("");
                }
            } else if (command.equals("=")) {
                if (currentInput.length() > 0 && !operator.isEmpty()) {
                    double secondNumber = Double.parseDouble(currentInput.toString());
                    double result = 0;
                    switch (operator) {
                        case "+": result = firstNumber + secondNumber; break;
                        case "-": result = firstNumber - secondNumber; break;
                        case "*": result = firstNumber * secondNumber; break;
                        case "/":
                            if (secondNumber == 0) {
                                display.setText("Error");
                                currentInput.setLength(0);
                                return;
                            }
                            result = firstNumber / secondNumber;
                            break;
                    }
                    display.setText(String.valueOf(result));
                    currentInput.setLength(0);
                    currentInput.append(result);
                    operator = "";
                }
            } else if (command.equals("C")) {
                currentInput.setLength(0);
                operator = "";
                firstNumber = 0;
                display.setText("");
            }
        }
    }
}