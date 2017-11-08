package com.ldb.bin.riderapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Bin on 11/08/2017.
 */

public class BottomSheetRiderFragment extends BottomSheetDialogFragment {
    String mTag;

    public static BottomSheetRiderFragment newInstance(String tag)
    {
        BottomSheetRiderFragment f = new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("TAG",tag);
        f.setArguments(args);
        return f;
    }

    //Press Ctrl + O

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = getArguments().getString("TAG");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_rider,container,false);
//        TextView
        return view;
    }
}
