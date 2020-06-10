package com.github.alexthe666.iceandfire.message;

import com.github.alexthe666.iceandfire.ClientProxy;
import io.netty.buffer.ByteBuf;
import net.ilexiconn.llibrary.server.network.AbstractMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;

public class MessageSetMyrmexHiveNull extends AbstractMessage<MessageSetMyrmexHiveNull> {

    public MessageSetMyrmexHiveNull() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void onClientReceived(Minecraft client, MessageSetMyrmexHiveNull message, PlayerEntity player, MessageContext messageContext) {
        ClientProxy.setReferedClientHive(null);
    }

    @Override
    public void onServerReceived(MinecraftServer server, MessageSetMyrmexHiveNull message, PlayerEntity player, MessageContext messageContext) {

    }
}