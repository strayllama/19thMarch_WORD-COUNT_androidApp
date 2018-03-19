package lab.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class TestCounter {
    private Counter counter;


    @Before
    public void before() {
        counter = new Counter();
    }

    @Test
    public void canCountWords() {
        String result = counter.countWords("Lots of words to count, words yeah words to to count.");
        System.out.println(result);
        assertEquals("{lots=1, of=1, words=3, count=2, to=3, yeah=1}",result);
    }

}
