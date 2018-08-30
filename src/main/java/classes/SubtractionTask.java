package classes;

import java.util.Random;

public class SubtractionTask extends Task {
    SubtractionTask(int difficulty){
        this.difficulty = difficulty;

        Random rand = new Random();
        if (difficulty==1){
            numbers = new int[2];
            numbers[0] = rand.nextInt(8)+9;
            numbers[1] = rand.nextInt(8)+1;
        } else if (difficulty==2){
            numbers = new int[2];
            numbers[0] = rand.nextInt(8)+20;
            numbers[1] = rand.nextInt(8)+8;
        } else if (difficulty==3){
            numbers = new int[2];
            numbers[0] = rand.nextInt(14)+29;
            numbers[1] = rand.nextInt(14)+10;
        } else if (difficulty==4){
            numbers = new int[3];
            numbers[0] = rand.nextInt(19)+29;
            numbers[1] = rand.nextInt(8)+14;
            numbers[2] = rand.nextInt(8)+3;
        } else if (difficulty==5){
            numbers = new int[3];
            numbers[0] = rand.nextInt(19)+49;
            numbers[1] = rand.nextInt(14)+29;
            numbers[2] = rand.nextInt(14)+9;
        }
    }
}
