package com.docker.springboot.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DockerSpringbootApplication {

	@RequestMapping("/hello")
    public DockerVO home() {
		DockerVO docker = new DockerVO();
		docker.setName("Welcome Openshift!!!!");
		System.out.println("Test Print"); 
        return docker;
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringbootApplication.class, args);
    }

}
