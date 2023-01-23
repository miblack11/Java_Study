package com.object_oriented.abstract_;

public class AA extends Template {

    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 300000000; i++) {
            num += i;
        }
    }
}
