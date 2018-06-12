package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class h
  extends af<h>
{
  public String aGl;
  public String aWn;
  public String aWo;
  public String aWp;
  public boolean aWq;
  public String aWr;
  public boolean aWs;
  public double aWt;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", this.aWn);
    localHashMap.put("clientId", this.aGl);
    localHashMap.put("userId", this.aWo);
    localHashMap.put("androidAdId", this.aWp);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(this.aWq));
    localHashMap.put("sessionControl", this.aWr);
    localHashMap.put("nonInteraction", Boolean.valueOf(this.aWs));
    localHashMap.put("sampleRate", Double.valueOf(this.aWt));
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */