package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomFrameApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Özel Pencere");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setUndecorated(true);  // Varsayılan pencere dekorasyonlarını kaldır

        // Özelleştirilmiş başlık çubuğunu oluştur
        JPanel titleBar = new JPanel();
        titleBar.setBackground(new Color(70, 130, 180)); // Başlık çubuğu rengi
        titleBar.setLayout(new BorderLayout());
        titleBar.setPreferredSize(new Dimension(frame.getWidth(), 30));

        // Başlık metnini ekle
        JLabel titleLabel = new JLabel("Özel Pencere Başlığı");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        titleBar.add(titleLabel, BorderLayout.WEST);

        // Pencere kontrol düğmelerini ekle
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        controlPanel.setOpaque(false);

        JButton minimizeButton = new JButton("_");
        JButton closeButton = new JButton("X");

        // Küçültme düğmesi işlemi
        minimizeButton.addActionListener(e -> frame.setState(Frame.ICONIFIED));

        // Kapatma düğmesi işlemi
        closeButton.addActionListener(e -> System.exit(0));

        // Düğme stillerini ayarla
        customizeButton(minimizeButton);
        customizeButton(closeButton);

        controlPanel.add(minimizeButton);
        controlPanel.add(closeButton);
        titleBar.add(controlPanel, BorderLayout.EAST);

        // Başlık çubuğunu sürükleyerek pencereyi taşıma
        titleBar.addMouseListener(new MouseAdapter() {
            private Point initialClick;

            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                frame.getComponentAt(initialClick);
            }

            public void mouseDragged(MouseEvent e) {
                // Ekran koordinatlarını al
                int thisX = frame.getLocation().x;
                int thisY = frame.getLocation().y;

                // Yeni pencere konumunu hesapla
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                frame.setLocation(X, Y);
            }
        });
        

        // İçeriği ekle
        frame.add(titleBar, BorderLayout.NORTH);
        frame.add(new JLabel("Ana İçerik"), BorderLayout.CENTER);

        // Çerçeveyi görünür yap
        frame.setVisible(true);
    }

    private static void customizeButton(JButton button) {
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setBackground(new Color(220, 220, 220));
        button.setForeground(Color.BLACK);
        button.setPreferredSize(new Dimension(40, 30));
    }
}
