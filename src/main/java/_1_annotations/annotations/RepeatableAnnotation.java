package _1_annotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE})
@Repeatable(RepeatableAnnotations.class)
public @interface RepeatableAnnotation {
    String value();
}
