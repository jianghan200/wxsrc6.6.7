package com.tencent.smtt.export.external.jscore.interfaces;

import android.os.Looper;

public abstract interface IX5JsVirtualMachine
{
  public abstract IX5JsContext createJsContext();
  
  public abstract void destroy();
  
  public abstract Looper getLooper();
  
  public abstract void onPause();
  
  public abstract void onResume();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/export/external/jscore/interfaces/IX5JsVirtualMachine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */