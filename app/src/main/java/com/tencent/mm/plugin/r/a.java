package com.tencent.mm.plugin.r;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract class a
{
  public abstract boolean aZX();
  
  public abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
  
  public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public abstract void onBackPressed();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */