package model;

// Clase que representa la dirección de una persona
public class Direccion {

    private String ciudad;
    private String region;

    public Direccion() {
    }

    public Direccion(String ciudad, String region) {
        setCiudad(ciudad);
        setRegion(region);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.trim().isEmpty()) {
            this.ciudad = "Sin ciudad";
        } else {
            this.ciudad = ciudad;
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region == null || region.trim().isEmpty()) {
            this.region = "Sin region";
        } else {
            this.region = region;
        }
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}