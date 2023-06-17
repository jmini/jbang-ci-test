///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS org.gitlab4j:gitlab4j-api:5.2.0

import static java.lang.System.*;

public class HelloWorld {

    public static void main(String... args) {
        out.println("Hello World");
    }
}
