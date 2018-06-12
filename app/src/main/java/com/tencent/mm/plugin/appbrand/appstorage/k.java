package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class k
{
  /* Error */
  static int a(java.util.zip.ZipInputStream paramZipInputStream, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual 18	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   6: astore 4
    //   8: aload 4
    //   10: ifnull +287 -> 297
    //   13: aload 4
    //   15: invokevirtual 24	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   18: astore 5
    //   20: aload 5
    //   22: ldc 26
    //   24: invokevirtual 32	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   27: ifne -25 -> 2
    //   30: aload 5
    //   32: ldc 34
    //   34: invokevirtual 32	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   37: ifne -35 -> 2
    //   40: aload 4
    //   42: invokevirtual 38	java/util/zip/ZipEntry:isDirectory	()Z
    //   45: ifeq +82 -> 127
    //   48: aload 5
    //   50: iconst_0
    //   51: aload 5
    //   53: invokevirtual 42	java/lang/String:length	()I
    //   56: iconst_1
    //   57: isub
    //   58: invokevirtual 46	java/lang/String:substring	(II)Ljava/lang/String;
    //   61: astore 4
    //   63: new 48	java/io/File
    //   66: dup
    //   67: new 50	java/lang/StringBuilder
    //   70: dup
    //   71: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   74: aload_1
    //   75: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: getstatic 62	java/io/File:separator	Ljava/lang/String;
    //   81: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload 4
    //   86: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: invokevirtual 71	java/io/File:mkdirs	()Z
    //   98: pop
    //   99: goto -97 -> 2
    //   102: astore_1
    //   103: ldc 73
    //   105: aload_1
    //   106: ldc 75
    //   108: iconst_0
    //   109: anewarray 4	java/lang/Object
    //   112: invokestatic 81	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 84	java/util/zip/ZipInputStream:close	()V
    //   123: iconst_m1
    //   124: istore_2
    //   125: iload_2
    //   126: ireturn
    //   127: new 48	java/io/File
    //   130: dup
    //   131: new 50	java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   138: aload_1
    //   139: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: getstatic 62	java/io/File:separator	Ljava/lang/String;
    //   145: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 5
    //   150: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   159: astore 4
    //   161: aload 4
    //   163: invokevirtual 88	java/io/File:getParentFile	()Ljava/io/File;
    //   166: invokevirtual 71	java/io/File:mkdirs	()Z
    //   169: pop
    //   170: aload 4
    //   172: invokevirtual 91	java/io/File:createNewFile	()Z
    //   175: pop
    //   176: new 93	java/io/FileOutputStream
    //   179: dup
    //   180: aload 4
    //   182: invokespecial 96	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   185: astore 5
    //   187: aload 5
    //   189: astore 4
    //   191: sipush 1024
    //   194: newarray <illegal type>
    //   196: astore 6
    //   198: aload 5
    //   200: astore 4
    //   202: aload_0
    //   203: aload 6
    //   205: invokevirtual 100	java/util/zip/ZipInputStream:read	([B)I
    //   208: istore_3
    //   209: iload_3
    //   210: iconst_m1
    //   211: if_icmpeq +67 -> 278
    //   214: aload 5
    //   216: astore 4
    //   218: aload 5
    //   220: aload 6
    //   222: iconst_0
    //   223: iload_3
    //   224: invokevirtual 104	java/io/FileOutputStream:write	([BII)V
    //   227: aload 5
    //   229: astore 4
    //   231: aload 5
    //   233: invokevirtual 107	java/io/FileOutputStream:flush	()V
    //   236: goto -38 -> 198
    //   239: astore_1
    //   240: aload 5
    //   242: astore 4
    //   244: aload_1
    //   245: athrow
    //   246: astore_1
    //   247: aload 4
    //   249: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   252: aload_1
    //   253: athrow
    //   254: astore_1
    //   255: ldc 73
    //   257: aload_1
    //   258: ldc 75
    //   260: iconst_0
    //   261: anewarray 4	java/lang/Object
    //   264: invokestatic 81	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: aload_0
    //   268: ifnull +7 -> 275
    //   271: aload_0
    //   272: invokevirtual 84	java/util/zip/ZipInputStream:close	()V
    //   275: bipush -2
    //   277: ireturn
    //   278: aload 5
    //   280: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   283: goto -281 -> 2
    //   286: astore_1
    //   287: aload_0
    //   288: ifnull +7 -> 295
    //   291: aload_0
    //   292: invokevirtual 84	java/util/zip/ZipInputStream:close	()V
    //   295: aload_1
    //   296: athrow
    //   297: aload_0
    //   298: ifnull -173 -> 125
    //   301: aload_0
    //   302: invokevirtual 84	java/util/zip/ZipInputStream:close	()V
    //   305: iconst_0
    //   306: ireturn
    //   307: astore_0
    //   308: ldc 73
    //   310: ldc 115
    //   312: invokestatic 119	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: iconst_0
    //   316: ireturn
    //   317: astore_0
    //   318: ldc 73
    //   320: ldc 115
    //   322: invokestatic 119	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: goto -202 -> 123
    //   328: astore_0
    //   329: ldc 73
    //   331: ldc 115
    //   333: invokestatic 119	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   336: goto -61 -> 275
    //   339: astore_0
    //   340: ldc 73
    //   342: ldc 115
    //   344: invokestatic 119	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   347: goto -52 -> 295
    //   350: astore_1
    //   351: aconst_null
    //   352: astore 4
    //   354: goto -107 -> 247
    //   357: astore_1
    //   358: aconst_null
    //   359: astore 4
    //   361: goto -117 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	paramZipInputStream	java.util.zip.ZipInputStream
    //   0	364	1	paramString	String
    //   1	125	2	i	int
    //   208	16	3	j	int
    //   6	354	4	localObject1	Object
    //   18	261	5	localObject2	Object
    //   196	25	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	8	102	java/io/FileNotFoundException
    //   13	99	102	java/io/FileNotFoundException
    //   127	176	102	java/io/FileNotFoundException
    //   247	254	102	java/io/FileNotFoundException
    //   278	283	102	java/io/FileNotFoundException
    //   191	198	239	java/lang/Exception
    //   202	209	239	java/lang/Exception
    //   218	227	239	java/lang/Exception
    //   231	236	239	java/lang/Exception
    //   191	198	246	finally
    //   202	209	246	finally
    //   218	227	246	finally
    //   231	236	246	finally
    //   244	246	246	finally
    //   2	8	254	java/io/IOException
    //   13	99	254	java/io/IOException
    //   127	176	254	java/io/IOException
    //   247	254	254	java/io/IOException
    //   278	283	254	java/io/IOException
    //   2	8	286	finally
    //   13	99	286	finally
    //   103	115	286	finally
    //   127	176	286	finally
    //   247	254	286	finally
    //   255	267	286	finally
    //   278	283	286	finally
    //   301	305	307	java/io/IOException
    //   119	123	317	java/io/IOException
    //   271	275	328	java/io/IOException
    //   291	295	339	java/io/IOException
    //   176	187	350	finally
    //   176	187	357	java/lang/Exception
  }
  
  public static long w(File paramFile)
  {
    long l1 = 0L;
    paramFile = paramFile.listFiles();
    long l2;
    if (paramFile == null) {
      l2 = l1;
    }
    int j;
    int i;
    do
    {
      return l2;
      j = paramFile.length;
      i = 0;
      l2 = l1;
    } while (i >= j);
    File localFile = paramFile[i];
    if (localFile.isFile()) {}
    for (l1 += localFile.length();; l1 += w(localFile))
    {
      i += 1;
      break;
    }
  }
  
  /* Error */
  static java.nio.ByteBuffer x(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +17 -> 18
    //   4: aload_0
    //   5: invokevirtual 141	java/io/File:exists	()Z
    //   8: ifeq +10 -> 18
    //   11: aload_0
    //   12: invokevirtual 129	java/io/File:isFile	()Z
    //   15: ifne +8 -> 23
    //   18: iconst_0
    //   19: invokestatic 147	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   22: areturn
    //   23: aload_0
    //   24: invokevirtual 132	java/io/File:length	()J
    //   27: l2i
    //   28: istore_1
    //   29: iload_1
    //   30: ifge +8 -> 38
    //   33: iconst_0
    //   34: invokestatic 147	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   37: areturn
    //   38: iload_1
    //   39: invokestatic 147	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   42: astore 4
    //   44: new 149	java/io/FileInputStream
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 150	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: astore_3
    //   53: aload_3
    //   54: astore_2
    //   55: sipush 4096
    //   58: newarray <illegal type>
    //   60: astore 5
    //   62: aload_3
    //   63: astore_2
    //   64: aload_3
    //   65: aload 5
    //   67: iconst_0
    //   68: sipush 4096
    //   71: invokevirtual 153	java/io/FileInputStream:read	([BII)I
    //   74: istore_1
    //   75: iload_1
    //   76: iconst_m1
    //   77: if_icmpeq +49 -> 126
    //   80: aload_3
    //   81: astore_2
    //   82: aload 4
    //   84: aload 5
    //   86: iconst_0
    //   87: iload_1
    //   88: invokevirtual 157	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   91: pop
    //   92: goto -30 -> 62
    //   95: astore_0
    //   96: aload_3
    //   97: astore_2
    //   98: ldc 73
    //   100: aload_0
    //   101: ldc -97
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokestatic 81	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_3
    //   111: astore_2
    //   112: aload 4
    //   114: invokestatic 165	com/tencent/mm/plugin/appbrand/l/a:j	(Ljava/nio/ByteBuffer;)V
    //   117: aload_3
    //   118: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   121: iconst_0
    //   122: invokestatic 147	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   125: areturn
    //   126: aload_3
    //   127: astore_2
    //   128: aload 4
    //   130: invokevirtual 169	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   133: pop
    //   134: aload_3
    //   135: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   138: aload 4
    //   140: areturn
    //   141: astore_2
    //   142: aconst_null
    //   143: astore_3
    //   144: aload_3
    //   145: astore_2
    //   146: ldc 73
    //   148: ldc -85
    //   150: iconst_2
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: invokevirtual 132	java/io/File:length	()J
    //   160: invokestatic 177	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   163: aastore
    //   164: dup
    //   165: iconst_1
    //   166: aload 4
    //   168: invokevirtual 180	java/nio/ByteBuffer:capacity	()I
    //   171: invokestatic 185	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: aastore
    //   175: invokestatic 188	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: astore_2
    //   180: aload 4
    //   182: invokestatic 165	com/tencent/mm/plugin/appbrand/l/a:j	(Ljava/nio/ByteBuffer;)V
    //   185: aload_3
    //   186: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   189: goto -68 -> 121
    //   192: astore_0
    //   193: aconst_null
    //   194: astore_2
    //   195: aload_2
    //   196: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   199: aload_0
    //   200: athrow
    //   201: astore_0
    //   202: goto -7 -> 195
    //   205: astore_2
    //   206: goto -62 -> 144
    //   209: astore_0
    //   210: aconst_null
    //   211: astore_3
    //   212: goto -116 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramFile	File
    //   28	60	1	i	int
    //   54	74	2	localFileInputStream1	java.io.FileInputStream
    //   141	1	2	localBufferOverflowException1	java.nio.BufferOverflowException
    //   145	51	2	localFileInputStream2	java.io.FileInputStream
    //   205	1	2	localBufferOverflowException2	java.nio.BufferOverflowException
    //   52	160	3	localFileInputStream3	java.io.FileInputStream
    //   42	139	4	localByteBuffer	java.nio.ByteBuffer
    //   60	25	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   55	62	95	java/io/IOException
    //   64	75	95	java/io/IOException
    //   82	92	95	java/io/IOException
    //   128	134	95	java/io/IOException
    //   44	53	141	java/nio/BufferOverflowException
    //   44	53	192	finally
    //   55	62	201	finally
    //   64	75	201	finally
    //   82	92	201	finally
    //   98	110	201	finally
    //   112	117	201	finally
    //   128	134	201	finally
    //   146	178	201	finally
    //   180	185	201	finally
    //   55	62	205	java/nio/BufferOverflowException
    //   64	75	205	java/nio/BufferOverflowException
    //   82	92	205	java/nio/BufferOverflowException
    //   128	134	205	java/nio/BufferOverflowException
    //   44	53	209	java/io/IOException
  }
  
  public static void y(File paramFile)
  {
    if (paramFile.exists())
    {
      paramFile = paramFile.listFiles();
      if (paramFile != null)
      {
        int j = paramFile.length;
        int i = 0;
        while (i < j)
        {
          File localFile = paramFile[i];
          if (localFile.isDirectory()) {
            y(localFile);
          }
          localFile.delete();
          i += 1;
        }
      }
    }
  }
  
  public static boolean z(File paramFile)
  {
    if (paramFile == null) {
      throw new NullPointerException("file should not be NULL");
    }
    if (!paramFile.exists()) {}
    for (;;)
    {
      return false;
      try
      {
        FileStructStat localFileStructStat = new FileStructStat();
        if (FileStat.stat(paramFile.getAbsolutePath(), localFileStructStat) == 0)
        {
          x.i("MicroMsg.AppBrand.FileSystemUtil", "constainsSymLink, path %s, stat.st_mode %d", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(localFileStructStat.st_mode) });
          int i = localFileStructStat.st_mode;
          if ((i & 0xF000) == 40960) {
            return true;
          }
        }
      }
      catch (Exception paramFile)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil", paramFile, "", new Object[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */