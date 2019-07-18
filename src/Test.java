public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(0,2);
        Point point2 = new Point(0,1);
        Point point3 = new Point(10,-2);

        Section section1 = new Section();
        Triangle triangle = new Triangle();
        System.out.println(point1.is1Quater(point1.coordinateX, point1.coordinateY));
        System.out.println(section1.lenghOfSection(point1, point2));
        System.out.println(triangle.isTriangle(point1, point2, point3));

    }
}
