package _1_annotations.models;


public class OldClass {
    @Deprecated
    /**
     * @deprecated use of foo
     * is discouraged, please don't use it in newer programs
     */
    public void foo() {
        System.out.println("foo() is invoked and did nothing");
    }
}
