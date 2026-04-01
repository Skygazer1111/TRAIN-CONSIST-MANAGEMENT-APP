import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BogieService {

    // UC8
    public List<Bogie> filterByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    // UC9
    public Map<String, List<Bogie>> groupByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
    //uc10
    public int getTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)      // extract capacity
                .reduce(0, Integer::sum);     // aggregate
    }
}