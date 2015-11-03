/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Models.SearchBean;
import java.util.ArrayList;

/**
 *
 * @author Coty
 */
@ManagedBean
@SessionScoped
public class SearchController implements Serializable{
    
    SearchBean searchBean;
    ArrayList<String> resultsList;
    
    public SearchController(){
        searchBean = new SearchBean();
    }
    
    public String searchDatabase(){
        String searchTerm = searchBean.getSearchString();
        String searchType = searchBean.getSearchType();

        //This is where the Data Access comes in. TODO.
        //resultsList = Search.search(searchType, searchString);
        //searchBean.setResults(resultsList);

        return "foo";
        //return "searchResults.xhtml"; //Maybe???
    }
    
}
