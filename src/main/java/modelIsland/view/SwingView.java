package modelIsland.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static modelIsland.repository.AnimalParameters.nameAnimals;

public class SwingView extends JFrame implements View {
    //TODO кнопка стоп не работает
    boolean isStart = true;
    boolean isStop = false;

    public boolean isStop() {
        return isStop;
    }

    private static final String NAME_TYPE_DESERT = "DesertType";
    private static final String NAME_TYPE_MOUNTAINOUS = "MountainousType";
    private static final String NAME_TYPE_PLAIN = "PlainType";
    private static final String NAME_TYPE_WOODLAND = "WoodlandType";

    private JTextArea jTextDesertWolf;
    private JTextArea jTextDesertBoa;
    private JTextArea jTextDesertFox;
    private JTextArea jTextDesertBear;
    private JTextArea jTextDesertEagle;
    private JTextArea jTextDesertHorse;
    private JTextArea jTextDesertDeer;
    private JTextArea jTextDesertRabbit;
    private JTextArea jTextDesertMouse;
    private JTextArea jTextDesertGoat;
    private JTextArea jTextDesertSheep;
    private JTextArea jTextDesertHog;
    private JTextArea jTextDesertBull;
    private JTextArea jTextDesertDuck;
    private JTextArea jTextDesertCaterpillar;
    private JTextArea jTextDesertPlant;

    private JTextArea jTextMountainousWolf;
    private JTextArea jTextMountainousBoa;
    private JTextArea jTextMountainousFox;
    private JTextArea jTextMountainousBear;
    private JTextArea jTextMountainousEagle;
    private JTextArea jTextMountainousHorse;
    private JTextArea jTextMountainousDeer;
    private JTextArea jTextMountainousRabbit;
    private JTextArea jTextMountainousMouse;
    private JTextArea jTextMountainousGoat;
    private JTextArea jTextMountainousSheep;
    private JTextArea jTextMountainousHog;
    private JTextArea jTextMountainousBull;
    private JTextArea jTextMountainousDuck;
    private JTextArea jTextMountainousCaterpillar;
    private JTextArea jTextMountainousPlant;

    private JTextArea jTextPlainWolf;
    private JTextArea jTextPlainBoa;
    private JTextArea jTextPlainFox;
    private JTextArea jTextPlainBear;
    private JTextArea jTextPlainEagle;
    private JTextArea jTextPlainHorse;
    private JTextArea jTextPlainDeer;
    private JTextArea jTextPlainRabbit;
    private JTextArea jTextPlainMouse;
    private JTextArea jTextPlainGoat;
    private JTextArea jTextPlainSheep;
    private JTextArea jTextPlainHog;
    private JTextArea jTextPlainBull;
    private JTextArea jTextPlainDuck;
    private JTextArea jTextPlainCaterpillar;
    private JTextArea jTextPlainPlant;

    private JTextArea jTextWoodlandWolf;
    private JTextArea jTextWoodlandBoa;
    private JTextArea jTextWoodlandFox;
    private JTextArea jTextWoodlandBear;
    private JTextArea jTextWoodlandEagle;
    private JTextArea jTextWoodlandHorse;
    private JTextArea jTextWoodlandDeer;
    private JTextArea jTextWoodlandRabbit;
    private JTextArea jTextWoodlandMouse;
    private JTextArea jTextWoodlandGoat;
    private JTextArea jTextWoodlandSheep;
    private JTextArea jTextWoodlandHog;
    private JTextArea jTextWoodlandBull;
    private JTextArea jTextWoodlandDuck;
    private JTextArea jTextWoodlandCaterpillar;
    private JTextArea jTextWoodlandPlant;

    private final Map<String, JTextArea> mapNameAnimalDesert = new HashMap<>();
    private final Map<String, JTextArea> mapNameAnimalMountainous = new HashMap<>();
    private final Map<String, JTextArea> mapNameAnimalPlain = new HashMap<>();
    private final Map<String, JTextArea> mapNameAnimalWoodland = new HashMap<>();

    private static final String PATH_ICON = "/image/mapIsland.jpeg";

