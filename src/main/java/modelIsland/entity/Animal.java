package modelIsland.entity;

public interface Animal {
   void eat(Animal food);
   Location move();
   Animal reproduce(Animal pair);
   void dead();
}
