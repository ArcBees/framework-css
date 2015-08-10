package com.arcbees.frameworkcss.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface AppResources extends ClientBundle {
    interface Normalize extends CssResource {
    }

    interface Style extends CssResource {
        String clearfix();

        String wrapper();
    }

    @Source({"theme/theme.gss", "css/normalize.gss"})
    Normalize normalize();

    @Source({"theme/theme.gss", "css/base.gss", "css/style.gss"})
    Style style();
}
