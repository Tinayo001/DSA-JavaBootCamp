import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class SimpleElectricityBill {

    // Slab rates (example). You can change these to match your local tariff.
    private static final double SLAB1_RATE = 3.00;   // for first 50 units
    private static final double SLAB2_RATE = 4.50;   // for next 100 units (51-150)
    private static final double SLAB3_RATE = 6.00;   // for next 100 units (151-250)
    private static final double SLAB4_RATE = 7.50;   // for units >250

    private static final double FIXED_CHARGE = 50.00; // fixed monthly charge
    private static final double TAX_RATE = 0.16;      // 16% tax (adjust as needed)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("#,##0.00");

        System.out.println("=== Simple Electricity Bill Generator ===");

        System.out.print("Customer name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Meter number: ");
        String meter = scanner.nextLine().trim();

        System.out.print("Previous meter reading (kWh): ");
        double prev = scanner.nextDouble();

        System.out.print("Current meter reading (kWh): ");
        double curr = scanner.nextDouble();

        if (curr < prev) {
            System.out.println("Error: current reading cannot be less than previous reading.");
            return;
        }

        double units = curr - prev;
        double energyCharge = calculateEnergyCharge(units);
        double subtotal = energyCharge + FIXED_CHARGE;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // Print bill
        System.out.println();
        System.out.println("------------- ELECTRICITY BILL -------------");
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Customer: " + name);
        System.out.println("Meter No: " + meter);
        System.out.println("--------------------------------------------");
        System.out.println("Previous Reading: " + money.format(prev) + " kWh");
        System.out.println("Current Reading : " + money.format(curr) + " kWh");
        System.out.println("Units Consumed  : " + money.format(units) + " kWh");
        System.out.println();
        System.out.println("Energy Charge   : KES " + money.format(energyCharge));
        System.out.println("Fixed Charge    : KES " + money.format(FIXED_CHARGE));
        System.out.println("Subtotal        : KES " + money.format(subtotal));
        System.out.println("Tax (" + (int)(TAX_RATE * 100) + "%)        : KES " + money.format(tax));
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL PAYABLE   : KES " + money.format(total));
        System.out.println("--------------------------------------------");
        System.out.println("Thank you for paying on time!");
    }

    // Calculate energy charge using slab rates
    private static double calculateEnergyCharge(double units) {
        double charge = 0.0;

        if (units <= 0) return 0.0;

        // First 50 units
        double slab1 = Math.min(units, 50);
        charge += slab1 * SLAB1_RATE;
        units -= slab1;

        if (units <= 0) return charge;

        // Next 100 units (51-150)
        double slab2 = Math.min(units, 100);
        charge += slab2 * SLAB2_RATE;
        units -= slab2;

        if (units <= 0) return charge;

        // Next 100 units (151-250)
        double slab3 = Math.min(units, 100);
        charge += slab3 * SLAB3_RATE;
        units -= slab3;

        if (units <= 0) return charge;

        // Remaining units > 250
        charge += units * SLAB4_RATE;

        return charge;
    }
}
