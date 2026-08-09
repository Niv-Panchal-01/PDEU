
import java.util.Scanner;

// This class contains all methods of Temperature Practical
class TemperatureMethods {

    float average; // reusable average value in this class

    // This method will return average value 
    float averageOfTemperaturValues(float arr[]) {
        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        this.average = (sum / arr.length);

        return average;
    }

    // Method to return the highest temperature
    float highestTemperatureValue(float arr[]) {
        float highestTemperature = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (highestTemperature < arr[i]) {
                highestTemperature = arr[i];
            }
        }

        return highestTemperature;
    }

    // Method to return the highest temperature
    float lowestTemperatureValue(float arr[]) {
        float lowestTemperature = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (lowestTemperature > arr[i]) {
                lowestTemperature = arr[i];
            }
        }

        return lowestTemperature;
    }

    // Method to return the days where temperature was above weekly average
    int daysAboveWeeklyAverage(float arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (average < arr[i]) {
                count++;
            }
        }

        return count;
    }
}

public class temperaturePrac {

    public static void main(String[] args) {
        float arr[] = new float[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element : ");
            arr[i] = sc.nextFloat();
        }

        // Allocating memory to TemperatureMethods class
        TemperatureMethods temp = new TemperatureMethods();

        System.out.println("Example (a) : ");
        System.out.println("Average temperature : " + temp.averageOfTemperaturValues(arr));

        System.out.println("\nExample (b) : ");
        System.out.println("Highest Temperature : " + temp.highestTemperatureValue(arr));
        System.out.println("Lowest Temperature : " + temp.lowestTemperatureValue(arr));

        System.out.println("\nExample (c) : ");
        System.out.println("Total number of days when weekly temperature was above : " + temp.daysAboveWeeklyAverage(arr));
    }
}
