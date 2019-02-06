package sutton.physics;

import java.util.ArrayList;
import java.util.Random;

public class physics {
    public static void main(String [ ] args) {

         ArrayList<Projectile> plist = new ArrayList<Projectile>();

         for (int i = 0; i <= 120; i ++){
             plist.forEach((n) -> n.addTime(1));
             Random r = new Random();
             int randomAmount = r.nextInt(6);
             for(int j = 0; j < randomAmount; j++){
                 int max = 120;
                 int min = 50;
                 int velocity = r.nextInt((max - min) + 1) + min;
                 max = 150;
                 min = 30;
                 int degrees = r.nextInt((max - min) + 1) + min;
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
