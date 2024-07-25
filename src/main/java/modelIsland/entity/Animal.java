package modelIsland.entity;

public interface Animal {
   void eat(Animal food, Location id);
   Location move(Location id);
   Animal reproduce(Animal pair, Location id);
   void dead(Location id);
}
