import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void calculateTotalPay() {
        //Arrange
        Author a1 = new Author("Jens Hansen");
        a1.addTitle(new PrintedBook("Bog2","SKØN",140, 166));
        a1.addTitle(new AudioBook("Bog1","SKØN",140,192));
        float expected = 4213.6445F;

        //act
        float actual = a1.calculateTotalPay();

        //assert
        assertEquals(expected,actual);
    }
}