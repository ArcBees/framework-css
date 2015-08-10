package com.arcbees.frameworkcss.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface BtnsResources extends ClientBundle {

    interface Style extends CssResource {
        String btn();

        String btn__small();

        String btn__large();

        String btn__primary();

        String btn__secondary();

        String btn__alert();

        String btn__disabled();

        String btn__wide();

        String btn_content();

        String btns();

        String btns__round();

        String btn__outline();
    }

    @Source({"theme/theme.gss", "css/btns.gss"})
    Style style();
}
