import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException {
        double box;
        int container;
        int truck;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of boxes: ");
        box = Integer.parseInt(reader.readLine().trim());

        truck = 1;
        container = 1;
        boolean fullContainer = false;
        boolean fullTruck = false;
        System.out.println("\nГрузовик " + truck + ":");
        System.out.println("\tКонтейнер " + container + ":");

        for (int i=1; i<=box; i++)
        {
            if (fullTruck == true)
            {
                truck++;
                System.out.println("\nГрузовик " + truck + ":");
                fullTruck = false;
            }
            if (fullContainer == true)
            {
                container++;
                System.out.println("\tКонтейнер " + container + ":");
                fullContainer = false;
            }

            System.out.println("\t\t\tЯщик " + i);

            if (i % (27 * 12) == 0)
            {
                fullTruck = true;
            }
            if (i % 27 == 0)
            {
                fullContainer = true;
            }
        }

    }
}