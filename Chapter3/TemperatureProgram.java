import java.util.*;


public class TemperatureProgram
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Thermometer myThermometer = new Thermometer();
        Thermometer yourThermometer = new Thermometer();

        int temperature;

        // Output thermometer information.
        System.out.println("myThermometer: " + myThermometer);
        System.out.println("yourThermometer: " + yourThermometer);

        yourThermometer.setCurrentTemp(34);

        System.out.println("After setting yourThermometer: " + yourThermometer);

        System.out.println("Enter the current tempurature: ");

        temperature = console.nextInt();
        System.out.println();

        myThermometer.setCurrentTemp(temperature);

        System.out.println("myThermometer: " + myThermometer);        
    }
}