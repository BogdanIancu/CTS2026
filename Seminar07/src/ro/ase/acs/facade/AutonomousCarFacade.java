package ro.ase.acs.facade;

public class AutonomousCarFacade {
    private BrakingSystem brakingSystem = new BrakingSystem();
    private Engine engine = new Engine();
    private LightsSystem lightsSystem = new LightsSystem();

    public void start(){
        engine.start();
        brakingSystem.releaseAllBrakes();
        lightsSystem.turnOnLowBeam();
    }

    public void park(){
        engine.stop();
        brakingSystem.releaseAllBrakes();
        lightsSystem.turnOffAllLights();
    }

    public void emergencyBrake(){
        brakingSystem.applyFrontBrakes();
        brakingSystem.applyRearBrakes();
        engine.stop();
        lightsSystem.turnOnBrakeLights();
        lightsSystem.turnOnHazardLights();
    }
}
