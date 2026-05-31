/*
Question:
How can you create a Java program to Create a Shape interface with area() and perimeter(), implement Circle, Rectangle, and Triangle, and make ShapeProcessor print the area of each shape?
*/
interface Shape{
  
    
    double area();
    double perimeter();
}
class Circle implements Shape{
   double r;
   Circle(double r)
   {
    this.r = r;
   }
   @Override
   public double area (){
    return (Math.PI * r * r);
   }
   @Override
   public double perimeter ()
   {
    return (r * r);
   }
   
}

class Rectangle implements Shape{
   double l;
   double b;
   Rectangle(double l,double b)
   {
    this.l = l;
    this.b = b;
   }
   @Override
   public double area (){
    return (l * b);
   }
   @Override
   public double perimeter ()
   {
    return (2 * (l + b));
   }}

   class Triangle implements Shape{
   double l;
   double b;
   double h;
   Triangle(double l,double b,double h)
   {
    this.l = l;
    this.b = b;
    this.h = h;
   }
   @Override
   public double area (){
    return ((0.5)* b * h);
   }
   @Override
   public double perimeter ()
   {
    return (b * h);
   }}

class ShapeProcessor {
    public static void main (String args[]){
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(2,3);
        Shape s3 = new Triangle(3,4,5);

        System.out.println("The area of circle" +s1.area());
        
        
        System.out.println("The perimeter of circle "+s1.perimeter());
        System.out.println("The area of rectangle"+s2.perimeter());
        System.out.println("The area of rectangle" +s2.area());
        System.out.println("The area of triangle "+s3.perimeter());

        System.out.println("The area of triaangle" +s3.area());
    }

}