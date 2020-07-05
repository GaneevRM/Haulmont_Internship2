package com.company.contractcreator.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Contract;

@UiController("contractcreator_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
public class ContractEdit extends StandardEditor<Contract> {
}