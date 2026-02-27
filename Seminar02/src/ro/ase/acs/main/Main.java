package ro.ase.acs.main;

import ro.ase.acs.classes.AverageCalculator;
import ro.ase.acs.classes.ValuePrinter;
import ro.ase.acs.classes.ValuesReader;

public class Main {
    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator(new ValuesReader(),
                new AverageCalculator(), new ValuePrinter());
        orchestrator.execute();
    }
}
