/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bookkeeper.mledger;

import com.google.common.annotations.Beta;

/**
 * A Position is a pointer to a specific entry into the managed ledger.
 */
@Beta
public interface Position {
    /**
     * Get the position of the entry next to this one. The returned position might point to a non-existing, or not-yet
     * existing entry
     * 
     * @return the position of the next logical entry
     */
    Position getNext();
}
