/**
 * 
 */
package com.unioncast.common.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author juchaochao
 * @date 2016年11月3日 上午11:30:06
 *
 */
@Target({ FIELD })
@Retention(RUNTIME)
@Documented
public @interface JoinColumn {
	String value() default "";
}
