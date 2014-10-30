package net.canarymod.commandsys.commands.system.kits;

import net.canarymod.Canary;
import net.canarymod.Translator;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.inventory.Item;
import net.canarymod.chat.ChatFormat;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.chat.ReceiverType;
import net.canarymod.commandsys.NativeCommand;
import net.canarymod.kit.Kit;
import net.canarymod.user.Group;

import java.util.ArrayList;
import java.util.Arrays;

import static net.canarymod.commandsys.CanaryCommandPermissions.KIT$GROUP;
import static net.canarymod.commandsys.CanaryCommandPermissions.KIT$PRIVATE;

/**
 * /kit create
 *
 * @author Jason Jones (darkdiplomat)
 */
public class KitCreate implements NativeCommand {

    @Override
    public void execute(MessageReceiver caller, String[] args) {
        if (caller.getReceiverType().equals(ReceiverType.PLAYER)) {
            if (args.length < 3) {
                caller.notice(Translator.translateAndFormat("usage", "/kit create <name> <use delay> [G|P Groups|Players]") + " - " + Translator.translate("kit from inventory"));
                return;
            }
            Player player = (Player)caller;
            // Default public kit
            if (args.length == 3) {
                Kit newKit = new Kit();

                newKit.setContent(new ArrayList<Item>(Arrays.asList(player.getInventory().getContents())));
                newKit.setDelay(Integer.parseInt(args[2]));
                newKit.setName(args[1]);
                Canary.kits().addKit(newKit);
                player.message(ChatFormat.YELLOW + Translator.translateAndFormat("kit created", args[1]));
                return;
            }

            if (args.length >= 5) {
                // ADD GROUPS KIT
                if (args[3].equalsIgnoreCase("G") && player.hasPermission(KIT$GROUP)) {
                    String[] groups = new String[args.length - 4];

                    for (int i = 0; i < groups.length; i++) {
                        Group g = Canary.usersAndGroups().getGroup(args[i + 4]);

                        if (g != null) {
                            groups[i] = g.getName();
                        }
                        else {
                            groups[i] = Canary.usersAndGroups().getDefaultGroup().getName();
                        }
                    }
                    Kit newKit = new Kit();

                    newKit.setContent(new ArrayList<Item>(Arrays.asList(player.getInventory().getContents())));
                    newKit.setDelay(Integer.parseInt(args[2]));
                    newKit.setName(args[1]);
                    newKit.setGroups(groups);
                    Canary.kits().addKit(newKit);
                    player.message(ChatFormat.YELLOW + Translator.translateAndFormat("kit created group", args[1]));
                    return;
                }
                // ADD PLAYER PRIVATE KIT
                else if (args[3].equalsIgnoreCase("P") && player.hasPermission(KIT$PRIVATE)) {
                    String[] players = new String[args.length - 4];

                    System.arraycopy(args, 4, players, 0, players.length);
                    Kit newKit = new Kit();

                    newKit.setContent(new ArrayList<Item>(Arrays.asList(player.getInventory().getContents())));
                    newKit.setDelay(Integer.parseInt(args[2]));
                    newKit.setName(args[1]);
                    newKit.setOwner(players);
                    Canary.kits().addKit(newKit);
                    player.message(ChatFormat.YELLOW + Translator.translateAndFormat("kit created private", args[1]));
                    return;
                }
                else {
                    player.notice(Translator.translateAndFormat("usage", "/kit create <name> <use delay> [G|P Groups|Players]") + " - " + Translator.translate("kit from inventory"));
                    return;
                }
            }
            player.notice(Translator.translateAndFormat("usage", "/kit create <name> <use delay> [G|P Groups|Players]" + " - " + Translator.translate("kit from inventory")));
        }
        else {
            caller.notice("Cannot run command from Console/CommandBlock");
        }
    }
}
