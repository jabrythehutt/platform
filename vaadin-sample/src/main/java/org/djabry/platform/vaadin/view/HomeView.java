/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.djabry.platform.vaadin.view;


import com.vaadin.navigator.ViewChangeListener;
import org.djabry.platform.service.security.annotations.ReadOwn;
import org.vaadin.spring.UIScope;
import org.vaadin.spring.navigator.VaadinView;

/**
 * @author djabry
 */
@UIScope
@VaadinView(name = HomeView.VIEW_NAME)
@ReadOwn
public class HomeView extends BaseMainViewAbstr {
    public static final String VIEW_NAME = "home";


    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }

    @Override
    public void clear() {

    }


}
