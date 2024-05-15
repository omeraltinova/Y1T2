package Hafta8.GUI1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatUI extends JFrame {
    private JTextField messageField;
    private JTextArea chatArea;

    public ChatUI() {
        setTitle("Java Swing Chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        messageField = new JTextField();
        inputPanel.add(messageField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Gönder");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                if (!message.isEmpty()) {
                    sendMessage(message);
                    messageField.setText("");
                }
            }
        });
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void sendMessage(String message) {
        chatArea.append("Sen: " + message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatUI();
            }
        });
    }
}

