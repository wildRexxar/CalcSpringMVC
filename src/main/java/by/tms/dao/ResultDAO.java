package by.tms.dao;

import by.tms.entity.Result;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultDAO {
    private final List<Result> results = new ArrayList<>();

    public void addResult(int id, double num1, double num2, double result, String action) {
        results.add(new Result(id, num1, num2, result, action));
    }

    public List<Result> getListResultsById(int id) {
      return  results.stream().filter(result -> result.getId() == id).collect(Collectors.toList());
    }
}