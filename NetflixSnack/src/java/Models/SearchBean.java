/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author Coty
 */
@ManagedBean
@SessionScoped
public class SearchBean {
    private String searchType;
    private String searchString;
    private ArrayList<String> results;

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public void setResults(ArrayList<String> results) {
        this.results = results;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getSearchString() {
        return searchString;
    }

    public ArrayList<String> getResults() {
        return results;
    }
    
    public SearchBean(){
        this.results = new ArrayList();
    }
}
