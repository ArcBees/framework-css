package com.arcbees.frameworkcss.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface FormsResources extends ClientBundle {

    interface Style extends CssResource {
        String inputRadio();

        String inputCheckbox();

        String input();

        String inputIcon();

        String inputIcon_icon();

        String inputLabeled();

        String inputLabeled_label();

        String input__error();

        String inputRequired();

        String inputRequired_required();

        String required();

        String field();

        String inlineFields();

        String inlineFields__even();

        String name();

    }

    @Source({"theme/theme.gss", "css/forms.gss"})
    Style style();
}