    public SwingView() {
        initializationWindow();

        threadDesertType();
        threadMountainousType();
        threadPlainType();
        threadWoodlandType();


        initializationIcon();
        initializationFrame();

        mapNameAnimalDesert.put(nameAnimals[0], jTextDesertWolf);
        mapNameAnimalDesert.put(nameAnimals[1], jTextDesertBoa);
        mapNameAnimalDesert.put(nameAnimals[2], jTextDesertFox);
        mapNameAnimalDesert.put(nameAnimals[3], jTextDesertBear);
        mapNameAnimalDesert.put(nameAnimals[4], jTextDesertEagle);
        mapNameAnimalDesert.put(nameAnimals[5], jTextDesertHorse);
        mapNameAnimalDesert.put(nameAnimals[6], jTextDesertDeer);
        mapNameAnimalDesert.put(nameAnimals[7], jTextDesertRabbit);
        mapNameAnimalDesert.put(nameAnimals[8], jTextDesertMouse);
        mapNameAnimalDesert.put(nameAnimals[9], jTextDesertGoat);
        mapNameAnimalDesert.put(nameAnimals[10], jTextDesertSheep);
        mapNameAnimalDesert.put(nameAnimals[11], jTextDesertHog);
        mapNameAnimalDesert.put(nameAnimals[12], jTextDesertBull);
        mapNameAnimalDesert.put(nameAnimals[13], jTextDesertDuck);
        mapNameAnimalDesert.put(nameAnimals[14], jTextDesertCaterpillar);
        mapNameAnimalDesert.put(nameAnimals[15], jTextDesertPlant);

        mapNameAnimalMountainous.put(nameAnimals[0], jTextMountainousWolf);
        mapNameAnimalMountainous.put(nameAnimals[1], jTextMountainousBoa);
        mapNameAnimalMountainous.put(nameAnimals[2], jTextMountainousFox);
        mapNameAnimalMountainous.put(nameAnimals[3], jTextMountainousBear);
        mapNameAnimalMountainous.put(nameAnimals[4], jTextMountainousEagle);
        mapNameAnimalMountainous.put(nameAnimals[5], jTextMountainousHorse);
        mapNameAnimalMountainous.put(nameAnimals[6], jTextMountainousDeer);
        mapNameAnimalMountainous.put(nameAnimals[7], jTextMountainousRabbit);
        mapNameAnimalMountainous.put(nameAnimals[8], jTextMountainousMouse);
        mapNameAnimalMountainous.put(nameAnimals[9], jTextMountainousGoat);
        mapNameAnimalMountainous.put(nameAnimals[10], jTextMountainousSheep);
        mapNameAnimalMountainous.put(nameAnimals[11], jTextMountainousHog);
        mapNameAnimalMountainous.put(nameAnimals[12], jTextMountainousBull);
        mapNameAnimalMountainous.put(nameAnimals[13], jTextMountainousDuck);
        mapNameAnimalMountainous.put(nameAnimals[14], jTextMountainousCaterpillar);
        mapNameAnimalMountainous.put(nameAnimals[15], jTextMountainousPlant);

        mapNameAnimalPlain.put(nameAnimals[0], jTextPlainWolf);
        mapNameAnimalPlain.put(nameAnimals[1], jTextPlainBoa);
        mapNameAnimalPlain.put(nameAnimals[2], jTextPlainFox);
        mapNameAnimalPlain.put(nameAnimals[3], jTextPlainBear);
        mapNameAnimalPlain.put(nameAnimals[4], jTextPlainEagle);
        mapNameAnimalPlain.put(nameAnimals[5], jTextPlainHorse);
        mapNameAnimalPlain.put(nameAnimals[6], jTextPlainDeer);
        mapNameAnimalPlain.put(nameAnimals[7], jTextPlainRabbit);
        mapNameAnimalPlain.put(nameAnimals[8], jTextPlainMouse);
        mapNameAnimalPlain.put(nameAnimals[9], jTextPlainGoat);
        mapNameAnimalPlain.put(nameAnimals[10], jTextPlainSheep);
        mapNameAnimalPlain.put(nameAnimals[11], jTextPlainHog);
        mapNameAnimalPlain.put(nameAnimals[12], jTextPlainBull);
        mapNameAnimalPlain.put(nameAnimals[13], jTextPlainDuck);
        mapNameAnimalPlain.put(nameAnimals[14], jTextPlainCaterpillar);
        mapNameAnimalPlain.put(nameAnimals[15], jTextPlainPlant);

        mapNameAnimalWoodland.put(nameAnimals[0], jTextWoodlandWolf);
        mapNameAnimalWoodland.put(nameAnimals[1], jTextWoodlandBoa);
        mapNameAnimalWoodland.put(nameAnimals[2], jTextWoodlandFox);
        mapNameAnimalWoodland.put(nameAnimals[3], jTextWoodlandBear);
        mapNameAnimalWoodland.put(nameAnimals[4], jTextWoodlandEagle);
        mapNameAnimalWoodland.put(nameAnimals[5], jTextWoodlandHorse);
        mapNameAnimalWoodland.put(nameAnimals[6], jTextWoodlandDeer);
        mapNameAnimalWoodland.put(nameAnimals[7], jTextWoodlandRabbit);
        mapNameAnimalWoodland.put(nameAnimals[8], jTextWoodlandMouse);
        mapNameAnimalWoodland.put(nameAnimals[9], jTextWoodlandGoat);
        mapNameAnimalWoodland.put(nameAnimals[10], jTextWoodlandSheep);
        mapNameAnimalWoodland.put(nameAnimals[11], jTextWoodlandHog);
        mapNameAnimalWoodland.put(nameAnimals[12], jTextWoodlandBull);
        mapNameAnimalWoodland.put(nameAnimals[13], jTextWoodlandDuck);
        mapNameAnimalWoodland.put(nameAnimals[14], jTextWoodlandCaterpillar);
        mapNameAnimalWoodland.put(nameAnimals[15], jTextWoodlandPlant);

        while (isStart) {
            System.out.println("Waiting");
        }
        System.out.println("Start");
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
        start.addActionListener(e -> isStart = false);
        this.add(start);

        JButton stop = new JButton("Stop");
        stop.setBounds(5, 65, 80, 35);
        stop.addActionListener(e -> isStop = true);
        this.add(stop);
    }

