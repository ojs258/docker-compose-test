package com.example.composetest1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://host.docker.internal:8081")
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<MsgDto> hello(){
        MsgDto msgDto = new MsgDto();
        return ResponseEntity.status(HttpStatus.OK).body(msgDto);
    }
}