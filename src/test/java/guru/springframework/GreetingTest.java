package guru.springframework;

import org.junit.jupiter.api.*;

public class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    public void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    public void helloWorld1() {
        System.out.println(greeting.helloWorld("Chris"));
    }

    @Test
    public void helloWorld2() {
        System.out.println(greeting.helloWorld("Sinead"));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("In After Each...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called once!!!");
    }
}