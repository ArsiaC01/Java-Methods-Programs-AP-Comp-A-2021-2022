package meta;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Textbook {
    int page() default -1;
}
