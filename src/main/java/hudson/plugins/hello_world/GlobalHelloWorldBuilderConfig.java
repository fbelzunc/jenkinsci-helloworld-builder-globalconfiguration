package hudson.plugins.hello_world;

import hudson.Extension;
import jenkins.model.GlobalConfiguration;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

/**
 * Created by Felix on 26/04/15.
 */

@Extension
public class GlobalHelloWorldBuilderConfig extends GlobalConfiguration {

    private boolean useFrench;

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        req.bindJSON(this, json);
        return true;
    }

    public boolean isUseFrench() {
        return useFrench;
    }

    public void setUseFrench(boolean useFrench) {
        this.useFrench = useFrench;
    }
}
