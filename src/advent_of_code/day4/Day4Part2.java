package advent_of_code.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Day4Part2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines((Paths.get("C:\\Users\\patry\\IdeaProjects\\AOC\\src\\advent_of_code\\day4\\day4part2data")));
        int fullyContainsCounter = 0;
        for (String line : lines) { //24-48,48-72
            String[] assignments = line.split(","); //[24-48] [48-72]
            int[] firstElfAssignments = Arrays.stream(assignments[0].split("-")).mapToInt(Integer::parseInt).toArray(); //[24] [48]
            int[] secondElfAssignments = Arrays.stream(assignments[1].split("-")).mapToInt(Integer::parseInt).toArray(); //[48] [72]


            if ((firstElfAssignments[0] >= secondElfAssignments[0] && firstElfAssignments[0] <= secondElfAssignments[1])
                    || (firstElfAssignments[1] <= secondElfAssignments[1] && firstElfAssignments[1] >= secondElfAssignments[0])
                    || (secondElfAssignments[0] >= firstElfAssignments[0] && secondElfAssignments[0] <= firstElfAssignments[1])
                    || (secondElfAssignments[1] <= firstElfAssignments[1] && secondElfAssignments[1] >= firstElfAssignments[0])) {
                fullyContainsCounter++;
            }
        }

        System.out.println(fullyContainsCounter);
    }
}
