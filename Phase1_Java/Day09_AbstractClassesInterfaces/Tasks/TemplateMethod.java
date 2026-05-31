/*
Question:
How can you create abstract DataProcessor with processData() skeleton, and CSVProcessor and JSONProcessor where only parseData() and formatOutput() differ?
*/
abstract class DataProcessor {
    final void processData(String data) {
        readData(data);
        String parsed = parseData(data);
        String output = formatOutput(parsed);
        saveOutput(output);
    }

    void readData(String data) {
        System.out.println("Reading: " + data);
    }

    abstract String parseData(String data);

    abstract String formatOutput(String parsedData);

    void saveOutput(String output) {
        System.out.println("Saved output: " + output);
    }
}

class CSVProcessor extends DataProcessor {
    String parseData(String data) {
        return data.replace(",", " | ");
    }

    String formatOutput(String parsedData) {
        return "CSV Output -> " + parsedData;
    }
}

class JSONProcessor extends DataProcessor {
    String parseData(String data) {
        return data.replace("{", "").replace("}", "").replace("\"", "");
    }

    String formatOutput(String parsedData) {
        return "JSON Output -> " + parsedData;
    }
}

class TemplateMethod {
    public static void main(String[] args) {
        DataProcessor csv = new CSVProcessor();
        csv.processData("id,name,cgpa");

        DataProcessor json = new JSONProcessor();
        json.processData("{\"id\":1,\"name\":\"Santhosh\"}");
    }
}
