package modelIsland.view;

import javax.swing.*;
import java.io.File;
import java.util.Objects;

public class SwingView extends JFrame implements View{
    //TODO дописать логику web интерфейса
    ImageIcon mapIcon;
    JLabel jLabelIcon;
    private static final String PATH_ICON = "/image/mapIsland.jpg";

    public SwingView(){
        initializationWindow();
        initializationFrame();
    }
    private void initializationFrame(){
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void initializationWindow(){
        mapIcon = new ImageIcon(Objects.requireNonNull(SwingView.class.getResource(PATH_ICON)));
        jLabelIcon = new JLabel(mapIcon);
        jLabelIcon.setBounds(0,125,1200, 650);
        this.add(jLabelIcon);
    }
}
