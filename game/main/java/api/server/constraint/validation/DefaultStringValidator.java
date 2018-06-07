/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package api.server.constraint.validation;


import api.server.constraint.annotation.DefaultString;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * Check that a character sequence's (e.g. string) trimmed length is not empty.
 *
 * @author mc
 */
public class DefaultStringValidator implements ConstraintValidator<DefaultString, CharSequence> {

	@Override
	public void initialize(DefaultString annotation) {
	}

	/**
	 * Checks that the trimmed string is not empty.
	 *
	 * @param charSequence The character sequence to validate.
	 * @param constraintValidatorContext context in which the constraint is evaluated.
	 *
	 * @return Returns <code>true</code> if the string is <code>null</code> or the length of <code>charSequence</code> between the specified
	 *         <code>min</code> and <code>max</code> values (inclusive), <code>false</code> otherwise.
	 */
	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if ( charSequence == null ) {
			return true;
		}

		return charSequence.toString().trim().length() > 0;
	}
}
