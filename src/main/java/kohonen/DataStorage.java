package kohonen;

import kohonen.model.Input;
import kohonen.model.TwoDimensionalVector;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    public static final List<Input> EPOCH = new ArrayList<>();

    static {
        final Input JAPANESE_D_CLASS = new Input();
        final Input GERMANY_B_CLASS = new Input();
        final Input AMERICAN_A_CLASS = new Input();
        final Input EUROPEAN_D_CLASS = new Input();
        // 5-10
        AMERICAN_A_CLASS.setLabel("AMERICAN_A_CLASS");
        // 11-13
        GERMANY_B_CLASS.setLabel("GERMANY_B_CLASS");
        // 15-19
        JAPANESE_D_CLASS.setLabel("JAPANESE_C_CLASS");
        // 20-30
        EUROPEAN_D_CLASS.setLabel("EUROPEAN_D_CLASS");

        TwoDimensionalVector japVec1 = new TwoDimensionalVector(15., 16);
        TwoDimensionalVector japVec2 = new TwoDimensionalVector(15, 17);
        TwoDimensionalVector japVec3 = new TwoDimensionalVector(15, 18);
        TwoDimensionalVector japVec4 = new TwoDimensionalVector(15, 19);
        TwoDimensionalVector japVec5 = new TwoDimensionalVector(15.76, 17.99);
        TwoDimensionalVector japVec6 = new TwoDimensionalVector(15.33, 15.76);
        TwoDimensionalVector japVec7 = new TwoDimensionalVector(15.87, 16.87);
        TwoDimensionalVector japVec8 = new TwoDimensionalVector(15.98, 19.33);
        TwoDimensionalVector japVec9 = new TwoDimensionalVector(15.56, 18.53);
        TwoDimensionalVector japVec10 = new TwoDimensionalVector(15.25, 18.34);

        TwoDimensionalVector gemVec1 = new TwoDimensionalVector(11, 12);
        TwoDimensionalVector gemVec2 = new TwoDimensionalVector(11, 13);
        TwoDimensionalVector gemVec3 = new TwoDimensionalVector(11.223, 11.98);
        TwoDimensionalVector gemVec4 = new TwoDimensionalVector(11.432, 12.434);
        TwoDimensionalVector gemVec5 = new TwoDimensionalVector(11.44, 12.98);
        TwoDimensionalVector gemVec6 = new TwoDimensionalVector(11.55, 12.33);
        TwoDimensionalVector gemVec7 = new TwoDimensionalVector(11.51, 12.89);
        TwoDimensionalVector gemVec8 = new TwoDimensionalVector(11.98, 13);
        TwoDimensionalVector gemVec9 = new TwoDimensionalVector(12.32, 12.98);
        TwoDimensionalVector gemVec10 = new TwoDimensionalVector(12.4, 12.5);

        TwoDimensionalVector euVec1 = new TwoDimensionalVector(21,22);
        TwoDimensionalVector euVec2 = new TwoDimensionalVector(21,29);
        TwoDimensionalVector euVec3 = new TwoDimensionalVector(22, 28);
        TwoDimensionalVector euVec4 = new TwoDimensionalVector(23, 29);
        TwoDimensionalVector euVec5 = new TwoDimensionalVector(20, 30);
        TwoDimensionalVector euVec6 = new TwoDimensionalVector(21, 29);
        TwoDimensionalVector euVec7 = new TwoDimensionalVector(22, 28);
        TwoDimensionalVector euVec8 = new TwoDimensionalVector(23, 27);
        TwoDimensionalVector euVec9 = new TwoDimensionalVector(24, 26);
        TwoDimensionalVector euVec10 = new TwoDimensionalVector(25, 25);

        TwoDimensionalVector ameriVec1 = new TwoDimensionalVector(6, 9);
        TwoDimensionalVector ameriVec2 = new TwoDimensionalVector(5, 10);
        TwoDimensionalVector ameriVec3 = new TwoDimensionalVector(5, 7);
        TwoDimensionalVector ameriVec4 = new TwoDimensionalVector(7, 9);
        TwoDimensionalVector ameriVec5 = new TwoDimensionalVector(7, 10);
        TwoDimensionalVector ameriVec6 = new TwoDimensionalVector(6.3, 8.2);
        TwoDimensionalVector ameriVec7 = new TwoDimensionalVector(7.4, 9.4);
        TwoDimensionalVector ameriVec8 = new TwoDimensionalVector(6.55, 10);
        TwoDimensionalVector ameriVec9 = new TwoDimensionalVector(6.21, 8.22);
        TwoDimensionalVector ameriVec10 = new TwoDimensionalVector(7.82, 10);


        List<TwoDimensionalVector> japVecList = new ArrayList<>();
        japVecList.add(japVec1);
        japVecList.add(japVec2);
        japVecList.add(japVec3);
        japVecList.add(japVec4);
        japVecList.add(japVec5);
        japVecList.add(japVec6);
        japVecList.add(japVec7);
        japVecList.add(japVec8);
        japVecList.add(japVec9);
        japVecList.add(japVec10);

        List<TwoDimensionalVector> gemVecList = new ArrayList<>();
        gemVecList.add(gemVec1);
        gemVecList.add(gemVec2);
        gemVecList.add(gemVec3);
        gemVecList.add(gemVec4);
        gemVecList.add(gemVec5);
        gemVecList.add(gemVec6);
        gemVecList.add(gemVec7);
        gemVecList.add(gemVec8);
        gemVecList.add(gemVec9);
        gemVecList.add(gemVec10);

        List<TwoDimensionalVector> americaVecList = new ArrayList<>();
        americaVecList.add(ameriVec1);
        americaVecList.add(ameriVec2);
        americaVecList.add(ameriVec3);
        americaVecList.add(ameriVec4);
        americaVecList.add(ameriVec5);
        americaVecList.add(ameriVec6);
        americaVecList.add(ameriVec7);
        americaVecList.add(ameriVec8);
        americaVecList.add(ameriVec9);
        americaVecList.add(ameriVec10);

        List<TwoDimensionalVector> euVecList = new ArrayList<>();
        euVecList.add(euVec1);
        euVecList.add(euVec2);
        euVecList.add(euVec3);
        euVecList.add(euVec4);
        euVecList.add(euVec5);
        euVecList.add(euVec6);
        euVecList.add(euVec7);
        euVecList.add(euVec8);
        euVecList.add(euVec9);
        euVecList.add(euVec10);

        JAPANESE_D_CLASS.setVectors(japVecList);
        EUROPEAN_D_CLASS.setVectors(euVecList);
        AMERICAN_A_CLASS.setVectors(americaVecList);
        GERMANY_B_CLASS.setVectors(gemVecList);

        EPOCH.add(JAPANESE_D_CLASS);
        EPOCH.add(EUROPEAN_D_CLASS);
        EPOCH.add(AMERICAN_A_CLASS);
        EPOCH.add(GERMANY_B_CLASS);
    }
}
