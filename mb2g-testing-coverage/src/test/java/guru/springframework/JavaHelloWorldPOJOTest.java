package guru.springframework;

public class JavaHelloWorldPOJOTest {

    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert "Hello World".equals(javaHelloWorld.getHello());
    }
}