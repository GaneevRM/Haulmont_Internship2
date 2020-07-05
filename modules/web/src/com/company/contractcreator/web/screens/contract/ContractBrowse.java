package com.company.contractcreator.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Contract;

@UiController("contractcreator_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}