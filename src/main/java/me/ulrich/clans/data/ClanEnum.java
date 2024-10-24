package me.ulrich.clans.data;

public class ClanEnum {
	
	public enum ClansExtensions{
		CMIHolograms,
		DecentHolograms,
		Dynmap,
		ElementalGems,
		Holograms,
		HolographicDisplays,
		PlayerPoints,
		TokenEnchantMoney,
		Vault,
		WorldGuardRegion,
		FancyHolograms,
		GriefPrevention,
		TAB,
		CMIScoreboard,
		FeatherBoard,
		SternalBoard,
		SimpleCore,
		BlueMap,
		TNE;
		
		
	}
	
	public enum ExtensionsReturn {
		ERROR_REPO, ALREADY_UPDATED, ERROR_DOWNLOAD, SUCCESS_DOWNLOAD, ALREADY_EXISTS, NEED_RELOAD_ADDONS, GENERAL_ERROR
		
		
	}
	
	public enum ClanLangs{
		EN, PL, TR, RU, ES, HU, GE, BR;
	}
	
	
	public enum LoggerTime{
		ALL, DAILY, WEEKLY, MONTHLY, YEARLY,
	}
	
	public enum MailTime{
		ALL, READ, UNREAD,
	}
	
	public enum PlayerLeaveReaction{
		KICK, LEAVE;
	}
	
	public enum Agent {
		POLYMART, BUILDBYBIT, NONE;
	}
	
	public enum BannerFilter{
		COMMON, BANNER, HEAD;
	}
	
	public enum UnlockerTypes{
		BANNER_UPLOAD, MEMBER_DEMOTE, MEMBER_PROMOTE, MEMBER_REGROUP, ACCEPT_WAR, INVITE_WAR, REMOVE_MEMBERS, INVITE_MEMBERS, MODTAG, CHANGE_DESC;
	}
	
	public enum EnumExpand {
		VERT, UP, DOWN;
	}
	
	public enum TranslatableKey{
		block, entity, item, biome, color, enchantment, gameMode;
	}
	
	public enum MoneyType{
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED, ULTRAECONOMY, ELEMENTALGEMS;
	}
	public enum ImportStorage{
		MYSQL, SQLITE;
	}

	public enum ClanStorage{
		MYSQL, SQLITE, YAML, H2;
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}

	
	public enum SyncName {
		NULL, UPDATE, CHEST, BROADCAST, CLANCHAT, INVITE, ALLYINVITE, RIVALREMOVE;
	}
	
	public enum AllyInviteReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum RivalRemoveReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_SENDED;
	}
	public enum WarReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum EventState {
		STOPED, INLOBBY, STARTED, ENDING, CANCELED, INWAIT;
	}
	
	public enum BuyChestResponse {
		NEEDMONEY, ERROR, SUCCESS;
	}

	public enum PlaceholderTop{
		KILL, DEATH, KDR, MEMBER, BANK, LEVEL, WAR, ALL, POINT, PATENT;
	}
	
	public enum ClanActions{
		CREATE, NEWMEMBER, REMOVEMEMBER, WARWIN, WARLOSE, NEWALLIANCE, REMOVEALLIANCE, NEWRIVAL, REMOVERIVAL, PROMOTEMEMBER, DEMOTEMEMBER, DEATHMEMBER, KILLMEMBER, CLANVERIFY;
	}
	
	public enum KdrChangeType{
		RESET, KILL, DEATH;
	}
	
	public enum RivalAllyCount{
		RIVAL, ALLY;
	}
	
	public enum SettingsType{
		WARINVITE, ALLYSHAREDCHAT, JOINLEAVE, ALLYSHAREDHOME, CLANFF, OPENED, PUBLICHOMES, RECEIVEMAILALLIES, RECEIVEMAILALL;
	}
	
	public enum PlayerSettingsType{
		INVITATIONS;
	}
	
	public enum RedisType{
		EMPTY, CLANUPDATEUUID, PLAYERUPDATEUUID, INVITEUPDATEUUID, MODERATIONUPDATEUUID, PLAYERTELEPORT, CLANCHAT, CUSTOM, CLEARPRORYEDPLAYERS, PROXYEDPLAYERS, EVENTMESSAGES;
	}
	
	public enum SettingsFlagsAccept {
		TRUE, FALSE, TOGGLE;
	}
	
	public enum ClanCommandActions{
		CREATE, DELETE, JOIN, LEAVE, MODTAG;
	}
	
	public enum HoloPreference{
		ANY, CMI, HOLOGRAPHICDISPLAYS, HOLOGRAMS, DECENTHOLOGRAMS;
	}
	
	public enum ChatDataType {
		CHANGENICKNAME, COMMANDUNKNOWNPLAYER, COMMANDUNKNOWNADMIN, CLANLEVELRECEIVED, CLANPATENTRECEIVED, CLANHOMECREATE, CLANCREATE, CLANMODTAG, CLANDESC, INVITERECEIVE, CLANREGROUPRECEIVE, CLANINVITE, CLANALLYRECEIVE, CLANRIVALREMOVE, CLANDISCORDCREATEWEBHOOK;
	}
	
	public enum QueueSync{
		Moderation, ClanAndPlayers, GetInvite, ClanData, UpdateClanPlayers, PlayerData
	}
	
}
