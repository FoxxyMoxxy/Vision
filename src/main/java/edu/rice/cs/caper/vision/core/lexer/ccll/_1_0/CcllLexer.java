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
package edu.rice.cs.caper.vision.core.lexer.ccll._1_0;

import edu.rice.cs.caper.vision.core.lexer.UnexpectedEndOfCharacters;

import java.util.Iterator;

/**
 * A lexer for version 1.0 of the Coarse C-Like Language.
 */
public interface CcllLexer
{
    /**
     * Lexes the given character sequence into tokens.
     */
    Iterable<Token> lex(Iterable<Character> chars) throws UnexpectedEndOfCharacters;

    /**
     * Lexes the given character sequence into tokens.
     */
    default Iterable<Token> lex(CharSequence sequence) throws UnexpectedEndOfCharacters
    {
        Iterable<Character> iterable = () -> new Iterator<Character>()
        {
            int _i = 0;

            @Override
            public boolean hasNext()
            {
                return _i < sequence.length();
            }

            @Override
            public Character next()
            {
                return sequence.charAt(_i++);
            }
        };

        return lex(iterable);
    }


    /**
     * @return a new CcllLexer instance.
     */
    static CcllLexer makeDefault()
    {
        return new CcllLexerDefault();
    }
}