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

public class CompareSubscriber implements ExtensionPoint {
	
	public Change compare(Launcher launcher, TaskListener listener, MercurialTagAction baseline, PrintStream output, Node node, FilePath repository, AbstractProject<?,?> project) 
			throws IOException, InterruptedException {
		return Change.NONE;
	}
	
	public static ExtensionList<CompareSubscriber> all() {
        return Hudson.getInstance().getExtensionList(CompareSubscriber.class);
    }
	
}
