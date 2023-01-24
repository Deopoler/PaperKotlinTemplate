package io.github.deopoler.sample.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Check: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            sender.sendMessage("Player Check")
        } else {
            sender.sendMessage("Console or Command Block Check")
        }
        return true
    }
}