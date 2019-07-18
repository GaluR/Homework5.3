public class Point {
    public double coordinateX;
    public double coordinateY;


    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    boolean is1Quater(double coordinateX, double coordinateY){
        return (coordinateX > 0 && coordinateY >0);
    }

    boolean is2Quater(double coordinateX, double coordinateY){
        return (coordinateX < 0 && coordinateY > 0);
    }

    boolean is3Quater(double coordinateX, double coordinateY){
        return (coordinateX < 0 && coordinateY < 0);
    }

    boolean is4Quater(double coordinateX, double coordinateY){
        return (coordinateX > 0 && coordinateY < 0);
    }

    boolean isOX(double coordinateX, double coordinateY){
        return (coordinateX==0 && coordinateY !=0);
    }

    boolean isOY(double coordinateX, double coordinateY){
        return (coordinateX!=0 && coordinateY ==0);
    }

    boolean isOO(double coordinateX, double coordinateY){
        return (coordinateX==0 && coordinateY == 0);
    }

}
