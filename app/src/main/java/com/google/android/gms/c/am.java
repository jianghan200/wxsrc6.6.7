package com.google.android.gms.c;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class am
  extends af<am>
{
  public final List<a> aYK = new ArrayList();
  public final List<c> aYL = new ArrayList();
  public final Map<String, List<a>> aYM = new HashMap();
  public b aYN;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!this.aYK.isEmpty()) {
      localHashMap.put("products", this.aYK);
    }
    if (!this.aYL.isEmpty()) {
      localHashMap.put("promotions", this.aYL);
    }
    if (!this.aYM.isEmpty()) {
      localHashMap.put("impressions", this.aYM);
    }
    localHashMap.put("productAction", this.aYN);
    return ak(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */