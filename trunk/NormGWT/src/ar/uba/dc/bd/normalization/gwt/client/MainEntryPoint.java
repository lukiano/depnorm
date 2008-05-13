package ar.uba.dc.bd.normalization.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		// TODO Auto-generated method stub 
		RootPanel rootPanel = RootPanel.get();
		
		AbsolutePanel mainPanel = new AbsolutePanel();
		
		ListBox columnListBox = new ListBox(true);
		columnListBox.setName("columnListBox");
		columnListBox.setPixelSize(120, 100);
		columnListBox.addItem("Item 1");
		
		Button addColumnButton = new Button("Add Column");
		addColumnButton.setPixelSize(155, 22);
		addColumnButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				// TODO Auto-generated method stub
			}
		});

		Button removeColumnButton = new Button("Remove Column");
		removeColumnButton.setPixelSize(155, 22);
		removeColumnButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				// TODO Auto-generated method stub
			}
		});

		Button findKeysButton = new Button("Find Keys");
		findKeysButton.setPixelSize(155, 22);
		findKeysButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				// TODO Auto-generated method stub
			}
		});

		Button closureColumnButton = new Button("Closure of selected Column");
		closureColumnButton.setPixelSize(155, 22);

		closureColumnButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				// TODO Auto-generated method stub
			}
		});

		mainPanel.add(columnListBox, 12, 0);
		mainPanel.add(addColumnButton, 153, 21);
		mainPanel.add(removeColumnButton, 153, 55);
		mainPanel.add(findKeysButton, 383, 21);
		mainPanel.add(closureColumnButton, 383, 55);
		
		Window.setTitle("Da Title");
		
		ListBox dependencyListBox = new ListBox(true);
		dependencyListBox.setName("dependencyListBox");
		dependencyListBox.addItem("Item 1");
		
		mainPanel.add(dependencyListBox, 12, 170);
		
		ListBox schemaListBox = new ListBox(true);
		schemaListBox.setName("schemaListBox");
		schemaListBox.addItem("Item 1");
		
		mainPanel.add(schemaListBox, 12, 319);

		rootPanel.add(mainPanel);
	}

}
