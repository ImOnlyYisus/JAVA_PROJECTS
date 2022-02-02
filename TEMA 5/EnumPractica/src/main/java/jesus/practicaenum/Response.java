package jesus.practicaenum;

public enum Response {
    GANAJ1("Gana J1"),
    GANAJ2("Gana J2"),
    EMPATE("Empate"),
    NOGANA("No gana");

    private final String respuesta;

    Response(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

}
