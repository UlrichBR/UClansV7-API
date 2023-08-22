package me.ulrich.clans.api;

import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.DiscordAPI;

public class DiscordAPIManager implements DiscordAPI {


	public DiscordAPIManager(Clans clans) {

	}
	
	@Override
	public boolean sendClanHookMessage(UUID clanUUID, String title, String content, String autor, String autorIcon ) {
		return false;
	}
	
	@Override 
	public boolean hasWebhook(UUID clanUUID) {
		return false;
	}
	
	@Override
	public Optional<String> getWebhook(UUID clanUUID) {
		return Optional.empty();
	}
	
	@Override
	public boolean changeWebhook(UUID clanUUID, String url) {
		return false;
	}
	
	@Override
	public boolean removeWebhook(UUID clanUUID) {
		return false;
	}
}
