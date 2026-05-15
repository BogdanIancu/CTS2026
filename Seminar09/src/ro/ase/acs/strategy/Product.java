package ro.ase.acs.strategy;

import java.util.List;

public class Product implements Operation {
    @Override
    public double compute(List<Integer> numbers) {
        double product = 1;
        for (int i : numbers) {
            product *= i;
        }
        return product;
    }
}
