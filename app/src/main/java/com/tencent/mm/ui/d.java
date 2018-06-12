package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

public final class d
{
  private static a thj;
  private static HashMap<Integer, Long> thk = new HashMap();
  private static int thl = 1100;
  private static int thm = 2000;
  private static long thn = 0L;
  
  private static String ZQ(String paramString)
  {
    paramString = paramString.split("\\.");
    if (paramString.length > 0) {
      return paramString[(paramString.length - 1)];
    }
    return "";
  }
  
  public static void a(a parama)
  {
    thj = parama;
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean, Intent[] paramArrayOfIntent, Object... paramVarArgs)
  {
    label438:
    for (;;)
    {
      try
      {
        int j = paramArrayOfIntent.length;
        int i = 0;
        if (i < j)
        {
          boolean bool = ar(paramArrayOfIntent[i]);
          if (bool)
          {
            paramBoolean = false;
            return paramBoolean;
          }
          i += 1;
        }
        else
        {
          long l = System.currentTimeMillis();
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append(paramContext.toString()).append(",");
          j = paramArrayOfIntent.length;
          i = 0;
          if (i < j)
          {
            ((StringBuilder)localObject).append(paramArrayOfIntent[i]);
            ((StringBuilder)localObject).append(",");
            i += 1;
          }
          else
          {
            j = paramVarArgs.length;
            i = 0;
            if (i < j)
            {
              ((StringBuilder)localObject).append(paramVarArgs[i]);
              ((StringBuilder)localObject).append(",");
              i += 1;
            }
            else
            {
              paramVarArgs = ((StringBuilder)localObject).toString();
              localObject = Integer.valueOf(paramVarArgs.hashCode());
              Long localLong1 = (Long)thk.get(localObject);
              Long localLong2 = Long.valueOf(System.currentTimeMillis());
              if ((paramBoolean) && (localLong1 != null))
              {
                if (localLong2.longValue() - localLong1.longValue() <= thm)
                {
                  String str = ZQ(paramContext.getClass().toString());
                  if (paramArrayOfIntent[0].getComponent() == null) {
                    break label438;
                  }
                  paramContext = ZQ(paramArrayOfIntent[0].getComponent().getClassName());
                  thj.b(localLong2.longValue() - localLong1.longValue(), str, paramContext);
                }
                if (localLong2.longValue() - localLong1.longValue() <= thl)
                {
                  thk.put(localObject, localLong2);
                  x.e("MicroMsg.CheckReduplicatedAcitiv", "starting the same activity in %sms, [k:%s, v:%s], curr: %s", new Object[] { Integer.valueOf(thl), paramVarArgs, localLong1, localLong2 });
                  paramBoolean = true;
                  continue;
                }
              }
              if ((thk.size() > 100) && (thn != 0L) && (System.currentTimeMillis() - thn > thl)) {
                thk.clear();
              }
              thk.put(localObject, localLong2);
              thn = System.currentTimeMillis();
              x.i("MicroMsg.CheckReduplicatedAcitiv", "check reduplicated cost %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
              paramBoolean = false;
              continue;
              paramContext = "None";
            }
          }
        }
      }
      finally {}
    }
  }
  
  private static boolean ar(Intent paramIntent)
  {
    boolean bool = true;
    if (paramIntent != null) {
      try
      {
        if ((paramIntent.getComponent() != null) && (!bi.oW(paramIntent.getComponent().getClassName())))
        {
          paramIntent = Class.forName(paramIntent.getComponent().getClassName()).getAnnotation(b.class);
          if (paramIntent != null) {
            return bool;
          }
          return false;
        }
      }
      catch (Exception paramIntent)
      {
        x.e("MicroMsg.CheckReduplicatedAcitiv", "skipReduplicateCheck exception %s", new Object[] { paramIntent });
        return false;
      }
    }
    bool = false;
    return bool;
  }
  
  public static int coR()
  {
    return thl;
  }
  
  public static abstract interface a
  {
    public abstract void b(long paramLong, String paramString1, String paramString2);
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface b {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */