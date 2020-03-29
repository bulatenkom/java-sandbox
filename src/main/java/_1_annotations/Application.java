package _1_annotations;

import _1_annotations.annotations.RepeatableAnnotation;
import _1_annotations.models.ClassDTO;
import _1_annotations.models.DataClass;
import _1_annotations.models.OldClass;
import _1_annotations.models.SimpleClass;
import lombok.NonNull;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        // SIMPLE CLASS
        SimpleClass simpleClass = new SimpleClass("field");

        System.out.println("simpleClass.someField = " + simpleClass.getSomeField());

        // DATA CLASS
        DataClass dataClass = new DataClass(new HashMap<String, String>() {
            {
                put("key1", "value1");
                put("key2", "value2");
                put("key3", "value3");
            }
        });

        dataClass.getParams()
                .forEach((key, value) -> System.out.println(String.format("%s: %s", key, value)));

        String key2 = dataClass.getParam("key2");
        System.out.println("key2 = " + key2);

        // DTO CLASS
        ClassDTO classDTO = new ClassDTO("field1", 1L);
        System.out.println(String.format("%s, %d", classDTO.getFieldOne(), classDTO.getFieldTwo()));

        // OLD CLASS
        OldClass oldClass = new OldClass();
        oldClass.foo();

        // OLD CLASS with suppressing warning
        createAndRunOldClass();

        // Repeatable annotation
        @RepeatableAnnotation("a")
        @RepeatableAnnotation("b")
        @RepeatableAnnotation("c")
        @NonNull Void x = null;


    }

    @SuppressWarnings("deprecation")
    private static void createAndRunOldClass() {
        OldClass oldClass = new OldClass();
        oldClass.foo();
    }
}
