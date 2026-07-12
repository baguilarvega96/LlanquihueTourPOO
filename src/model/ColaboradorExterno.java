package model;

// Clase que representa a un colaborador externo de la agencia
public class ColaboradorExterno extends Persona implements Registrable {

    private String empresa;
    private String servicioPrestado;

    public ColaboradorExterno() {
    }

    public ColaboradorExterno(String nombre, String rut, String telefono,
                              Direccion direccion, String empresa,
                              String servicioPrestado) {

        super(nombre, rut, telefono, direccion);

        setEmpresa(empresa);
        setServicioPrestado(servicioPrestado);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {

        if (empresa == null || empresa.trim().isEmpty()) {
            this.empresa = "Empresa no informada";
        } else {
            this.empresa = empresa;
        }
    }

    public String getServicioPrestado() {
        return servicioPrestado;
    }

    public void setServicioPrestado(String servicioPrestado) {

        if (servicioPrestado == null
                || servicioPrestado.trim().isEmpty()) {

            this.servicioPrestado = "Servicio no informado";

        } else {
            this.servicioPrestado = servicioPrestado;
        }
    }

    @Override
    public String mostrarResumen() {

        return "Colaborador externo: " + getNombre()
                + " | Empresa: " + empresa
                + " | Servicio: " + servicioPrestado;
    }

    @Override
    public String toString() {

        return "ColaboradorExterno{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", empresa='" + empresa + '\'' +
                ", servicioPrestado='" + servicioPrestado + '\'' +
                '}';
    }
}
