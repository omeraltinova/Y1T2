package Hafta8.Teorik.EventListeners.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSample implements ActionListener {
    JFrame frame;
    JButton btnSave;
    JButton btnDelete;
    public ButtonSample() {
        frame = new JFrame("Null Layout Örneği");
        frame.setLayout(null);
// Bileşenleri oluştur btnSave = new JButton("Save");
        btnDelete = new JButton("Delete");

        JLabel lblName = new JLabel("Name: ");
        JLabel lblEmail = new JLabel("Email: ");

        JTextField txtName = new JTextField();
        JTextField txtEmail = new JTextField();

        lblName.setBounds(20, 10, 80, 30);
        txtName.setBounds(120, 10, 200, 30);
        lblEmail.setBounds(20, 50, 80, 30);
        txtEmail.setBounds(120, 50, 200, 30);

// Bileşenlerin boyutlarını ve konumlarını ayarla btnSave.setBounds(20, 100, 80, 30);
        btnDelete.setBounds(120, 100, 80, 30);

        btnSave.addActionListener(this);
        btnDelete.addActionListener(this);

// Bileşenleri JFrame'e ekle frame.getContentPane().add(btnSave);
        frame.getContentPane().add(btnDelete);
        frame.getContentPane().add(lblName);
        frame.getContentPane().add(lblEmail);
        frame.getContentPane().add(txtName);
        frame.getContentPane().add(txtEmail);

// Pencereyi görünür yap frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnSave) {
            JOptionPane.showMessageDialog(frame, "Kayıt Edildi " );
        }else if (e.getSource()==btnDelete) {
            JOptionPane.showMessageDialog(frame, "Kayıt Silindi " );
        }

    }
}