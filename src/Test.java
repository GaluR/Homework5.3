public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(0,10);
        Point point2 = new Point(0,5);
        Point point3 = new Point(0,-2);

        Section section1 = new Section(point1, point2);
        Triangle triangle = new Triangle(section1, point1, point2, point3);
        System.out.println(point1.is1Quater(point1.coordinateX, point1.coordinateY));
        System.out.println(section1.lenghOfSection(point1, point2));
        System.out.println(triangle.isTriangle(point1, point2, point3));

    }
}
