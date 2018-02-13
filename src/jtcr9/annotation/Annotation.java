package jtcr9.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno1 {
	String str() default "Testing";
	int val() default 200;
}

@Retention(RetentionPolicy.RUNTIME)
@interface Anno2 {
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Maker { }