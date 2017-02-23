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
public class DrunkenWalk {

    private static int outOfBounds;
    private static int outOfBounds1;
    private static int outOfBounds2;

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {

            RandomWalk drunkenWalk = new RandomWalk(200, 10);
            drunkenWalk.walk();

            System.out.println("1: " + drunkenWalk.toString());

            if (drunkenWalk.inBounds() == false) {
                outOfBounds++;
                System.out.println("You are out of bounds!");
            }

            RandomWalk drunkenWalk1 = new RandomWalk(500, 10);
            drunkenWalk1.walk();

            System.out.println("2: " + drunkenWalk1.toString());

            if (drunkenWalk1.inBounds() == false) {
                outOfBounds1++;
                System.out.println("You are out of bounds!");
            }

            RandomWalk drunkenWalk2 = new RandomWalk(200, 50);
            drunkenWalk2.walk();

            System.out.println("3: " + drunkenWalk2.toString());

            if (drunkenWalk2.inBounds() == false) {
                outOfBounds2++;
                System.out.println("You are out of bounds!");
            }
        }
        System.out.println("The first drunk went out of bounds: " + outOfBounds + " times");
        System.out.println("The second drunk went out of bounds: " + outOfBounds1 + " times");
        System.out.println("The third drunk went out of bounds: " + outOfBounds2 + " times");
    }
}
