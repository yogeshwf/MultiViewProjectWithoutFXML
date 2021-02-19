package com.gluonapplication.views;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class NewFXMLView extends View {

	public NewFXMLView() {
		Label label = new Label("This is FXML");
		VBox controls = new VBox(label);
		controls.setAlignment(Pos.CENTER);
		setCenter(controls);
	}

	@Override
	protected void updateAppBar(AppBar appBar) {
		appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> getApplication().getDrawer().open()));
		appBar.setTitleText("NewFXML");
		appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
	}
}
