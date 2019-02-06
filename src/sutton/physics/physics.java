package sutton.physics;

import java.util.ArrayList;
import java.util.Random;

public class physics {
    public static void main(String [ ] args) {

         ArrayList<Projectile> plist = new ArrayList<Projectile>();

         for (int i = 0; i <= 120; i ++){
             plist.forEach((n) -> n.addTime(1));
             int randomAmount = new Random().nextInt(6);
             for(int j = 0; j < randomAmount; j++){
                 int velocity = new Random().nextInt((120 - 50) + 1) + 50;
                 int degrees = new Random().nextInt((150 - 30) + 1) + 30;
                 Projectile temp = new Projectile (velocity, degrees);
                 plist.add(temp);
             }
         }
        for (Projectile n : plist) {
            if (n.getY() > 0)
                System.out.println(n);
        }

    }
}
