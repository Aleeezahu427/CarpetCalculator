<h2>**Carpet Calculator**</h2>
<h3>Overview</h3>
This Java application models rooms and carpets, calculates the total carpet cost for each room, and demonstrates object-oriented principles such as cloning, equality, hashing, and ordering using the Comparable interface.
<h4>Classes</h4>
<h5>RoomDimension</h5>
- Represents a room's dimensions with length and width.
- Calculates the area of the room.
- Implements Comparable<RoomDimension> to compare rooms by area.
- Supports cloning and equality based on dimensions.
- Provides a custom hashCode() and a descriptive toString().
<h5>RoomCarpet</h5>
- Represents a carpet for a room, storing a RoomDimension and carpet cost per unit area.
- Calculates total carpet cost (area * carpetCost).
- Implements Comparable<RoomCarpet> to compare carpets by total cost.
- Supports cloning and equality based on both room dimensions and carpet cost.
- Provides a custom hashCode() and a descriptive toString().
<h5>CarpetCalculatorApp</h5>
- Main application class demonstrating usage.
- Creates multiple RoomCarpet objects.
- Displays original carpet costs.
- Sorts carpets by total cost using compareTo().
- Tests equals(), clone(), hashCode(), and compareTo() methods with output to console.

<h3>Features</h3>
- Comparable Implementation: Both RoomDimension and RoomCarpet implement Comparable to allow sorting.
- Cloning: Supports cloning of objects to create copies.
- Equality & Hashing: Custom equals and hashCode methods for accurate comparisons and use in hash collections.
- Sorting: Demonstrates sorting of carpets by total cost using Java's Collections.sort().