    private void threadDesertType() {

        JLabel labelDesertWolf = new JLabel("\uD83D\uDC3A");
        labelDesertWolf.setBounds(130, 90, 25, 25);
        this.add(labelDesertWolf);
        jTextDesertWolf = new JTextArea("-");
        jTextDesertWolf.setBounds(145, 97, 35, 10);
        jTextDesertWolf.setEditable(false);
        jTextDesertWolf.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertWolf);

        JLabel labelDesertBoa = new JLabel("\uD83D\uDC0D");
        labelDesertBoa.setBounds(130, 110, 25, 25);
        this.add(labelDesertBoa);
        jTextDesertBoa = new JTextArea("-");
        jTextDesertBoa.setBounds(145, 117, 35, 10);
        jTextDesertBoa.setEditable(false);
        jTextDesertBoa.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertBoa);

        JLabel labelDesertFox = new JLabel("\uD83E\uDD8A");
        labelDesertFox.setBounds(130, 130, 25, 25);
        this.add(labelDesertFox);
        jTextDesertFox = new JTextArea("-");
        jTextDesertFox.setBounds(145, 137, 35, 10);
        jTextDesertFox.setEditable(false);
        jTextDesertFox.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertFox);

        JLabel labelDesertBear = new JLabel("\uD83D\uDC3B");
        labelDesertBear.setBounds(130, 150, 25, 25);
        this.add(labelDesertBear);
        jTextDesertBear = new JTextArea("-");
        jTextDesertBear.setBounds(145, 157, 35, 10);
        jTextDesertBear.setEditable(false);
        jTextDesertBear.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertBear);

        JLabel labelDesertEagle = new JLabel("\uD83E\uDD85");
        labelDesertEagle.setBounds(130, 170, 25, 25);
        this.add(labelDesertEagle);
        jTextDesertEagle = new JTextArea("-");
        jTextDesertEagle.setBounds(145, 177, 35, 10);
        jTextDesertEagle.setEditable(false);
        jTextDesertEagle.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertEagle);

        JLabel labelDesertHorse = new JLabel("\uD83D\uDC0E");
        labelDesertHorse.setBounds(130, 190, 25, 25);
        this.add(labelDesertHorse);
        jTextDesertHorse = new JTextArea("-");
        jTextDesertHorse.setBounds(145, 197, 35, 10);
        jTextDesertHorse.setEditable(false);
        jTextDesertHorse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertHorse);

        JLabel labelDesertDeer = new JLabel("\uD83E\uDD8C");
        labelDesertDeer.setBounds(130, 210, 25, 25);
        this.add(labelDesertDeer);
        jTextDesertDeer = new JTextArea("-");
        jTextDesertDeer.setBounds(145, 217, 35, 10);
        jTextDesertDeer.setEditable(false);
        jTextDesertDeer.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertDeer);

        JLabel labelDesertRabbit = new JLabel("\uD83D\uDC07");
        labelDesertRabbit.setBounds(130, 230, 25, 25);
        this.add(labelDesertRabbit);
        jTextDesertRabbit = new JTextArea("-");
        jTextDesertRabbit.setBounds(145, 237, 35, 10);
        jTextDesertRabbit.setEditable(false);
        jTextDesertRabbit.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertRabbit);

        JLabel labelDesertMouse = new JLabel("\uD83D\uDC01");
        labelDesertMouse.setBounds(130, 250, 25, 25);
        this.add(labelDesertMouse);
        jTextDesertMouse = new JTextArea("-");
        jTextDesertMouse.setBounds(145, 257, 35, 10);
        jTextDesertMouse.setEditable(false);
        jTextDesertMouse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertMouse);

        JLabel labelDesertGoat = new JLabel("\uD83D\uDC10");
        labelDesertGoat.setBounds(160, 70, 25, 25);
        this.add(labelDesertGoat);
        jTextDesertGoat = new JTextArea("-");
        jTextDesertGoat.setBounds(175, 77, 35, 10);
        jTextDesertGoat.setEditable(false);
        jTextDesertGoat.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertGoat);

        JLabel labelDesertSheep = new JLabel("\uD83D\uDC11");
        labelDesertSheep.setBounds(190, 110, 25, 25);
        this.add(labelDesertSheep);
        jTextDesertSheep = new JTextArea("-");
        jTextDesertSheep.setBounds(205, 117, 35, 10);
        jTextDesertSheep.setEditable(false);
        jTextDesertSheep.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertSheep);

        JLabel labelDesertHog = new JLabel("\uD83D\uDC17");
        labelDesertHog.setBounds(190, 130, 25, 25);
        this.add(labelDesertHog);
        jTextDesertHog = new JTextArea("-");
        jTextDesertHog.setBounds(205, 137, 35, 10);
        jTextDesertHog.setEditable(false);
        jTextDesertHog.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertHog);

        JLabel labelDesertBull = new JLabel("\uD83D\uDC03");
        labelDesertBull.setBounds(190, 150, 25, 25);
        this.add(labelDesertBull);
        jTextDesertBull = new JTextArea("-");
        jTextDesertBull.setBounds(205, 157, 35, 10);
        jTextDesertBull.setEditable(false);
        jTextDesertBull.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertBull);

        JLabel labelDesertDuck = new JLabel("\uD83E\uDD86");
        labelDesertDuck.setBounds(190, 170, 25, 25);
        this.add(labelDesertDuck);
        jTextDesertDuck = new JTextArea("-");
        jTextDesertDuck.setBounds(205, 177, 35, 10);
        jTextDesertDuck.setEditable(false);
        jTextDesertDuck.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertDuck);

        JLabel labelDesertCaterpillar = new JLabel("\uD83D\uDC1B");
        labelDesertCaterpillar.setBounds(190, 190, 25, 25);
        this.add(labelDesertCaterpillar);
        jTextDesertCaterpillar = new JTextArea("-");
        jTextDesertCaterpillar.setBounds(205, 197, 35, 10);
        jTextDesertCaterpillar.setEditable(false);
        jTextDesertCaterpillar.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertCaterpillar);

        JLabel labelDesertPlant = new JLabel("\uD83C\uDF3E");
        labelDesertPlant.setBounds(190, 210, 25, 25);
        this.add(labelDesertPlant);
        jTextDesertPlant = new JTextArea("-");
        jTextDesertPlant.setBounds(205, 217, 35, 10);
        jTextDesertPlant.setEditable(false);
        jTextDesertPlant.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextDesertPlant);
    }

    private void threadMountainousType() {
        JLabel labelMountainousWolf = new JLabel("\uD83D\uDC3A");
        labelMountainousWolf.setBounds(255, 70, 25, 25);
        this.add(labelMountainousWolf);
        jTextMountainousWolf = new JTextArea("-");
        jTextMountainousWolf.setBounds(270, 77, 35, 10);
        jTextMountainousWolf.setEditable(false);
        jTextMountainousWolf.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousWolf);

        JLabel labelMountainousBoa = new JLabel("\uD83D\uDC0D");
        labelMountainousBoa.setBounds(255, 90, 25, 25);
        this.add(labelMountainousBoa);
        jTextMountainousBoa = new JTextArea("-");
        jTextMountainousBoa.setBounds(270, 97, 35, 10);
        jTextMountainousBoa.setEditable(false);
        jTextMountainousBoa.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousBoa);

        JLabel labelMountainousFox = new JLabel("\uD83E\uDD8A");
        labelMountainousFox.setBounds(255, 110, 25, 25);
        this.add(labelMountainousFox);
        jTextMountainousFox = new JTextArea("-");
        jTextMountainousFox.setBounds(270, 117, 35, 10);
        jTextMountainousFox.setEditable(false);
        jTextMountainousFox.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousFox);

        JLabel labelMountainousBear = new JLabel("\uD83D\uDC3B");
        labelMountainousBear.setBounds(255, 130, 25, 25);
        this.add(labelMountainousBear);
        jTextMountainousBear = new JTextArea("-");
        jTextMountainousBear.setBounds(270, 137, 35, 10);
        jTextMountainousBear.setEditable(false);
        jTextMountainousBear.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousBear);

        JLabel labelMountainousEagle = new JLabel("\uD83E\uDD85");
        labelMountainousEagle.setBounds(255, 150, 25, 25);
        this.add(labelMountainousEagle);
        jTextMountainousEagle = new JTextArea("-");
        jTextMountainousEagle.setBounds(270, 157, 35, 10);
        jTextMountainousEagle.setEditable(false);
        jTextMountainousEagle.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousEagle);

        JLabel labelMountainousHorse = new JLabel("\uD83D\uDC0E");
        labelMountainousHorse.setBounds(255, 170, 25, 25);
        this.add(labelMountainousHorse);
        jTextMountainousHorse = new JTextArea("-");
        jTextMountainousHorse.setBounds(270, 177, 35, 10);
        jTextMountainousHorse.setEditable(false);
        jTextMountainousHorse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousHorse);

        JLabel labelMountainousDeer = new JLabel("\uD83E\uDD8C");
        labelMountainousDeer.setBounds(255, 190, 25, 25);
        this.add(labelMountainousDeer);
        jTextMountainousDeer = new JTextArea("-");
        jTextMountainousDeer.setBounds(270, 197, 35, 10);
        jTextMountainousDeer.setEditable(false);
        jTextMountainousDeer.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousDeer);

        JLabel labelMountainousRabbit = new JLabel("\uD83D\uDC07");
        labelMountainousRabbit.setBounds(255, 210, 25, 25);
        this.add(labelMountainousRabbit);
        jTextMountainousRabbit = new JTextArea("-");
        jTextMountainousRabbit.setBounds(270, 217, 35, 10);
        jTextMountainousRabbit.setEditable(false);
        jTextMountainousRabbit.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousRabbit);

        JLabel labelMountainousMouse = new JLabel("\uD83D\uDC01");
        labelMountainousMouse.setBounds(255, 230, 25, 25);
        this.add(labelMountainousMouse);
        jTextMountainousMouse = new JTextArea("-");
        jTextMountainousMouse.setBounds(270, 237, 35, 10);
        jTextMountainousMouse.setEditable(false);
        jTextMountainousMouse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousMouse);

        JLabel labelMountainousGoat = new JLabel("\uD83D\uDC10");
        labelMountainousGoat.setBounds(255, 250, 25, 25);
        this.add(labelMountainousGoat);
        jTextMountainousGoat = new JTextArea("-");
        jTextMountainousGoat.setBounds(270, 257, 35, 10);
        jTextMountainousGoat.setEditable(false);
        jTextMountainousGoat.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousGoat);

        JLabel labelMountainousSheep = new JLabel("\uD83D\uDC11");
        labelMountainousSheep.setBounds(315, 68, 25, 25);
        this.add(labelMountainousSheep);
        jTextMountainousSheep = new JTextArea("-");
        jTextMountainousSheep.setBounds(330, 75, 35, 10);
        jTextMountainousSheep.setEditable(false);
        jTextMountainousSheep.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousSheep);

        JLabel labelMountainousHog = new JLabel("\uD83D\uDC17");
        labelMountainousHog.setBounds(315, 88, 25, 25);
        this.add(labelMountainousHog);
        jTextMountainousHog = new JTextArea("-");
        jTextMountainousHog.setBounds(330, 95, 35, 10);
        jTextMountainousHog.setEditable(false);
        jTextMountainousHog.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousHog);

        JLabel labelMountainousBull = new JLabel("\uD83D\uDC03");
        labelMountainousBull.setBounds(315, 108, 25, 25);
        this.add(labelMountainousBull);
        jTextMountainousBull = new JTextArea("-");
        jTextMountainousBull.setBounds(330, 115, 35, 10);
        jTextMountainousBull.setEditable(false);
        jTextMountainousBull.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousBull);

        JLabel labelMountainousDuck = new JLabel("\uD83E\uDD86");
        labelMountainousDuck.setBounds(315, 128, 25, 25);
        this.add(labelMountainousDuck);
        jTextMountainousDuck = new JTextArea("-");
        jTextMountainousDuck.setBounds(330, 135, 35, 10);
        jTextMountainousDuck.setEditable(false);
        jTextMountainousDuck.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousDuck);

        JLabel labelMountainousCaterpillar = new JLabel("\uD83D\uDC1B");
        labelMountainousCaterpillar.setBounds(315, 148, 25, 25);
        this.add(labelMountainousCaterpillar);
        jTextMountainousCaterpillar = new JTextArea("-");
        jTextMountainousCaterpillar.setBounds(330, 155, 35, 10);
        jTextMountainousCaterpillar.setEditable(false);
        jTextMountainousCaterpillar.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousCaterpillar);

        JLabel labelMountainousPlant = new JLabel("\uD83C\uDF3E");
        labelMountainousPlant.setBounds(315, 168, 25, 25);
        this.add(labelMountainousPlant);
        jTextMountainousPlant = new JTextArea("-");
        jTextMountainousPlant.setBounds(330, 175, 35, 10);
        jTextMountainousPlant.setEditable(false);
        jTextMountainousPlant.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextMountainousPlant);
    }

    private void threadPlainType() {
        JLabel labelPlainWolf = new JLabel("\uD83D\uDC3A");
        labelPlainWolf.setBounds(390, 125, 25, 25);
        this.add(labelPlainWolf);
        jTextPlainWolf = new JTextArea("-");
        jTextPlainWolf.setBounds(405, 132, 35, 10);
        jTextPlainWolf.setEditable(false);
        jTextPlainWolf.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainWolf);

        JLabel labelPlainBoa = new JLabel("\uD83D\uDC0D");
        labelPlainBoa.setBounds(390, 145, 25, 25);
        this.add(labelPlainBoa);
        jTextPlainBoa = new JTextArea("-");
        jTextPlainBoa.setBounds(405, 152, 35, 10);
        jTextPlainBoa.setEditable(false);
        jTextPlainBoa.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainBoa);

        JLabel labelPlainFox = new JLabel("\uD83E\uDD8A");
        labelPlainFox.setBounds(390, 165, 25, 25);
        this.add(labelPlainFox);
        jTextPlainFox = new JTextArea("-");
        jTextPlainFox.setBounds(405, 172, 35, 10);
        jTextPlainFox.setEditable(false);
        jTextPlainFox.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainFox);

        JLabel labelPlainBear = new JLabel("\uD83D\uDC3B");
        labelPlainBear.setBounds(390, 185, 25, 25);
        this.add(labelPlainBear);
        jTextPlainBear = new JTextArea("-");
        jTextPlainBear.setBounds(405, 192, 35, 10);
        jTextPlainBear.setEditable(false);
        jTextPlainBear.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainBear);

        JLabel labelPlainEagle = new JLabel("\uD83E\uDD85");
        labelPlainEagle.setBounds(390, 205, 25, 25);
        this.add(labelPlainEagle);
        jTextPlainEagle = new JTextArea("-");
        jTextPlainEagle.setBounds(405, 212, 35, 10);
        jTextPlainEagle.setEditable(false);
        jTextPlainEagle.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainEagle);

        JLabel labelPlainHorse = new JLabel("\uD83D\uDC0E");
        labelPlainHorse.setBounds(390, 225, 25, 25);
        this.add(labelPlainHorse);
        jTextPlainHorse = new JTextArea("-");
        jTextPlainHorse.setBounds(405, 232, 35, 10);
        jTextPlainHorse.setEditable(false);
        jTextPlainHorse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainHorse);

        JLabel labelPlainDeer = new JLabel("\uD83E\uDD8C");
        labelPlainDeer.setBounds(390, 245, 25, 25);
        this.add(labelPlainDeer);
        jTextPlainDeer = new JTextArea("-");
        jTextPlainDeer.setBounds(405, 252, 35, 10);
        jTextPlainDeer.setEditable(false);
        jTextPlainDeer.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainDeer);

        JLabel labelPlainRabbit = new JLabel("\uD83D\uDC07");
        labelPlainRabbit.setBounds(390, 265, 25, 25);
        this.add(labelPlainRabbit);
        jTextPlainRabbit = new JTextArea("-");
        jTextPlainRabbit.setBounds(405, 272, 35, 10);
        jTextPlainRabbit.setEditable(false);
        jTextPlainRabbit.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainRabbit);

        JLabel labelPlainMouse = new JLabel("\uD83D\uDC01");
        labelPlainMouse.setBounds(390, 285, 25, 25);
        this.add(labelPlainMouse);
        jTextPlainMouse = new JTextArea("-");
        jTextPlainMouse.setBounds(405, 292, 35, 10);
        jTextPlainMouse.setEditable(false);
        jTextPlainMouse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainMouse);

        JLabel labelPlainGoat = new JLabel("\uD83D\uDC10");
        labelPlainGoat.setBounds(390, 305, 25, 25);
        this.add(labelPlainGoat);
        jTextPlainGoat = new JTextArea("-");
        jTextPlainGoat.setBounds(405, 312, 35, 10);
        jTextPlainGoat.setEditable(false);
        jTextPlainGoat.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainGoat);

        JLabel labelPlainSheep = new JLabel("\uD83D\uDC11");
        labelPlainSheep.setBounds(450, 125, 25, 25);
        this.add(labelPlainSheep);
        jTextPlainSheep = new JTextArea("-");
        jTextPlainSheep.setBounds(465, 132, 35, 10);
        jTextPlainSheep.setEditable(false);
        jTextPlainSheep.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainSheep);

        JLabel labelPlainHog = new JLabel("\uD83D\uDC17");
        labelPlainHog.setBounds(450, 145, 25, 25);
        this.add(labelPlainHog);
        jTextPlainHog = new JTextArea("-");
        jTextPlainHog.setBounds(465, 152, 35, 10);
        jTextPlainHog.setEditable(false);
        jTextPlainHog.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainHog);

        JLabel labelPlainBull = new JLabel("\uD83D\uDC03");
        labelPlainBull.setBounds(450, 165, 25, 25);
        this.add(labelPlainBull);
        jTextPlainBull = new JTextArea("-");
        jTextPlainBull.setBounds(465, 172, 35, 10);
        jTextPlainBull.setEditable(false);
        jTextPlainBull.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainBull);

        JLabel labelPlainDuck = new JLabel("\uD83E\uDD86");
        labelPlainDuck.setBounds(450, 185, 25, 25);
        this.add(labelPlainDuck);
        jTextPlainDuck = new JTextArea("-");
        jTextPlainDuck.setBounds(465, 192, 35, 10);
        jTextPlainDuck.setEditable(false);
        jTextPlainDuck.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainDuck);

        JLabel labelPlainCaterpillar = new JLabel("\uD83D\uDC1B");
        labelPlainCaterpillar.setBounds(450, 205, 25, 25);
        this.add(labelPlainCaterpillar);
        jTextPlainCaterpillar = new JTextArea("-");
        jTextPlainCaterpillar.setBounds(465, 212, 35, 10);
        jTextPlainCaterpillar.setEditable(false);
        jTextPlainCaterpillar.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainCaterpillar);

        JLabel labelPlainPlant = new JLabel("\uD83C\uDF3E");
        labelPlainPlant.setBounds(450, 225, 25, 25);
        this.add(labelPlainPlant);
        jTextPlainPlant = new JTextArea("-");
        jTextPlainPlant.setBounds(465, 232, 35, 10);
        jTextPlainPlant.setEditable(false);
        jTextPlainPlant.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextPlainPlant);
    }

    private void threadWoodlandType() {
        JLabel labelWoodlandWolf = new JLabel("\uD83D\uDC3A");
        labelWoodlandWolf.setBounds(520, 125, 25, 25);
        this.add(labelWoodlandWolf);
        jTextWoodlandWolf = new JTextArea("-");
        jTextWoodlandWolf.setBounds(535, 132, 35, 10);
        jTextWoodlandWolf.setEditable(false);
        jTextWoodlandWolf.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandWolf);

        JLabel labelWoodlandBoa = new JLabel("\uD83D\uDC0D");
        labelWoodlandBoa.setBounds(520, 145, 25, 25);
        this.add(labelWoodlandBoa);
        jTextWoodlandBoa = new JTextArea("-");
        jTextWoodlandBoa.setBounds(535, 152, 35, 10);
        jTextWoodlandBoa.setEditable(false);
        jTextWoodlandBoa.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandBoa);

        JLabel labelWoodlandFox = new JLabel("\uD83E\uDD8A");
        labelWoodlandFox.setBounds(520, 165, 25, 25);
        this.add(labelWoodlandFox);
        jTextWoodlandFox = new JTextArea("-");
        jTextWoodlandFox.setBounds(535, 172, 35, 10);
        jTextWoodlandFox.setEditable(false);
        jTextWoodlandFox.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandFox);

        JLabel labelWoodlandBear = new JLabel("\uD83D\uDC3B");
        labelWoodlandBear.setBounds(520, 185, 25, 25);
        this.add(labelWoodlandBear);
        jTextWoodlandBear = new JTextArea("-");
        jTextWoodlandBear.setBounds(535, 192, 35, 10);
        jTextWoodlandBear.setEditable(false);
        jTextWoodlandBear.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandBear);

        JLabel labelWoodlandEagle = new JLabel("\uD83E\uDD85");
        labelWoodlandEagle.setBounds(520, 205, 25, 25);
        this.add(labelWoodlandEagle);
        jTextWoodlandEagle = new JTextArea("-");
        jTextWoodlandEagle.setBounds(535, 212, 35, 10);
        jTextWoodlandEagle.setEditable(false);
        jTextWoodlandEagle.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandEagle);

        JLabel labelWoodlandHorse = new JLabel("\uD83D\uDC0E");
        labelWoodlandHorse.setBounds(520, 225, 25, 25);
        this.add(labelWoodlandHorse);
        jTextWoodlandHorse = new JTextArea("-");
        jTextWoodlandHorse.setBounds(535, 232, 35, 10);
        jTextWoodlandHorse.setEditable(false);
        jTextWoodlandHorse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandHorse);

        JLabel labelWoodlandDeer = new JLabel("\uD83E\uDD8C");
        labelWoodlandDeer.setBounds(520, 245, 25, 25);
        this.add(labelWoodlandDeer);
        jTextWoodlandDeer = new JTextArea("-");
        jTextWoodlandDeer.setBounds(535, 252, 35, 10);
        jTextWoodlandDeer.setEditable(false);
        jTextWoodlandDeer.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandDeer);

        JLabel labelWoodlandRabbit = new JLabel("\uD83D\uDC07");
        labelWoodlandRabbit.setBounds(520, 265, 25, 25);
        this.add(labelWoodlandRabbit);
        jTextWoodlandRabbit = new JTextArea("-");
        jTextWoodlandRabbit.setBounds(535, 272, 35, 10);
        jTextWoodlandRabbit.setEditable(false);
        jTextWoodlandRabbit.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandRabbit);

        JLabel labelWoodlandMouse = new JLabel("\uD83D\uDC01");
        labelWoodlandMouse.setBounds(580, 145, 25, 25);
        this.add(labelWoodlandMouse);
        jTextWoodlandMouse = new JTextArea("-");
        jTextWoodlandMouse.setBounds(595, 152, 35, 10);
        jTextWoodlandMouse.setEditable(false);
        jTextWoodlandMouse.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandMouse);

        JLabel labelWoodlandGoat = new JLabel("\uD83D\uDC10");
        labelWoodlandGoat.setBounds(580, 164, 25, 25);
        this.add(labelWoodlandGoat);
        jTextWoodlandGoat = new JTextArea("-");
        jTextWoodlandGoat.setBounds(595, 171, 35, 10);
        jTextWoodlandGoat.setEditable(false);
        jTextWoodlandGoat.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandGoat);

        JLabel labelWoodlandSheep = new JLabel("\uD83D\uDC11");
        labelWoodlandSheep.setBounds(580, 185, 25, 25);
        this.add(labelWoodlandSheep);
        jTextWoodlandSheep = new JTextArea("-");
        jTextWoodlandSheep.setBounds(595, 192, 35, 10);
        jTextWoodlandSheep.setEditable(false);
        jTextWoodlandSheep.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandSheep);

        JLabel labelWoodlandHog = new JLabel("\uD83D\uDC17");
        labelWoodlandHog.setBounds(580, 205, 25, 25);
        this.add(labelWoodlandHog);
        jTextWoodlandHog = new JTextArea("-");
        jTextWoodlandHog.setBounds(595, 212, 35, 10);
        jTextWoodlandHog.setEditable(false);
        jTextWoodlandHog.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandHog);

        JLabel labelWoodlandBull = new JLabel("\uD83D\uDC03");
        labelWoodlandBull.setBounds(580, 225, 25, 25);
        this.add(labelWoodlandBull);
        jTextWoodlandBull = new JTextArea("-");
        jTextWoodlandBull.setBounds(595, 232, 35, 10);
        jTextWoodlandBull.setEditable(false);
        jTextWoodlandBull.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandBull);

        JLabel labelWoodlandDuck = new JLabel("\uD83E\uDD86");
        labelWoodlandDuck.setBounds(580, 245, 25, 25);
        this.add(labelWoodlandDuck);
        jTextWoodlandDuck = new JTextArea("-");
        jTextWoodlandDuck.setBounds(595, 252, 35, 10);
        jTextWoodlandDuck.setEditable(false);
        jTextWoodlandDuck.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandDuck);

        JLabel labelWoodlandCaterpillar = new JLabel("\uD83D\uDC1B");
        labelWoodlandCaterpillar.setBounds(640, 145, 25, 25);
        this.add(labelWoodlandCaterpillar);
        jTextWoodlandCaterpillar = new JTextArea("-");
        jTextWoodlandCaterpillar.setBounds(655, 152, 35, 10);
        jTextWoodlandCaterpillar.setEditable(false);
        jTextWoodlandCaterpillar.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandCaterpillar);

        JLabel labelWoodlandPlant = new JLabel("\uD83C\uDF3E");
        labelWoodlandPlant.setBounds(640, 165, 25, 25);
        this.add(labelWoodlandPlant);
        jTextWoodlandPlant = new JTextArea("-");
        jTextWoodlandPlant.setBounds(655, 172, 35, 10);
        jTextWoodlandPlant.setEditable(false);
        jTextWoodlandPlant.setFont(new Font("Areal", Font.BOLD, 10));
        this.add(jTextWoodlandPlant);
    }

    @Override
    public void changeType(String nameType, String name, int count) {
        switch (nameType) {
            case NAME_TYPE_DESERT -> mapNameAnimalDesert.get(name).setText(String.valueOf(count));
            case NAME_TYPE_MOUNTAINOUS -> mapNameAnimalMountainous.get(name).setText(String.valueOf(count));
            case NAME_TYPE_PLAIN -> mapNameAnimalPlain.get(name).setText(String.valueOf(count));
            case NAME_TYPE_WOODLAND -> mapNameAnimalWoodland.get(name).setText(String.valueOf(count));
            default -> throw new IllegalArgumentException("Не верный тип локации");
        }
    }
}
