package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class k
{
  /* Error */
  private static String C(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 16	java/io/File:exists	()Z
    //   4: ifne +6 -> 10
    //   7: ldc 18
    //   9: areturn
    //   10: new 20	java/lang/StringBuffer
    //   13: dup
    //   14: invokespecial 24	java/lang/StringBuffer:<init>	()V
    //   17: astore_3
    //   18: new 26	java/io/BufferedReader
    //   21: dup
    //   22: new 28	java/io/FileReader
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 31	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   30: invokespecial 34	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   33: astore_2
    //   34: aload_2
    //   35: astore_0
    //   36: sipush 1024
    //   39: newarray <illegal type>
    //   41: astore 4
    //   43: aload_2
    //   44: astore_0
    //   45: aload_2
    //   46: aload 4
    //   48: invokevirtual 38	java/io/BufferedReader:read	([C)I
    //   51: istore_1
    //   52: iload_1
    //   53: iconst_m1
    //   54: if_icmpeq +42 -> 96
    //   57: aload_2
    //   58: astore_0
    //   59: aload_3
    //   60: aload 4
    //   62: iconst_0
    //   63: iload_1
    //   64: invokestatic 44	java/lang/String:valueOf	([CII)Ljava/lang/String;
    //   67: invokevirtual 48	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   70: pop
    //   71: goto -28 -> 43
    //   74: astore_3
    //   75: aload_2
    //   76: astore_0
    //   77: aload_3
    //   78: astore_2
    //   79: aload_2
    //   80: athrow
    //   81: astore_3
    //   82: aload_0
    //   83: astore_2
    //   84: aload_3
    //   85: astore_0
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 51	java/io/BufferedReader:close	()V
    //   94: aload_0
    //   95: athrow
    //   96: aload_2
    //   97: invokevirtual 51	java/io/BufferedReader:close	()V
    //   100: aload_3
    //   101: invokevirtual 55	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   104: areturn
    //   105: astore_0
    //   106: aload_0
    //   107: athrow
    //   108: astore_0
    //   109: aload_0
    //   110: athrow
    //   111: astore_0
    //   112: aconst_null
    //   113: astore_2
    //   114: goto -28 -> 86
    //   117: astore_2
    //   118: aconst_null
    //   119: astore_0
    //   120: goto -41 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramFile	File
    //   51	13	1	i	int
    //   33	81	2	localObject1	Object
    //   117	1	2	localIOException1	java.io.IOException
    //   17	43	3	localStringBuffer	StringBuffer
    //   74	4	3	localIOException2	java.io.IOException
    //   81	20	3	localObject2	Object
    //   41	20	4	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   36	43	74	java/io/IOException
    //   45	52	74	java/io/IOException
    //   59	71	74	java/io/IOException
    //   36	43	81	finally
    //   45	52	81	finally
    //   59	71	81	finally
    //   79	81	81	finally
    //   96	100	105	java/lang/Exception
    //   90	94	108	java/lang/Exception
    //   18	34	111	finally
    //   18	34	117	java/io/IOException
  }
  
  /* Error */
  public static void g(String paramString, String... paramVarArgs)
  {
    // Byte code:
    //   0: new 12	java/io/File
    //   3: dup
    //   4: invokestatic 64	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   7: invokevirtual 70	android/content/Context:getCacheDir	()Ljava/io/File;
    //   10: aload_0
    //   11: invokespecial 73	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   14: astore_0
    //   15: new 75	java/io/FileWriter
    //   18: dup
    //   19: aload_0
    //   20: invokespecial 76	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   23: astore 4
    //   25: aload_1
    //   26: arraylength
    //   27: istore_3
    //   28: iconst_0
    //   29: istore_2
    //   30: iload_2
    //   31: iload_3
    //   32: if_icmpge +18 -> 50
    //   35: aload 4
    //   37: aload_1
    //   38: iload_2
    //   39: aaload
    //   40: invokevirtual 80	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   43: iload_2
    //   44: iconst_1
    //   45: iadd
    //   46: istore_2
    //   47: goto -17 -> 30
    //   50: aload 4
    //   52: invokevirtual 81	java/io/FileWriter:close	()V
    //   55: return
    //   56: astore_0
    //   57: aconst_null
    //   58: astore_1
    //   59: aload_1
    //   60: ifnull +7 -> 67
    //   63: aload_1
    //   64: invokevirtual 81	java/io/FileWriter:close	()V
    //   67: aload_0
    //   68: athrow
    //   69: astore_0
    //   70: return
    //   71: astore_1
    //   72: goto -5 -> 67
    //   75: astore_0
    //   76: aload 4
    //   78: astore_1
    //   79: goto -20 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	paramString	String
    //   0	82	1	paramVarArgs	String[]
    //   29	18	2	i	int
    //   27	6	3	j	int
    //   23	54	4	localFileWriter	java.io.FileWriter
    // Exception table:
    //   from	to	target	type
    //   15	25	56	finally
    //   50	55	69	java/io/IOException
    //   63	67	71	java/io/IOException
    //   25	28	75	finally
    //   35	43	75	finally
  }
  
  public static int j(String... paramVarArgs)
  {
    int m = paramVarArgs.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      String str = paramVarArgs[i];
      k = j;
      if (str != null) {
        k = j + str.length();
      }
      i += 1;
    }
    return j;
  }
  
  public static String ua(String paramString)
  {
    return C(new File(ad.getContext().getCacheDir(), paramString));
  }
  
  public static void ub(String paramString)
  {
    boolean bool = new File(ad.getContext().getCacheDir(), paramString).delete();
    x.i("MicroMsg.JsApiStorageHelper", "deleteTmpFile: " + paramString + ":" + bool);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */