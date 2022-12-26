package advent_of_code.day1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        final File file = new File("src/advent_of_code/day1/input");
        final List<String> fileContent = Files.readAllLines(file.toPath(), UTF_8);
        System.out.println("Part 1 solution:" + part1(fileContent));
        System.out.println("Part 2 solution:" + part2(fileContent));
    }

    private static int part1(List<String> fileContent) {
        int maxCalories = 0;
        int currentCalorieSum = 0;
        for (String line : fileContent) {
            if (line.isEmpty() || !fileContent.listIterator().hasNext()) {
                if (currentCalorieSum > maxCalories) {
                    maxCalories = currentCalorieSum;
                }
                currentCalorieSum = 0;
            } else {
                currentCalorieSum += Integer.parseInt(line);
            }
        }
        return maxCalories;
    }

    private static int part2(List<String> fileContent) {
        List<Integer> sums = new ArrayList<>();
        int currentCalorieSum = 0;
        for (String line : fileContent) {
            if (line.isEmpty() || !fileContent.listIterator().hasNext()) {
                sums.add(currentCalorieSum);
                currentCalorieSum = 0;
            } else {
                currentCalorieSum += Integer.parseInt(line);
            }
        }
        sums.sort(Comparator.naturalOrder());
        return sums.get(sums.size() - 1) + sums.get(sums.size() - 2) + sums.get(sums.size() - 3);
    }
}