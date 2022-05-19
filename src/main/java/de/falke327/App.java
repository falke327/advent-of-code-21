package de.falke327;

import de.falke327.day01.Day01Solver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        solveDay01();
    }

    public static void solveDay01() {
        String path = "src/main/resources/day01/data01.txt";

        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        log.debug(absolutePath);

        ProblemSolver day01Solver = new Day01Solver();
        System.out.println(day01Solver.solve1(absolutePath));
    }
}
