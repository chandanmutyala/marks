package com.marks.marks;

import com.marks.marks.service.StudentDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarksApplication.class, args);

		StudentDataService service=new StudentDataService();

		service.show();
	}

}
