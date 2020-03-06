package troscsessions;

 public class Shape {
    
    private int width;
    private int height;
    private int radius;
    //Constructor 
    //Shape(int width , int height , int radius){
     //   this.width = width;
      //  this.height = height;
       // this.radius = radius;
        // }
         //  Shape(int width , int height ){
        //    this.width = width;
        //  this.height = height;
        //}
   
   //Default Constructor
   Shape(){}
   
   // Setter 
   void setData(int width , int height , int radius){
      this.width = width;
      this.height = height;
      this.radius = radius;
   }
   // Getter
   int getWidth(){
       return width;
   }
   int getHeight(){
       return height;
   }
   int getRadius(){
       return radius;
   }
}