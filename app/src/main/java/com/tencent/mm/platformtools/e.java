package com.tencent.mm.platformtools;

import android.app.Activity;
import java.util.HashSet;
import java.util.Set;

public abstract class e
  implements com.tencent.mm.ab.e
{
  public Activity activity;
  Set<Integer> evJ = new HashSet();
  
  public e(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public final boolean a(ah paramah)
  {
    if (paramah.action == 0) {
      return false;
    }
    switch (paramah.action)
    {
    case 3: 
    default: 
      return false;
    case 1: 
      return b(paramah);
    case 2: 
      return c(paramah);
    case 4: 
      return d(paramah);
    }
    return e(paramah);
  }
  
  public abstract boolean b(ah paramah);
  
  public abstract boolean c(ah paramah);
  
  public abstract boolean d(ah paramah);
  
  public abstract boolean e(ah paramah);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/platformtools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */