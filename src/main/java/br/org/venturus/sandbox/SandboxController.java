package br.org.venturus.sandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@RefreshScope
public class SandboxController {

	@Value("${info.description:default value}")
	private String property;
	public static void main(String[] args) {
		SpringApplication.run(SandboxController.class, args);
	}
	
	
	@RequestMapping("/")
	@ResponseBody
	public String foo() {
		return property;
	}
}
