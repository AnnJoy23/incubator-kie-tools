/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.widgets.client.popups.list;

import org.uberfire.commons.Pair;

import javax.inject.Inject;
import java.util.List;

public class FormListPopup
        implements FormListPopupView.Presenter {

    private PopupItemSelectedCommand command;

    protected final FormListPopupView view;

    @Inject
    public FormListPopup( final FormListPopupView view ) {
        this.view = view;
        view.setPresenter( this );
    }

    public void show( final List<Pair<String, String>> items,
                      final PopupItemSelectedCommand command ) {
        this.command = command;
        view.setItems( items );
        view.show();
    }

    @Override
    public void onOk() {
        final Pair<String, String> selectedItem = view.getSelectedItem();
        if ( selectedItem != null && !selectedItem.getK1().isEmpty() ) {
            command.setSelectedItem( selectedItem );
        } else {
            view.showFieldEmptyWarning();
        }
    }

}
