package stream.exam.sol;
import java.util.*;
import java.util.stream.*;

import stream.exam.sol.Student;

/**
 * 평균 점수 구하기 (filter + mapToDouble + average)
 *   점수가 80이상인 학생 + 점수기준 오름차순 + 이름만 검색
 * */
public class Test00 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("희정", 22, 88.5, "Computer Science"),
            new Student("가현", 24, 76.2, "Mathematics"),
            new Student("찬범", 23, 92.3, "Computer Science"),
            new Student("현솔", 25, 81.7, "Physics")
        );

       
        List<String> list1 = students.stream()
        .filter(s->s.getScore()>=80)
        .sorted(Comparator.comparingDouble(Student::getScore))
        .map(s->s.getName())
        .toList();
        
       // list1.add("a");//java.lang.UnsupportedOperationException
        
        List<String> list2 = students.stream()
                .filter(s->s.getScore()>=80)
                .sorted(Comparator.comparingDouble(Student::getScore))
                .map(s->s.getName())
               .collect(Collectors.toList());
        
        list2.add("a");//가능
        
        
        list1.forEach(System.out::println);
       
        list2.forEach(System.out::println);
      
    }
}
