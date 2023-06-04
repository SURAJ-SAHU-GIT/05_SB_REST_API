package in.suraj.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suraj.props.AppProperties;

@RestController
public class MsgRestController {
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("welcome")
	public String getWelcomeMsg() {
		Map<String, String> messages = appProps.getMessages();
		return messages.get("welcomeMsg");
	}
	
	@GetMapping("greet")
	public String getGreetMsg() {
		Map<String, String> messages= appProps.getMessages();
		return messages.get("greetMsg");
	}

	
	@GetMapping("HELLO")
	public String getHelloMsg() {
		Map<String, String> messages= appProps.getMessages();
		return messages.get("helloK");
	}
}
