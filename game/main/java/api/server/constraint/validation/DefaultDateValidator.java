/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package api.server.constraint.validation;


import api.server.constraint.annotation.DefaultDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validate that the object is <code>null</code>
 *
 * @author mc
 */
public class DefaultDateValidator implements ConstraintValidator<DefaultDate, Object> {

	@Override
	public void initialize(DefaultDate constraintAnnotation) {
	}

	@Override
	public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
		return object != null;
	}

}
