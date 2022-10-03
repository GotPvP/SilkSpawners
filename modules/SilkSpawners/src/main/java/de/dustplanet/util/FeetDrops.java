package de.dustplanet.util;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Bradley Steele
 */
public final class FeetDrops {

    public static void drop(Player player, Block block, ItemStack stack) {
        boolean hasFeetDrops = !player.hasPermission("feetdrop.disable");

        if (hasFeetDrops) {
            drop(player, stack);
        } else {
            block.getWorld().dropItemNaturally(block.getLocation(), stack);
        }
    }

    public static void drop(Player player, ItemStack stack) {
        player.getWorld().dropItem(player.getLocation(), stack, (item) -> item.setVelocity(item.getVelocity().zero()));
    }
}
