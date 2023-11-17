package springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rami SAHRAOUI on 17/11/2023
 */
class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("########################################");
        System.out.println("Before - I am only called once!!!\n");
    }

    @BeforeEach
    void setUp() {
        System.out.println("\t*********************");
        System.out.println("\tIn Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println("\t\t" + greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println("\t\t" + greeting.helloWorld("Rami"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("\tIn After Each...");
        System.out.println("\t*********************\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called once!!!");
        System.out.println("########################################\n\n");
    }
}
