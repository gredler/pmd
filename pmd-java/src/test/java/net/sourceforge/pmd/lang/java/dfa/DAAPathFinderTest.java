/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.dfa;

import org.junit.Ignore;
import org.junit.Test;

import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.lang.dfa.DataFlowNode;
import net.sourceforge.pmd.lang.dfa.pathfinder.CurrentPath;
import net.sourceforge.pmd.lang.dfa.pathfinder.DAAPathFinder;
import net.sourceforge.pmd.lang.dfa.pathfinder.Executable;
import net.sourceforge.pmd.lang.java.JavaParsingHelper;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.lang.java.symboltable.BaseNonParserTest;

@Ignore
public class DAAPathFinderTest extends BaseNonParserTest implements Executable {

    @Test
    public void testTwoUpdateDefs() {
        ASTMethodDeclarator meth = JavaParsingHelper.WITH_PROCESSING.getNodes(ASTMethodDeclarator.class, TWO_UPDATE_DEFS).get(0);
        DAAPathFinder a = new DAAPathFinder(DataFlowNode.get(meth).getFlow().get(0), new Executable() {
            @Override
            public void execute(CurrentPath path) {

            }
        });
        // a.run();
    }

    public void execute(CurrentPath path) {
    }

    private static final String TWO_UPDATE_DEFS = "class Foo {" + PMD.EOL + " void bar(int x) {" + PMD.EOL
            + "  for (int i=0; i<10; i++, j--) {}" + PMD.EOL + " }" + PMD.EOL + "}";
}
