package com.helloworld.example.conf;


import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

public class FreeMarkerConfiguration extends FreeMarkerView {
    public static final String CONTEXT_PATH = "ctx";
    public static final String REQUEST = "request";

    public FreeMarkerConfiguration() {
    }

    protected final void exposeHelpers(Map var1, HttpServletRequest var2) throws Exception {
        var1.put("ctx", var2.getContextPath());
        var1.put("request", var2);
        this.putVariables(var1, var2);
    }

    protected void putVariables(Map var1, HttpServletRequest var2) {
    }
}
