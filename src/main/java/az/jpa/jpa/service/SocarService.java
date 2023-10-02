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
    public void  jpql() {
        socarRepository.findSocarsWithJPQL("Elgun", "Mammadov")
                .stream()
                .forEach(System.out::println);
    }
    @PostConstruct
    public void sql(){
        socarRepository.findSocarsWithNativeSql("Babek","Merdimazardi")
                .stream()
                .forEach(System.out::println);





    }


}
