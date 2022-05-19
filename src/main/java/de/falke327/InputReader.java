package de.falke327;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    private final File input;

    public InputReader(final String path) {
        this.input = new File(path);
    }

    public List<Integer> getLinesAsInteger() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.input);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        List<Integer> result = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(Integer.parseInt(line));
            }
        }

        return result;
    }
}
