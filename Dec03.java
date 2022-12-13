import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Dec03 {
    public static void main(String[] args) {
        try {
            //opens puzzle input and creates a scanner
            File f = new File("input.txt");
            Scanner in = new Scanner(f);

            int priority = 0;
            while(in.hasNextLine()) {
                //part one + two
                ArrayList<Character> list = new ArrayList<>(); //will be used to make sure duplicate characters aren't added to total score
                int roundPrio = 0; //score for each line of text

                /* PART ONE

                //String line = in.nextLine(); //part one line
                //int lineLen = line.length(); //total length of the line
                //int lineHalf = lineLen / 2; //cutoff point for first and second half of the line

                for(int i = 0; i < lineHalf; i++) { //loop goes through first half of line
                    for (int j = lineHalf; j < lineLen; j++) { //loop goes through second half of line
                        if (line.charAt(i) == line.charAt(j)) { //checks to see if characters match

                            //the list is combed through to see if this score has already been account for, t will become false if the score has already been added
                            boolean t = true;
                            for (char c : list) {
                                if (line.charAt(i) == c) {
                                    t = false;
                                    break;
                                }
                            }

                            //if t remains true that means it is the first time we found this particular duplicate in this line, therefore add the score and add it to the list to prevent duplicates
                            if (t) {
                                list.add(line.charAt(i));
                                roundPrio = getPrio(line.charAt(i)); //gets the priority value using getPrio function
                                priority += roundPrio; //adds it to the round score
                            }
                        }
                    }
                }
                PART ONE END */



                /* PART TWO

                //reads three lines and assigns them
                String line1 = in.nextLine();
                String line2 = in.nextLine();
                String line3 = in.nextLine();

                for(int i = 0; i < line1.length(); i++) { //goes through the first line
                    for(int j = 0; j < line2.length(); j++) { //goes through the second line

                        //if there is a common character in lines 1 and 2 check through line 3 to see if it's there as well, if it is use same duplicate checking as part 1
                        if(line1.charAt(i) == line2.charAt(j)) {
                            for(int k = 0; k < line3.length(); k++) { //goes through third line
                                if(line1.charAt(i) == line3.charAt(k)) {
                                    boolean t = true; //duplicate checking
                                    for (char c : list) {
                                        if (line1.charAt(i) == c) {
                                            t = false;
                                            break;
                                        }
                                    }

                                    if (t) {
                                        list.add(line1.charAt(i));
                                        roundPrio = getPrio(line1.charAt(i)); //gets the priority value using getPrio function
                                        priority += roundPrio; //adds it to the round score
                                    }
                                }
                            }
                        }
                    }
                }

                PART TWO END */

            }

            System.out.println(priority);

        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static int getPrio(char c) {
        int p = c;

        if(p < 95) {
            return p -= 38;
        }
        else {
            return p -= 96;
        }
    }
}