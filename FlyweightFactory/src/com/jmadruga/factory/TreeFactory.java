package com.jmadruga.factory;

import com.jmadruga.models.OrnamentalTree;
import com.jmadruga.models.RedFruitTree;
import com.jmadruga.models.Tree;
import com.jmadruga.models.TurquoiseFruitTree;

public class TreeFactory {
    // Tree codes to feed the constructor
    public final String ORNAMENTAL = "ornamental";
    public final String RED_FRUIT_TREE = "red";
    public final String TURQUOISE_FRUIT_TREE = "turquoise";
    // instances of diferent trees
    private Tree ornamentalTree;
    private Tree redFruitTree;
    private Tree turquoiseFruitTree;

    // private constructor
    public TreeFactory() {
    }

    public Tree createTree(String codeOfTreeToInstance){
        Tree treeToReturn = null;
        if(ORNAMENTAL.equalsIgnoreCase(codeOfTreeToInstance)){
            if(ornamentalTree == null){
                treeToReturn = new OrnamentalTree();
                ornamentalTree = treeToReturn;
                System.out.println("Creando arbol ornamental nuevo.");
                return treeToReturn;
            }
            return ornamentalTree;
        }
        if(RED_FRUIT_TREE.equalsIgnoreCase(codeOfTreeToInstance)){
            if(redFruitTree == null){
                treeToReturn = new RedFruitTree();
                redFruitTree = treeToReturn;
                System.out.println("Creando arbol frutal rojo nuevo.");
                return treeToReturn;
            }
            return redFruitTree;
        }
        if(TURQUOISE_FRUIT_TREE.equalsIgnoreCase(codeOfTreeToInstance)){
            if(turquoiseFruitTree == null){
                treeToReturn = new TurquoiseFruitTree();
                turquoiseFruitTree = treeToReturn;
                System.out.println("Creando arbol frutal turquesa nuevo.");
                return treeToReturn;
            }
            return turquoiseFruitTree;
        }
        return treeToReturn;
    }

}
