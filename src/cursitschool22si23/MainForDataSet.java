package cursitschool22si23;

import java.util.List;

public class MainForDataSet {
    public static void main(String[] args) {
        List<Double> largeData = java.util.stream.DoubleStream.iterate
                        (1, n -> n + 1)
                .limit(20)
                .boxed()
                .toList();
        DataSet ds = new DataSet("TestData", largeData);
        System.out.println(ds);
    }
}