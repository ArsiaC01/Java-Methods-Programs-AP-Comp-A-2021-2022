package meta;

import java.lang.annotation.*;

/**
 * Denotes that the declaration which this annotates and all of its children (e.g., the methods and constructors of a
 * class) are provided directly by the textbook and are <b>not to be modified</b>.
 * <p>
 * If this code fragment appears on a page different from the exercise written in the chapter manifest,
 * it should be passed as an argument to the page parameter.
 */
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Textbook {
    int page() default -1;
}
