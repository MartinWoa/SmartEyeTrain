package org.easypr.train;

public class TestTrain {

    public static void main(String[] args) {
        ANNTrain ann = new ANNTrain();
        ann.annMain();       //67行的有错

//        SVMTrain svm = new SVMTrain();
//        svm.svmTrain(true, false);     //java.lang.RuntimeException
    }

}
