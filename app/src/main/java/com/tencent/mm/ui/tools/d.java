package com.tencent.mm.ui.tools;

public final class d
{
  private static int uwS = 0;
  
  /* Error */
  public static void i(java.io.File paramFile1, java.io.File paramFile2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 23	java/io/File:exists	()Z
    //   4: ifeq +93 -> 97
    //   7: aload_0
    //   8: invokevirtual 26	java/io/File:delete	()Z
    //   11: pop
    //   12: new 28	java/io/FileInputStream
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 32	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   20: astore_1
    //   21: new 34	java/io/FileOutputStream
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 35	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: astore_0
    //   30: aload_0
    //   31: astore_3
    //   32: aload_1
    //   33: astore_2
    //   34: sipush 1024
    //   37: newarray <illegal type>
    //   39: astore 4
    //   41: aload_0
    //   42: astore_3
    //   43: aload_1
    //   44: astore_2
    //   45: aload_1
    //   46: aload 4
    //   48: invokevirtual 41	java/io/InputStream:read	([B)I
    //   51: iconst_m1
    //   52: if_icmpeq +62 -> 114
    //   55: aload_0
    //   56: astore_3
    //   57: aload_1
    //   58: astore_2
    //   59: aload_0
    //   60: aload 4
    //   62: invokevirtual 45	java/io/FileOutputStream:write	([B)V
    //   65: goto -24 -> 41
    //   68: astore_2
    //   69: aload_0
    //   70: astore_3
    //   71: aload_1
    //   72: astore_2
    //   73: ldc 47
    //   75: ldc 49
    //   77: invokestatic 55	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: aload_1
    //   81: ifnull +7 -> 88
    //   84: aload_1
    //   85: invokevirtual 58	java/io/InputStream:close	()V
    //   88: aload_0
    //   89: ifnull +7 -> 96
    //   92: aload_0
    //   93: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   96: return
    //   97: aload_0
    //   98: invokevirtual 62	java/io/File:createNewFile	()Z
    //   101: pop
    //   102: goto -90 -> 12
    //   105: astore_0
    //   106: ldc 47
    //   108: ldc 49
    //   110: invokestatic 55	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: return
    //   114: aload_1
    //   115: invokevirtual 58	java/io/InputStream:close	()V
    //   118: aload_0
    //   119: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   122: return
    //   123: astore_0
    //   124: return
    //   125: astore_0
    //   126: aconst_null
    //   127: astore_2
    //   128: aconst_null
    //   129: astore_1
    //   130: aload_1
    //   131: ifnull +7 -> 138
    //   134: aload_1
    //   135: invokevirtual 58	java/io/InputStream:close	()V
    //   138: aload_2
    //   139: ifnull +7 -> 146
    //   142: aload_2
    //   143: invokevirtual 59	java/io/FileOutputStream:close	()V
    //   146: aload_0
    //   147: athrow
    //   148: astore_1
    //   149: goto -3 -> 146
    //   152: astore_0
    //   153: aconst_null
    //   154: astore_2
    //   155: goto -25 -> 130
    //   158: astore_0
    //   159: aload_2
    //   160: astore_1
    //   161: aload_3
    //   162: astore_2
    //   163: goto -33 -> 130
    //   166: astore_0
    //   167: return
    //   168: astore_0
    //   169: aconst_null
    //   170: astore_0
    //   171: aconst_null
    //   172: astore_1
    //   173: goto -104 -> 69
    //   176: astore_0
    //   177: aconst_null
    //   178: astore_0
    //   179: goto -110 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	paramFile1	java.io.File
    //   0	182	1	paramFile2	java.io.File
    //   33	26	2	localFile1	java.io.File
    //   68	1	2	localException	Exception
    //   72	91	2	localFile2	java.io.File
    //   31	131	3	localFile3	java.io.File
    //   39	22	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   34	41	68	java/lang/Exception
    //   45	55	68	java/lang/Exception
    //   59	65	68	java/lang/Exception
    //   97	102	105	java/io/IOException
    //   114	122	123	java/lang/Exception
    //   12	21	125	finally
    //   134	138	148	java/lang/Exception
    //   142	146	148	java/lang/Exception
    //   21	30	152	finally
    //   34	41	158	finally
    //   45	55	158	finally
    //   59	65	158	finally
    //   73	80	158	finally
    //   84	88	166	java/lang/Exception
    //   92	96	166	java/lang/Exception
    //   12	21	168	java/lang/Exception
    //   21	30	176	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/tools/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */