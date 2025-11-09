package cursitschool22si23;

import java.util.List;

public class DataSet {
    private String name;
    private List<Double> data;
    public DataSet(String name, List<Double> data) {
        this.name = name;
        this.data = data;
    }
    @Override
    public String toString() {
        int size = data.size();
        String preview = "";
        if (size <= 5) {
            preview = data.toString();
        } else {
            preview = data.subList(0, 3) + " ... " + data.subList(size - 2, size);
        }
        double average = data.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        return String.format(
                "DataSet{name='%s', size=%d, avg=%.2f, sample=%s}",
                name, size, average, preview
        );
    }
}