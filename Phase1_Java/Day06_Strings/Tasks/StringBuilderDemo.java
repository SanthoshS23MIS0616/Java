/*
Question:
How can you create a Java program to compare 10000 concatenations using + and StringBuilder.append() by timing both?
*/
class StringBuilderDemo {
    public static void main(String[] args) {
        long startPlus = System.nanoTime();
        String text = "";
        for (int i = 0; i < 10000; i++) {
            text = text + "java";
        }
        long endPlus = System.nanoTime();

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("java");
        }
        String result = sb.toString();
        long endBuilder = System.nanoTime();

        System.out.println("Length using +: " + text.length());
        System.out.println("Time using +: " + (endPlus - startPlus) + " ns");
        System.out.println("Length using StringBuilder: " + result.length());
        System.out.println("Time using StringBuilder: " + (endBuilder - startBuilder) + " ns");
    }
}
