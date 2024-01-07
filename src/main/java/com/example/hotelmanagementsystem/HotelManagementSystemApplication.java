package com.example.hotelmanagementsystem;

import com.example.hotelmanagementsystem.models.Room;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HotelManagementSystemApplication {

    @Bean
    public ModelMapper modelmapper(){
        return new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(HotelManagementSystemApplication.class, args);
    }

}
