package me.ulrich.clans.data;

public class PlayerData_Settings {

	private boolean invitations;

	public PlayerData_Settings(boolean invitations) {
		this.setInvitations(invitations);
	}

	public boolean isInvitations() {
		return invitations;
	}

	public void setInvitations(boolean invitations) {
		this.invitations = invitations;
	}
}
