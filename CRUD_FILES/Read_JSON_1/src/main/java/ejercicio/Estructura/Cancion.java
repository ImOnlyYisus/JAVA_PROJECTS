package ejercicio.Estructura;

import java.util.ArrayList;

public class Cancion {
    public int resultCount;
    public ArrayList<Result> results;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public Cancion() {
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
