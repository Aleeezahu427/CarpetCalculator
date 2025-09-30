//use comparable everytime using compareTo
public class RoomDimension implements Comparable<RoomDimension>{
    private double length;
    private double width;

    public RoomDimension(double length,double width){
        this.length = length;
        this.width = width;
    }

    //copy constructor- creates new objects as copy of existing one
    public RoomDimension(RoomDimension room2){
        this.length = room2.length;
        this.width = room2.width;
    }

    //clone method- creates new object using copy constructor
    public Object clone(){
        return new RoomDimension(this);
    }

    //comes up with unique number
    public int hashCode() {
        int result = 17;

        result = 37 * result + Double.hashCode(length); // Convert int to hashCode
        result = 37 * result + Double.hashCode(width);

        return result;
    }

    public boolean equals(RoomDimension x){
        boolean status;
        if(length == x.length && width == x.width){
            status = true;
        }else{
            status = false;
        }
        return status;
    }


    public double getArea(){
        return length*width;
    }

    @Override
    public int compareTo(RoomDimension o) {
        int result = 0;
        if(this.getArea() == o.getArea()){
            result = 0;
        }else if(this.getArea() > o.getArea()){
            result = 1;
        }else{
            result = -1;
        }
        return result;
    }

    public String toString(){
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + getArea();
    }
}
