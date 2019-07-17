public class Section {
    Point point1;
    Point point2;

    public Section(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double lenghOfSection(Point point1, Point point2){
        return Math.sqrt((point1.coordinateX-point2.coordinateX)*(point1.coordinateX-point2.coordinateX)+
                (point1.coordinateY-point2.coordinateY)*(point1.coordinateY-point2.coordinateY));
    }
}
