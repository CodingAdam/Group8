package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PelletTest {

    Pellet pellet = new Pellet(0,  null);
    @Test
    void testGetValue() {
        assertThat(pellet.getValue()).isEqualTo(0);
    }
}
