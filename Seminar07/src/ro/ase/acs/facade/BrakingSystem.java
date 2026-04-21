package ro.ase.acs.facade;

class BrakingSystem {
    public void applyFrontBrakes(){
        System.out.println("Front brakes on");
    }

    public void applyRearBrakes(){
        System.out.println("Rear brakes on");
    }

    public void releaseAllBrakes(){
        System.out.println("All brakes off");
    }
}
