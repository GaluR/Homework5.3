public class Triangle {

    Section section = new Section();

   public boolean isTriangle( Point point1, Point point2, Point point3){
       return section.lenghOfSection(point1, point2) + section.lenghOfSection(point2, point3)  != section.lenghOfSection(point1, point3) &&
               section.lenghOfSection(point1, point2) - section.lenghOfSection(point2, point3)  != section.lenghOfSection(point1, point3);

        }
}


