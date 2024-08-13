package modelIsland.view;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderOutput;
import org.w3c.dom.DOMImplementation;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.image.ImageTranscoder;

public class SwingView extends JFrame implements View {
    //TODO дописать логику web интерфейса
    ImageIcon mapIcon;
    JLabel jLabelIcon;
    private static final String PATH_ICON = "/image/mapIsland.jpg";
    private static final String PATH_ICON2 = "/Users/vadimdudorov/Documents/GIT/ModelIsland/src/main/resources/image/mapIsland.jpg";

    public SwingView() {
        initializationWindow();
        initializationFrame();
    }

    private void initializationFrame() {
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void initializationWindow() {
//        mapIcon = new ImageIcon(Objects.requireNonNull(SwingView.class.getResource(PATH_ICON)));
//        jLabelIcon = new JLabel(mapIcon);
//        jLabelIcon.setBounds(0,125,1200, 650);
//        this.add(jLabelIcon);
        ImageBackgroundPanel panel = new ImageBackgroundPanel(PATH_ICON);
        panel.setBounds(0, 350, 500, 500);


        JButton start = new JButton("Start");
        start.setBounds(5, 25, 80, 35);
        this.add(start);

        JButton stop = new JButton("Stop");
        stop.setBounds(5, 65, 80, 35);
        this.add(stop);

        JButton label = new JButton("\uD83D\uDC03");
        label.setBounds(200, 85, 250, 60);
        panel.add(label);
        this.add(panel);
    }

    private BufferedImage initializeIcon(String path) {
        URL iconUrl = SwingView.class.getResource(path);

        try (InputStream in = iconUrl.openStream()) {
            if (in == null) {
                throw new IOException("Input stream for URL = " + iconUrl + " is null");
            }

            MyTranscoder transcoder = new MyTranscoder();

            transcoder.transcode(new TranscoderInput(in), null);
            BufferedImage image = transcoder.getImage();
            return image;
        } catch (IOException | TranscoderException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private class ImageBackgroundPanel extends JPanel {
        private BufferedImage backgroundImage;

        public ImageBackgroundPanel(String imagePath) {
            backgroundImage = initializeIcon(imagePath);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(backgroundImage, getHeight(), getHeight(), null);
        }
    }

    private static class MyTranscoder extends ImageTranscoder {
        private BufferedImage image;

        public BufferedImage createImage(int w, int h) {
            this.image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            return this.image;
        }

        public void writeImage(BufferedImage img, TranscoderOutput out) {
        }

        public BufferedImage getImage() {
            return this.image;
        }
    }
}
