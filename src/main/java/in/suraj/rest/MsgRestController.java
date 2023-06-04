package in.suraj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suraj.constants.AppConstants;
import in.suraj.props.AppProperties;

@RestController
public class MsgRestController {
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("welcome")
	public String getWelcomeMsg() {
		return appProps.getMessages().get(AppConstants.WELCOME_MSG_KEY);
	}
	
	@GetMapping("greet")
	public String getGreetMsg() {
		return appProps.getMessages().get(AppConstants.GREET_MSG_KEY);
	}

	
	@GetMapping("HELLO")
	public String getHelloMsg() {
		return appProps.getMessages().get(AppConstants.HELLO_MSG_KEY);
	}
}
