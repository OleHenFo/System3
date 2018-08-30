package classes;

import java.util.Random;

public class DivisionTask extends Task {
    DivisionTask(int difficulty){
        this.difficulty = difficulty;

        Random rand = new Random();
        if (difficulty==1){
            numbers = new int[2];
            numbers[0] = rand.nextInt(4)+2;
            numbers[1] = numbers[0] * (rand.nextInt(4)+1);
        } else if (difficulty==2){
            numbers = new int[2];
            numbers[0] = rand.nextInt(5)+3;
            numbers[1] = numbers[0] * (rand.nextInt(4)+2);
        } else if (difficulty==3){
            numbers = new int[2];
            numbers[0] = rand.nextInt(9)+3;
            numbers[1] = numbers[0] * (rand.nextInt(9)+2);
        } else if (difficulty==4){
            numbers = new int[2];
            numbers[0] = rand.nextInt(14)+2;
            numbers[1] = numbers[0] * (rand.nextInt(4)+2);
        } else if (difficulty==5){
            numbers = new int[2];
            numbers[0] = rand.nextInt(14)+3;
            numbers[1] = numbers[0] * (rand.nextInt(9)+3);
        }
    }
}
