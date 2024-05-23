package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeName {
    public void isEmpty(){
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_Lines");
        tubeNames.add("Central_Line");
        tubeNames.add("Circle_Line");
        tubeNames.add("District_Line");
        tubeNames.add("Hammersmith_and_City_Line");
        tubeNames.add("Jubilee_Line");
        tubeNames.add("Metropolitan_Line");
        tubeNames.add("Northan_Line");
        tubeNames.add("Piccadilly_Line");
        tubeNames.add("Victoria_Line");
        tubeNames.add("Waterloo_and_City_Line");
        System.out.println("Given Array List : " + tubeNames);
        if(tubeNames.isEmpty())  {
            System.out.println("Given Array List is Empty!!");
        }else {
            System.out.println("Given Array List is Not Empty!!");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeName obj = new Programme_7_UnderGroundTubeName();
        obj.isEmpty();
    }
}
