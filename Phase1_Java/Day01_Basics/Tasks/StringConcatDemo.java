/*
Question:
What is the output of 'Sum=' + 5 + 3 and 5 + 3 + '=Sum' in Java, and why does String concatenation behave that way?
*/
class StringConcatDemo {

    public static void main(String[] args) {

        System.out.println("Sum=" + 5 + 3);

        System.out.println(5 + 3 + "=Sum");
    }
}