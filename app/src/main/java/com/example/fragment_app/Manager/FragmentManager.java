package com.example.fragment_app.Manager;

import com.example.fragment_app.MainActivity;
import com.example.fragment_app.View.Fragment.CommunicationFragment;
import com.example.fragment_app.View.Fragment.Fragment1;
import com.example.fragment_app.View.Fragment.Fragment2;
import com.example.fragment_app.View.Fragment.Fragment3;
import com.example.fragment_app.View.Fragment.Fragment4;
import com.example.fragment_app.View.Fragment.Fragment5;
import com.example.fragment_app.View.Fragment.Fragment6;
import com.example.fragment_app.View.Fragment.Fragment7;
import com.example.fragment_app.View.Fragment.Fragment8;
import com.example.fragment_app.View.Fragment.OtherFragment;

public class FragmentManager {

    MainActivity mainActivity;

    private static OtherFragment otherFragment;

    private static CommunicationFragment communicationFragment;
    private static Fragment1 fragment1;
    private static Fragment2 fragment2;
    private static Fragment3 fragment3;
    private static Fragment4 fragment4;
    private static Fragment5 fragment5;
    private static Fragment6 fragment6;
    private static Fragment7 fragment7;
    private static Fragment8 fragment8;


    public static CommunicationFragment getCommunicationFragment() {
        return communicationFragment;
    }

    public static void setCommunicationFragment(CommunicationFragment communicationFragment) {
        FragmentManager.communicationFragment = communicationFragment;
    }

    public static OtherFragment getOtherFragment() {
        return otherFragment;
    }

    public static void setOtherFragment(OtherFragment otherFragment) {
        FragmentManager.otherFragment = otherFragment;
    }


    public static Fragment1 getFragment1() {
        return fragment1;
    }

    public static void setFragment1(Fragment1 fragment1) {
        FragmentManager.fragment1 = fragment1;
    }

    public static Fragment2 getFragment2() {
        return fragment2;
    }

    public static void setFragment2(Fragment2 fragment2) {
        FragmentManager.fragment2 = fragment2;
    }


    public static Fragment3 getFragment3() {
        return fragment3;
    }

    public static void setFragment3(Fragment3 fragment3) {
        FragmentManager.fragment3 = fragment3;
    }

    public static Fragment4 getFragment4() {
        return fragment4;
    }

    public static void setFragment4(Fragment4 fragment4) {
        FragmentManager.fragment4 = fragment4;
    }

    public static Fragment5 getFragment5() {
        return fragment5;
    }

    public static void setFragment5(Fragment5 fragment5) {
        FragmentManager.fragment5 = fragment5;
    }

    public static Fragment6 getFragment6() {
        return fragment6;
    }

    public static void setFragment6(Fragment6 fragment6) {
        FragmentManager.fragment6 = fragment6;
    }

    public static Fragment7 getFragment7() {
        return fragment7;
    }

    public static void setFragment7(Fragment7 fragment7) {
        FragmentManager.fragment7 = fragment7;
    }

    public static Fragment8 getFragment8() {
        return fragment8;
    }

    public static void setFragment8(Fragment8 fragment8) {
        FragmentManager.fragment8 = fragment8;
    }
}