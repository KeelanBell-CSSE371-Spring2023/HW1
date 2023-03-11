package data;

import java.util.List;

public interface CSVReader<T> {
    public List<T> readCSV(String filename);
}
