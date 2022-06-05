package com.northeastern.jsontool;


import com.northeastern.jsontool.parser.Parser;
import com.northeastern.jsontool.tokenizer.CharReader;
import com.northeastern.jsontool.tokenizer.TokenList;
import com.northeastern.jsontool.tokenizer.Tokenizer;

import java.io.IOException;
import java.io.StringReader;

public class JSONParser {

    private Tokenizer tokenizer = new Tokenizer();

    private Parser parser = new Parser();

    public Object fromJSON(String json) throws IOException {
        CharReader charReader = new CharReader(new StringReader(json));
        TokenList tokens = tokenizer.tokenize(charReader);
        return parser.parse(tokens);
    }
}
