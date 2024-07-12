package com.timmie.mightyarchitect.gui.widgets;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSimiWidget extends AbstractWidget {

	protected List<Component> toolTip;
	
	public AbstractSimiWidget(int xIn, int yIn, int widthIn, int heightIn) {
		super(xIn, yIn, widthIn, heightIn, new TextComponent(""));
		toolTip = new LinkedList<>();
	}
	
	public List<Component> getToolTip() {
		return toolTip;
	}

	public abstract void renderWidget(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks);
}
