package net.runeduniverse.tools.runes4tools.maven.cpp2gcc;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import net.runeduniverse.tools.runes4tools.maven.runes4maven.lifecycles.builder.mojos.ALinkerMojo;

/**
 * Assembler for GCC
 * @author Pl4yingNight
 *
 * @phase builder-linker
 * @goal link
 */
public class LinkerMojo extends ALinkerMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("cpp2gcc:link");
	}

}
