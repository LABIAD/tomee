/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openejb.config.sys;

import org.apache.openejb.util.SuperProperties;

import java.util.Properties;

// exactly the PojoConfiguration today
// but let use a different format/info between module tree and config file
public class PojoConfig {
    private final Properties properties = new SuperProperties().caseInsensitive(true);

    public Properties getProperties() {
        return properties;
    }

    public boolean hasProperties() {
        return properties.size() > 0;
    }
}
