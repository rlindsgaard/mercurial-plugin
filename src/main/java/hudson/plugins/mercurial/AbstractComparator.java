package hudson.plugins.mercurial;

import java.io.IOException;
import java.io.PrintStream;

import hudson.ExtensionList;
import hudson.ExtensionPoint;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Hudson;
import hudson.model.Node;
import hudson.model.TaskListener;
import hudson.scm.PollingResult.Change;
import hudson.scm.SCM;

public abstract class AbstractComparator implements ExtensionPoint {
	
	public Change compare(SCM scm, Launcher launcher, TaskListener listener, MercurialTagAction baseline, PrintStream output, Node node, FilePath repository, AbstractProject<?,?> project) 
			throws IOException, InterruptedException {
		return Change.NONE;
	}
	
	public static ExtensionList<AbstractComparator> all() {
        return Hudson.getInstance().getExtensionList(AbstractComparator.class);
    }
	
}
