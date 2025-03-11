/*
 * ValidPromotionCode.java
 *
 * Copyright (C) 2012-2025 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented

@Constraint(validatedBy = PromotionCodeValidator.class)
@ReportAsSingleViolation
public @interface ValidPromotionCode {

	// Custom properties ------------------------------------------------------

	/** Indica si se debe verificar que los últimos dos dígitos coincidan con el año actual. */
	boolean checkYear() default true;

	// Standard validation properties -----------------------------------------

	String message() default "{acme.validation.promotion-code.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
