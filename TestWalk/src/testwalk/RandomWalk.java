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
public class RandomWalk {

    private int xCoords;
    private int yCoords;
    private int maxStep;
    private int steps;
    private int edge;
    private int maxDistance;

    public RandomWalk(int maxStep, int edge) {
        this.maxStep = maxStep;
        this.edge = edge;
        xCoords = 0;
        yCoords = 0;
        steps = 0;
        maxDistance = 0;
    }

    public RandomWalk(int xCoords, int yCoords, int maxStep, int edge) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
        this.maxStep = maxStep;
        this.edge = edge;
        maxDistance = 0;
    }

    public void takeStep() {
        double direction;
        direction = Math.random() * 4 + 1;
        //System.out.println((int) direction);
        switch ((int) direction) {
            case 1: // right
                this.xCoords++;
                break;
            case 2: // left
                this.xCoords--;
                break;
            case 3: // up
                this.yCoords++;
                break;
            case 4: // down
                this.yCoords--;
                break;
        }
        steps++;
        maxDistance = max(maxDistance, Math.max(Math.abs(xCoords), Math.abs(yCoords)));
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    private int max(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    // returns true if the number of steps taken is less than the maximum number; returns false otherwise
    private boolean moreSteps() {
        if (steps < maxStep) {
            return true;
        }
        return false;
    }

    // returns true if the current position is on the square (include the boundary as part of the square); returns false otherwise.
    boolean inBounds() {
        if (xCoords < edge && yCoords < edge) {
            return true;
        }
        return false;
    }

    // Add to the RandomWalk class a method named walk that has no parameters and returns nothing. 
    // Its job is to simulate a complete random walk.
    // This should be a very simple loop (while or do... while) 
    // --- you will need to call the methods takeStep, moreSteps, and inBounds.
    void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
            System.out.println(this.toString());
        }
        if (!moreSteps()) {
            System.out.println("Out of steps");
        }
        if (!inBounds()) {
            System.out.println("Out of bounds");
        }
    }

    @Override
    public String toString() {
        return "Step: " + steps + "; Position:(" + xCoords + "," + yCoords + ") ";
    }

    public int getX() {
        return xCoords;
    }

    public int getY() {
        return yCoords;
    }
}
