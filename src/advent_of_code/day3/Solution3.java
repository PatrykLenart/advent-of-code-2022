package advent_of_code.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        final List<String> fileContent = Files.readAllLines(Path.of("src/advent_of_code/day3/input"), UTF_8);
        System.out.println("Part 1 solution:" + part1(fileContent));
        System.out.println("Part 2 solution:" + part2(fileContent));
    }

    private static int part1(List<String> fileContent) {
        int totalValue = 0;
        for (String line : fileContent) {
            String firstPart = line.substring(0, line.length() / 2);
            String secondPart = line.substring(line.length() / 2);
            for (int i = 0; i < firstPart.length(); i++) {
                if (secondPart.indexOf(firstPart.charAt(i)) != -1) {
                    totalValue += Character.isUpperCase(firstPart.charAt(i)) ? firstPart.charAt(i) - 38 : firstPart.charAt(i) - 96;
                    break;
                }
            }
        }
        return totalValue;
    }

    private static int part2(List<String> fileContent) {
        int totalValue = 0;

        for (int i = 0; i < fileContent.size(); i += 3) {
            String first = fileContent.get(i);
            String second = fileContent.get(i + 1);
            String third = fileContent.get(i + 2);

            for (int j = 0; j < first.length(); j++) {
                if (second.indexOf(first.charAt(j)) != -1 && third.indexOf(first.charAt(j)) != -1) {
                    totalValue += Character.isUpperCase(first.charAt(j)) ? first.charAt(j) - 38 : first.charAt(j) - 96;
                    break;
                }
            }
        }

        return totalValue;
    }


}
