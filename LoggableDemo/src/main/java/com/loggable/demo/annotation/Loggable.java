/**
 * 
 */
package com.loggable.demo.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target({ FIELD, METHOD })
/**
 * @author rbhat
 *
 */
public @interface Loggable {

}
