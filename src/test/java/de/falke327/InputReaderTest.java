package de.falke327;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputReaderTest {

    Logger log = LoggerFactory.getLogger(InputReaderTest.class);

    @Test
    void readIntegerList() throws IOException {
        String path = "src/test/testResources/day01/testData01.txt";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        log.debug(absolutePath);

        InputReader inputReader = new InputReader(absolutePath);

        List<Integer> integerList = inputReader.getLinesAsInteger();
        assertEquals(10, integerList.size());

        int[] numbers = {199, 200, 208, 210, 200, 207, 240, 269, 260, 263};
        assertAll("numbers",
                () -> {
                    for (int i = 0; i < numbers.length; i++) {
                        assertEquals(numbers[i], integerList.get(i));
                    }
                }
        );
    }
}
