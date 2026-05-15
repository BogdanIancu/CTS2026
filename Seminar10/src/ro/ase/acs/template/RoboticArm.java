package ro.ase.acs.template;

public class RoboticArm extends PartMover {
    @Override
    protected void liftPart() {
        System.out.println("Robotic arm is lifting the part");
    }

    @Override
    protected void movePart() {
        System.out.println("Robotic arm is moving the part");

    }

    @Override
    protected void dropPart() {
        System.out.println("Robotic arm is dropping the part");

    }
}
