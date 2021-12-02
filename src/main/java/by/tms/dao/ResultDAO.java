package by.tms.dao;

import by.tms.entity.Result;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultDAO {
    private final List<Result> results = new ArrayList<>();

    public void addResult(Result result) {
        results.add(result);
    }

    public List<Result> getListResultsById(int id) {
      return  results.stream().filter(result -> result.getId() == id).collect(Collectors.toList());
    }
}