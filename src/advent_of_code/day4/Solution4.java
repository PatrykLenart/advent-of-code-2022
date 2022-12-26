package advent_of_code.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        final List<String> fileContent = Files.readAllLines(Path.of("src/advent_of_code/day4/input"), UTF_8);
        System.out.println("Part 1 solution:" + part1(fileContent));
        System.out.println("Part 2 solution:" + part2(fileContent));
    }

    private static int part1(List<String> fileContent) {
        int fullyContained = 0;
        for (String line : fileContent) {
            String[] areas = line.split("[,-]");
            int[] areaBorders = Arrays.stream(areas).mapToInt(Integer::parseInt).toArray();
            if ((areaBorders[0] <= areaBorders[2] && areaBorders[1] >= areaBorders[3])
                    || (areaBorders[2] <= areaBorders[0] && areaBorders[3] >= areaBorders[1])) {
                fullyContained++;
            }
        }
        return fullyContained;
    }

    private static int part2(List<String> fileContent) {
        int contained = 0;
        for (String line : fileContent) {
            String[] areas = line.split("[,-]");
            int[] areaBorders = Arrays.stream(areas).mapToInt(Integer::parseInt).toArray();
            if ((areaBorders[0] <= areaBorders[3] && areaBorders[0] >= areaBorders[2])
                    || (areaBorders[1] <= areaBorders[3] && areaBorders[1] >= areaBorders[2])
                    || (areaBorders[2] <= areaBorders[1] && areaBorders[2] >= areaBorders[0])
                    || (areaBorders[3] <= areaBorders[0] && areaBorders[3] >= areaBorders[1])) {
                contained++;
            }
        }
        return contained;
    }
}
