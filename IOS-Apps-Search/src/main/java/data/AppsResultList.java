package data;

import java.util.ArrayList;

public class AppsResultList {
    private String resultCount;
    private ArrayList<Application> results;

    public String getResultCount() {
        return resultCount;
    }

    public void setResultCount(String resultCount) {
        this.resultCount = resultCount;
    }

    public ArrayList<Application> getResults() {
        return results;
    }

    public void setResults(ArrayList<Application> results) {
        this.results = results;
    }
}
