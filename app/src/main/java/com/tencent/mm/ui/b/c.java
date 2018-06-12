package com.tencent.mm.ui.b;

import android.app.Activity;
import android.support.v7.view.i;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

public final class c
  extends i
{
  private Activity mActivity;
  
  public c(Window.Callback paramCallback, Activity paramActivity)
  {
    super(paramCallback);
    this.mActivity = paramActivity;
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return this.mActivity.onWindowStartingActionMode(paramCallback);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */