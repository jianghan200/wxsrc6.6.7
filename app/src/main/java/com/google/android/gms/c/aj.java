package com.google.android.gms.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class aj
  extends af<aj>
{
  public String aEV;
  public String aEW;
  public String aYu;
  public String aYv;
  
  public final void a(aj paramaj)
  {
    if (!TextUtils.isEmpty(this.aEV)) {
      paramaj.aEV = this.aEV;
    }
    if (!TextUtils.isEmpty(this.aEW)) {
      paramaj.aEW = this.aEW;
    }
    if (!TextUtils.isEmpty(this.aYu)) {
      paramaj.aYu = this.aYu;
    }
    if (!TextUtils.isEmpty(this.aYv)) {
      paramaj.aYv = this.aYv;
    }
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.aEV);
    localHashMap.put("appVersion", this.aEW);
    localHashMap.put("appId", this.aYu);
    localHashMap.put("appInstallerId", this.aYv);
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/c/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */