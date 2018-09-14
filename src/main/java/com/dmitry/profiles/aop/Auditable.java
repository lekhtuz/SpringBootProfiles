package com.dmitry.profiles.aop;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@Inherited
/**
 * @author du376ye
 *
 */
public @interface Auditable {
	String value();
	Class<?> log();
}
