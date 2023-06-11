/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter31;

import com.turing.javase4thbatch.chapter25.ParentFrame;
import java.io.File;
import java.nio.file.Path;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author macbook
 */
public class TreeFromFolder extends ParentFrame{
    TreeFromFolder()
    {
        super("Folder");
        this.initUI();
    }
    public void initUI()
    {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Folder");
        
        File dir = new File("./src/main/java/com/turing/javase4thbatch/chapter22");
        for(File file : dir.listFiles())
        {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(file.getName());
            root.add(child);
            
            child.add(new DefaultMutableTreeNode("SubChild"));
        }
        JTree tree = new JTree(root);
        add(tree);
    }
    public static void main(String[] args) {
        new TreeFromFolder();
    }
}
