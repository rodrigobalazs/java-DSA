package com.rbalazs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreeExamplesTest {

    @Test
    public void visitNaryTreeViaDFS_null(){
        assertEquals(Collections.emptyList(), TreeExamples.visitNaryTreeViaDFS(null));
    }

    @Test
    public void visitNaryTreeViaDFS_singleNode(){
        TreeExamples.Node node1 = new TreeExamples.Node(50);
        assertEquals(List.of(50), TreeExamples.visitNaryTreeViaDFS(node1));
    }

    @Test
    public void visitNaryTreeViaDFS(){

        /*
         * Tree structure used as input =>
         *               100
         *         /   /    \   \
         *       200   300  400  500
         *       |  \
         *      600  700
         */
        TreeExamples.Node rootNode1 = new TreeExamples.Node(100);
        TreeExamples.Node childNode2 = new TreeExamples.Node(200);
        TreeExamples.Node childNode3 = new TreeExamples.Node(300);
        TreeExamples.Node childNode4 = new TreeExamples.Node(400);
        TreeExamples.Node childNode5 = new TreeExamples.Node(500);
        TreeExamples.Node childNode6 = new TreeExamples.Node(600);
        TreeExamples.Node childNode7 = new TreeExamples.Node(700);

        rootNode1.addChild(childNode2);
        rootNode1.addChild(childNode3);
        rootNode1.addChild(childNode4);
        rootNode1.addChild(childNode5);
        childNode2.addChild(childNode6);
        childNode2.addChild(childNode7);

        assertEquals(List.of(100, 200, 600, 700, 300, 400, 500), TreeExamples.visitNaryTreeViaDFS(rootNode1));
    }
}

