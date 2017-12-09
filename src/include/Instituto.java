package include;

public class Instituto {
    private Integer ClaveInst;
    private String NombreInst;
    private String DireccionInst;


    public Instituto(Integer claveInst, String nombreInst, String direccionInst) {
        ClaveInst = claveInst;
        NombreInst = nombreInst;
        DireccionInst = direccionInst;
    }

    public Integer getClaveInst() {
        return ClaveInst;
    }

    public void setClaveInst(Integer  claveInst) {
        this.ClaveInst = claveInst;
    }

    public String getNombreInst() {
        return NombreInst;
    }

    public void setNombreInst(String nombreInst) {
        NombreInst = nombreInst;
    }

    public String getDireccionInst() {
        return DireccionInst;
    }

    public void setDireccionInst(String direccionInst) {
        DireccionInst = direccionInst;
    }

    public Integer getclaveInst() {
        return ClaveInst;
    }
}
