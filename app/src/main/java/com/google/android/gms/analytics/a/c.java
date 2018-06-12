package com.google.android.gms.analytics.a;

import com.google.android.gms.c.af;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  Map<String, String> aEM = new HashMap();
  
  public final Map<String, String> aH(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.aEM.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(paramString + (String)localEntry.getKey(), localEntry.getValue());
    }
    return localHashMap;
  }
  
  public final String toString()
  {
    return af.c(this.aEM);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */