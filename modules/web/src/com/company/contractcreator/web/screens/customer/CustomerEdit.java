package com.company.contractcreator.web.screens.customer;

import com.company.contractcreator.entity.Contract;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Customer;

import javax.inject.Inject;

@UiController("contractcreator_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private CollectionLoader<Contract> contractsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        contractsDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }


}