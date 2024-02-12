package nl.tudelft.jpacman.game;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameFactoryTest {

    GameFactory gameFactory = new GameFactory(new PlayerFactory(new PacManSprites()));

    @Test
    void testCreateSinglePlayerGame() {
        assertThat(gameFactory.createSinglePlayerGame(new Launcher().makeLevel(),
            new PointCalculatorLoader().load())).isNotNull();
    }
}
