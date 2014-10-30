package net.canarymod.commandsys;

/**
 * An list of all Canary Command permissions<br/>
 * to help track what permissions are what
 *
 * @author Jason Jones (darkdiplomat)
 */
public enum CanaryCommandPermissions {
    // Empty Enum Singleton
    ;

    public static final String // Have to use this for annotations as these need to be constances
            GROUPMOD = "canary.command.groupmod",
            GROUPMOD$ADD = "canary.command.groupmod.add",
            GROUPMOD$PERMISSIONS = "canary.command.groupmod.permissions",
            GROUPMOD$PERMISSIONS$ADD = "canary.command.groupmod.permissions.add",
            GROUPMOD$PERMISSIONS$REMOVE = "canary.command.groupemod.permissions.remove",
            GROUPMOD$PERMISSIONS$CHECK = "canary.command.groupmod.permissions.check",
            GROUPMOD$PERMISSIONS$LIST = "canary.command.groupmod.permissions.list",
            GROUPMOD$PERMISSIONS$FLUSH = "canary.command.groupmod.permission.flush",
            GROUPMOD$LIST = "canary.command.groupmod.list",
            GROUPMOD$REMOVE = "canary.command.groupmod.remove",
            GROUPMOD$CHECK = "canary.command.groupmod.check",
            GROUPMOD$RENAME = "canary.command.groupmod.rename",
            GROUPMOD$PREFIX = "canary.command.groupmod.prefix",
            GROUPMOD$PARENT = "canary.command.groupmod.parent",
            COMPASS = "canary.command.compass",
            GETPOS = "canary.command.getpos",
            GOD = "canary.command.god",
            GOD$OTHER = "canary.command.god.other",
            KILL = "canary.command.kill",
            KILL$OTHER = "canary.command.kill.other",
            PLAYERMOD = "canary.command.playermod",
            PLAYERMOD$ADD = "canary.command.playermod.add",
            PLAYERMOD$PERMISSIONS = "canary.command.playermod.permissions",
            PLAYERMOD$PERMISSIONS$ADD = "canary.command.playermod.permissions.add",
            PLAYERMOD$PERMISSIONS$REMOVE = "canary.command.playermod.permissions.remove",
            PLAYERMOD$PERMISSIONS$CHECK = "canary.command.playermod.permissions.check",
            PLAYERMOD$PERMISSIONS$LIST = "canary.command.playermod.permissions.list",
            PLAYERMOD$PREFIX = "canary.command.playermod.prefix",
            PLAYERMOD$REMOVE = "canary.command.playermod.remove",
            PLAYERMOD$GROUP = "canary.command.playermod.group",
            PLAYERMOD$GROUP$SET = "canary.command.playermod.group.set",
            PLAYERMOD$GROUP$ADD = "canary.command.playermod.group.add",
            PLAYERMOD$GROUP$LIST = "canary.command.playermod.group.list",
            PLAYERMOD$GROUP$CHECK = "canary.command.playermod.group.check",
            PLAYERMOD$GROUP$REMOVE = "canary.command.playermod.group.remove",
            BAN = "canary.command.ban",
            CANARYMOD = "canary.command.canarymod",
            CREATEVANILLA = "canary.command.createvanilla",
            HELP = "canary.command.help",
            IPBAN = "canary.command.ipban",
            KICK = "canary.command.kick",
            KIT = "canary.command.kit",
            KIT$CREATE = "canary.command.kit.create",
            KIT$GROUP = "canary.command.kit.group",
            KIT$PRIVATE = "canary.command.kit.private",
            KIT$OTHER = "canary.command.kit.other",
            PLUGIN$LIST = "canary.command.plugin.list",
            MOTD = "canary.command.motd",
            MUTE = "canary.command.mute",
            PLAYER$INFO = "canary.command.player.info",
            PLAYER$LIST = "canary.command.player.list",
            PLUGIN$ENABLE = "canary.command.plugin.enable",
            PLUGIN$DISABLE = "canary.command.plugin.disable",
            PLUGIN$RELOAD = "canary.command.plugin.reload",
            RELOAD = "canary.command.reload",
            RESERVELIST = "canary.command.reservelist",
            STOP = "canary.command.stop",
            SYSINFO = "canary.command.sysinfo",
            UNBAN = "canary.command.unban",
            UPTIME = "canary.command.uptime",
            WHITELIST = "canary.command.whitelist",
            ACHIEVEMENT = "canary.command.achievement",
            ACHIEVEMENT$OTHER = "canary.command.achievement.other",
            BLOCKDATA = "canary.command.blockdata",
            BROADCAST = "canary.command.broadcast",
            CLEAR = "canary.command.clear",
            CLEAR$OTHER = "canary.command.clear.other",
            CLONE = "canary.command.clone",
            DEBUG = "canary.command.debug",
            DEFAULTGAMEMODE = "canary.command.defaultgamemode",
            SETWORLDSPAWN = "canary.command.setworldspawn",
            DIFFICULTY = "canary.command.difficulty",
            EFFECT = "canary.command.effect",
            EFFECT$OTHER = "canary.command.effect.other",
            EMOTE = "canary.command.emote",
            ENCHANT = "canary.command.enchant",
            ENCHANT$OTHER = "canary.command.enchant.other",
            ENTITYDATA = "canary.command.entitydata",
            EXECUTE = "canary.command.execute",
            FILL = "canary.command.fill",
            GAMEMODE = "canary.command.gamemode",
            GAMEMODE$OTHER = "canary.command.gamemode.other",
            GAMERULE = "canary.command.gamerule",
            GIVE = "canary.command.give",
            GIVE$OTHER = "canary.command.give.other",
            MESSAGE = "canary.command.message",
            MESSAGERAW = "canary.command.message.raw",
            PARTICLE = "canary.command.particle",
            PLAYSOUND = "canary.command.playsound",
            PLAYSOUND$OTHER = "canary.command.playsound.other",
            REPLACEITEM = "canary.command.replaceitem",
            SAVE$ALL = "canary.command.save.all",
            SAVE$OFF = "canary.command.save.off",
            SAVE$ON = "canary.command.save.on",
            SCOREBOARD = "canary.command.scoreboard",
            SETBLOCK = "canary.command.setblock",
            SPAWNPOINT = "canary.command.spawnpoint",
            SPAWNPOINT$OTHER = "canary.command.spawnpoint.other",
            SPREADPLAYERS = "canary.command.spreadplayers",
            STATS = "canary.command.stats",
            SUMMON = "canary.command.summon",
            TELEPORT = "canary.command.teleport",
            TELEPORT$OTHER = "canary.command.teleport.other",
            TESTFOR = "canary.command.testfor",
            TESTFORBLOCK = "canary.command.testforblock",
            TESTFORBLOCKS = "canary.command.testforblocks",
            TIME = "canary.command.time",
            TITLE = "canary.command.title",
            TOGGLEDOWNFALL = "canary.command.toggledownfall",
            TRIGGER = "canary.command.trigger",
            WEATHER = "canary.command.weather",
            WORLDBORDER = "canary.command.worldborder",
            XP = "canary.command.xp",
            XP$OTHER = "canary.command.xp.other",
            HOME = "canary.command.home",
            HOME$SET = "canary.command.home.set",
            HOME$OTHER = "canary.command.home.other",
            SPAWN = "canary.command.spawn",
            WARP$LIST = "canary.command.warp.list",
            WARP$REMOVE = "canary.command.warp.remove",
            WARP$SET = "canary.command.warp.set",
            WARP$SET$ADMIN = "canary.command.warp.set.admin",
            WARP$SET$PRIVATE = "canary.command.warp.set.private",
            WARP$SET$GROUP = "canary.command.warp.set.group",
            WARP$USE = "canary.command.warp.use",
            WORLD$CREATE = "canary.command.world.create",
            WORLD$DELETE = "canary.command.world.delete",
            WORLD$LOAD = "canary.commmand.world.load",
            MOB = "canary.command.mob",
            MOB$CLEAR = "canary.command.mob.clear",
            MOB$COUNT = "canary.command.mob.count";
}
