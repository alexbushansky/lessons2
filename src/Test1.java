import java.lang.annotation.Annotation;

public class Test1 {
    @MyAnnotation
      private String test1;
    @MyAnnotation
     private String diff1;
    @MyAnnotation
     private String same;

    public Test1(String test1, String diff1, String same) {
        this.test1 = test1;
        this.diff1 = diff1;
        this.same = same;
    }


}
