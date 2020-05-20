package xyz.raw34.vim2idea;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vim2ideaApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Running Spring Boot Application!!!");
        if (args.length > 0 ) {
            for (String arg : args) {
                System.out.println("Command line argument: " + arg);
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Vim2ideaApplication.class, args);
    }
}
