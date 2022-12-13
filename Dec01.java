import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

class Dec01 {
    public static void main(String[] args) {
        try {
            //opens puzzle input and creates a scanner
            File input = new File("in.txt");
            Scanner in = new Scanner(input);

            int calTemp = 0;
            ArrayList<Integer> calories = new ArrayList<Integer>(); 

            //loops through the input
            while (in.hasNextLine()) {
                String numLine = in.nextLine();

                //if the line is blank the elf has no more calories so it can be added to the list
                if (numLine.isBlank()) {
                    calories.add(calTemp);
                    calTemp = 0;
                } 
                
                //since the line is not blank the elf has more calories so add this line and go to the next
                else { 
                    calTemp += Integer.parseInt(numLine);
                }
            }

            //sorts the calories with the biggest holder being first
            calories.sort(Comparator.reverseOrder());
            
            int max = 0;
            int top3 = 0;

            //gets the elf with the highest amount of calories
            max = calories.get(0);

            //gets the top 3 elves and their total calorie count
            for(int i = 0; i < 3; i++) {
                top3 += calories.get(i);
            }

            System.out.println(max);
            System.out.println(top3);
            
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File error.");
        }
    }
}