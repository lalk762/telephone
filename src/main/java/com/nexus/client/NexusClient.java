package com.nexus.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * Minimal safe entrypoint for NEXUS CLIENT.
 *
 * UI, HUD and local-only training features will be added in separate,
 * reviewable steps. No combat automation, anti-cheat bypass, network
 * telemetry, or remote code loading belongs in this project.
 */
public final class NexusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Intentionally minimal until the matching local Fabric toolchain
        // and API versions are available for a verified implementation.
    }
}
