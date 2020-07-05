package com.company.contractcreator.web.screens.provider;

import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Provider;

@UiController("contractcreator_Provider.browse")
@UiDescriptor("provider-browse.xml")
@LookupComponent("providersTable")
@LoadDataBeforeShow
public class ProviderBrowse extends StandardLookup<Provider> {
}