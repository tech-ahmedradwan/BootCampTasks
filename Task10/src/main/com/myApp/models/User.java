package main.com.myApp.models;


import lombok.Getter;
import lombok.Setter;
import main.com.myApp.validation.PasswordMatch;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
@Setter
@Getter

@PasswordMatch
public class User {

	@NotNull(message = "Name is Required")
	@Size(min = 3,message = "Name must be at least 3 character")
	private String userName;

	@NotNull(message = "email is Required")
	@Pattern(
			regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
			message = "Invalid email"
	)
	private String email;

	@NotNull(message = "Password is Required")
	@Pattern(
			regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
			message = "Password must contain uppercase, lowercase, number and special character"
	)
	private String password;

	private String confirmPassword;
}