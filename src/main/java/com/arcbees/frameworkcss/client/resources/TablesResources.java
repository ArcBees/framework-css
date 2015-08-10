package com.arcbees.frameworkcss.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface TablesResources extends ClientBundle {

    interface Style extends CssResource {
        String table__column();

        String table__striped();

        String table__bordered();

        String table__sqeezed();

        String table__responsive();

        String tbl();

        String tbl__colored();

        String tbl__separate();

        String table__hover();

        String is_disabled();

        String is_error();

        String tbls();
    }

    @Source({"theme/theme.gss", "css/tables.gss"})
    Style style();
}
