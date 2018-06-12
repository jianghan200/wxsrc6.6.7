package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;

public final class h
  extends b
{
  public h(c.a parama, a parama1)
  {
    super(parama, parama1);
  }
  
  public final String MJ(String paramString)
  {
    return paramString;
  }
  
  public final boolean bza()
  {
    String str = i.j(this.caK);
    FileOp.i(this.nsN.getPath(), this.nsN.byY(), str);
    return true;
  }
  
  protected final int bzb()
  {
    return 2;
  }
  
  /* Error */
  public final boolean u(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 52
    //   2: ldc 54
    //   4: iconst_1
    //   5: anewarray 56	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: new 58	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   17: aload_0
    //   18: getfield 27	com/tencent/mm/plugin/sns/model/a/h:nsN	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   21: invokevirtual 33	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   24: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: getfield 27	com/tencent/mm/plugin/sns/model/a/h:nsN	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   31: invokevirtual 36	com/tencent/mm/plugin/sns/model/a/a:byY	()Ljava/lang/String;
    //   34: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 73	com/tencent/mm/modelsfs/f:mQ	(Ljava/lang/String;)Ljava/lang/String;
    //   43: aastore
    //   44: invokestatic 78	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: sipush 1024
    //   50: newarray <illegal type>
    //   52: astore 8
    //   54: new 58	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   61: aload_0
    //   62: getfield 27	com/tencent/mm/plugin/sns/model/a/h:nsN	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   65: invokevirtual 33	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   68: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_0
    //   72: getfield 27	com/tencent/mm/plugin/sns/model/a/h:nsN	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   75: invokevirtual 36	com/tencent/mm/plugin/sns/model/a/a:byY	()Ljava/lang/String;
    //   78: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 73	com/tencent/mm/modelsfs/f:mQ	(Ljava/lang/String;)Ljava/lang/String;
    //   87: invokestatic 82	com/tencent/mm/modelsfs/FileOp:jx	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   90: astore 7
    //   92: aload 7
    //   94: astore 6
    //   96: invokestatic 88	java/lang/System:currentTimeMillis	()J
    //   99: lstore 4
    //   101: aload 7
    //   103: astore 6
    //   105: aload_0
    //   106: getfield 92	com/tencent/mm/plugin/sns/model/a/h:nsY	Lcom/tencent/mm/pointers/PString;
    //   109: ldc 94
    //   111: putfield 100	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   114: iconst_0
    //   115: istore_2
    //   116: aload 7
    //   118: astore 6
    //   120: aload_1
    //   121: aload 8
    //   123: invokevirtual 106	java/io/InputStream:read	([B)I
    //   126: istore_3
    //   127: iload_3
    //   128: iconst_m1
    //   129: if_icmpeq +181 -> 310
    //   132: aload 7
    //   134: astore 6
    //   136: iload_3
    //   137: aload_0
    //   138: getfield 110	com/tencent/mm/plugin/sns/model/a/h:nsZ	I
    //   141: if_icmple +23 -> 164
    //   144: aload 7
    //   146: astore 6
    //   148: aload_0
    //   149: iload_3
    //   150: putfield 110	com/tencent/mm/plugin/sns/model/a/h:nsZ	I
    //   153: aload 7
    //   155: astore 6
    //   157: aload_0
    //   158: invokestatic 115	com/tencent/mm/sdk/platformtools/bi:VE	()J
    //   161: putfield 119	com/tencent/mm/plugin/sns/model/a/h:nta	J
    //   164: aload 7
    //   166: astore 6
    //   168: aload_0
    //   169: getfield 122	com/tencent/mm/plugin/sns/model/a/h:ntb	J
    //   172: lconst_0
    //   173: lcmp
    //   174: ifne +18 -> 192
    //   177: aload 7
    //   179: astore 6
    //   181: aload_0
    //   182: aload_0
    //   183: getfield 125	com/tencent/mm/plugin/sns/model/a/h:ntc	J
    //   186: invokestatic 129	com/tencent/mm/sdk/platformtools/bi:bH	(J)J
    //   189: putfield 122	com/tencent/mm/plugin/sns/model/a/h:ntb	J
    //   192: aload 7
    //   194: astore 6
    //   196: invokestatic 134	com/tencent/mm/plugin/sns/model/af:Gq	()Ljava/lang/String;
    //   199: invokestatic 138	com/tencent/mm/plugin/sns/data/i:LM	(Ljava/lang/String;)Z
    //   202: ifne +47 -> 249
    //   205: aload 7
    //   207: astore 6
    //   209: aload 7
    //   211: invokevirtual 143	java/io/OutputStream:close	()V
    //   214: aload 7
    //   216: astore 6
    //   218: aload_1
    //   219: invokevirtual 144	java/io/InputStream:close	()V
    //   222: aload 7
    //   224: ifnull +8 -> 232
    //   227: aload 7
    //   229: invokevirtual 143	java/io/OutputStream:close	()V
    //   232: iconst_0
    //   233: ireturn
    //   234: astore_1
    //   235: ldc 52
    //   237: aload_1
    //   238: ldc 94
    //   240: iconst_0
    //   241: anewarray 56	java/lang/Object
    //   244: invokestatic 148	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: iconst_0
    //   248: ireturn
    //   249: aload 7
    //   251: astore 6
    //   253: aload 7
    //   255: aload 8
    //   257: iconst_0
    //   258: iload_3
    //   259: invokevirtual 152	java/io/OutputStream:write	([BII)V
    //   262: aload 7
    //   264: astore 6
    //   266: aload_0
    //   267: aload_0
    //   268: getfield 155	com/tencent/mm/plugin/sns/model/a/h:nth	I
    //   271: iload_3
    //   272: iadd
    //   273: putfield 155	com/tencent/mm/plugin/sns/model/a/h:nth	I
    //   276: aload 7
    //   278: astore 6
    //   280: aload_0
    //   281: getfield 155	com/tencent/mm/plugin/sns/model/a/h:nth	I
    //   284: lload 4
    //   286: aload_0
    //   287: getfield 92	com/tencent/mm/plugin/sns/model/a/h:nsY	Lcom/tencent/mm/pointers/PString;
    //   290: invokestatic 159	com/tencent/mm/plugin/sns/model/a/h:a	(IJLcom/tencent/mm/pointers/PString;)Z
    //   293: ifeq +167 -> 460
    //   296: aload 7
    //   298: astore 6
    //   300: invokestatic 88	java/lang/System:currentTimeMillis	()J
    //   303: lstore 4
    //   305: iconst_0
    //   306: istore_2
    //   307: goto -191 -> 116
    //   310: aload 7
    //   312: astore 6
    //   314: aload 7
    //   316: invokevirtual 143	java/io/OutputStream:close	()V
    //   319: iload_2
    //   320: ifeq +16 -> 336
    //   323: aload_0
    //   324: getfield 155	com/tencent/mm/plugin/sns/model/a/h:nth	I
    //   327: lconst_0
    //   328: aload_0
    //   329: getfield 92	com/tencent/mm/plugin/sns/model/a/h:nsY	Lcom/tencent/mm/pointers/PString;
    //   332: invokestatic 159	com/tencent/mm/plugin/sns/model/a/h:a	(IJLcom/tencent/mm/pointers/PString;)Z
    //   335: pop
    //   336: iconst_1
    //   337: ireturn
    //   338: astore_1
    //   339: aconst_null
    //   340: astore 7
    //   342: aload 7
    //   344: astore 6
    //   346: ldc 52
    //   348: aload_1
    //   349: new 58	java/lang/StringBuilder
    //   352: dup
    //   353: ldc -95
    //   355: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   358: aload_1
    //   359: invokevirtual 167	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   362: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   368: iconst_0
    //   369: anewarray 56	java/lang/Object
    //   372: invokestatic 148	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   375: aload 7
    //   377: astore 6
    //   379: ldc 52
    //   381: aload_1
    //   382: ldc 94
    //   384: iconst_0
    //   385: anewarray 56	java/lang/Object
    //   388: invokestatic 148	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   391: aload 7
    //   393: ifnull -161 -> 232
    //   396: aload 7
    //   398: invokevirtual 143	java/io/OutputStream:close	()V
    //   401: iconst_0
    //   402: ireturn
    //   403: astore_1
    //   404: ldc 52
    //   406: aload_1
    //   407: ldc 94
    //   409: iconst_0
    //   410: anewarray 56	java/lang/Object
    //   413: invokestatic 148	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: iconst_0
    //   417: ireturn
    //   418: astore_1
    //   419: aconst_null
    //   420: astore 6
    //   422: aload 6
    //   424: ifnull +8 -> 432
    //   427: aload 6
    //   429: invokevirtual 143	java/io/OutputStream:close	()V
    //   432: aload_1
    //   433: athrow
    //   434: astore 6
    //   436: ldc 52
    //   438: aload 6
    //   440: ldc 94
    //   442: iconst_0
    //   443: anewarray 56	java/lang/Object
    //   446: invokestatic 148	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: goto -17 -> 432
    //   452: astore_1
    //   453: goto -31 -> 422
    //   456: astore_1
    //   457: goto -115 -> 342
    //   460: iconst_1
    //   461: istore_2
    //   462: goto -346 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	465	0	this	h
    //   0	465	1	paramInputStream	java.io.InputStream
    //   115	347	2	i	int
    //   126	147	3	j	int
    //   99	205	4	l	long
    //   94	334	6	localOutputStream1	java.io.OutputStream
    //   434	5	6	localIOException	java.io.IOException
    //   90	307	7	localOutputStream2	java.io.OutputStream
    //   52	204	8	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   227	232	234	java/io/IOException
    //   47	92	338	java/lang/Exception
    //   323	336	338	java/lang/Exception
    //   396	401	403	java/io/IOException
    //   47	92	418	finally
    //   323	336	418	finally
    //   427	432	434	java/io/IOException
    //   96	101	452	finally
    //   105	114	452	finally
    //   120	127	452	finally
    //   136	144	452	finally
    //   148	153	452	finally
    //   157	164	452	finally
    //   168	177	452	finally
    //   181	192	452	finally
    //   196	205	452	finally
    //   209	214	452	finally
    //   218	222	452	finally
    //   253	262	452	finally
    //   266	276	452	finally
    //   280	296	452	finally
    //   300	305	452	finally
    //   314	319	452	finally
    //   346	375	452	finally
    //   379	391	452	finally
    //   96	101	456	java/lang/Exception
    //   105	114	456	java/lang/Exception
    //   120	127	456	java/lang/Exception
    //   136	144	456	java/lang/Exception
    //   148	153	456	java/lang/Exception
    //   157	164	456	java/lang/Exception
    //   168	177	456	java/lang/Exception
    //   181	192	456	java/lang/Exception
    //   196	205	456	java/lang/Exception
    //   209	214	456	java/lang/Exception
    //   218	222	456	java/lang/Exception
    //   253	262	456	java/lang/Exception
    //   266	276	456	java/lang/Exception
    //   280	296	456	java/lang/Exception
    //   300	305	456	java/lang/Exception
    //   314	319	456	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */