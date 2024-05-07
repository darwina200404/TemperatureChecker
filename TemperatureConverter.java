import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String unit = scanner.next().toLowerCase().trim();

        switch (unit) {
            case "celsius":
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.",
                        temperature, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case "fahrenheit":
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.",
                        temperature, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case "kelvin":
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f degrees Fahrenheit.",
                        temperature, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
    }
}
