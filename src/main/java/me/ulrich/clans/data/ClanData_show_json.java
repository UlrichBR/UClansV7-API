package me.ulrich.clans.data;

public class ClanData_show_json {

private String hover_text;
private String click_type;
private String click_action;

/*
            hover_text: '&aClick to view help of Clans.'
            click_type: RUN_COMMAND
            click_action: /clan help
 * */	
	
	public ClanData_show_json(String hover_text, String click_type, String click_action) {
		this.setHover_text(hover_text);
		this.setClick_type(click_type);
		this.setClick_action(click_action);
	}

	public String getHover_text() {
		return hover_text;
	}

	public void setHover_text(String hover_text) {
		this.hover_text = hover_text;
	}

	public String getClick_type() {
		return click_type;
	}

	public void setClick_type(String click_type) {
		this.click_type = click_type;
	}

	public String getClick_action() {
		return click_action;
	}

	public void setClick_action(String click_action) {
		this.click_action = click_action;
	}
}
