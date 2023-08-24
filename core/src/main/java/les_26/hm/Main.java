package les_26.hm;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

        private static final String FILE_PATH_JOHN = "core/src/main/resources/student.json";
        private static final String FILE_PATH_MARTA = "core/src/main/resources/student2.json";
        private static final String FILE_PATH_MAX = "core/src/main/resources/student3.json";
        private static final String FILE_PATH_BY_SORTED_GROUP = "core/src/main/resources/sorted_group.json";

        public static void main(String[] args) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();

            Student john = readStudentFile(objectMapper, FILE_PATH_JOHN);
            Student marta = readStudentFile(objectMapper, FILE_PATH_MARTA);
            Student max = readStudentFile(objectMapper, FILE_PATH_MAX);
            List<Student> group = Arrays.asList(john, marta, max);

            List<Student> sortedGroup = sortGroup(group);

            File file = new File(FILE_PATH_BY_SORTED_GROUP);
            objectMapper.writeValue(file, sortedGroup);
        }

        public static Student readStudentFile(ObjectMapper objectMapper, String path) throws IOException {
            InputStream resource = ClassLoader.getSystemResourceAsStream(path);
            return objectMapper.readValue(resource, Student.class);
        }

        public static List<Student> sortGroup(List<Student> group) {
            return group.stream()
                    .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                    .collect(Collectors.toList());

    }

}
