package sutton.physics;

import java.util.ArrayList;
import java.util.Random;

public class physics {
    public static void main(String [ ] args) {

         ArrayList<Projectile> plist = new ArrayList<Projectile>();
         final int maxVelocity = 120;
         final int minVelocity = 50;
         final int maxDegrees = 150;
         final int minDegrees = 30;
        Random r = new Random();

         for (int i = 0; i <= 120; i ++){
             plist.forEach((n) -> n.addTime(1));
             int randomAmount = r.nextInt(6);
             for(int j = 0; j < randomAmount; j++){
                 int velocity = r.nextInt((maxVelocity - minVelocity) + 1) + minVelocity;
                 int degrees = r.nextInt((maxDegrees - minDegrees) + 1) + minDegrees;
                 Projectile temp = new Projectile (velocity, degrees);
                 plist.add(temp);
             }
         }
        for (Projectile n : plist) {
            if (n.getY() > 0) {
                System.out.println(n);
            }
        }

    }
}
