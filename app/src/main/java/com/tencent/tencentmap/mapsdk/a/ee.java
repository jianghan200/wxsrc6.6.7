package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;
import java.util.HashMap;

public class ee
{
  private boolean a;
  
  public ee(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public static fp a(gd paramgd)
  {
    paramgd = new fv(paramgd);
    try
    {
      paramgd.i();
      return paramgd;
    }
    catch (Exception localException)
    {
      paramgd.b = -2;
      paramgd.c = fz.a(localException);
    }
    return paramgd;
  }
  
  public static String a(String paramString)
  {
    String str = "";
    if (!TextUtils.isEmpty(paramString)) {
      str = paramString.replace('\n', ' ').replace('\r', ' ').replace("|", "%7C").replace("&", "%26").replace("=", "%3D");
    }
    return str;
  }
  
  public static HashMap a(fn paramfn)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("B50", paramfn.d);
    localHashMap.put("B51", a(paramfn.g));
    localHashMap.put("B69", a(paramfn.e));
    localHashMap.put("B52", paramfn.h);
    localHashMap.put("B53", a(paramfn.j));
    localHashMap.put("B54", paramfn.k);
    localHashMap.put("B55", paramfn.m);
    localHashMap.put("B56", paramfn.n);
    if (!TextUtils.isEmpty(paramfn.o)) {
      localHashMap.put("B57", a(paramfn.o));
    }
    if ((!TextUtils.isEmpty(paramfn.p)) && (!paramfn.p.equals("null"))) {
      localHashMap.put("B58", a(paramfn.p));
    }
    localHashMap.put("B59", paramfn.q);
    localHashMap.put("B63", paramfn.z);
    localHashMap.put("B60", paramfn.r);
    localHashMap.put("B61", paramfn.s);
    localHashMap.put("B62", paramfn.t);
    localHashMap.put("B71", paramfn.w);
    localHashMap.put("B76", paramfn.x);
    return localHashMap;
  }
  
  /* Error */
  public static boolean a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore_3
    //   5: new 190	java/net/Socket
    //   8: dup
    //   9: invokespecial 191	java/net/Socket:<init>	()V
    //   12: astore 6
    //   14: aload 6
    //   16: new 193	java/net/InetSocketAddress
    //   19: dup
    //   20: aload_0
    //   21: bipush 80
    //   23: invokespecial 196	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   26: sipush 5000
    //   29: invokevirtual 200	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   32: aload 6
    //   34: invokevirtual 204	java/net/Socket:isConnected	()Z
    //   37: istore 5
    //   39: iload 5
    //   41: ifeq +5 -> 46
    //   44: iconst_1
    //   45: istore_3
    //   46: aload 6
    //   48: invokevirtual 207	java/net/Socket:close	()V
    //   51: iload_3
    //   52: ireturn
    //   53: astore_0
    //   54: aconst_null
    //   55: astore 6
    //   57: iload 4
    //   59: istore_3
    //   60: aload 6
    //   62: ifnull -11 -> 51
    //   65: aload 6
    //   67: invokevirtual 207	java/net/Socket:close	()V
    //   70: iconst_0
    //   71: ireturn
    //   72: astore_0
    //   73: iconst_0
    //   74: ireturn
    //   75: astore_0
    //   76: aconst_null
    //   77: astore 6
    //   79: aload 6
    //   81: ifnull +8 -> 89
    //   84: aload 6
    //   86: invokevirtual 207	java/net/Socket:close	()V
    //   89: aload_0
    //   90: athrow
    //   91: astore_0
    //   92: iload_3
    //   93: ireturn
    //   94: astore 6
    //   96: goto -7 -> 89
    //   99: astore_0
    //   100: goto -21 -> 79
    //   103: astore_0
    //   104: goto -47 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramString	String
    //   0	107	1	paramInt1	int
    //   0	107	2	paramInt2	int
    //   4	89	3	bool1	boolean
    //   1	57	4	bool2	boolean
    //   37	3	5	bool3	boolean
    //   12	73	6	localSocket	java.net.Socket
    //   94	1	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   5	14	53	java/lang/Throwable
    //   65	70	72	java/lang/Throwable
    //   5	14	75	finally
    //   46	51	91	java/lang/Throwable
    //   84	89	94	java/lang/Throwable
    //   14	39	99	finally
    //   14	39	103	java/lang/Throwable
  }
  
  public final boolean a()
  {
    return this.a;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */