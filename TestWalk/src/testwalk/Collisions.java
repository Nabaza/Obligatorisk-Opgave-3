/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwalk;

/**
 *
 * @author Nao
 */
public class Collisions {

    private int largeBounds = 2000000;
    private static int largeMaxSteps = 100000;
    private static int counter = 0;

    public static void main(String[] args) {
        RandomWalk part1 = new RandomWalk(-3, 0);
        RandomWalk part2 = new RandomWalk(3, 0);
        samePosition(part1, part2);

        for (int i = 0; i < 200; i++) {

            part1.takeStep();
            part2.takeStep();
            boolean hit = samePosition(part1, part2);
            if (hit) {
                System.out.println("It's a HIT !!!");
            }

            System.out.println(part1.toString());
            System.out.println(part2.toString());

            if ((part1.getX() == part2.getX())
                    && (part1.getY() == part2.getY())) {
            }
            {
                System.out.println("number of hits : " + ++counter);
            }
        }
    }

    public static boolean samePosition(RandomWalk part1, RandomWalk part2) {
        if ((part1.getX() == part2.getX())
                && (part1.getY() == part2.getY())) {
            return true;
        } else {
            return false;
        }
    }
}
