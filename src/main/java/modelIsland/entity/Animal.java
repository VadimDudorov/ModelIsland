package modelIsland.entity;

import modelIsland.service.Location;

public interface Animal {
   void eat(Location id);
   Location move(Location id);
   void reproduce(Location id);
   boolean dead(Location id);
   double getWeight();
}
