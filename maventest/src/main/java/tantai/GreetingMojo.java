package tantai;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Says "Hi" to the user.
 *
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    /**
    * Says "Hi" to the user.
    * @throws MojoExecutionException is MojoExecutionException
    */
    public final void execute() throws MojoExecutionException {
        getLog().info("Hello, world.");
    }
}
