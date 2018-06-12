package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.mm.plugin.appbrand.jsapi.h;

public final class a
  extends h
{
  private static final int CTRL_INDEX = 355;
  private static final String NAME = "onHCEMessage";
  private static final a fWn = new a();
  
  /* Error */
  static void a(String paramString, int paramInt, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 26
    //   5: ldc 28
    //   7: iconst_2
    //   8: anewarray 30	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: aload_0
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: iload_1
    //   18: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: aastore
    //   22: invokestatic 42	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: iload_1
    //   26: bipush 31
    //   28: if_icmpne +65 -> 93
    //   31: aload_2
    //   32: ifnull +57 -> 89
    //   35: aload_2
    //   36: ldc 44
    //   38: invokevirtual 50	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore_2
    //   42: new 52	java/util/HashMap
    //   45: dup
    //   46: invokespecial 53	java/util/HashMap:<init>	()V
    //   49: astore_3
    //   50: aload_3
    //   51: ldc 55
    //   53: iconst_1
    //   54: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: invokeinterface 61 3 0
    //   62: pop
    //   63: aload_3
    //   64: ldc 63
    //   66: aload_2
    //   67: invokeinterface 61 3 0
    //   72: pop
    //   73: getstatic 20	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:fWn	Lcom/tencent/mm/plugin/appbrand/jsapi/nfc/a;
    //   76: aload_0
    //   77: iconst_0
    //   78: invokevirtual 67	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:aC	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/jsapi/h;
    //   81: aload_3
    //   82: invokevirtual 71	com/tencent/mm/plugin/appbrand/jsapi/h:x	(Ljava/util/Map;)Lcom/tencent/mm/plugin/appbrand/jsapi/h;
    //   85: invokevirtual 75	com/tencent/mm/plugin/appbrand/jsapi/h:ahM	()Z
    //   88: pop
    //   89: ldc 2
    //   91: monitorexit
    //   92: return
    //   93: iload_1
    //   94: bipush 41
    //   96: if_icmpne -7 -> 89
    //   99: aload_2
    //   100: ifnull -11 -> 89
    //   103: new 52	java/util/HashMap
    //   106: dup
    //   107: invokespecial 53	java/util/HashMap:<init>	()V
    //   110: astore_3
    //   111: aload_3
    //   112: ldc 55
    //   114: iconst_2
    //   115: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   118: invokeinterface 61 3 0
    //   123: pop
    //   124: aload_3
    //   125: ldc 77
    //   127: aload_2
    //   128: ldc 79
    //   130: invokevirtual 83	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   133: invokestatic 36	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: invokeinterface 61 3 0
    //   141: pop
    //   142: getstatic 20	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:fWn	Lcom/tencent/mm/plugin/appbrand/jsapi/nfc/a;
    //   145: aload_0
    //   146: iconst_0
    //   147: invokevirtual 67	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:aC	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/jsapi/h;
    //   150: aload_3
    //   151: invokevirtual 71	com/tencent/mm/plugin/appbrand/jsapi/h:x	(Ljava/util/Map;)Lcom/tencent/mm/plugin/appbrand/jsapi/h;
    //   154: invokevirtual 75	com/tencent/mm/plugin/appbrand/jsapi/h:ahM	()Z
    //   157: pop
    //   158: goto -69 -> 89
    //   161: astore_0
    //   162: ldc 2
    //   164: monitorexit
    //   165: aload_0
    //   166: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	paramString	String
    //   0	167	1	paramInt	int
    //   0	167	2	paramBundle	android.os.Bundle
    //   49	102	3	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   3	25	161	finally
    //   35	89	161	finally
    //   103	158	161	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/nfc/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */