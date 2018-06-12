package com.tencent.mm.plugin.appbrand.m;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.compat.a.f;
import com.tencent.mm.plugin.appbrand.q.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import java.io.File;
import java.util.Map;
import java.util.Properties;

public final class d
  implements f
{
  public final Properties A(File paramFile)
  {
    return n.A(paramFile);
  }
  
  public final String adP()
  {
    return n.adP();
  }
  
  public final int adQ()
  {
    return n.adQ();
  }
  
  public final Intent adR()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
    localIntent.putExtra("neverGetA8Key", true);
    return localIntent;
  }
  
  public final Map<String, String> adS()
  {
    return n.b(201, true, 64);
  }
  
  /* Error */
  public final boolean bc(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: invokestatic 75	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   6: invokevirtual 81	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   9: astore 5
    //   11: aload 5
    //   13: aload_2
    //   14: invokevirtual 87	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull +30 -> 49
    //   22: ldc 89
    //   24: ldc 91
    //   26: invokestatic 97	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: iconst_0
    //   30: ireturn
    //   31: astore_2
    //   32: ldc 89
    //   34: aload_2
    //   35: ldc 99
    //   37: iconst_0
    //   38: anewarray 4	java/lang/Object
    //   41: invokestatic 103	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: aconst_null
    //   45: astore_2
    //   46: goto -28 -> 18
    //   49: new 105	java/io/File
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 108	java/io/File:<init>	(Ljava/lang/String;)V
    //   57: astore_1
    //   58: aload_1
    //   59: invokevirtual 112	java/io/File:exists	()Z
    //   62: ifeq +8 -> 70
    //   65: aload_1
    //   66: invokevirtual 115	java/io/File:delete	()Z
    //   69: pop
    //   70: aload_1
    //   71: invokevirtual 119	java/io/File:getParentFile	()Ljava/io/File;
    //   74: invokevirtual 122	java/io/File:mkdirs	()Z
    //   77: pop
    //   78: new 124	java/io/FileOutputStream
    //   81: dup
    //   82: aload_1
    //   83: invokespecial 127	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   86: astore_1
    //   87: aload_1
    //   88: ifnull +100 -> 188
    //   91: sipush 1024
    //   94: newarray <illegal type>
    //   96: astore 4
    //   98: aload_2
    //   99: aload 4
    //   101: invokevirtual 133	java/io/InputStream:read	([B)I
    //   104: istore_3
    //   105: iload_3
    //   106: iconst_m1
    //   107: if_icmpeq +58 -> 165
    //   110: aload_1
    //   111: aload 4
    //   113: iconst_0
    //   114: iload_3
    //   115: invokevirtual 139	java/io/OutputStream:write	([BII)V
    //   118: goto -20 -> 98
    //   121: astore 4
    //   123: ldc 89
    //   125: aload 4
    //   127: ldc 99
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 103	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_2
    //   137: invokestatic 145	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   140: aload_1
    //   141: invokestatic 149	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   144: iconst_0
    //   145: ireturn
    //   146: astore_1
    //   147: ldc 89
    //   149: aload_1
    //   150: ldc 99
    //   152: iconst_0
    //   153: anewarray 4	java/lang/Object
    //   156: invokestatic 103	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload 4
    //   161: astore_1
    //   162: goto -75 -> 87
    //   165: aload_2
    //   166: invokestatic 145	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   169: aload_1
    //   170: invokestatic 149	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   173: iconst_1
    //   174: ireturn
    //   175: astore 4
    //   177: aload_2
    //   178: invokestatic 145	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   181: aload_1
    //   182: invokestatic 149	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   185: aload 4
    //   187: athrow
    //   188: aload_2
    //   189: invokestatic 145	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   192: iconst_0
    //   193: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	d
    //   0	194	1	paramString1	String
    //   0	194	2	paramString2	String
    //   104	11	3	i	int
    //   1	111	4	arrayOfByte	byte[]
    //   121	39	4	localIOException	java.io.IOException
    //   175	11	4	localObject	Object
    //   9	3	5	localAssetManager	android.content.res.AssetManager
    // Exception table:
    //   from	to	target	type
    //   11	18	31	java/io/IOException
    //   91	98	121	java/io/IOException
    //   98	105	121	java/io/IOException
    //   110	118	121	java/io/IOException
    //   78	87	146	java/io/FileNotFoundException
    //   91	98	175	finally
    //   98	105	175	finally
    //   110	118	175	finally
    //   123	136	175	finally
  }
  
  public final String v(Map<String, String> paramMap)
  {
    return n.v(paramMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */