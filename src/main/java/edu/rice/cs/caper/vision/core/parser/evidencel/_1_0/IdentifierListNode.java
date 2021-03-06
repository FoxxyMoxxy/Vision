/*
Copyright 2017 Rice University

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
package edu.rice.cs.caper.vision.core.parser.evidencel._1_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Models the identifier-list non-terminal.
 *
 * See doc/internal/evidencel_language/1_0/evidencel_language_1_0_grammar.txt
 */
public interface IdentifierListNode
{
    /**
     * @return the elements of the list
     */
    List<IdentifierNode> getIdentifiers();

    /**
     * Creates an IdentifierListNode with the given type identifier and ident list.
     *
     * @param idents the identifiers of the list
     * @return a new IdentifierListNode instance
     */
    static IdentifierListNode make(ArrayList<IdentifierNode> idents)
    {
        //noinspection Convert2Lambda reduces readability
        return new IdentifierListNode()
        {
            @Override
            public List<IdentifierNode> getIdentifiers()
            {
                return Collections.unmodifiableList(idents);
            }
        };
    }
}
