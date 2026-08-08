package main.com.myApp.validation;

import main.com.myApp.models.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordsMatchesValidator implements ConstraintValidator<PasswordMatch, User> {

	@Override
	public boolean isValid(User user, ConstraintValidatorContext context) {
		if(user == null) return true;
		if (Objects.equals(null,user.getConfirmPassword())) return true;
		if (Objects.equals(user.getPassword(),user.getConfirmPassword())) {
			return true;
		}
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate(
				context.getDefaultConstraintMessageTemplate()
		).addPropertyNode("confirmPassword").addConstraintViolation();
		return false;
	}
}