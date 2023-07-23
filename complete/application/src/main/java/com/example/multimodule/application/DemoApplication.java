package com.example.multimodule.application;

import com.example.multimodule.service.DmpEncryptionType;
import com.example.multimodule.service.DmpEncryptorFactory;
import com.example.multimodule.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
public class DemoApplication {

	@Autowired
	private DmpEncryptorFactory dmpEncryptorFactory;
	private final MyService myService;

	public DemoApplication(MyService myService/*, DmpEncryptorFactory dmpEncryptorFactory*/) {
		this.myService = myService;
//		this.dmpEncryptorFactory = dmpEncryptorFactory;
//		System.out.println("#############"+this.dmpEncryptorFactory.getDmpEncryptor(DmpEncryptionType.KEY_VAULT));

	}


	@GetMapping("/")
	public String home() {
		System.out.println("#############"+this.dmpEncryptorFactory.getDmpEncryptor(DmpEncryptionType.KEY_VAULT));
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.addListeners(new DynamicPropertiesListener());
		app.run(args);
		//SpringApplication.run(DemoApplication.class, args);

	}
}
