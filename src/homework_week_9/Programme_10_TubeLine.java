package homework_week_9;

import java.util.Scanner;

/**
 * Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name
 */
public class Programme_10_TubeLine {
    public static void main(String[] args) {
        //List of all station in Zone 1 of London
        String[] tubeStationZone1 = new String[]{"Aldgate", "East", "Angel", "Baker Street", "Bank", "Barbican", "Baywater", "Blackfairs",
                "Bond Street", "Borough", "Cannon Street", "Chancery Lane", "Charing Cross", "Covent Garden", "Earl's Court", "Edgware Road", "Elephant & Castle",
                "Embankment", "Euston", "Euston Square", "Farrington", "Gloucester Road", "Goodge Street", "Great Portland Street", "Green park",
                "High street Kensington", "Holborn", "Hyde Park Corner", "King's Cross", "Knightsbridge", "Lambeth North", "Lancaster Gate", "Leicester Square", "Liverpool Street", "London Bridge", "Mansion House",
                "Marble Arch", "Marylebone", "Monument", "Moorgate", "Notting Hill Gate", "Old Street", "Oxford Circus", "Paddington",
                "Piccadilly Circus", "Pimlico", "Queensway", "Regent's Park", "Russell Square", "Sloane Square",
                "South Kensington", "St Pancras", "St. Paul's", "Temple", "Tottenham Court Road", "Tower Gateway",
                "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East", "Waterloo", "Westminster"};
        System.out.println(tubeStationZone1.length);//for debug purpose
        int length = tubeStationZone1.length;

        String[][] londonUGLines = new String[12][length];
        londonUGLines[0][0] = "Bakerloo Line"; //Line name
        londonUGLines[0][1] = "Baker Street"; //Station Name
        londonUGLines[0][2] = "Charing Cross";
        londonUGLines[0][3] = "Edgware Road";
        londonUGLines[0][4] = "Elephant & Castle";
        londonUGLines[0][5] = "Embankment";
        londonUGLines[0][6] = "Lambeth North";
        londonUGLines[0][7] = "Maryle North";
        londonUGLines[0][8] = "Oxford Circus";
        londonUGLines[0][9] = "Regent's Park";
        londonUGLines[0][10] = "Waterloo";

        londonUGLines[1][0] = "Central Line";
        londonUGLines[1][1] = "Aldgate";
        londonUGLines[1][2] = "Baker Street";
        londonUGLines[1][3] = "Barbican";
        londonUGLines[1][4] = "Bayswater";
        londonUGLines[1][5] = "Bank";
        londonUGLines[1][6] = "Bond Street";
        londonUGLines[1][7] = "Chancery Lane";
        londonUGLines[1][8] = "Holborn";
        londonUGLines[1][9] = "Lancaster Lane";
        londonUGLines[1][10] = "Liverpool Street";
        londonUGLines[1][11] = "Marble Arch";
        londonUGLines[1][12] = "Notting Hill Gate";
        londonUGLines[1][13] = "Oxford Circus";
        londonUGLines[1][14] = "Queensway";
        londonUGLines[1][15] = "St. Paul's";
        londonUGLines[1][16] = "Tottenham Court Road";

        londonUGLines[2][0] = "Circle Line";
        londonUGLines[2][1] = "Edgware Road";
        londonUGLines[2][2] = "Baker Street";
        londonUGLines[2][3] = "Farrington";
        londonUGLines[2][4] = "Barbican";
        londonUGLines[2][5] = "Aldgate";
        londonUGLines[2][6] = "BlackFriars";
        londonUGLines[2][7] = "Baywater";
        londonUGLines[2][8] = "Cannon street";
        londonUGLines[2][9] = "Embankment";
        londonUGLines[2][10] = "Euston Square";
        londonUGLines[2][11] = "Gloucester Road";
        londonUGLines[2][12] = "Great Portland Street";
        londonUGLines[2][13] = "High Street Kensington";
        londonUGLines[2][14] = "King's Cross";
        londonUGLines[2][15] = "LiverPool Street";
        londonUGLines[2][16] = "Mansion House";
        londonUGLines[2][17] = "Monument";
        londonUGLines[2][18] = "Notting Hill Gate";
        londonUGLines[2][19] = "Sloane Square";
        londonUGLines[2][20] = "South Kensington";
        londonUGLines[2][21] = "St Pancaras";
        londonUGLines[2][22] = "Temple";
        londonUGLines[2][23] = "Tower Hill";
        londonUGLines[2][24] = "Victoria";
        londonUGLines[2][25] = "Westminster";

        londonUGLines[3][0] = "District Line";
        londonUGLines[3][1] = "Edgware Road";
        londonUGLines[3][2] = "Paddington";
        londonUGLines[3][3] = "Bayswater";
        londonUGLines[3][4] = "Aldgate East";
        londonUGLines[3][5] = "Blackfriars";
        londonUGLines[3][6] = "Cannon Street";
        londonUGLines[3][7] = "Earl's Cours";
        londonUGLines[3][8] = "Embankment";
        londonUGLines[3][9] = "Gloucester Road";
        londonUGLines[3][10] = "High Street Kensington";
        londonUGLines[3][11] = "Mansion House";
        londonUGLines[3][12] = "Monument";
        londonUGLines[3][13] = "Notting Hill gate";
        londonUGLines[3][14] = "Sloane Square";
        londonUGLines[3][15] = "South Kensington";
        londonUGLines[3][16] = "Temple";
        londonUGLines[3][17] = "Tower Hill";
        londonUGLines[3][18] = "Victoria";
        londonUGLines[3][19] = "Westminster";

        londonUGLines[4][0] = "Hammersmith Line";
        londonUGLines[4][1] = "Aldgate East";
        londonUGLines[4][2] = "Liverpool Street";
        londonUGLines[4][3] = "King's Cross";
        londonUGLines[4][4] = "Barbican";
        londonUGLines[4][5] = "Edgware Road";
        londonUGLines[4][6] = "Euston Square";
        londonUGLines[4][7] = "Farringdon";
        londonUGLines[4][8] = "Great Portland Street";
        londonUGLines[4][9] = "St Pancras";

        londonUGLines[5][0] = "Jubilee Line";
        londonUGLines[5][1] = "Baket Street";
        londonUGLines[5][2] = "Bond Street";
        londonUGLines[5][3] = "Westminster";
        londonUGLines[5][4] = "Waterloo";
        londonUGLines[5][5] = "Green Park";
        londonUGLines[5][6] = "London Bridge";

        londonUGLines[6][0] = "Metropolitan Line";
        londonUGLines[6][1] = "Aldgate";
        londonUGLines[6][2] = "Liverpoll Street";
        londonUGLines[6][3] = "Moorgate";
        londonUGLines[6][4] = "Barbican";
        londonUGLines[6][5] = "Baker Street";
        londonUGLines[6][6] = "Euston Square";
        londonUGLines[6][7] = "Farringdon";
        londonUGLines[6][8] = "Great Portkand Street";
        londonUGLines[6][9] = "King's Crross";
        londonUGLines[6][10] = "St Pancras";

        londonUGLines[7][0] = "Northern Line";
        londonUGLines[7][1] = "Borough";
        londonUGLines[7][2] = "London bridge";
        londonUGLines[7][3] = "MoorGate";
        londonUGLines[7][4] = "Old Street";
        londonUGLines[7][5] = "angel";
        londonUGLines[7][6] = "Bank";
        londonUGLines[7][7] = "Elephant & Castle";
        londonUGLines[7][8] = "Embankment";
        londonUGLines[7][9] = "Euston";
        londonUGLines[7][10] = "Goodge Street";
        londonUGLines[7][11] = "King's Cross";
        londonUGLines[7][12] = "Leicseter Square";
        londonUGLines[7][13] = "St Pancras";
        londonUGLines[7][14] = "warren Street";
        londonUGLines[7][15] = "Waterloo";

        londonUGLines[8][0] = "Piccadillay Line";
        londonUGLines[8][1] = "Green Park";
        londonUGLines[8][2] = "Piccadilly Circus";
        londonUGLines[8][3] = "Leicester Square";
        londonUGLines[8][4] = "Convent Gardon";
        londonUGLines[8][5] = "Earl's Court";
        londonUGLines[8][6] = "Gloucester Road";
        londonUGLines[8][7] = "Hyde Park Corner";
        londonUGLines[8][8] = "King's Cross";
        londonUGLines[8][9] = "Knightsbridge";
        londonUGLines[8][10] = "Russell Square";
        londonUGLines[8][11] = "South Kensington";
        londonUGLines[8][12] = "St Pancars";

        londonUGLines[9][0] = "Victoria Line";
        londonUGLines[9][1] = "Euston";
        londonUGLines[9][2] = "Warren Street";
        londonUGLines[9][3] = "Oxford Circus";
        londonUGLines[9][4] = "Green park";
        londonUGLines[9][5] = "king's Cross";
        londonUGLines[9][6] = "Pimlico";
        londonUGLines[9][7] = "St Pancras";
        londonUGLines[9][8] = "vauxhall";
        londonUGLines[9][9] = "Victoria";

        londonUGLines[10][0] = "Waterloo & City line";
        londonUGLines[10][1] = "Bank";
        londonUGLines[10][2] = "Waterloo";
        londonUGLines[10][3] = "Barbican";
        londonUGLines[10][4] = "Bayswater";

        londonUGLines[11][0] = "DLR Line";
        londonUGLines[11][1] = "Bank";
        londonUGLines[11][2] = "Tower Gateway";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the tube station's name of Zone 1 :");
        //input wizard for the user , and store his/her input as a variable
        String userTubeStation = scanner.nextLine();
        String catchStationName = "";

        //Checking if user input is present in the list of Zone 1 stations
        for (int i = 0; i < tubeStationZone1.length; i++) {
            if (userTubeStation.equalsIgnoreCase(tubeStationZone1[i])) {
                catchStationName = tubeStationZone1[i];
            }
        }
        //logic to find the Line names from the given input from the user
        if (userTubeStation.equalsIgnoreCase(catchStationName)) {
            System.out.println(userTubeStation + "Station is in the Zone 1.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Following Line(s) passing through the given tube station : " + userTubeStation);
            System.out.println("--------------------------------------------------------------");

            System.out.println(londonUGLines.length);//for debug purpose
            for (int x = 0; x < londonUGLines.length; x++) {
                for (int y = 1; y < tubeStationZone1.length; y++) {
                    String match = londonUGLines[x][y];
                    System.out.println("I am here Line : 176" + match); // for debug purpose
                    if (userTubeStation.equalsIgnoreCase(match)) {
                        System.out.println(londonUGLines[x][0]); //first element of multi dimension array is the line name
                    } else {
                        System.out.println("Station is not in the Zone 1.");
                    }
                }
            }
        }
    }
}