package classes;

import java.util.Random;

public class AdditionTask extends Task {
    AdditionTask(int difficulty){
        this.difficulty = difficulty;

        Random rand = new Random();
        if (difficulty==1){
            numbers = new int[2];
            numbers[0] = rand.nextInt(8)+1;
            numbers[1] = rand.nextInt(8)+1;
        } else if (difficulty==2){
            numbers = new int[2];
            numbers[0] = rand.nextInt(19)+5;
            numbers[1] = rand.nextInt(19)+5;
        } else if (difficulty==3){
            numbers = new int[2];
            numbers[0] = rand.nextInt(19)+19;
            numbers[1] = rand.nextInt(19)+19;
        } else if (difficulty==4){
            numbers = new int[3];
            numbers[0] = rand.nextInt(19)+19;
            numbers[1] = rand.nextInt(19)+19;
            numbers[2] = rand.nextInt(19)+19;
        } else if (difficulty==5){
            numbers = new int[3];
            numbers[0] = rand.nextInt(39)+19;
            numbers[1] = rand.nextInt(39)+19;
            numbers[2] = rand.nextInt(39)+19;
        }
    }
}
