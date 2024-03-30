package com.example.project4;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager
{
    private final String PREF_FILE_NAME="shopping";
    private final int PRIVATE_MODE=0;
    Context context;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    public SessionManager(Context context)
    {
        this.context=context;
        sp=context.getSharedPreferences(PREF_FILE_NAME,PRIVATE_MODE);
        editor =sp.edit();
    }
}
