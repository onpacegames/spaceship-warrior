package com.gamadu.spaceshipwarrior.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

public class ImagePacker {

	public static void run() {
		Settings settings = new Settings();
		settings.paddingX = settings.paddingY = 2;
		settings.stripWhitespaceX = settings.stripWhitespaceY = false;
		settings.minHeight = 1024;
		settings.minWidth = 1024;
		settings.filterMin = Texture.TextureFilter.Linear;
		settings.filterMag = Texture.TextureFilter.Linear;
        TexturePacker2.process(settings, "textures-original", "resources/textures", "pack");
	}
}