public class Triangle {
    Section section;
    Point point1;
    Point point2;

    public Triangle(Section section, Point point1, Point point2, Point point3) {
        this.section = section;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    Point point3;


   public boolean isTriangle(Point point1, Point point2, Point point3){
       return section.lenghOfSection(point1, point2) + section.lenghOfSection(point2, point3)  != section.lenghOfSection(point1, point3) &&
               section.lenghOfSection(point1, point2) - section.lenghOfSection(point2, point3)  != section.lenghOfSection(point1, point3);

        }
}


