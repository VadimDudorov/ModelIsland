package modelIsland.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static modelIsland.repository.AnimalParameters.nameAnimals;

public class SwingView extends JFrame implements View {
    //TODO дописать кнопки для 4-рех типов + растения не создаются в начале - исправить
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
        threadPlainType();
        threadMountainousType();
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

    private void threadDesertType() {
//        {"Волк", "Удав", "Лиса", "Медведь", "Орел", "Лошадь", "Олень", "Кролик", "Мышь",
//                "Коза", "Овца", "Кабан", "Бык", "Утка", "Гусеница", "Растение"}
//
//        {"Wolf", "Boa", "Fox", "Bear", "Eagle", "Horse", "Deer", "Rabbit", "Mouse",
//                "Goat", "Sheep", "Hog", "Bull", "Duck", "Caterpillar", "Plant"};

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
    }

    private void threadPlainType() {
    }

    private void threadWoodlandType() {
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
