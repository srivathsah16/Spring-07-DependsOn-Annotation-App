package in.srivath.b;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean {
	public UserDao() {
		System.out.println("UserDao::constructor");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Getting data from DB and storing it to Redis Cache.");
	}

}
