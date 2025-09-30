import java.util.ArrayList;
import java.util.Collections;

public class CarpetCalculatorApp {
    public static void main(String[] args) {

        RoomDimension a = new RoomDimension(47,83);
        RoomCarpet x = new RoomCarpet(a,8);

        RoomDimension b = new RoomDimension(67,92);
        RoomCarpet y = new RoomCarpet(b,9);

        RoomDimension c = new RoomDimension(736,8);
        RoomCarpet z = new RoomCarpet(c,3.5);

        ArrayList <RoomCarpet> carpets = new ArrayList<>();
        carpets.add(x);
        carpets.add(y);
        carpets.add(z);

        System.out.println("Original Room Carpet Cost List:");
        for (RoomCarpet carpet : carpets) {
            System.out.println(carpet);
            System.out.println("----------------------------------");
        }

        // Test compareTo() by sorting the list (sorts by total cost)
        Collections.sort(carpets);

        // Display sorted list
        System.out.println("\nSorted Room Carpet List (by total cost):");
        for (RoomCarpet carpet : carpets) {
            System.out.println(carpet);
            System.out.println("----------------------------------");
        }

        // Test equals() method
        System.out.println("\nTesting equals() method:");
        System.out.println("carpets[0] equals carpets[1]? " + carpets.get(0).equals(carpets.get(1)));
        System.out.println("carpets[0] equals carpets[0] (self-check)? " + carpets.get(0).equals(carpets.get(0)));

        // Test clone() method
        System.out.println("\nTesting clone() method:");
        RoomCarpet clonedCarpet = (RoomCarpet) carpets.get(0).clone();
        System.out.println("Cloned Carpet: \n" + clonedCarpet);
        System.out.println("Original Carpet equals Cloned Carpet? " + carpets.get(0).equals(clonedCarpet));

        // Test hashCode() method
        System.out.println("\nTesting hashCode() method:");
        System.out.println("HashCode of carpets[0]: " + carpets.get(0).hashCode());
        System.out.println("HashCode of carpets[1]: " + carpets.get(1).hashCode());

        // Test compareTo() explicitly
        System.out.println("\nTesting compareTo() method:");
        System.out.println("carpets[0] compared to carpets[1]: " + carpets.get(0).compareTo(carpets.get(1)));
        System.out.println("carpets[1] compared to carpets[0]: " + carpets.get(1).compareTo(carpets.get(0)));
        System.out.println("carpets[0] compared to itself: " + carpets.get(0).compareTo(carpets.get(0)));
    }
}

