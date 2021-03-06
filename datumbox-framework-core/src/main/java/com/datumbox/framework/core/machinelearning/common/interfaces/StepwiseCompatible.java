/**
 * Copyright (C) 2013-2019 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.framework.core.machinelearning.common.interfaces;

import java.util.Map;

/**
 * Stepwise regression requires the estimation of p-values for each parameter. 
 * The regression models that support this estimation is marked with this interface.
 * 
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public interface StepwiseCompatible {
    
    /**
     * Getter for the p-values of the Features.
     * 
     * @return 
     */
    public Map<Object, Double> getFeaturePvalues();
}
