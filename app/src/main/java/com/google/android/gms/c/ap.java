package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ap
  extends af<ap>
{
  public String aYS;
  public int aYT;
  private int aYU;
  private String aYV;
  public String aYW;
  private boolean aYX;
  private boolean aYY;
  private boolean aYZ;
  
  public ap()
  {
    this((byte)0);
  }
  
  private ap(byte paramByte) {}
  
  private ap(int paramInt)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Given Integer is zero");
    }
    this.aYT = paramInt;
    this.aYY = false;
  }
  
  private void qq()
  {
    if (this.aYZ) {
      throw new IllegalStateException("ScreenViewInfo is immutable");
    }
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", this.aYS);
    localHashMap.put("interstitial", Boolean.valueOf(this.aYX));
    localHashMap.put("automatic", Boolean.valueOf(this.aYY));
    localHashMap.put("screenId", Integer.valueOf(this.aYT));
    localHashMap.put("referrerScreenId", Integer.valueOf(this.aYU));
    localHashMap.put("referrerScreenName", this.aYV);
    localHashMap.put("referrerUri", this.aYW);
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/c/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */