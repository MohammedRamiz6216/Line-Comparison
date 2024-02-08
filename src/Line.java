public class Line {
    Point p1;
    Point p2;
    Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2=p2;
    }
    public double length(){
        int xdiff=p2.a-p1.a;
        int ydiff = p2.b-p1.b;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
}
