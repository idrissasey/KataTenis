import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Idrissa SI
 *
 */
public class TennisGameTest {
	TennisGameTP tg;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		 tg = new TennisGameTP();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		 tg = null;
	}

	/**
	 * Test method for {@link TennisGameTP#TennisGame()}.
	 */
	@Test
	public void testTennisGame() {
		assertEquals("love - love", tg.currentScore());
	}

	/**
	 * Test method for {@link TennisGameTP#currentScore()}.
	 */
	@Test
	public void testCurrentScore() {
		assertEquals("love - love", tg.currentScore());
		tg.player1Scores();
		assertEquals("fifteen - love", tg.currentScore());
		
	}

	/**
	 * Test method for {@link TennisGameTP#player1Scores()}.
	 */
	@Test
	public void testPlayer1Scores() {

		tg.player1Scores();
		assertEquals("fifteen - love", tg.currentScore());

	}

	/**
	 * Test method for {@link TennisGameTP#player2Scores()}.
	 */
	@Test
	public void testPlayer2Scores() {
		tg.player2Scores();
		assertEquals("love - fifteen", tg.currentScore());
	}

}
