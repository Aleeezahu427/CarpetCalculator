<h2>Carpet Calculator</h2>
<h3>Overview</h3>
This Java application models rooms and carpets, calculates the total carpet cost for each room, and demonstrates object-oriented principles such as cloning, equality, hashing, and ordering using the Comparable interface.
<h4>Classes</h4>
<h5>RoomDimension</h5>
<ul>
<li>Represents a room's dimensions with length and width.</li>
<li>Calculates the area of the room.</li>
<li>Implements Comparable&lt;RoomDimension&gt; to compare rooms by area.</li>
<li>Supports cloning and equality based on dimensions.</li>
<li>Provides a custom hashCode() and a descriptive toString().</li>
</ul>

<h5>RoomCarpet</h5>
<ul> 
  <li>Represents a carpet for a room, storing a RoomDimension and carpet cost per unit area.</li>
<li>Calculates total carpet cost (area * carpetCost).</li>
<li>Implements Comparable<RoomCarpet> to compare carpets by total cost.</li>
<li>Supports cloning and equality based on both room dimensions and carpet cost.</li>
<li>Provides a custom hashCode() and a descriptive toString().</li>
</ul>
<h5>CarpetCalculatorApp</h5>
  <ul>
    <li>Main application class demonstrating usage.</li>
    <li>Creates multiple RoomCarpet objects.</li>
    <li>Displays original carpet costs.</li>
    <li>Sorts carpets by total cost using compareTo().</li>
    <li>Tests equals(), clone(), hashCode(), and compareTo() methods with output to console.</li>
</ul>

<h4>Features</h4>
<ul>
  <li>Comparable Implementation: Both RoomDimension and RoomCarpet implement Comparable to allow sorting.</li>
  <li>Cloning: Supports cloning of objects to create copies.</li>
  <li>Equality & Hashing: Custom equals and hashCode methods for accurate comparisons and use in hash collections.</li>
  <li>Sorting: Demonstrates sorting of carpets by total cost using Java's Collections.sort().</li>
</ul>
