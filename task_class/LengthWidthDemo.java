package pl.monikagapinska.firstprogramme.task_class;

public class LengthWidthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        box.setLength(10.0);
        box.setWidth(20.0);
        double sizeA=box.getLength();
        double sizeB=box.getWidth();
        double area = box.getArea();
    }
}
