package net.runeduniverse.tools.runes4tools.maven.cpp2gcc;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import net.runeduniverse.tools.runes4tools.maven.r4m.lifecycles.builder.mojos.AAssemblerMojo;

/**
 * Assembler for GCC
 * @author Pl4yingNight
 *
 * @phase builder-assembler
 * @goal assemble
 */
public class AssemblerMojo extends AAssemblerMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("cpp2gcc:assemble");
	}

}
