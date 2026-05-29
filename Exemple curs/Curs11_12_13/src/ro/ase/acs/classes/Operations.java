package ro.ase.acs.classes;

import ro.ase.acs.exceptions.NullParameterException;

public class Operations {
    public static final double MAX_SUM = 20_000;

    public double sum(int x, int y) {
        return x + y;
    }

    public double addition(Double... values) throws NullParameterException {
        if(values == null) {
            throw new NullParameterException();
        }
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            if(values[i] != null) {
                if (sum + values[i] >= MAX_SUM) {
                    return MAX_SUM;
                } else {
                    sum += values[i];
                }
            }
        }

        double roundedSum = Math.round(sum);
        return roundedSum;
    }
}
