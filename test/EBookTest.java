import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    @Test
    void calculateIllustratedPages() {

        //arrange
        EBook eb = new EBook("Bog3", "LYRIK", 20, 60, 50, 100000, true);
        double expected = 83.11111111111111;


        //act
        double actual = eb.calculatePages();

        //assert
        assertEquals(expected, actual);

    }
    @Test
    void calculateUnillustratedPages() {

        //arrange
        EBook eb = new EBook("Bog3", "LYRIK", 20, 60, 50, 100000, false);
        double expected = 75.55555555555556;

        //act
        double actual = eb.calculatePages();

        //assert
        assertEquals(expected, actual);

    }
}


//double pages = (this.characters / 1800.0) + 20 * 1.1;