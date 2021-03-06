package cz.xtf.radanalytics.util.junit5.annotation;

import cz.xtf.radanalytics.util.junit5.extension.Screenshotter;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(Screenshotter.class)
public @interface WebUITests {
}
