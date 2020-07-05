package com.company.contractcreator.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Customer;

@UiController("contractcreator_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}