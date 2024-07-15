package in.srivath.a;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userDao")
public class UserService {
	public UserService() {
		System.out.println("UserService:: constructor --->Getting data from Redis Cache...");
	}
}
