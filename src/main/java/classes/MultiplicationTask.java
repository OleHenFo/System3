package classes;

import java.util.Random;

public class MultiplicationTask extends Task {
    MultiplicationTask(int difficulty){
        this.difficulty = difficulty;

        Random rand = new Random();
        if (difficulty==1){
            numbers = new int[2];
            numbers[0] = rand.nextInt(5)+2;
            numbers[1] = rand.nextInt(5)+2;
        } else if (difficulty==2){
            numbers = new int[2];
            numbers[0] = rand.nextInt(5)+4;
            numbers[1] = rand.nextInt(5)+4;
        } else if (difficulty==3){
            numbers = new int[2];
            numbers[0] = rand.nextInt(5)+8;
            numbers[1] = rand.nextInt(5)+8;
        } else if (difficulty==4){
            numbers = new int[3];
            numbers[0] = rand.nextInt(4)+2;
            numbers[1] = rand.nextInt(4)+2;
            numbers[2] = rand.nextInt(4)+2;
        } else if (difficulty==5){
            numbers = new int[3];
            numbers[0] = rand.nextInt(5)+4;
            numbers[1] = rand.nextInt(5)+4;
            numbers[2] = rand.nextInt(5)+4;
        }
    }
}
