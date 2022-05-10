package ejercicio2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistroJSON {
    @JsonProperty("Alumno/a")
    private String alumno;
    @JsonProperty("OACV")
    private String OACV;
    @JsonProperty("EA")
    private String EA;
    @JsonProperty("TII")
    private String TII;
    @JsonProperty("TC")
    private String TC;
    @JsonProperty("ING")
    private String ING;
    @JsonProperty("FOL")
    private String FOL;
    @JsonProperty("CEAC")
    private String CEAC;

    public RegistroJSON() {
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getOACV() {
        return OACV;
    }

    public void setOACV(String OACV) {
        this.OACV = OACV;
    }

    public String getEA() {
        return EA;
    }

    public void setEA(String EA) {
        this.EA = EA;
    }

    public String getTII() {
        return TII;
    }

    public void setTII(String TII) {
        this.TII = TII;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getING() {
        return ING;
    }

    public void setING(String ING) {
        this.ING = ING;
    }

    public String getFOL() {
        return FOL;
    }

    public void setFOL(String FOL) {
        this.FOL = FOL;
    }

    public String getCEAC() {
        return CEAC;
    }

    public void setCEAC(String CEAC) {
        this.CEAC = CEAC;
    }

    @Override
    public String toString() {
        return alumno + ';' + OACV + ';' + EA + ';' +
                ";" + TII +
                ";" + TC +
                ";" + ING +
                ";" + FOL +
                ";" + CEAC ;
    }
}
