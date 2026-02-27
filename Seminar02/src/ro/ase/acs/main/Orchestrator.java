package ro.ase.acs.main;

import ro.ase.acs.interfaces.AbstractCalculator;
import ro.ase.acs.interfaces.AbstractValuePrinter;
import ro.ase.acs.interfaces.AbstractValuesReader;

import java.util.List;

public class Orchestrator {
    private final AbstractValuesReader valuesReader;
    private final AbstractCalculator calculator;
    private final AbstractValuePrinter valuePrinter;

    public Orchestrator(AbstractValuesReader valuesReader, AbstractCalculator calculator, AbstractValuePrinter valuePrinter) {
        this.valuesReader = valuesReader;
        this.calculator = calculator;
        this.valuePrinter = valuePrinter;
    }

    public void execute(){
        List<Integer> list = valuesReader.readValues(5);
        long result = calculator.compute(list);
        valuePrinter.printValue(result);
    }
}
