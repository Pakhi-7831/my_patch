///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2024 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.google.checkstyle.test.chapter4formatting.rule412nonemptyblocks;

import org.junit.jupiter.api.Test;

import com.google.checkstyle.test.base.AbstractGoogleModuleTestSupport;

public class NonemptyBlocksKrStyleTest extends AbstractGoogleModuleTestSupport {

    @Override
    protected String getPackageLocation() {
        return "com/google/checkstyle/test/chapter4formatting/rule412nonemptyblocks";
    }

    @Test
    public void testLeftAndRightCurlyBraces() throws Exception {
        verifyWithWholeConfig(getPath("InputNonemptyBlocksLeftRightCurly.java"));
    }

    @Test
    public void testLeftCurlyAnnotations() throws Exception {
        verifyWithWholeConfig(getPath("InputLeftCurlyAnnotations.java"));
    }

    @Test
    public void testLeftCurlyMethods() throws Exception {
        verifyWithWholeConfig(getPath("InputLeftCurlyMethod.java"));
    }

    @Test
    public void testRightCurly() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurly.java"));
    }

    @Test
    public void testRightCurlyLiteralDoDefault() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurlyDoWhile.java"));
    }

    @Test
    public void testRightCurlyOther() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurlyOther.java"));
    }

    @Test
    public void testRightCurlyLiteralDo() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurlyDoWhile2.java"));
    }

    @Test
    public void testRightCurlySwitch() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurlySwitchCase.java"));
    }

    @Test
    public void testRightCurlySwitchCases() throws Exception {
        verifyWithWholeConfig(getPath("InputRightCurlySwitchCasesBlocks.java"));
    }

}
