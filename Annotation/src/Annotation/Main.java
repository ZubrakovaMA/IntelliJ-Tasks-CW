package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@AnnotationPractice("Begin")
@AnnotationPractice("Close")
@AnnotationPractice("Save")
@NotRep(123)


public class Main {
    public static void main(String[] args) {
        myFirstMethod();
        System.out.println(isAnnotationPresent());

    }

    public static void myFirstMethod() {
        Main main = new Main();
        try {
            Annotation[] annotations = main.getClass().getAnnotations();
            for (Annotation anno : annotations
            ) {
                System.out.println(anno);
            }
        } catch (Exception e) {

        }
    }

    public static boolean isAnnotationPresent () {
        return Main.class.isAnnotationPresent(RepAnno.class);
    }
}
