package org.spring.springboot.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MethodInfo {
	
	TradeCategory category() default TradeCategory.BOND;
	
}
