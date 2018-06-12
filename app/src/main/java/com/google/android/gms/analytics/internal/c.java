package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  final Map<String, String> aFa;
  final List<Command> aFb;
  final long aFc;
  final long aFd;
  final int aFe;
  final boolean aFf;
  private final String aFg;
  
  public c(n paramn, Map<String, String> paramMap, long paramLong)
  {
    this(paramn, paramMap, paramLong, true, 0L, 0, null);
  }
  
  public c(n paramn, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramn, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public c(n paramn, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List<Command> paramList)
  {
    w.ah(paramn);
    w.ah(paramMap);
    this.aFd = paramLong1;
    this.aFf = paramBoolean;
    this.aFc = paramLong2;
    this.aFe = paramInt;
    if (paramList != null) {}
    Object localObject2;
    for (Object localObject1 = paramList;; localObject1 = Collections.EMPTY_LIST)
    {
      this.aFb = ((List)localObject1);
      this.aFg = r(paramList);
      paramList = new HashMap();
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (aa(((Map.Entry)localObject2).getKey()))
        {
          String str = a(paramn, ((Map.Entry)localObject2).getKey());
          if (str != null) {
            paramList.put(str, b(paramn, ((Map.Entry)localObject2).getValue()));
          }
        }
      }
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      if (!aa(((Map.Entry)localObject1).getKey()))
      {
        localObject2 = a(paramn, ((Map.Entry)localObject1).getKey());
        if (localObject2 != null) {
          paramList.put(localObject2, b(paramn, ((Map.Entry)localObject1).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(this.aFg))
    {
      k.a(paramList, "_v", this.aFg);
      if ((this.aFg.equals("ma4.0.0")) || (this.aFg.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    this.aFa = Collections.unmodifiableMap(paramList);
  }
  
  private static String a(n paramn, Object paramObject)
  {
    if (paramObject == null) {
      paramn = null;
    }
    Object localObject;
    do
    {
      return paramn;
      localObject = paramObject.toString();
      paramObject = localObject;
      if (((String)localObject).startsWith("&")) {
        paramObject = ((String)localObject).substring(1);
      }
      int i = ((String)paramObject).length();
      localObject = paramObject;
      if (i > 256)
      {
        localObject = ((String)paramObject).substring(0, 256);
        paramn.c("Hit param name is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      paramn = (n)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return null;
  }
  
  private static boolean aa(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.toString().startsWith("&");
  }
  
  private static String b(n paramn, Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = "";; paramObject = paramObject.toString())
    {
      int i = ((String)paramObject).length();
      Object localObject = paramObject;
      if (i > 8192)
      {
        localObject = ((String)paramObject).substring(0, 8192);
        paramn.c("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      return (String)localObject;
    }
  }
  
  private static String r(List<Command> paramList)
  {
    Command localCommand;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      do
      {
        if (!paramList.hasNext()) {
          break;
        }
        localCommand = (Command)paramList.next();
      } while (!"appendVersion".equals(localCommand.aEN));
    }
    for (paramList = localCommand.mValue;; paramList = null)
    {
      if (TextUtils.isEmpty(paramList)) {
        return null;
      }
      return paramList;
    }
  }
  
  final String l(String paramString1, String paramString2)
  {
    w.bg(paramString1);
    if (!paramString1.startsWith("&")) {}
    for (boolean bool = true;; bool = false)
    {
      w.e(bool, "Short param name required");
      paramString1 = (String)this.aFa.get(paramString1);
      if (paramString1 == null) {
        break;
      }
      return paramString1;
    }
    return paramString2;
  }
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(this.aFd);
    if (this.aFc != 0L) {
      localStringBuffer.append(", dbId=").append(this.aFc);
    }
    if (this.aFe != 0L) {
      localStringBuffer.append(", appUID=").append(this.aFe);
    }
    Object localObject = new ArrayList(this.aFa.keySet());
    Collections.sort((List)localObject);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuffer.append(", ");
      localStringBuffer.append(str);
      localStringBuffer.append("=");
      localStringBuffer.append((String)this.aFa.get(str));
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */