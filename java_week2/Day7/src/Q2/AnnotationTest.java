package Q2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void readAnnotation(AnnotatedElement element) {
        Annotation[] annotations = element.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                Author author = (Author) annotation;
                System.out.println("Author: " + author.name());
            } else if (annotation instanceof Version) {
                Version version = (Version) annotation;
                System.out.println("Version: " + version.number());
            }
        }
    }
    public static void main(String[] args) {
        try {
            // Reading class-level annotations
            Class<AnnotatedClass> clazz = AnnotatedClass.class;
            System.out.println("Class Annotations:");
            readAnnotation(clazz);

            // Reading method-level annotations
            Method method1 = clazz.getMethod("annotatedMethod1");
            System.out.println("Method1 Annotations:");
            readAnnotation(method1);

            Method method2 = clazz.getMethod("annotatedMethod2");
            System.out.println("Method2 Annotations:");
            readAnnotation(method2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
