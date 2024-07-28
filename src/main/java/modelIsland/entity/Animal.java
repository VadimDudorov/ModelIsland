package modelIsland.entity;

public interface Animal {
   void eat(Location id);
   Location move(Location id);
   void reproduce(Location id);
   void dead(Location id);
   double getWeight();
}
