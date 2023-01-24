package io.github.deopoler.sample.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object PlayerJoinListener: Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        e.joinMessage = "Welcome To My Server!"
    }
}