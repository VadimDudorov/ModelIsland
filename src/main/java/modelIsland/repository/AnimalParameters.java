package modelIsland.repository;

import java.util.HashMap;
import java.util.Map;

public class AnimalParameters {
    public static final int sizeIsland = 2000;
    public static final int HEIGHT_ISLAND = 20;
    public static final int WEIGHT_ISLAND = 100;

    public static final String[] nameAnimals = {"Wolf, Boa", "Fox", "Bear", "Eagle", "Horse", "Deer", "Rabbit", "Mouse",
            "Goat", "Sheep", "Hog", "Bull", "Duck", "Caterpillar", "Plant"};
    public static final Map<Integer, String> listNameAnimals = new HashMap<>() {{
        put(0, nameAnimals[0]);
        put(1, nameAnimals[1]);
        put(2, nameAnimals[2]);
        put(3, nameAnimals[3]);
        put(4, nameAnimals[4]);
        put(5, nameAnimals[5]);
        put(6, nameAnimals[6]);
        put(7, nameAnimals[7]);
        put(8, nameAnimals[8]);
        put(9, nameAnimals[9]);
        put(10, nameAnimals[10]);
        put(11, nameAnimals[11]);
        put(12, nameAnimals[12]);
        put(13, nameAnimals[13]);
        put(14, nameAnimals[14]);
        put(15, nameAnimals[15]);
    }};

    public static final double[] wolfParamsLocation = {50, 30, 3, 8};
    public static final double[] boaParamsLocation = {15, 30, 1, 3};
    public static final double[] foxParamsLocation = {8, 30, 2, 2};
    public static final double[] bearParamsLocation = {500, 5, 2, 80};
    public static final double[] eagleParamsLocation = {6, 20, 3, 1};
    public static final double[] horseParamsLocation = {400, 20, 4, 60};
    public static final double[] deerParamsLocation = {300, 20, 4, 50};
    public static final double[] rabbitParamsLocation = {2, 150, 2, 0.45};
    public static final double[] mouseParamsLocation = {0.05, 500, 1, 0.01};
    public static final double[] goatParamsLocation = {60, 140, 3, 10};
    public static final double[] sheepParamsLocation = {70, 140, 3, 15};
    public static final double[] hogParamsLocation = {400, 50, 2, 50};
    public static final double[] bullParamsLocation = {700, 10, 3, 100};
    public static final double[] duckParamsLocation = {1, 200, 4, 0.15};
    public static final double[] caterpillarParamsLocation = {0.01, 1000, 0, 0};
    public static final double[] plantParamsLocation = {1, 200};
    public static final Map<String, double[]> arraysParametersLocation = new HashMap<>() {{
        put(nameAnimals[0], wolfParamsLocation);
        put(nameAnimals[1], boaParamsLocation);
        put(nameAnimals[2], foxParamsLocation);
        put(nameAnimals[3], bearParamsLocation);
        put(nameAnimals[4], eagleParamsLocation);
        put(nameAnimals[5], horseParamsLocation);
        put(nameAnimals[6], deerParamsLocation);
        put(nameAnimals[7], rabbitParamsLocation);
        put(nameAnimals[8], mouseParamsLocation);
        put(nameAnimals[9], goatParamsLocation);
        put(nameAnimals[10], sheepParamsLocation);
        put(nameAnimals[11], hogParamsLocation);
        put(nameAnimals[12], bullParamsLocation);
        put(nameAnimals[13], duckParamsLocation);
        put(nameAnimals[14], caterpillarParamsLocation);
        put(nameAnimals[15], plantParamsLocation);
    }};

    public static Map<String, Integer> wolfProbability = new HashMap<>(){{
       put(nameAnimals[0],0);
       put(nameAnimals[1],0);
       put(nameAnimals[2],0);
       put(nameAnimals[3],0);
       put(nameAnimals[4],0);
       put(nameAnimals[5],10);
       put(nameAnimals[6],15);
       put(nameAnimals[7],60);
       put(nameAnimals[8],80);
       put(nameAnimals[9],60);
       put(nameAnimals[10],70);
       put(nameAnimals[11],15);
       put(nameAnimals[12],10);
       put(nameAnimals[13],40);
       put(nameAnimals[14],0);
       put(nameAnimals[15],0);
    }};
    public static Map<String, Integer> boaProbability = new HashMap<>(){{
        put(nameAnimals[0],0);
        put(nameAnimals[1],0);
        put(nameAnimals[2],15);
        put(nameAnimals[3],0);
        put(nameAnimals[4],0);
        put(nameAnimals[5],0);
        put(nameAnimals[6],5);
        put(nameAnimals[7],20);
        put(nameAnimals[8],40);
        put(nameAnimals[9],0);
        put(nameAnimals[10],0);
        put(nameAnimals[11],0);
        put(nameAnimals[12],0);
        put(nameAnimals[13],10);
        put(nameAnimals[14],0);
        put(nameAnimals[15],0);
    }};
    public static Map<String, Integer> foxProbability = new HashMap<>(){{
        put(nameAnimals[0],0);
        put(nameAnimals[1],0);
        put(nameAnimals[2],0);
        put(nameAnimals[3],0);
        put(nameAnimals[4],0);
        put(nameAnimals[5],0);
        put(nameAnimals[6],0);
        put(nameAnimals[7],70);
        put(nameAnimals[8],90);
        put(nameAnimals[9],0);
        put(nameAnimals[10],0);
        put(nameAnimals[11],0);
        put(nameAnimals[12],0);
        put(nameAnimals[13],60);
        put(nameAnimals[14],40);
        put(nameAnimals[15],0);
    }};
    public static Map<String, Integer> bearProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],80); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],40); //Horse
        put(nameAnimals[6],80); //Deer
        put(nameAnimals[7],80); //Rabbit
        put(nameAnimals[8],90); //Mouse
        put(nameAnimals[9],70); //Goat
        put(nameAnimals[10],70); //Sheep
        put(nameAnimals[11],50); //Hog
        put(nameAnimals[12],20); //Bull
        put(nameAnimals[13],10); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],0); //Plant
    }};
    public static Map<String, Integer> eagleProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],10); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],90); //Rabbit
        put(nameAnimals[8],90); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],80); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],0); //Plant
    }};
    public static Map<String, Integer> horseProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> deerProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> rabbitProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> mouseProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],90); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> goatProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> sheepProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> hogProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],50); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],90); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> bullProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> duckProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],90); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};
    public static Map<String, Integer> caterpillarProbability = new HashMap<>(){{
        put(nameAnimals[0],0); //Wolf
        put(nameAnimals[1],0); //Boa
        put(nameAnimals[2],0); //Fox
        put(nameAnimals[3],0); //Bear
        put(nameAnimals[4],0); //Eagle
        put(nameAnimals[5],0); //Horse
        put(nameAnimals[6],0); //Deer
        put(nameAnimals[7],0); //Rabbit
        put(nameAnimals[8],0); //Mouse
        put(nameAnimals[9],0); //Goat
        put(nameAnimals[10],0); //Sheep
        put(nameAnimals[11],0); //Hog
        put(nameAnimals[12],0); //Bull
        put(nameAnimals[13],0); //Duck
        put(nameAnimals[14],0); //Caterpillar
        put(nameAnimals[15],100); //Plant
    }};

}
