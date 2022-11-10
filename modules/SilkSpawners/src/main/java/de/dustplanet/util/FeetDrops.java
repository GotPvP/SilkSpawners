package de.dustplanet.util;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Bradley Steele
 */
public final class FeetDrops {

    public static void drop(Player player, Block block, ItemStack stack) {
        if (player.hasPermission("feetdrop.disable")) {
            block.getWorld().dropItemNaturally(block.getLocation(), stack);
        } else {
            // drops enabled
            player.getWorld().dropItem(player.getLocation(), stack, (item) -> item.setVelocity(item.getVelocity().zero()));
        }
    }
}
