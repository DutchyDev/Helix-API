package dev.dutchy.helix.api.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActionRequest implements Serializable {

    private static final long serialVersionUID = 2276582175471193011L;

    private String action;
    private List<String> arguments;

    public ActionRequest() { }

    public ActionRequest(String action, List<String> arguments) {
        this.action = action;
        this.arguments = arguments;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "ActionRequest{" +
                "action='" + action + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
