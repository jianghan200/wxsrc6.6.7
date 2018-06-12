package com.tencent.mm.ipcinvoker.d;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class c
{
  private static volatile c dmV;
  Map<String, List<e>> dmW = new ConcurrentHashMap();
  
  public static c Cy()
  {
    if (dmV == null) {}
    try
    {
      if (dmV == null) {
        dmV = new c();
      }
      return dmV;
    }
    finally {}
  }
  
  public final boolean a(String paramString, e parame)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    List localList = (List)this.dmW.get(paramString);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new LinkedList();
      this.dmW.put(paramString, localObject);
    }
    if (((List)localObject).contains(parame)) {
      return false;
    }
    try
    {
      boolean bool = ((List)localObject).add(parame);
      return bool;
    }
    finally {}
  }
  
  public final boolean b(String paramString, e parame)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    List localList = (List)this.dmW.get(paramString);
    if (localList != null) {
      try
      {
        boolean bool = localList.remove(parame);
        if (localList.isEmpty()) {
          this.dmW.remove(paramString);
        }
        return bool;
      }
      finally {}
    }
    return false;
  }
  
  public final boolean c(String paramString, Bundle paramBundle)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    paramString = (List)this.dmW.get(paramString);
    if ((paramString == null) || (paramString.isEmpty())) {
      return true;
    }
    try
    {
      ArrayList localArrayList = new ArrayList(paramString);
      paramString = localArrayList.iterator();
      while (paramString.hasNext()) {
        ((e)paramString.next()).at(paramBundle);
      }
      return true;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ipcinvoker/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */