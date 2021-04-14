package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before All run only once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("in after each method");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Sohit"));
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After All run only once");
    }



}