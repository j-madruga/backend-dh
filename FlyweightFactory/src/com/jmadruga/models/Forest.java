package com.jmadruga.models;

import com.jmadruga.factory.TreeFactory;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    public void plantTrees(){
//        List<Tree> treesToPlant = new ArrayList<>();
        TreeFactory factory = new TreeFactory();
//        treesToPlant.add(ornamentalTree);
//        treesToPlant.add(redFruitTree);
        for (int i = 0; i < 5; i++) {
            Tree ornamentalTree = factory.createTree(factory.ORNAMENTAL);
            System.out.println("Arbol n°"+i+" "+ornamentalTree.getTreeType() + " creado.");
            Tree redFruitTree = factory.createTree(factory.RED_FRUIT_TREE);
            System.out.println("Arbol n°"+i+" "+redFruitTree.getTreeType() + " creado.");
        }
    }

}
