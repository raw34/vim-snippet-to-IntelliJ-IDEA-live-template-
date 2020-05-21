package xyz.raw34.vim2idea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vim2ideaApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Vim2ideaApplication.class);

    @Override
    public void run(String... args) throws Exception{
        logger.info("Running Spring Boot Application!!!");

        if (args.length > 0 ) {
            for (String arg : args) {
                logger.info("Command line argument: {}", arg);
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Vim2ideaApplication.class, args);
    }
}
