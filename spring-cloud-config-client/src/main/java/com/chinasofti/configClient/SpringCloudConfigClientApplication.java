package com.chinasofti.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringCloudConfigClientApplication {

	@Value("${info.profile}")
	private String info ;

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudConfigClientApplication.class).web(true).run(args);
	}

	@RequestMapping("/getConfig")
	public String getConfig(){
		return info ;
	}

}
