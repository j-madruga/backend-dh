package com.jmadruga.models;

public class Tree {
    private Integer height;
    private Integer wide;
    private String color;
    private String treeType;

    public Tree(Integer height, Integer wide, String color, String treeType) {
        this.height = height;
        this.wide = wide;
        this.color = color;
        this.treeType = treeType;
    }

    public String getTreeType() {
        return treeType;
    }
}
