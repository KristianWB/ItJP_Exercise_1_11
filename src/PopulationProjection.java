public class PopulationProjection {
    public static void main(String[] args)   {

        /* The task will be split in two parts
        1) Calculating all the differing variables
        2) Printing out all the results
        */

        // 1) Calculating variables
        double currentPopulation = 312032486; // Declaring and assigning current population
        double birthPrYear = ((24. * 60 * 60) / 7.0) * 365; // Declaring and assigning birthrate a year by calculation
        double deathPrYear =  ((24. * 60 * 60) / 13.) * 365; // Declaring and assigning deaths a year by calculation
        double immigrantsPrYear = ((24. * 60 * 60) / 45.) * 365; // Declaring and assigning immigration a year by calculation
        double sumOfAllFears = birthPrYear + deathPrYear + immigrantsPrYear; // Declaring and assigning the sum of all fears

        double yearOne = currentPopulation + birthPrYear + deathPrYear + immigrantsPrYear; // Declaring and assigning the population number for year one by calculation
        double yearTwo = yearOne + sumOfAllFears; // Declaring and assigning the population number for year two
        double yearThree = yearTwo + sumOfAllFears; // Declaring and assigning the populationnumber for year three
        double yearFour = yearThree + sumOfAllFears; // Declaring and assigning the populationnumber for year four
        double yearFive = yearFour + sumOfAllFears; // Declaring and assigning the populationnumber for year five

        // 2) Printing out the results
        System.out.printf(
                "The population in year one is: " +
                "%5.2f",yearOne
        );
        System.out.print("\n");
        System.out.printf(
                "\nThe population in year two is: " +
                "%5.2f",yearTwo
        );
        System.out.print("\n");
        System.out.printf(
                "\nThe population in year three is: " +
                "%5.2f", yearThree
        );
        System.out.print("\n");
        System.out.printf(
                "\nThe population in year four is: " +
                "%5.2f", yearFour
        );
        System.out.print("\n");
        System.out.printf(
                "\nThe population in year five is: " +
                "%5.2f", yearFive
        );
    }
}
