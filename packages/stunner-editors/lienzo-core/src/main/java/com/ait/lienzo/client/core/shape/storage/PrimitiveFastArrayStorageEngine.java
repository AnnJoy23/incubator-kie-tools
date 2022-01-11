/*
   Copyright (c) 2017 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.client.core.shape.storage;

import com.ait.lienzo.client.core.shape.IPrimitive;

public class PrimitiveFastArrayStorageEngine extends AbstractFastArrayStorageEngine<IPrimitive<?>> {

    public PrimitiveFastArrayStorageEngine() {
        super(StorageEngineType.PRIMITIVE_FAST_ARRAY_STORAGE_ENGINE);
    }

    protected PrimitiveFastArrayStorageEngine(final Object node) {
        super(StorageEngineType.PRIMITIVE_FAST_ARRAY_STORAGE_ENGINE, node);
    }
}
