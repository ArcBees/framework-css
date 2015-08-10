package com.arcbees.frameworkcss.client.resources;

import javax.inject.Inject;

public class ResourceLoader {
    @Inject
    ResourceLoader(
            AppResources appResources,
            FormsResources formsResources,
            TablesResources tablesResources,
            BtnsResources btnsResources) {
        appResources.normalize().ensureInjected();
        appResources.style().ensureInjected();
        formsResources.style().ensureInjected();
        btnsResources.style().ensureInjected();
        tablesResources.style().ensureInjected();
    }
}
