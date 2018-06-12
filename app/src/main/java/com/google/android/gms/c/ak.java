package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class ak
  extends af<ak>
{
  public String aEN;
  public String aYA;
  public String aYB;
  public String aYC;
  public String aYD;
  public String aYw;
  public String aYx;
  public String aYy;
  public String aYz;
  public String mName;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", this.mName);
    localHashMap.put("source", this.aYw);
    localHashMap.put("medium", this.aYx);
    localHashMap.put("keyword", this.aYy);
    localHashMap.put("content", this.aYz);
    localHashMap.put("id", this.aEN);
    localHashMap.put("adNetworkId", this.aYA);
    localHashMap.put("gclid", this.aYB);
    localHashMap.put("dclid", this.aYC);
    localHashMap.put("aclid", this.aYD);
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */