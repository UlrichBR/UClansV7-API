package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

public interface DiscordAPI {

	boolean sendClanHookMessage(UUID clanUUID, String title, String content, String autor, String autorIcon);

	boolean hasWebhook(UUID clanUUID);

	Optional<String> getWebhook(UUID clanUUID);

	boolean changeWebhook(UUID clanUUID, String url);

	boolean removeWebhook(UUID clanUUID);

}
