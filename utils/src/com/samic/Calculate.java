package com.samic;

import com.samic.internal.AddHelper;

public class Calculate {
    private AddHelper addHelper = new AddHelper();
    public int add(int i, int j) {
        return addHelper.add(i,j);
    }
}
