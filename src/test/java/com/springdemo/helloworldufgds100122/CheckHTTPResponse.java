package com.springdemo.helloworldufgds100122;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals; //Tuve que agregar esto


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class CheckHTTPResponse {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
        public void shouldPassStringMatches(){
            assertEquals("Hello World", testRestTemplate.getForObject("http://localhost:" + port + "/", String.class));
        }



}
