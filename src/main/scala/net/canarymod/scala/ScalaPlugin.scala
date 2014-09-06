package net.canarymod.scala

import net.canarymod.Canary
import net.canarymod.hook.{Dispatcher, Hook}
import net.canarymod.plugin.{Priority, PluginListener, Plugin}
import net.canarymod.scala.ScalaHooks._

/**
 * Main class for scala-based plugins.
 * <br/><br/>
 * A standard Scala-based plugin will use the hook method to add hooks in the enable block.
 * @example {{{
import net.canarymod.hook.player.{ChatHook, ConnectionHook}
import net.canarymod.scala.ScalaPlugin

class TestPlugin extends ScalaPlugin {
  override def enable(): Boolean = {
    hook { h: ConnectionHook =>
      h.getPlayer.message("Welcome from scala!")
    }

    hook { h: ChatHook =>
      h.getPlayer.message("You said: " + h.getMessage)
    }
    true
  }

  override def disable(): Unit = {
    println("Scala is dying D:")
  }
}
}}}
 *
 * @author pwootage
 */
abstract class ScalaPlugin extends Plugin {
  private lazy val hookListener = Canary.hooks()

  lazy val priority = Priority.NORMAL

  /**
   * Regester a hook with Canary
   * @param h Scala hook to register
   * @tparam T Type of hook
   */
  def hook[T <: Hook: Manifest](h: ScalaHook[T]): Unit = hookListener.registerHook(
    h,
    this,
    manifest[T].runtimeClass,
    new Dispatcher {
      override def execute(listener: PluginListener, hook: Hook): Unit = h.run(hook.asInstanceOf[T])
    },
    priority
  )

  /**
   * Register a hook with canary
   * @param h Hook method
   * @tparam T Type of hook to register
   */
  def hook[T <: Hook: Manifest](h: T => Unit): Unit = hook(funcToHook(h))
}
