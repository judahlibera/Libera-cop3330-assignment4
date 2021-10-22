/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Judah Libera
 */
package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

class item{
    public String title = "";
    public String description = "";
    public int completed = 0;
    public String due = "YYYY-MM-DD";
}

public class HelloController implements Initializable{

    @FXML
    final ToggleGroup group = new ToggleGroup();

    @FXML
    private TextField fp;
    @FXML
    private Button btnsave;
    @FXML
    private Button btnload;

    @FXML
    private ListView<String> listBoxtodo;

    @FXML
    private Button btndeltodo;
    @FXML
    private Button btncrttodo;

    @FXML
    private TextField newnametodo;

    @FXML
    private ListView<String> listBoxitem;

    @FXML
    private Button btndelitem;
    @FXML
    private Button btncrtitem;

    @FXML
    private Label desc;
    @FXML
    private Button descup;

    @FXML
    private Label dd;
    @FXML
    private Button ddup;

    @FXML
    private Label stat;
    @FXML
    private Button statup;

    @FXML
    private TextField itemchange;


    final ArrayList<item> listitem = new ArrayList<item>();
    ObservableList<String> listitemtitles = FXCollections.observableArrayList(); //to display to listbox
    final ObservableList<String> listtodo = FXCollections.observableArrayList();



    @FXML
    protected void createtodo() {
        //create a new to do list
    }
    @FXML
    protected void deltodo(){
        //delete a to do list
    }

    @FXML
    protected void delitem(){
        //delete an item from a list
    }
    @FXML
    protected void createitem() {
        //create an item in the selected list
    }

    @FXML
    protected void loadfile(){
//create filepath based on fp data
    }
    @FXML
    protected void savefile(){
//create filepath based on fp data
    }

    @FXML
    protected void descupdate(){
//change items.description at same index listitems is at
    }
    @FXML
    protected void ddupdate(){
//change items.due at same index listitems is at
    }
    @FXML
    protected void statupdate(){
//change items.completed at same index listitems is at
    }

    void updateitemlistbox(ObservableList<String> list){ //call whenever radio button update is detected
        //ObservableList<String> temp = FXCollections.observableArrayList();
        //copy from list into temp based on selected radio button filter. use list.get(i).title with if to filter
        //listBoxitem.setItems(temp); //switch to display temp
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //updateitemlistbox(listitemtitles); //how to update listviews

        //set list of items to list associated with list to do when a todolist gets selected
        //when item is selected change labels from arraylist in same position.
    }
}

