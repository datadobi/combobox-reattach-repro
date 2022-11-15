package com.datadobi.repros.comboboxreattach.views.address;

import com.datadobi.repros.comboboxreattach.data.entity.SampleAddress;
import com.datadobi.repros.comboboxreattach.views.MainLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Address")
@Route(value = "address", layout = MainLayout.class)
public class AddressView extends Div {

    private ComboBox<String> state = new ComboBox<>("State");

    private Binder<SampleAddress> binder = new Binder<>(SampleAddress.class);

    public AddressView() {
        addClassName("address-view");

        add(createTitle());
        add(createFormLayout());

        binder.bindInstanceFields(this);

        clearForm();

    }

    private Component createTitle() {
        return new H3("Address");
    }

    private Component createFormLayout() {
        FormLayout formLayout = new FormLayout();
        state.setItems("State A", "State B", "State C", "State D");
        formLayout.add(state);
        return formLayout;
    }

    private void clearForm() {
        this.binder.setBean(new SampleAddress());
    }
}
