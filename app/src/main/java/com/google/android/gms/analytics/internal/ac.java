package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.Set;

public final class ac
{
  private final q aHe;
  private volatile Boolean aHf;
  private String aHg;
  private Set<Integer> aHh;
  
  protected ac(q paramq)
  {
    w.ah(paramq);
    this.aHe = paramq;
  }
  
  public static boolean nU()
  {
    return ((Boolean)aj.aHs.get()).booleanValue();
  }
  
  public static int nV()
  {
    return ((Integer)aj.aHP.get()).intValue();
  }
  
  public static long nW()
  {
    return ((Long)aj.aHA.get()).longValue();
  }
  
  public static long nX()
  {
    return ((Long)aj.aHD.get()).longValue();
  }
  
  public static int nY()
  {
    return ((Integer)aj.aHF.get()).intValue();
  }
  
  public static int nZ()
  {
    return ((Integer)aj.aHG.get()).intValue();
  }
  
  public static String oa()
  {
    return (String)aj.aHI.get();
  }
  
  public static String ob()
  {
    return (String)aj.aHH.get();
  }
  
  public static String oc()
  {
    return (String)aj.aHJ.get();
  }
  
  public static long oe()
  {
    return ((Long)aj.aHX.get()).longValue();
  }
  
  /* Error */
  public final boolean nT()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   4: ifnonnull +129 -> 133
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   13: ifnonnull +118 -> 131
    //   16: aload_0
    //   17: getfield 26	com/google/android/gms/analytics/internal/ac:aHe	Lcom/google/android/gms/analytics/internal/q;
    //   20: getfield 106	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
    //   23: invokevirtual 112	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 26	com/google/android/gms/analytics/internal/ac:aHe	Lcom/google/android/gms/analytics/internal/q;
    //   31: getfield 106	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
    //   34: invokestatic 117	android/os/Process:myPid	()I
    //   37: invokestatic 123	com/google/android/gms/c/aa:r	(Landroid/content/Context;I)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_3
    //   42: ifnull +30 -> 72
    //   45: aload_3
    //   46: getfield 128	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull +90 -> 141
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +82 -> 141
    //   62: iconst_1
    //   63: istore_1
    //   64: aload_0
    //   65: iload_1
    //   66: invokestatic 136	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: putfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   72: aload_0
    //   73: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   76: ifnull +13 -> 89
    //   79: aload_0
    //   80: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   83: invokevirtual 46	java/lang/Boolean:booleanValue	()Z
    //   86: ifne +19 -> 105
    //   89: ldc -118
    //   91: aload_2
    //   92: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +10 -> 105
    //   98: aload_0
    //   99: getstatic 141	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   102: putfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   105: aload_0
    //   106: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   109: ifnonnull +22 -> 131
    //   112: aload_0
    //   113: getstatic 141	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   116: putfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   119: aload_0
    //   120: getfield 26	com/google/android/gms/analytics/internal/ac:aHe	Lcom/google/android/gms/analytics/internal/q;
    //   123: invokevirtual 145	com/google/android/gms/analytics/internal/q:nr	()Lcom/google/android/gms/analytics/internal/f;
    //   126: ldc -109
    //   128: invokevirtual 153	com/google/android/gms/analytics/internal/f:aS	(Ljava/lang/String;)V
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_0
    //   134: getfield 100	com/google/android/gms/analytics/internal/ac:aHf	Ljava/lang/Boolean;
    //   137: invokevirtual 46	java/lang/Boolean:booleanValue	()Z
    //   140: ireturn
    //   141: iconst_0
    //   142: istore_1
    //   143: goto -79 -> 64
    //   146: astore_2
    //   147: aload_0
    //   148: monitorexit
    //   149: aload_2
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	ac
    //   63	80	1	bool	boolean
    //   40	52	2	str	String
    //   146	4	2	localObject1	Object
    //   26	29	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	41	146	finally
    //   45	50	146	finally
    //   54	62	146	finally
    //   64	72	146	finally
    //   72	89	146	finally
    //   89	105	146	finally
    //   105	131	146	finally
    //   131	133	146	finally
    //   147	149	146	finally
  }
  
  public final Set<Integer> od()
  {
    String str1 = (String)aj.aHS.get();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((this.aHh == null) || (this.aHg == null) || (!this.aHg.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i += 1;
        continue;
        this.aHg = str1;
        this.aHh = localHashSet;
        return this.aHh;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/internal/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */