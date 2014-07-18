package io.github.qhenckel.skyBlock;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class SBWorldGenerator  extends ChunkGenerator{

	//This is where you stick your populators - these will be covered in another tutorial
//    @Override
//    public List<BlockPopulator> getDefaultPopulators(World world) {
//        return Arrays.asList((BlockPopulator) new BlockPopulator());
//    }
    
    //This needs to be set to return true to override minecraft's default behaviour
    @Override
    public boolean canSpawn(World world, int x, int z) {
        return true;
    }
   
    //This converts relative chunk locations to bytes that can be written to the chunk
    public int xyzToByte(int x, int y, int z) {
    	return (x * 16 + z) * 128 + y;
    }

    @Override
    public byte[] generate(World world, Random rand, int chunkx, int chunkz) {
    	byte[] result = new byte[32768];
	   // int y = 0;
	    //This will set the floor of each chunk at bedrock level to bedrock
//	    for(int x=0; x<16; x++){
//		    for(int z=0; z<16; z++) {
//		    	result[xyzToByte(x,y,z)] = (byte) Material.BEDROCK.getId();
//		    }
//	    }
	    return result;
    }
}
