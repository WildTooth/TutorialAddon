package com.github.wildtooth.tutorial.core.listener;

import net.labymod.api.event.Phase;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;
import com.github.wildtooth.tutorial.core.ExampleAddon;

public class ExampleGameTickListener {

  private final ExampleAddon addon;

  public ExampleGameTickListener(ExampleAddon addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onGameTick(GameTickEvent event) {
    if (event.phase() != Phase.PRE) {
      return;
    }

    this.addon.logger().info(this.addon.configuration().enabled().get() ? "enabled" : "disabled");
  }
}
