package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link Player} can be alive.
 *
 * @author Adam Bunnell
 */
public class PlayerTest {
    private PacManSprites sprites = new PacManSprites();
    private Player Player = new PlayerFactory(sprites).createPacMan();

    @Test
    void testIsAlive() {
        assertThat(Player.isAlive()).isEqualTo(true);
    }

    @Test
    void testGetKiller() {
        assertThat(Player.getKiller()).isNull();
    }

}
