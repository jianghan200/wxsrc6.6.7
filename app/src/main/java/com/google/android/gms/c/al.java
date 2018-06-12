package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class al
  extends af<al>
{
  public String aYE;
  public int aYF;
  public int aYG;
  public int aYH;
  public int aYI;
  public int aYJ;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", this.aYE);
    localHashMap.put("screenColors", Integer.valueOf(this.aYF));
    localHashMap.put("screenWidth", Integer.valueOf(this.aYG));
    localHashMap.put("screenHeight", Integer.valueOf(this.aYH));
    localHashMap.put("viewportWidth", Integer.valueOf(this.aYI));
    localHashMap.put("viewportHeight", Integer.valueOf(this.aYJ));
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */