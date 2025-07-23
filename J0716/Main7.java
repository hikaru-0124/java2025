package J0716;

public class Main7 {
    public static void main(String[] args) {
        double bottom = 10;
        double height = 5;
        double radius = 5;
        double Triangle =calcTriangleArea(bottom,height);
        double Circle = calcCircleArea(radius);

        System.out.println("底辺 : " + bottom +   "cm" + "高さ : " + height + "cm の三角形の面積は"+ Triangle + "立方センチメートル");
        System.out.println("半径 : " + radius + "cm の円の面積は" + Circle + "立方センチメートル");
    }

    public static double calcTriangleArea(double bottom  , double height){
        double Area = (bottom  * height) / 2;
        return Area;
    }
    public static double calcCircleArea(double radius){
        double Area = radius* radius * 3.14;
        return Area;
    }
}
