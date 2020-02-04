package Exercise.Lesson8.Lesson9.exercise_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    //Use IntSummaryStatistics to output the top test score,
    //the lowest test score, and the average of all test scores
    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>() {
            {
                add(new ExamData("George", 91.3));
                add(new ExamData("Tom", 88.9));
                add(new ExamData("Rick", 80));
                add(new ExamData("Harold", 90.8));
                add(new ExamData("Ignatius", 60.9));
                add(new ExamData("Anna", 77));
                add(new ExamData("Susan", 87.3));
                add(new ExamData("Phil", 99.1));
                add(new ExamData("Alex", 84));
            }
        };

        DoubleSummaryStatistics doubleSummaryStatistics = data.stream().mapToDouble(ExamData::getTestScore).summaryStatistics();
        System.out.println("Maximum Score is: "+ doubleSummaryStatistics.getMax());
        System.out.println("Minimum Score is: " + doubleSummaryStatistics.getMin());
        System.out.println("Average Score is: " +doubleSummaryStatistics.getAverage());

        List<String> word = Arrays.asList("Hello", "World");
        word.stream().flatMap(x -> Stream.of(x)).distinct().forEach(System.out::print);
    }

}
