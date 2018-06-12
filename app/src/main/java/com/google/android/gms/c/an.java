package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class an
  extends af<an>
{
  public String aOA;
  public String aYO;
  public long aYP;
  public String pM;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", this.pM);
    localHashMap.put("action", this.aOA);
    localHashMap.put("label", this.aYO);
    localHashMap.put("value", Long.valueOf(this.aYP));
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/c/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */