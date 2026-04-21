package ro.ase.acs.facade;

class LightsSystem {
    public void turnOnLowBeam(){
        System.out.println("Low Beam on");
    }
    public void turnOnHighBeam(){
        System.out.println("High Beam on");
    }

    public void turnOnBrakeLights(){
        System.out.println("Brake Lights on");
    }

    public void turnOnHazardLights(){
        System.out.println("Hazard Lights on");
    }

    public void turnOffAllLights(){
        System.out.println("All lights off");
    }
}
