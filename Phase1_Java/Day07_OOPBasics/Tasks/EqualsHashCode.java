/*
Question:
How can you create a Java program where two students with the same rollNo are equal by overriding equals() and hashCode() using rollNo?
*/
import java.util.HashSet;
import java.util.Objects;

class EqualsHashCode {
    static class StudentRecord {
        private String rollNo;
        private String name;

        StudentRecord(String rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StudentRecord)) {
                return false;
            }
            StudentRecord other = (StudentRecord) obj;
            return Objects.equals(rollNo, other.rollNo);
        }

        public int hashCode() {
            return Objects.hash(rollNo);
        }

        public String toString() {
            return rollNo + " - " + name;
        }
    }

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("23MIS0616", "Santhosh");
        StudentRecord s2 = new StudentRecord("23MIS0616", "Santhosh Kumar");
        StudentRecord s3 = new StudentRecord("23MIS0617", "Arjun");

        HashSet<StudentRecord> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("HashSet size: " + set.size());
        System.out.println(set);
    }
}
