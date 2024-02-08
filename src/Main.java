public class Main {

    public static void main(String[] args) {
        Point p1 =  new Point(4,9);
        Point p2 = new Point(3,6);
        Point p3 = new Point(13,25);
        Point p4 = new Point(12,36);
        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);

            double diff = Math.abs(l1.length()-l2.length());
        System.out.println("Difference of two lines are"+diff);




    }
}