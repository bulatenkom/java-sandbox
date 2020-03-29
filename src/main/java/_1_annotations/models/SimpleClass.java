package _1_annotations.models;

import _1_annotations.annotations.ClassPreamble;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ClassPreamble(
        author = "Mark Bulatenko",
        date = "3/28/2020",
        reviewers = {"Himself"}
)
@AllArgsConstructor
@Getter
public class SimpleClass {
    private String someField;
}
