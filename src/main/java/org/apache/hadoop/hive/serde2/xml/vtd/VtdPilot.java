/**
 * Copyright (C) 2013 by Dmitry Vasilenko. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package org.apache.hadoop.hive.serde2.xml.vtd;

import com.ximpleware.AutoPilot;
import com.ximpleware.VTDNav;

/**
 * VTD XML pilot
 */
public class VtdPilot extends AutoPilot {

    /**
     * Conversion constructor
     * 
     * @param inVTDNav
     */
    public VtdPilot(VTDNav inVTDNav) {
        super(inVTDNav);
    }

    /**
     * Creates VTD XML pilot
     */
    public VtdPilot() {
    }

    /**
     * Returns VTD XML navigator
     * 
     * @return
     */
    public VTDNav getVTDNav() {
        return this.vn;
    }

}