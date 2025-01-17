package Q2;

import Q2.Author;
import Q2.Version;

@Author(name = "Johny")
@Version(number = 1.0)
class AnnotatedClass {

    @Author(name = "Author1")
    @Version(number = 2.0)
    public void annotatedMethod1() {

    }

    @Author(name = "Author2")
    @Version(number = 4.0)
    public void annotatedMethod2() {

    }
}