package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public class f
  extends o
{
  private static String aFj = "3";
  private static String aFk = "01VDIWEA?";
  private static f aFl;
  
  public f(q paramq)
  {
    super(paramq);
  }
  
  private static String ab(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Integer)) {
      paramObject = new Long(((Integer)paramObject).intValue());
    }
    for (;;)
    {
      if ((paramObject instanceof Long))
      {
        if (Math.abs(((Long)paramObject).longValue()) < 100L) {
          return String.valueOf(paramObject);
        }
        if (String.valueOf(paramObject).charAt(0) == '-') {}
        for (String str = "-";; str = "")
        {
          paramObject = String.valueOf(Math.abs(((Long)paramObject).longValue()));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length() - 1)));
          localStringBuilder.append("...");
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length()) - 1.0D));
          return localStringBuilder.toString();
        }
      }
      if ((paramObject instanceof Boolean)) {
        return String.valueOf(paramObject);
      }
      if ((paramObject instanceof Throwable)) {
        return paramObject.getClass().getCanonicalName();
      }
      return "-";
    }
  }
  
  private void b(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    for (;;)
    {
      try
      {
        w.ah(paramString);
        if (paramInt >= 0) {
          break label402;
        }
        paramInt = 0;
        if (paramInt < aFk.length()) {
          break label399;
        }
        paramInt = aFk.length() - 1;
        label32:
        if (this.aFn.aFV.nT()) {
          if (com.google.android.gms.common.internal.f.aNr)
          {
            c = 'P';
            paramObject1 = aFj + aFk.charAt(paramInt) + c + p.VERSION + ":" + a(paramString, ab(paramObject1), ab(paramObject2), ab(paramObject3));
            paramString = (String)paramObject1;
            if (((String)paramObject1).length() > 1024) {
              paramString = ((String)paramObject1).substring(0, 1024);
            }
            paramObject1 = this.aFn;
            if (((q)paramObject1).aGb == null) {
              break label405;
            }
            if (((q)paramObject1).aGb.isInitialized()) {
              continue;
            }
            break label405;
            label165:
            if (paramObject1 != null)
            {
              paramObject1 = ((i)paramObject1).aFz;
              if (((i.a)paramObject1).mX() != 0L) {
                break label410;
              }
              ((i.a)paramObject1).mW();
              break label410;
            }
          }
        }
        try
        {
          label190:
          long l = ((i.a)paramObject1).aFB.aFw.getLong(((i.a)paramObject1).mZ(), 0L);
          if (l <= 0L)
          {
            paramObject2 = ((i.a)paramObject1).aFB.aFw.edit();
            ((SharedPreferences.Editor)paramObject2).putString(((i.a)paramObject1).na(), paramString);
            ((SharedPreferences.Editor)paramObject2).putLong(((i.a)paramObject1).mZ(), 1L);
            ((SharedPreferences.Editor)paramObject2).apply();
            return;
            c = 'C';
            continue;
            if (!com.google.android.gms.common.internal.f.aNr) {
              break label420;
            }
            c = 'p';
            continue;
            paramObject1 = ((q)paramObject1).aGb;
            continue;
          }
          if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (1L + l))
          {
            paramInt = 1;
            paramObject2 = ((i.a)paramObject1).aFB.aFw.edit();
            if (paramInt != 0) {
              ((SharedPreferences.Editor)paramObject2).putString(((i.a)paramObject1).na(), paramString);
            }
            ((SharedPreferences.Editor)paramObject2).putLong(((i.a)paramObject1).mZ(), l + 1L);
            ((SharedPreferences.Editor)paramObject2).apply();
            continue;
            paramString = finally;
          }
        }
        finally {}
        paramInt = 0;
      }
      finally {}
      continue;
      label399:
      label402:
      label405:
      label410:
      do
      {
        break label190;
        break label32;
        break;
        paramObject1 = null;
        break label165;
      } while (paramString != null);
      paramString = "";
      continue;
      label420:
      char c = 'c';
    }
  }
  
  public static f mM()
  {
    return aFl;
  }
  
  public final void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str = (String)aj.aHt.get();
    if (Log.isLoggable(str, paramInt)) {
      Log.println(paramInt, str, a(paramString, paramObject1, paramObject2, paramObject3));
    }
    if (paramInt >= 5) {
      b(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public final void a(c paramc, String paramString)
  {
    if (paramc != null) {}
    for (paramc = paramc.toString();; paramc = "no hit data")
    {
      f("Discarding hit. " + paramString, paramc);
      return;
    }
  }
  
  public final void b(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder;
    if (paramMap != null)
    {
      localStringBuilder = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(',');
        }
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append((String)localEntry.getValue());
      }
    }
    for (paramMap = localStringBuilder.toString();; paramMap = "no hit data")
    {
      f("Discarding hit. " + paramString, paramMap);
      return;
    }
  }
  
  protected final void mE()
  {
    try
    {
      aFl = this;
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/analytics/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */