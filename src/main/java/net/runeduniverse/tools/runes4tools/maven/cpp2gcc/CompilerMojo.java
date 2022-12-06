package net.runeduniverse.tools.runes4tools.maven.cpp2gcc;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import net.runeduniverse.tools.runes4tools.maven.runes4maven.lifecycles.builder.mojos.ACompilerMojo;

/**
 * Assembler for GCC
 * @author Pl4yingNight
 *
 * @phase builder-compiler
 * @goal compile
 */
public class CompilerMojo extends ACompilerMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("cpp2gcc:compile");
	}

}
