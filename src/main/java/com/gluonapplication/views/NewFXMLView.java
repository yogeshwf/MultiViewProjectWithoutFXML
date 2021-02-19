package com.gluonapplication.views;

import java.io.IOException;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

import javafx.fxml.FXMLLoader;

public class NewFXMLView extends View {
	
	public View getView() {
        try {
            View view = FXMLLoader.load(NewFXMLView.class.getResource("NewFXML.fxml"));//getClass().getResource("primary.fxml"));
            return view;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            return new View();
        }
    }
	
	 @Override
	    protected void updateAppBar(AppBar appBar) {
	        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> getApplication().getDrawer().open()));
	        appBar.setTitleText("NewFXML");
	        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
	    }
}
