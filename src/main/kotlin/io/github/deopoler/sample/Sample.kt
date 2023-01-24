package io.github.deopoler.sample

import io.github.deopoler.sample.commands.Check
import io.github.deopoler.sample.listeners.PlayerJoinListener
import org.bukkit.plugin.java.JavaPlugin

class Sample : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello World!")

        getCommand("check")?.setExecutor(Check)
        server.pluginManager.registerEvents(PlayerJoinListener, this)
    }

    override fun onDisable() {

    }
}