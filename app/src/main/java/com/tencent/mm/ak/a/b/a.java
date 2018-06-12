package com.tencent.mm.ak.a.b;

import com.tencent.mm.ak.a.c.f;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class a
  implements com.tencent.mm.ak.a.c.a
{
  private f dYd;
  
  private String a(String paramString, com.tencent.mm.ak.a.a.c paramc)
  {
    Object localObject2 = paramc.dXA;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject2 = paramc.dXB;
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {
          localObject1 = (String)localObject2 + "/" + this.dYd.mc(paramString);
        }
      }
    }
    localObject2 = localObject1;
    if (paramc.dXx)
    {
      localObject2 = localObject1;
      if (bi.oW((String)localObject1)) {
        localObject2 = com.tencent.mm.ak.a.g.b.Pw() + "/" + this.dYd.mc(paramString);
      }
    }
    if (localObject2 != null)
    {
      paramString = (String)localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      paramString = null;
    }
    return paramString;
  }
  
  private String b(String paramString, com.tencent.mm.ak.a.a.c paramc)
  {
    String str1 = paramc.dXC;
    Object localObject;
    if (str1 != null)
    {
      localObject = str1;
      if (str1.length() != 0) {}
    }
    else
    {
      String str2 = paramc.dXA;
      localObject = str1;
      if (str2 != null)
      {
        localObject = str1;
        if (str2.length() > 0)
        {
          paramc = paramc.dXB;
          if ((paramc == null) || (paramc.length() == 0) || (!str2.startsWith(paramc)))
          {
            x.e("MicroMsg.imageloader.DefaultImageDiskCache", "[johnw] SFS can't deal with absolute path: %s", new Object[] { str2 });
            throw new IllegalArgumentException("SFS can't deal with absolute path: " + str2);
          }
          paramc = str2.substring(paramc.length());
          localObject = paramc;
          if (paramc.startsWith("/")) {
            localObject = paramc.substring(1);
          }
        }
      }
    }
    if (localObject != null)
    {
      paramc = (com.tencent.mm.ak.a.a.c)localObject;
      if (((String)localObject).length() != 0) {}
    }
    else
    {
      paramc = this.dYd.mc(paramString);
    }
    if (paramc != null)
    {
      paramString = paramc;
      if (paramc.length() != 0) {}
    }
    else
    {
      paramString = null;
    }
    return paramString;
  }
  
  public final void Pu()
  {
    com.tencent.mm.ak.a.g.b.Py();
  }
  
  public final void a(f paramf)
  {
    this.dYd = paramf;
  }
  
  /* Error */
  public final boolean a(String paramString, byte[] paramArrayOfByte, com.tencent.mm.ak.a.a.c paramc)
  {
    // Byte code:
    //   0: aload_3
    //   1: getfield 110	com/tencent/mm/ak/a/a/c:dXU	Lcom/tencent/mm/modelsfs/SFSContext;
    //   4: astore 9
    //   6: aload 9
    //   8: ifnull +165 -> 173
    //   11: aload_0
    //   12: aload_1
    //   13: aload_3
    //   14: invokespecial 112	com/tencent/mm/ak/a/b/a:b	(Ljava/lang/String;Lcom/tencent/mm/ak/a/a/c;)Ljava/lang/String;
    //   17: astore 8
    //   19: aload 8
    //   21: ifnonnull +5 -> 26
    //   24: iconst_0
    //   25: ireturn
    //   26: aconst_null
    //   27: astore 7
    //   29: aconst_null
    //   30: astore 6
    //   32: aload 6
    //   34: astore_1
    //   35: aload 7
    //   37: astore_3
    //   38: aload 9
    //   40: getfield 118	com/tencent/mm/modelsfs/SFSContext:mNativePtr	J
    //   43: lconst_0
    //   44: lcmp
    //   45: ifne +33 -> 78
    //   48: aload 6
    //   50: astore_1
    //   51: aload 7
    //   53: astore_3
    //   54: new 85	java/lang/IllegalArgumentException
    //   57: dup
    //   58: ldc 120
    //   60: invokespecial 91	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   63: athrow
    //   64: astore_2
    //   65: aload_1
    //   66: ifnull -42 -> 24
    //   69: aload_1
    //   70: invokevirtual 125	java/io/OutputStream:close	()V
    //   73: iconst_0
    //   74: ireturn
    //   75: astore_1
    //   76: iconst_0
    //   77: ireturn
    //   78: ldc 127
    //   80: astore 5
    //   82: aload 6
    //   84: astore_1
    //   85: aload 8
    //   87: astore 4
    //   89: aload 7
    //   91: astore_3
    //   92: aload 8
    //   94: invokestatic 132	com/tencent/mm/modelsfs/f:mP	(Ljava/lang/String;)Z
    //   97: ifeq +29 -> 126
    //   100: aload 6
    //   102: astore_1
    //   103: aload 7
    //   105: astore_3
    //   106: aload 8
    //   108: invokestatic 135	com/tencent/mm/modelsfs/f:mS	(Ljava/lang/String;)Ljava/lang/String;
    //   111: astore 5
    //   113: aload 6
    //   115: astore_1
    //   116: aload 7
    //   118: astore_3
    //   119: aload 8
    //   121: invokestatic 138	com/tencent/mm/modelsfs/f:mQ	(Ljava/lang/String;)Ljava/lang/String;
    //   124: astore 4
    //   126: aload 6
    //   128: astore_1
    //   129: aload 7
    //   131: astore_3
    //   132: aload 9
    //   134: aload 4
    //   136: aload 5
    //   138: invokevirtual 142	com/tencent/mm/modelsfs/SFSContext:aw	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //   141: astore 4
    //   143: aload 4
    //   145: astore_1
    //   146: aload 4
    //   148: astore_3
    //   149: aload 4
    //   151: aload_2
    //   152: invokevirtual 146	java/io/OutputStream:write	([B)V
    //   155: aload 4
    //   157: invokevirtual 125	java/io/OutputStream:close	()V
    //   160: iconst_1
    //   161: ireturn
    //   162: astore_1
    //   163: aload_3
    //   164: ifnull +7 -> 171
    //   167: aload_3
    //   168: invokevirtual 125	java/io/OutputStream:close	()V
    //   171: aload_1
    //   172: athrow
    //   173: aload_0
    //   174: aload_1
    //   175: aload_3
    //   176: invokespecial 148	com/tencent/mm/ak/a/b/a:a	(Ljava/lang/String;Lcom/tencent/mm/ak/a/a/c;)Ljava/lang/String;
    //   179: astore_1
    //   180: aload_1
    //   181: ifnull -157 -> 24
    //   184: new 150	com/tencent/mm/vfs/b
    //   187: dup
    //   188: aload_1
    //   189: invokespecial 151	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   192: invokevirtual 155	com/tencent/mm/vfs/b:cBW	()Lcom/tencent/mm/vfs/b;
    //   195: astore_3
    //   196: aload_3
    //   197: ifnull +15 -> 212
    //   200: aload_3
    //   201: invokevirtual 158	com/tencent/mm/vfs/b:exists	()Z
    //   204: ifne +8 -> 212
    //   207: aload_3
    //   208: invokevirtual 161	com/tencent/mm/vfs/b:mkdirs	()Z
    //   211: pop
    //   212: new 150	com/tencent/mm/vfs/b
    //   215: dup
    //   216: aload_1
    //   217: invokespecial 151	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   220: astore_3
    //   221: aload_3
    //   222: invokevirtual 158	com/tencent/mm/vfs/b:exists	()Z
    //   225: ifne +8 -> 233
    //   228: aload_3
    //   229: invokevirtual 164	com/tencent/mm/vfs/b:createNewFile	()Z
    //   232: pop
    //   233: aload_2
    //   234: ifnull -74 -> 160
    //   237: aload_1
    //   238: aload_2
    //   239: aload_2
    //   240: arraylength
    //   241: invokestatic 169	com/tencent/mm/vfs/d:b	(Ljava/lang/String;[BI)I
    //   244: ifge -84 -> 160
    //   247: iconst_0
    //   248: ireturn
    //   249: astore_3
    //   250: ldc 75
    //   252: aload_3
    //   253: invokestatic 173	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   256: invokestatic 176	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: goto -26 -> 233
    //   262: astore_1
    //   263: goto -103 -> 160
    //   266: astore_2
    //   267: goto -96 -> 171
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	a
    //   0	270	1	paramString	String
    //   0	270	2	paramArrayOfByte	byte[]
    //   0	270	3	paramc	com.tencent.mm.ak.a.a.c
    //   87	69	4	localObject1	Object
    //   80	57	5	str1	String
    //   30	97	6	localObject2	Object
    //   27	103	7	localObject3	Object
    //   17	103	8	str2	String
    //   4	129	9	localSFSContext	SFSContext
    // Exception table:
    //   from	to	target	type
    //   38	48	64	java/io/IOException
    //   54	64	64	java/io/IOException
    //   92	100	64	java/io/IOException
    //   106	113	64	java/io/IOException
    //   119	126	64	java/io/IOException
    //   132	143	64	java/io/IOException
    //   149	155	64	java/io/IOException
    //   69	73	75	java/io/IOException
    //   38	48	162	finally
    //   54	64	162	finally
    //   92	100	162	finally
    //   106	113	162	finally
    //   119	126	162	finally
    //   132	143	162	finally
    //   149	155	162	finally
    //   228	233	249	java/lang/Exception
    //   155	160	262	java/io/IOException
    //   167	171	266	java/io/IOException
  }
  
  public final boolean c(String paramString, com.tencent.mm.ak.a.a.c paramc)
  {
    SFSContext localSFSContext = paramc.dXU;
    if (localSFSContext != null)
    {
      paramString = b(paramString, paramc);
      if (paramString != null) {}
    }
    do
    {
      return false;
      return localSFSContext.jy(paramString);
      paramString = a(paramString, paramc);
    } while (paramString == null);
    return new com.tencent.mm.vfs.b(paramString).delete();
  }
  
  public final InputStream d(String paramString, com.tencent.mm.ak.a.a.c paramc)
  {
    try
    {
      SFSContext localSFSContext = paramc.dXU;
      if (localSFSContext != null)
      {
        paramString = b(paramString, paramc);
        if (paramString == null) {
          return null;
        }
        return localSFSContext.openRead(paramString);
      }
      paramString = a(paramString, paramc);
      if (paramString != null)
      {
        paramString = new com.tencent.mm.vfs.c(paramString);
        return paramString;
      }
    }
    catch (FileNotFoundException paramString) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */