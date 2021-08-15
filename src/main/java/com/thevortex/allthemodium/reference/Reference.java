package com.thevortex.allthemodium.reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;


public class Reference {

	public static final ResourceLocation ORETYPE = location("forge:ores/allthemodium");
	public static final ResourceLocation ORETYPE2 = location("forge:ores/vibranium");
	public static final ResourceLocation ORETYPE3 = location("forge:ores/unobtainium");
	public static final String MOD_ID = "allthemodium";
	
	public static ResourceLocation location(String pathIn) {
		return new ResourceLocation(pathIn);
	}
	public static ResourceLocation forge(String path) {
		return new ResourceLocation("forge", path);
	}
	public static ResourceLocation ingot(String path) {
		return forge("ingots/" + path);
	}
	public static ResourceLocation dust(String path) {
		return forge("dusts/" + path);
	}
	public static ResourceLocation nugget(String path) {
		return forge("nuggets/" + path);
	}
	public static ResourceLocation ore(String path) {
		return forge("ores/" + path);
	}
	public static ResourceLocation rod(String path) {
		return forge("rods/" + path);
	}
	public static ResourceLocation gear(String path) {
		return forge("gears/" + path);
	}
	public static ResourceLocation plate(String path) {
		return forge("plates/" + path);
	}
	public static ResourceLocation block(String path) {
		return forge("storage_blocks/" + path);
	}

}
