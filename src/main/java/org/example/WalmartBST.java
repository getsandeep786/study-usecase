package org.example;

public class WalmartBST {

    public static WalmartBST walmartBSTObj;

    private WalmartBST() {

    }
    synchronized public static WalmartBST getObjReference() {
        if (walmartBSTObj == null) {
            walmartBSTObj = new WalmartBST();
        }
        return walmartBSTObj;
    }
}
