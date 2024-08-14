package modelIsland.view;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SwingView extends JFrame implements View {
    //TODO дописать логику web интерфейса
    private static final String PATH_ICON = "/image/mapIsland.jpeg";

    public SwingView() {
        initializationWindow();

        threadDesertType();
        threadPlainType();
        threadMountainousType();
        threadWoodlandType();

        initializationIcon();
        initializationFrame();
    }

    private void initializationFrame() {
        this.setSize(828, 370);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("MapIsland");

    }

    private void initializationIcon() {
        Image img = Toolkit.getDefaultToolkit().getImage(Objects.requireNonNull(SwingView.class.getResource(PATH_ICON)));
        JLabel picLabel = new JLabel(new ImageIcon(img));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        this.add(jPanel);

    }

    private void initializationWindow() {
        JButton start = new JButton("Start");
        start.setBounds(5, 25, 80, 35);
        this.add(start);

        JButton stop = new JButton("Stop");
        stop.setBounds(5, 65, 80, 35);
        this.add(stop);

    }

    private void threadDesertType(){
        JLabel labelBull = new JLabel("\uD83D\uDC03");
        labelBull.setBounds(130, 90, 25, 25);
        this.add(labelBull);
        JTextArea jTextAreaBull = new JTextArea("55000");
        jTextAreaBull.setBounds(145, 97, 35, 10);
        jTextAreaBull.setEditable(false);
        jTextAreaBull.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextAreaBull);
    }

    private void threadMountainousType(){
    }

    private void threadPlainType(){
    }

    private void threadWoodlandType(){
    }
}
