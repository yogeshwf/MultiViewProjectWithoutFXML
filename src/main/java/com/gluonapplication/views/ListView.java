package com.gluonapplication.views;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.AnchorPane;

public class ListView extends View {

	public ListView() {
		getStylesheets().add(PrimaryView.class.getResource("ListView.css").toExternalForm());
		AnchorPane topAnchorPane = new AnchorPane();
		TabPane topTabPane = new TabPane();
		topTabPane.setRotateGraphic(true);
		topTabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		for(int i=0; i<7; i++) {
			Tab tab = new Tab("Tab_"+i);
			topTabPane.getTabs().add(tab);
		}
		
		topAnchorPane.getChildren().add(topTabPane);
		setTop(topAnchorPane);
	}
	
	@Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> getApplication().getDrawer().open()));
        appBar.setTitleText("Primary");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }
}
