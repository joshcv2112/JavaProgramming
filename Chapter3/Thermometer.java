import java.util.*;

public class Thermometer
{
    private int currentTemp;

    public Thermometer()
    {
        currentTemp = 0;
    }

    public Thermometer(int cTemp)
    {
        currentTemp = cTemp;
    }

    public void setCurrentTemp(int cTemp)
    {
        currentTemp = cTemp;
    }

    public int getCurrentTemp()
    {
        return currentTemp;
    }

    public String toString()
    {
        return "Current temperature: " + currentTemp;
    }
}
