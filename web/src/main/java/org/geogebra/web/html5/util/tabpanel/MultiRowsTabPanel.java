package org.geogebra.web.html5.util.tabpanel;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;


public class MultiRowsTabPanel extends Composite implements TabPanelInterface {

	MyTabBar tabBar;
	DeckPanel deck = new DeckPanel();

	public MultiRowsTabPanel() {
		tabBar = new MyTabBar(this);
		tabBar.addStyleName("gwt-TabBar");
		tabBar.addStyleName("ggb-MultiRowsTabPanel");
		VerticalPanel panel = new VerticalPanel();
		panel.add(tabBar);
		panel.add(deck);
		panel.setCellHeight(deck, "100%");
		tabBar.setWidth("100%");
		initWidget(panel);
	}

	public HandlerRegistration addSelectionHandler(
			SelectionHandler<Integer> selectionHandler) {
		return addHandler(selectionHandler, SelectionEvent.getType());
	}

	public void selectTab(int index) {
		tabBar.selectTab(index);
	}

	private int getTabCount() {
		return tabBar.getWidgetCount();
	}

	public MyTabBar getTabBar() {
		return tabBar;
	}

	public void add(Widget w, String tabText) {
		tabBar.addTab(tabText);
		deck.add(w);
	}

	public int getWidgetIndex(Widget widget) {
		return deck.getWidgetIndex(widget);
	}

}