package openId.oauth2.uga.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoleTestingController {

	@ResponseBody
	@GetMapping("/hello")
	public String display(HttpServletRequest req) {
		return "Hello Avi";

	}

}
