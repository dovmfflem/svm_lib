package com.dovm.svm_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;

import libsvm.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = getFilesDir();
        String fs = file.toString();
        System.out.println(fs);
        
        svm_train t = new svm_train();

        String[] argv = {fs+"/sonar_scale.txt", fs+"/result.model"};

        System.out.println(argv[0]);
        try {
            t.run(argv);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
