package az.jpa.jpa.service;

import az.jpa.jpa.repository.SocarRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SocarService {

    private final SocarRepository socarRepository;


    @PostConstruct
    public void ListByQueryMethods(){
        socarRepository.findByFirstName("Sahin")
                .stream()
                .forEach(System.out::println);
        socarRepository.findByFirstNameAndLastName("Elgun","Mammadov")
                .stream()
                .forEach(System.out::println);
        socarRepository.findByAge(96)
                .stream()
                .forEach(System.out::println);

    }


}
