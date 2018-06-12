package com.tencent.mm.modelvideo;

public final class q
{
  private static String bytesToHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramArrayOfByte.length <= 0) {
      return null;
    }
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  /* Error */
  public static boolean nD(String paramString)
  {
    // Byte code:
    //   0: ldc 44
    //   2: new 8	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 46
    //   8: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   18: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: invokestatic 60	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   25: ifeq +5 -> 30
    //   28: iconst_0
    //   29: ireturn
    //   30: new 62	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 63	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   38: astore_1
    //   39: aload_1
    //   40: astore_0
    //   41: bipush 10
    //   43: newarray <illegal type>
    //   45: astore_2
    //   46: aload_1
    //   47: astore_0
    //   48: aload_1
    //   49: aload_2
    //   50: iconst_0
    //   51: bipush 10
    //   53: invokevirtual 67	java/io/FileInputStream:read	([BII)I
    //   56: pop
    //   57: aload_1
    //   58: astore_0
    //   59: aload_2
    //   60: invokestatic 69	com/tencent/mm/modelvideo/q:bytesToHexString	([B)Ljava/lang/String;
    //   63: astore_2
    //   64: aload_1
    //   65: astore_0
    //   66: aload_2
    //   67: invokestatic 60	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   70: ifne +59 -> 129
    //   73: aload_1
    //   74: astore_0
    //   75: aload_2
    //   76: invokevirtual 72	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   79: astore_2
    //   80: aload_1
    //   81: astore_0
    //   82: ldc 44
    //   84: new 8	java/lang/StringBuilder
    //   87: dup
    //   88: ldc 74
    //   90: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_2
    //   94: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_1
    //   104: astore_0
    //   105: aload_2
    //   106: ldc 76
    //   108: invokevirtual 80	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   111: ifeq +18 -> 129
    //   114: aload_1
    //   115: astore_0
    //   116: ldc 44
    //   118: ldc 82
    //   120: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_1
    //   124: invokevirtual 85	java/io/FileInputStream:close	()V
    //   127: iconst_1
    //   128: ireturn
    //   129: aload_1
    //   130: invokevirtual 85	java/io/FileInputStream:close	()V
    //   133: iconst_0
    //   134: ireturn
    //   135: astore_0
    //   136: iconst_0
    //   137: ireturn
    //   138: astore_2
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_1
    //   142: astore_0
    //   143: ldc 44
    //   145: ldc 87
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_2
    //   154: invokestatic 91	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 95	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_1
    //   162: ifnull -134 -> 28
    //   165: aload_1
    //   166: invokevirtual 85	java/io/FileInputStream:close	()V
    //   169: iconst_0
    //   170: ireturn
    //   171: astore_0
    //   172: iconst_0
    //   173: ireturn
    //   174: astore_1
    //   175: aconst_null
    //   176: astore_0
    //   177: aload_0
    //   178: ifnull +7 -> 185
    //   181: aload_0
    //   182: invokevirtual 85	java/io/FileInputStream:close	()V
    //   185: aload_1
    //   186: athrow
    //   187: astore_0
    //   188: goto -61 -> 127
    //   191: astore_0
    //   192: goto -7 -> 185
    //   195: astore_1
    //   196: goto -19 -> 177
    //   199: astore_2
    //   200: goto -59 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	paramString	String
    //   38	128	1	localFileInputStream	java.io.FileInputStream
    //   174	12	1	localObject1	Object
    //   195	1	1	localObject2	Object
    //   45	61	2	localObject3	Object
    //   138	16	2	localException1	Exception
    //   199	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   129	133	135	java/io/IOException
    //   30	39	138	java/lang/Exception
    //   165	169	171	java/io/IOException
    //   30	39	174	finally
    //   123	127	187	java/io/IOException
    //   181	185	191	java/io/IOException
    //   41	46	195	finally
    //   48	57	195	finally
    //   59	64	195	finally
    //   66	73	195	finally
    //   75	80	195	finally
    //   82	103	195	finally
    //   105	114	195	finally
    //   116	123	195	finally
    //   143	161	195	finally
    //   41	46	199	java/lang/Exception
    //   48	57	199	java/lang/Exception
    //   59	64	199	java/lang/Exception
    //   66	73	199	java/lang/Exception
    //   75	80	199	java/lang/Exception
    //   82	103	199	java/lang/Exception
    //   105	114	199	java/lang/Exception
    //   116	123	199	java/lang/Exception
  }
  
  /* Error */
  public static boolean nE(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 101	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   4: ifne +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: new 62	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 63	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: astore_0
    //   20: bipush 32
    //   22: newarray <illegal type>
    //   24: astore_3
    //   25: aload_2
    //   26: astore_0
    //   27: aload_2
    //   28: aload_3
    //   29: iconst_0
    //   30: bipush 32
    //   32: invokevirtual 67	java/io/FileInputStream:read	([BII)I
    //   35: pop
    //   36: aload_2
    //   37: astore_0
    //   38: aload_3
    //   39: invokestatic 69	com/tencent/mm/modelvideo/q:bytesToHexString	([B)Ljava/lang/String;
    //   42: astore_3
    //   43: aload_2
    //   44: astore_0
    //   45: aload_3
    //   46: invokestatic 60	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   49: ifne +25 -> 74
    //   52: aload_2
    //   53: astore_0
    //   54: aload_3
    //   55: invokevirtual 72	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   58: ldc 103
    //   60: invokevirtual 80	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   63: istore_1
    //   64: iload_1
    //   65: ifeq +9 -> 74
    //   68: aload_2
    //   69: invokevirtual 85	java/io/FileInputStream:close	()V
    //   72: iconst_1
    //   73: ireturn
    //   74: aload_2
    //   75: invokevirtual 85	java/io/FileInputStream:close	()V
    //   78: iconst_0
    //   79: ireturn
    //   80: astore_0
    //   81: iconst_0
    //   82: ireturn
    //   83: astore_3
    //   84: aconst_null
    //   85: astore_2
    //   86: aload_2
    //   87: astore_0
    //   88: ldc 44
    //   90: ldc 87
    //   92: iconst_1
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload_3
    //   99: invokestatic 91	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   102: aastore
    //   103: invokestatic 95	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: aload_2
    //   107: ifnull -100 -> 7
    //   110: aload_2
    //   111: invokevirtual 85	java/io/FileInputStream:close	()V
    //   114: iconst_0
    //   115: ireturn
    //   116: astore_0
    //   117: iconst_0
    //   118: ireturn
    //   119: astore_2
    //   120: aconst_null
    //   121: astore_0
    //   122: aload_0
    //   123: ifnull +7 -> 130
    //   126: aload_0
    //   127: invokevirtual 85	java/io/FileInputStream:close	()V
    //   130: aload_2
    //   131: athrow
    //   132: astore_0
    //   133: goto -61 -> 72
    //   136: astore_0
    //   137: goto -7 -> 130
    //   140: astore_2
    //   141: goto -19 -> 122
    //   144: astore_3
    //   145: goto -59 -> 86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	paramString	String
    //   63	2	1	bool	boolean
    //   17	94	2	localFileInputStream	java.io.FileInputStream
    //   119	12	2	localObject1	Object
    //   140	1	2	localObject2	Object
    //   24	31	3	localObject3	Object
    //   83	16	3	localException1	Exception
    //   144	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   74	78	80	java/io/IOException
    //   9	18	83	java/lang/Exception
    //   110	114	116	java/io/IOException
    //   9	18	119	finally
    //   68	72	132	java/io/IOException
    //   126	130	136	java/io/IOException
    //   20	25	140	finally
    //   27	36	140	finally
    //   38	43	140	finally
    //   45	52	140	finally
    //   54	64	140	finally
    //   88	106	140	finally
    //   20	25	144	java/lang/Exception
    //   27	36	144	java/lang/Exception
    //   38	43	144	java/lang/Exception
    //   45	52	144	java/lang/Exception
    //   54	64	144	java/lang/Exception
  }
  
  /* Error */
  public static boolean nF(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokestatic 101	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   7: ifne +5 -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: ldc 44
    //   14: ldc 108
    //   16: iconst_1
    //   17: anewarray 4	java/lang/Object
    //   20: dup
    //   21: iconst_0
    //   22: aload_0
    //   23: aastore
    //   24: invokestatic 110	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: new 112	android/media/MediaExtractor
    //   30: dup
    //   31: invokespecial 113	android/media/MediaExtractor:<init>	()V
    //   34: astore 5
    //   36: aload 5
    //   38: aload_0
    //   39: invokevirtual 116	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   42: aload 5
    //   44: invokevirtual 119	android/media/MediaExtractor:getTrackCount	()I
    //   47: istore_2
    //   48: iconst_0
    //   49: istore_1
    //   50: iload_1
    //   51: iload_2
    //   52: if_icmpge +83 -> 135
    //   55: aload 5
    //   57: iload_1
    //   58: invokevirtual 123	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   61: ldc 125
    //   63: invokevirtual 131	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   66: astore 4
    //   68: ldc -123
    //   70: aload 4
    //   72: invokevirtual 136	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   75: istore_3
    //   76: iload_3
    //   77: ifeq +32 -> 109
    //   80: aload 5
    //   82: invokevirtual 139	android/media/MediaExtractor:release	()V
    //   85: iconst_1
    //   86: ireturn
    //   87: astore 6
    //   89: aconst_null
    //   90: astore 4
    //   92: ldc 44
    //   94: aload 6
    //   96: ldc 108
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_0
    //   105: aastore
    //   106: invokestatic 143	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: ldc -123
    //   111: aload 4
    //   113: invokevirtual 136	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   116: istore_3
    //   117: iload_3
    //   118: ifeq +10 -> 128
    //   121: aload 5
    //   123: invokevirtual 139	android/media/MediaExtractor:release	()V
    //   126: iconst_1
    //   127: ireturn
    //   128: iload_1
    //   129: iconst_1
    //   130: iadd
    //   131: istore_1
    //   132: goto -82 -> 50
    //   135: aload 5
    //   137: invokevirtual 139	android/media/MediaExtractor:release	()V
    //   140: iconst_0
    //   141: ireturn
    //   142: astore 5
    //   144: ldc 44
    //   146: aload 5
    //   148: ldc 108
    //   150: iconst_1
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: aastore
    //   158: invokestatic 143	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload 4
    //   163: ifnull -153 -> 10
    //   166: aload 4
    //   168: invokevirtual 139	android/media/MediaExtractor:release	()V
    //   171: iconst_0
    //   172: ireturn
    //   173: astore_0
    //   174: aconst_null
    //   175: astore 4
    //   177: aload 4
    //   179: ifnull +8 -> 187
    //   182: aload 4
    //   184: invokevirtual 139	android/media/MediaExtractor:release	()V
    //   187: aload_0
    //   188: athrow
    //   189: astore_0
    //   190: aload 5
    //   192: astore 4
    //   194: goto -17 -> 177
    //   197: astore_0
    //   198: goto -21 -> 177
    //   201: astore 6
    //   203: aload 5
    //   205: astore 4
    //   207: aload 6
    //   209: astore 5
    //   211: goto -67 -> 144
    //   214: astore 6
    //   216: goto -124 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramString	String
    //   49	83	1	i	int
    //   47	6	2	j	int
    //   75	43	3	bool	boolean
    //   1	205	4	localObject1	Object
    //   34	102	5	localMediaExtractor	android.media.MediaExtractor
    //   142	62	5	localThrowable1	Throwable
    //   209	1	5	localObject2	Object
    //   87	8	6	localThrowable2	Throwable
    //   201	7	6	localThrowable3	Throwable
    //   214	1	6	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   55	68	87	java/lang/Throwable
    //   27	36	142	java/lang/Throwable
    //   27	36	173	finally
    //   36	48	189	finally
    //   55	68	189	finally
    //   68	76	189	finally
    //   92	109	189	finally
    //   109	117	189	finally
    //   144	161	197	finally
    //   36	48	201	java/lang/Throwable
    //   92	109	201	java/lang/Throwable
    //   109	117	201	java/lang/Throwable
    //   68	76	214	java/lang/Throwable
  }
  
  /* Error */
  public static boolean nG(String paramString)
  {
    // Byte code:
    //   0: ldc 44
    //   2: new 8	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 46
    //   8: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   18: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: invokestatic 60	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   25: ifeq +5 -> 30
    //   28: iconst_0
    //   29: ireturn
    //   30: new 62	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 63	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   38: astore_1
    //   39: aload_1
    //   40: astore_0
    //   41: bipush 7
    //   43: newarray <illegal type>
    //   45: astore_2
    //   46: aload_1
    //   47: astore_0
    //   48: aload_1
    //   49: aload_2
    //   50: iconst_0
    //   51: bipush 7
    //   53: invokevirtual 67	java/io/FileInputStream:read	([BII)I
    //   56: pop
    //   57: aload_1
    //   58: astore_0
    //   59: aload_2
    //   60: invokestatic 69	com/tencent/mm/modelvideo/q:bytesToHexString	([B)Ljava/lang/String;
    //   63: astore_2
    //   64: aload_1
    //   65: astore_0
    //   66: aload_2
    //   67: invokestatic 60	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   70: ifne +59 -> 129
    //   73: aload_1
    //   74: astore_0
    //   75: aload_2
    //   76: invokevirtual 72	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   79: astore_2
    //   80: aload_1
    //   81: astore_0
    //   82: ldc 44
    //   84: new 8	java/lang/StringBuilder
    //   87: dup
    //   88: ldc 74
    //   90: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_2
    //   94: invokevirtual 31	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 35	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_1
    //   104: astore_0
    //   105: aload_2
    //   106: ldc -110
    //   108: invokevirtual 80	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   111: ifeq +18 -> 129
    //   114: aload_1
    //   115: astore_0
    //   116: ldc 44
    //   118: ldc -108
    //   120: invokestatic 55	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_1
    //   124: invokevirtual 85	java/io/FileInputStream:close	()V
    //   127: iconst_1
    //   128: ireturn
    //   129: aload_1
    //   130: invokevirtual 85	java/io/FileInputStream:close	()V
    //   133: iconst_0
    //   134: ireturn
    //   135: astore_0
    //   136: iconst_0
    //   137: ireturn
    //   138: astore_2
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_1
    //   142: astore_0
    //   143: ldc 44
    //   145: ldc 87
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_2
    //   154: invokestatic 91	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 95	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_1
    //   162: ifnull -134 -> 28
    //   165: aload_1
    //   166: invokevirtual 85	java/io/FileInputStream:close	()V
    //   169: iconst_0
    //   170: ireturn
    //   171: astore_0
    //   172: iconst_0
    //   173: ireturn
    //   174: astore_1
    //   175: aconst_null
    //   176: astore_0
    //   177: aload_0
    //   178: ifnull +7 -> 185
    //   181: aload_0
    //   182: invokevirtual 85	java/io/FileInputStream:close	()V
    //   185: aload_1
    //   186: athrow
    //   187: astore_0
    //   188: goto -61 -> 127
    //   191: astore_0
    //   192: goto -7 -> 185
    //   195: astore_1
    //   196: goto -19 -> 177
    //   199: astore_2
    //   200: goto -59 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	paramString	String
    //   38	128	1	localFileInputStream	java.io.FileInputStream
    //   174	12	1	localObject1	Object
    //   195	1	1	localObject2	Object
    //   45	61	2	localObject3	Object
    //   138	16	2	localException1	Exception
    //   199	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   129	133	135	java/io/IOException
    //   30	39	138	java/lang/Exception
    //   165	169	171	java/io/IOException
    //   30	39	174	finally
    //   123	127	187	java/io/IOException
    //   181	185	191	java/io/IOException
    //   41	46	195	finally
    //   48	57	195	finally
    //   59	64	195	finally
    //   66	73	195	finally
    //   75	80	195	finally
    //   82	103	195	finally
    //   105	114	195	finally
    //   116	123	195	finally
    //   143	161	195	finally
    //   41	46	199	java/lang/Exception
    //   48	57	199	java/lang/Exception
    //   59	64	199	java/lang/Exception
    //   66	73	199	java/lang/Exception
    //   75	80	199	java/lang/Exception
    //   82	103	199	java/lang/Exception
    //   105	114	199	java/lang/Exception
    //   116	123	199	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvideo/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */