public class RoomCarpet implements Comparable<RoomCarpet>{

    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost){
        this.size = new RoomDimension(size);
        this.carpetCost = carpetCost;
    }

    public RoomCarpet(RoomCarpet carpet) {
        this.size = new RoomDimension(carpet.size); // Using copy constructor
        this.carpetCost = carpet.carpetCost;
    }

    public Object clone(){
        return new RoomCarpet(this);
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + Double.hashCode(carpetCost); // Convert double to hashCode

        return result;
    }

    public boolean equals(RoomCarpet x) {
        boolean status;
        if (size.equals(x.size) && carpetCost == x.carpetCost) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public double getTotalCost(){
        return size.getArea()*carpetCost;
    }

    public String toString(){
        return "Carpet Cost: " + carpetCost + "\nTotal Cost: " + getTotalCost();
    }

    @Override
    public int compareTo(RoomCarpet o) {
        int result = 0;
        if (this.getTotalCost() == o.getTotalCost()) {
            result = 0;
        } else if (this.getTotalCost() > o.getTotalCost()) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
