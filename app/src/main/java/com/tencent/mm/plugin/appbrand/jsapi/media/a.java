package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

abstract class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  /* Error */
  static boolean d(String paramString, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 15	java/io/FileOutputStream
    //   3: dup
    //   4: new 17	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 20	java/io/File:<init>	(Ljava/lang/String;)V
    //   12: invokespecial 23	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   15: astore_3
    //   16: aload_3
    //   17: astore_0
    //   18: sipush 4096
    //   21: newarray <illegal type>
    //   23: astore 4
    //   25: aload_3
    //   26: astore_0
    //   27: aload_1
    //   28: aload 4
    //   30: iconst_0
    //   31: sipush 4096
    //   34: invokevirtual 29	java/io/InputStream:read	([BII)I
    //   37: istore_2
    //   38: iload_2
    //   39: iconst_m1
    //   40: if_icmpeq +46 -> 86
    //   43: aload_3
    //   44: astore_0
    //   45: aload_3
    //   46: aload 4
    //   48: iconst_0
    //   49: iload_2
    //   50: invokevirtual 33	java/io/FileOutputStream:write	([BII)V
    //   53: goto -28 -> 25
    //   56: astore 4
    //   58: aload_3
    //   59: astore_0
    //   60: ldc 35
    //   62: ldc 37
    //   64: iconst_1
    //   65: anewarray 39	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload 4
    //   72: aastore
    //   73: invokestatic 45	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: aload_3
    //   77: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   80: aload_1
    //   81: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   84: iconst_0
    //   85: ireturn
    //   86: aload_3
    //   87: astore_0
    //   88: aload_3
    //   89: invokevirtual 53	java/io/FileOutputStream:flush	()V
    //   92: aload_3
    //   93: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   96: aload_1
    //   97: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   100: iconst_1
    //   101: ireturn
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_0
    //   105: aload_0
    //   106: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   109: aload_1
    //   110: invokestatic 50	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   113: aload_3
    //   114: athrow
    //   115: astore_3
    //   116: goto -11 -> 105
    //   119: astore 4
    //   121: aconst_null
    //   122: astore_3
    //   123: goto -65 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramString	String
    //   0	126	1	paramInputStream	java.io.InputStream
    //   37	13	2	i	int
    //   15	78	3	localFileOutputStream	java.io.FileOutputStream
    //   102	12	3	localObject1	Object
    //   115	1	3	localObject2	Object
    //   122	1	3	localObject3	Object
    //   23	24	4	arrayOfByte	byte[]
    //   56	15	4	localException1	Exception
    //   119	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   18	25	56	java/lang/Exception
    //   27	38	56	java/lang/Exception
    //   45	53	56	java/lang/Exception
    //   88	92	56	java/lang/Exception
    //   0	16	102	finally
    //   18	25	115	finally
    //   27	38	115	finally
    //   45	53	115	finally
    //   60	76	115	finally
    //   88	92	115	finally
    //   0	16	119	java/lang/Exception
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail filePath invalid", null));
      return;
    }
    c.Em().H(new a.1(this, paraml, paramJSONObject, paramInt));
  }
  
  abstract boolean tG(String paramString);
  
  abstract String tH(String paramString);
  
  abstract void tI(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/media/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */