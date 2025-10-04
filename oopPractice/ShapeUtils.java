package oopPractice;

import java.util.List;

class ShapeUtils {
    public static Shape largestArea(List<Shape> shapes) {

        if (shapes.isEmpty()) {
            return null;
        }

        Shape largest = shapes.get(0);

        for(Shape shape: shapes){
            if(largest.isSmallerThan(shape)){
                largest = shape;
            }
        }
     
        return largest;
    }
}