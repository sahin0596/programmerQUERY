package az.jpa.jpa;

import az.jpa.jpa.domain.Socar;
import az.jpa.jpa.repository.SocarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class JpaApplication implements CommandLineRunner {
    private final SocarRepository socarRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Socar socar = Socar.builder()
//                .firstName("Akif")
//                .lastName("Mendiyen")
//                .age(26)
//                .workersNumber("FF9584893")
//                .build();
//        socarRepository.save(socar);
    }
}
