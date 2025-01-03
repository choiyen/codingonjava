package _06_abstract.Practice2;

import java.util.ArrayList;

public class ShapEx
{
    public static void main(String[] args) {

        //자바는 추상 클레스인 부모를 넣으면 둘다 가능
        ArrayList <Shape> circles = new ArrayList<>();
        circles.add(new Rectangle("Rectangle","Blue",6, 4));
        circles.add(new Circle("Circle","Red",14));

        todo(circles);
    }


    static void todo(ArrayList<Shape> shape)
    {
        for (Shape shap : shape) {
            System.out.println("======" + shap.getType() + " 도형의 정보 =========");
            System.out.println("도형의 색상 : " + shap.getColor());
            System.out.println("도형의 넒이 : " + shap.calculateArea());
        }
    }

}
