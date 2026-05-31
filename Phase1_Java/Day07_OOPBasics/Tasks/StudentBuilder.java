/*
Question:
How can you create a Java program using Builder pattern like Student.builder().name("Arjun").cgpa(8.04).branch("CSE").build()?
*/
class StudentBuilder {
    static class BuiltStudent {
        private String name;
        private String rollNo;
        private double cgpa;
        private String branch;

        private BuiltStudent(Builder builder) {
            this.name = builder.name;
            this.rollNo = builder.rollNo;
            this.cgpa = builder.cgpa;
            this.branch = builder.branch;
        }

        static Builder builder() {
            return new Builder();
        }

        public String toString() {
            return "Student{name='" + name + "', rollNo='" + rollNo + "', cgpa=" + cgpa + ", branch='" + branch + "'}";
        }

        static class Builder {
            private String name;
            private String rollNo;
            private double cgpa;
            private String branch;

            Builder name(String name) {
                this.name = name;
                return this;
            }

            Builder rollNo(String rollNo) {
                this.rollNo = rollNo;
                return this;
            }

            Builder cgpa(double cgpa) {
                this.cgpa = cgpa;
                return this;
            }

            Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            BuiltStudent build() {
                return new BuiltStudent(this);
            }
        }
    }

    public static void main(String[] args) {
        BuiltStudent student = BuiltStudent.builder()
                .name("Arjun")
                .rollNo("23MIS0616")
                .cgpa(8.04)
                .branch("CSE")
                .build();

        System.out.println(student);
    }
}
