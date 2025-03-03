package day14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Operations {

    public static void main(String[] args) {
        List<Candidate> candidates = InterviewRepository.getCandidateList();

        System.out.println("List of Pune Candidates:");
        candidates.stream().filter(candidate -> candidate.getCity().equals("Pune")).map(Candidate::getName).forEach(System.out::println);
        printLine();
        System.out.println("Candidate count per city:");
        candidates.stream().map(Candidate::getCity).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((city, count) -> System.out.println(city + ": " + count));
        printLine();
        System.out.println("Candidate count by Technical Expertise:");
        candidates.stream().map(Candidate::getExpertise).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((expertise, count) -> System.out.println(expertise + ": " + count));
        printLine();
        System.out.println("Fresher Candidate list:");
        candidates.stream().filter(candidate -> candidate.getExperience() == 0).map(Candidate::getName).forEach(System.out::println);
        printLine();
        System.out.println("Candidates with Highest Experience:");
        candidates.stream().max(Comparator.comparingInt(Candidate::getExperience)).ifPresent(candidate -> System.out.println(candidate.getName() + " - " + candidate.getExperience() + " years"));
        printLine();
        System.out.println("Sorted List of Candidates by City Name:");
        candidates.stream().sorted(Comparator.comparing(Candidate::getCity)).forEach(candidate -> System.out.println(candidate.getName() + " - " + candidate.getCity()));
    }
    private static void printLine() {
        System.out.println("======================================================");

    }

}
