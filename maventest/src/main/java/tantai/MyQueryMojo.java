package tantai;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
/**
 *
 */
@Mojo (name = "query")
public class MyQueryMojo extends AbstractMojo {
    /**
     * @param expression="${query.url}"
     */
    private String url;

    /**
     * @param default-value="60"
     */
    private int timeout;

    /**
     * @param
     */
    private String[] options;
    /**
    * @throws MojoExecutionException is MojoExecutionException
    */
    public final void execute() throws MojoExecutionException {
        getLog().info("Hello, world.");
    }
}
