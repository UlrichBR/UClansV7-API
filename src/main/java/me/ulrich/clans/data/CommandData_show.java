package me.ulrich.clans.data;

public class CommandData_show {
private String on_help;
private ClanData_show_json on_help_json;
private String on_success;
private String on_error;
private String on_usage;

	/*
          on_help: ' &b/clan help &7-&e Show help menu.'
          on_help_json:
            hover_text: '&aClick to view help of Clans.'
            click_type: RUN_COMMAND
            click_action: /clan help
          on_success: '%tag% &aYou are seeing the help!'
          on_error: '%tag%&cError to show text.'
          on_usage: '%tag% &cUse &b/clan help'
*/
	public CommandData_show(String on_help, String on_success, String on_error, String on_usage) {
		this.setOn_help(on_help);
		this.setOn_help_json(on_help_json);
		this.setOn_success(on_success);
		this.setOn_error(on_error);
		this.setOn_usage(on_usage);
	}

	public String getOn_help() {
		return on_help;
	}

	public void setOn_help(String on_help) {
		this.on_help = on_help;
	}

	public ClanData_show_json getOn_help_json() {
		return on_help_json;
	}

	public void setOn_help_json(ClanData_show_json on_help_json) {
		this.on_help_json = on_help_json;
	}

	public String getOn_success() {
		return on_success;
	}

	public void setOn_success(String on_success) {
		this.on_success = on_success;
	}

	public String getOn_error() {
		return on_error;
	}

	public void setOn_error(String on_error) {
		this.on_error = on_error;
	}

	public String getOn_usage() {
		return on_usage;
	}

	public void setOn_usage(String on_usage) {
		this.on_usage = on_usage;
	}
}
