package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static List<a> dmY = new LinkedList();
  private static Map<String, a> dmZ = new HashMap();
  
  public static Object a(String paramString, Parcel paramParcel)
  {
    paramString = fH(paramString);
    if (paramString != null) {
      return paramString.e(paramParcel);
    }
    return null;
  }
  
  public static void a(a parama)
  {
    if ((parama == null) || (dmY.contains(parama))) {
      return;
    }
    dmZ.put(parama.getClass().getName(), parama);
    dmY.add(parama);
  }
  
  public static void a(Object paramObject, Parcel paramParcel)
  {
    a locala = ax(paramObject);
    if (locala != null) {
      locala.a(paramObject, paramParcel);
    }
  }
  
  public static a ax(Object paramObject)
  {
    Iterator localIterator = dmY.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.aw(paramObject)) {
        return locala;
      }
    }
    return null;
  }
  
  public static a fH(String paramString)
  {
    return (a)dmZ.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */