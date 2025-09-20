import java.util.*;
public class PolyMorphismShapes {
    // many way to represent
  double Area(){
    return 2;
  }
    
}
// final keyword is used to prevent the overridding
// early binding and late binding -> concept of changing method in complie and runtime
class Circle extends PolyMorphismShapes{
    double r=2.0;

    @Override
    double  Area(){
        return (22/7)*(Math.pow(r,2));

      }
}
// runtime polymorphism
// achieved by method overridding 
