/**
 * Copyright (C) 2006-2018 Talend Inc. - www.talend.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.proxy.test.component;

import static java.util.Collections.emptyList;

import java.io.Serializable;
import java.util.List;

import javax.json.JsonObject;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.input.Assessor;
import org.talend.sdk.component.api.input.Emitter;
import org.talend.sdk.component.api.input.PartitionMapper;
import org.talend.sdk.component.api.input.Producer;
import org.talend.sdk.component.api.input.Split;

@PartitionMapper(name = "TheMapper")
public class TheComponent implements Serializable {

    public TheComponent(@Option("config") final TheTestDataSet config) {
        // no-op
    }

    @Assessor
    public long size() {
        return 0;
    }

    @Split
    public List<TheComponent> split() {
        return emptyList();
    }

    @Emitter
    public TheInput create() {
        return null;
    }

    public static class TheInput {

        @Producer
        public JsonObject next() {
            return null;
        }
    }
}
