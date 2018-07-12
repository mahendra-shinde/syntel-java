package com.mahendra.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(value= {ElementType.TYPE})
public @interface Development {
	String[] developers();
	String description();
}
