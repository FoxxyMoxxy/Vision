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
package edu.rice.cs.caper.vision.core.dom_driver;

import edu.rice.cs.caper.vision.core.dsl.DSubTree;
import org.eclipse.jdt.core.dom.ReturnStatement;

public class DOMReturnStatement implements Handler {

    final ReturnStatement statement;
    final Visitor visitor;

    public DOMReturnStatement(ReturnStatement statement, Visitor visitor) {
        this.statement = statement;
        this.visitor = visitor;
    }

    @Override
    public DSubTree handle() {
        return new DOMExpression(statement.getExpression(), visitor).handle();
    }
}
