package com.company.contractcreator.web.screens.provider;

import com.company.contractcreator.entity.Contract;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.contractcreator.entity.Provider;

import javax.inject.Inject;

@UiController("contractcreator_Provider.edit")
@UiDescriptor("provider-edit.xml")
@EditedEntityContainer("providerDc")
public class ProviderEdit extends StandardEditor<Provider> {

    @Inject
    private CheckBox personField;
    @Inject
    private TextField<String> fioField;
    @Inject
    private TextField<String> phoneField;
    @Inject
    private TextField<String> emailField;
    @Inject
    private TextField<String> specialtyField;
    @Inject
    private TextField<String> innField;
    @Inject
    private TextField<String> directorField;

    @Inject
    private CollectionLoader<Contract> contractsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        contractsDl.setParameter("provider", getEditedEntity());
        getScreenData().loadAll();
    }


    @Subscribe
    protected void onInit(InitEvent event) {
        personField.addValueChangeListener(e->{
            if (e.getValue()) {
                fioField.setVisible(false);
                fioField.clear();
                phoneField.setVisible(false);
                phoneField.clear();
                emailField.setVisible(false);
                emailField.clear();
                specialtyField.setVisible(false);
                specialtyField.clear();
                innField.setVisible(true);
                directorField.setVisible(true);

            } else {
                fioField.setVisible(true);
                phoneField.setVisible(true);
                emailField.setVisible(true);
                specialtyField.setVisible(true);
                innField.setVisible(false);
                innField.clear();
                directorField.setVisible(false);
                directorField.clear();
            }
        });
    }
}