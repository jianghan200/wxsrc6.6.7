package com.tencent.tencentmap.mapsdk.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class fu
{
  private static fu a = new fu();
  private int b = 20000;
  private Socket c;
  private int d = -1;
  private fv e;
  private ep f;
  private OutputStream g;
  private InputStream h;
  private int i = -1;
  private int j = -1;
  private long k = -1L;
  private int l = -1;
  private int m = -1;
  
  public static fu a()
  {
    try
    {
      fu localfu = a;
      return localfu;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      a(paramInt, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(int paramInt, String paramString)
  {
    try
    {
      if ((paramInt != this.d) && (this.e != null))
      {
        this.e.b = paramInt;
        if (paramString != null) {
          this.e.c = paramString;
        }
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  private boolean a(fv paramfv)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: iconst_0
    //   5: istore 4
    //   7: iload 4
    //   9: ifne +267 -> 276
    //   12: aload_1
    //   13: ifnull +146 -> 159
    //   16: invokestatic 72	java/lang/System:currentTimeMillis	()J
    //   19: aload_1
    //   20: getfield 74	com/tencent/tencentmap/mapsdk/a/fv:i	J
    //   23: lsub
    //   24: aload_1
    //   25: getfield 75	com/tencent/tencentmap/mapsdk/a/fv:j	I
    //   28: i2l
    //   29: lcmp
    //   30: ifge +129 -> 159
    //   33: iconst_0
    //   34: istore_3
    //   35: iload_3
    //   36: ifne +240 -> 276
    //   39: iload_2
    //   40: iconst_5
    //   41: if_icmpge +235 -> 276
    //   44: iload_2
    //   45: iconst_1
    //   46: iadd
    //   47: istore_3
    //   48: aload_0
    //   49: invokespecial 78	com/tencent/tencentmap/mapsdk/a/fu:c	()Z
    //   52: istore 5
    //   54: iload 5
    //   56: ifeq +211 -> 267
    //   59: ldc 80
    //   61: new 82	java/lang/StringBuilder
    //   64: dup
    //   65: ldc 84
    //   67: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   70: aload_1
    //   71: invokevirtual 90	com/tencent/tencentmap/mapsdk/a/fv:j	()I
    //   74: invokevirtual 94	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   77: ldc 96
    //   79: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_0
    //   83: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   86: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 113	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: aload_1
    //   96: invokevirtual 116	com/tencent/tencentmap/mapsdk/a/fv:k	()[B
    //   99: astore 6
    //   101: aload_0
    //   102: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   105: aload 6
    //   107: iconst_0
    //   108: aload 6
    //   110: arraylength
    //   111: invokevirtual 124	java/io/OutputStream:write	([BII)V
    //   114: aload_0
    //   115: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   118: invokevirtual 127	java/io/OutputStream:flush	()V
    //   121: aload_0
    //   122: invokestatic 72	java/lang/System:currentTimeMillis	()J
    //   125: putfield 46	com/tencent/tencentmap/mapsdk/a/fu:k	J
    //   128: ldc 80
    //   130: new 82	java/lang/StringBuilder
    //   133: dup
    //   134: ldc -127
    //   136: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload 6
    //   141: arraylength
    //   142: invokevirtual 94	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   145: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: invokestatic 131	com/tencent/tencentmap/mapsdk/a/fx:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: iconst_1
    //   152: istore 4
    //   154: iload_3
    //   155: istore_2
    //   156: goto -149 -> 7
    //   159: iconst_1
    //   160: istore_3
    //   161: goto -126 -> 35
    //   164: astore 6
    //   166: aload_1
    //   167: bipush -5
    //   169: putfield 60	com/tencent/tencentmap/mapsdk/a/fv:b	I
    //   172: aload_1
    //   173: aload 6
    //   175: invokestatic 136	com/tencent/tencentmap/mapsdk/a/fz:a	(Ljava/lang/Exception;)Ljava/lang/String;
    //   178: putfield 63	com/tencent/tencentmap/mapsdk/a/fv:c	Ljava/lang/String;
    //   181: iload_3
    //   182: istore_2
    //   183: iload 4
    //   185: ifne -178 -> 7
    //   188: aload_0
    //   189: aload_1
    //   190: getfield 60	com/tencent/tencentmap/mapsdk/a/fv:b	I
    //   193: invokespecial 138	com/tencent/tencentmap/mapsdk/a/fu:a	(I)V
    //   196: aload_0
    //   197: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   200: invokevirtual 141	java/io/OutputStream:close	()V
    //   203: aload_0
    //   204: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   207: invokevirtual 144	java/net/Socket:close	()V
    //   210: aload_0
    //   211: invokespecial 146	com/tencent/tencentmap/mapsdk/a/fu:e	()V
    //   214: iload_3
    //   215: istore_2
    //   216: goto -209 -> 7
    //   219: astore 6
    //   221: iload_3
    //   222: istore_2
    //   223: goto -216 -> 7
    //   226: astore 6
    //   228: iload 4
    //   230: ifne +29 -> 259
    //   233: aload_0
    //   234: aload_1
    //   235: getfield 60	com/tencent/tencentmap/mapsdk/a/fv:b	I
    //   238: invokespecial 138	com/tencent/tencentmap/mapsdk/a/fu:a	(I)V
    //   241: aload_0
    //   242: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   245: invokevirtual 141	java/io/OutputStream:close	()V
    //   248: aload_0
    //   249: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   252: invokevirtual 144	java/net/Socket:close	()V
    //   255: aload_0
    //   256: invokespecial 146	com/tencent/tencentmap/mapsdk/a/fu:e	()V
    //   259: aload 6
    //   261: athrow
    //   262: astore_1
    //   263: aload_0
    //   264: monitorexit
    //   265: aload_1
    //   266: athrow
    //   267: aload_0
    //   268: invokespecial 146	com/tencent/tencentmap/mapsdk/a/fu:e	()V
    //   271: iload_3
    //   272: istore_2
    //   273: goto -266 -> 7
    //   276: aload_0
    //   277: monitorexit
    //   278: iload 4
    //   280: ireturn
    //   281: astore_1
    //   282: goto -23 -> 259
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	this	fu
    //   0	285	1	paramfv	fv
    //   3	270	2	n	int
    //   34	238	3	i1	int
    //   5	274	4	bool1	boolean
    //   52	3	5	bool2	boolean
    //   99	41	6	arrayOfByte	byte[]
    //   164	10	6	localException1	Exception
    //   219	1	6	localException2	Exception
    //   226	34	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   59	151	164	java/lang/Exception
    //   188	214	219	java/lang/Exception
    //   59	151	226	finally
    //   166	181	226	finally
    //   16	33	262	finally
    //   48	54	262	finally
    //   188	214	262	finally
    //   233	259	262	finally
    //   259	262	262	finally
    //   267	271	262	finally
    //   233	259	281	java/lang/Exception
  }
  
  private void b()
  {
    int n = 0;
    long l1;
    Object localObject2;
    int i1;
    int i2;
    for (;;)
    {
      try
      {
        l1 = System.currentTimeMillis();
        try
        {
          fx.b("WupTaskController", "doReadData: try read data...sk:" + this.c);
          localObject2 = new byte[4];
          i1 = n;
          if (n < 4)
          {
            fx.a("WupTaskController", "try read packet size: 4 bytes");
            i2 = this.h.read((byte[])localObject2, n, 4 - n);
            if (i2 <= 0) {
              continue;
            }
            this.l = ((int)(System.currentTimeMillis() - this.k));
            i1 = n + i2;
            n = i1;
            if (i1 != 4) {
              continue;
            }
          }
          if (i1 != 4) {
            continue;
          }
          n = fz.a((byte[])localObject2, 0);
          if ((n > 4) && (n <= 524288)) {
            break;
          }
          a(-6, "packSizeFail:" + n);
        }
        catch (Exception localException1)
        {
          a(-7, fz.a(localException1));
          continue;
        }
        return;
      }
      finally {}
      i1 = n;
      if (i2 != -1)
      {
        continue;
        a(-6, "readLen fail:" + i1);
      }
    }
    byte[] arrayOfByte = new byte[n];
    System.arraycopy(localObject2, 0, arrayOfByte, 0, 4);
    long l2 = System.currentTimeMillis();
    label220:
    while (i1 < n)
    {
      i2 = n - i1;
      fx.a("WupTaskController", "try read:" + i2);
      i2 = this.h.read(arrayOfByte, i1, i2);
      fx.a("WupTaskController", "read ret:" + i2);
      if (i2 <= 0) {
        break label493;
      }
      i1 += i2;
    }
    for (;;)
    {
      if (i1 != n)
      {
        fx.c("WupTaskController", "read fail. readLen:" + i1 + ",packSize:" + n);
        a(-6, "readLen != packSize,rspBuff:" + fz.a(arrayOfByte));
        break;
      }
      this.m = ((int)(System.currentTimeMillis() - l2));
      fx.b("WupTaskController", "doSendReceive: read finish,readLen=" + i1);
      localObject2 = new gd();
      try
      {
        ((gd)localObject2).a(arrayOfByte);
        if (this.e == null) {
          break;
        }
        this.e.a = ((gd)localObject2);
        this.e.b = 0;
        this.m = ((int)(System.currentTimeMillis() - l1));
        this.e.f = this.l;
        this.e.d = this.j;
        this.e.g = this.m;
      }
      catch (Exception localException2)
      {
        a(-8, fz.a(localException2));
      }
      break;
      label493:
      if (i2 != -1) {
        break label220;
      }
    }
  }
  
  private boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.c != null)
      {
        bool1 = bool2;
        if (this.c.isConnected())
        {
          bool1 = bool2;
          if (!this.c.isClosed())
          {
            OutputStream localOutputStream = this.g;
            bool1 = bool2;
            if (localOutputStream != null) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    finally {}
  }
  
  /* Error */
  private void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +15 -> 23
    //   11: aload_0
    //   12: getfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   15: invokevirtual 208	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +15 -> 44
    //   32: aload_0
    //   33: getfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   36: invokevirtual 141	java/io/OutputStream:close	()V
    //   39: aload_0
    //   40: aconst_null
    //   41: putfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   44: aload_0
    //   45: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   48: astore_1
    //   49: aload_1
    //   50: ifnull +15 -> 65
    //   53: aload_0
    //   54: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   57: invokevirtual 144	java/net/Socket:close	()V
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   65: invokestatic 212	com/tencent/tencentmap/mapsdk/a/fr:a	()V
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: astore_1
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   77: goto -54 -> 23
    //   80: astore_1
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_1
    //   84: athrow
    //   85: astore_1
    //   86: aload_0
    //   87: aconst_null
    //   88: putfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   99: goto -55 -> 44
    //   102: astore_1
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   108: aload_1
    //   109: athrow
    //   110: astore_1
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   116: goto -51 -> 65
    //   119: astore_1
    //   120: aload_0
    //   121: aconst_null
    //   122: putfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	fu
    //   6	44	1	localObject1	Object
    //   71	1	1	localException1	Exception
    //   80	4	1	localObject2	Object
    //   85	7	1	localObject3	Object
    //   93	1	1	localException2	Exception
    //   102	7	1	localObject4	Object
    //   110	1	1	localException3	Exception
    //   119	7	1	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   11	18	71	java/lang/Exception
    //   2	7	80	finally
    //   18	23	80	finally
    //   23	28	80	finally
    //   39	44	80	finally
    //   44	49	80	finally
    //   60	65	80	finally
    //   65	68	80	finally
    //   72	77	80	finally
    //   86	93	80	finally
    //   94	99	80	finally
    //   103	110	80	finally
    //   111	116	80	finally
    //   120	127	80	finally
    //   11	18	85	finally
    //   32	39	93	java/lang/Exception
    //   32	39	102	finally
    //   53	60	110	java/lang/Exception
    //   53	60	119	finally
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 80
    //   6: ldc -42
    //   8: invokestatic 180	com/tencent/tencentmap/mapsdk/a/fx:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   11: new 216	com/tencent/tencentmap/mapsdk/a/ft
    //   14: dup
    //   15: invokespecial 217	com/tencent/tencentmap/mapsdk/a/ft:<init>	()V
    //   18: astore 7
    //   20: aload_0
    //   21: getfield 57	com/tencent/tencentmap/mapsdk/a/fu:e	Lcom/tencent/tencentmap/mapsdk/a/fv;
    //   24: getfield 75	com/tencent/tencentmap/mapsdk/a/fv:j	I
    //   27: ifle +369 -> 396
    //   30: aload 7
    //   32: aload_0
    //   33: getfield 57	com/tencent/tencentmap/mapsdk/a/fu:e	Lcom/tencent/tencentmap/mapsdk/a/fv;
    //   36: getfield 75	com/tencent/tencentmap/mapsdk/a/fv:j	I
    //   39: invokeinterface 220 2 0
    //   44: aload 7
    //   46: invokestatic 225	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   49: getfield 228	com/tencent/tencentmap/mapsdk/a/dx:b	Lcom/tencent/tencentmap/mapsdk/a/dz;
    //   52: getfield 231	com/tencent/tencentmap/mapsdk/a/dz:d	I
    //   55: invokeinterface 233 2 0
    //   60: getstatic 238	com/tencent/tencentmap/mapsdk/a/dy:a	[I
    //   63: astore 8
    //   65: aload 7
    //   67: ldc -16
    //   69: invokeinterface 242 2 0
    //   74: aload 7
    //   76: aload 8
    //   78: invokeinterface 245 2 0
    //   83: invokestatic 250	com/tencent/tencentmap/mapsdk/a/er:a	()Lcom/tencent/tencentmap/mapsdk/a/er;
    //   86: ldc -16
    //   88: invokevirtual 253	com/tencent/tencentmap/mapsdk/a/er:a	(Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/a/eq$a;
    //   91: astore 8
    //   93: aload 8
    //   95: ifnull +32 -> 127
    //   98: new 255	java/util/ArrayList
    //   101: dup
    //   102: invokespecial 256	java/util/ArrayList:<init>	()V
    //   105: astore 9
    //   107: aload 9
    //   109: aload 8
    //   111: invokevirtual 261	com/tencent/tencentmap/mapsdk/a/eq$a:c	()Ljava/util/List;
    //   114: invokevirtual 265	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   117: pop
    //   118: aload 7
    //   120: aload 9
    //   122: invokeinterface 268 2 0
    //   127: invokestatic 225	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   130: getfield 271	com/tencent/tencentmap/mapsdk/a/dx:a	Lcom/tencent/tencentmap/mapsdk/a/dy;
    //   133: getfield 273	com/tencent/tencentmap/mapsdk/a/dy:b	J
    //   136: lstore_3
    //   137: lload_3
    //   138: lconst_0
    //   139: lcmp
    //   140: ifgt +282 -> 422
    //   143: aload 7
    //   145: invokestatic 225	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   148: getfield 271	com/tencent/tencentmap/mapsdk/a/dx:a	Lcom/tencent/tencentmap/mapsdk/a/dy;
    //   151: invokevirtual 276	com/tencent/tencentmap/mapsdk/a/dy:c	()Ljava/util/ArrayList;
    //   154: iload_2
    //   155: invokeinterface 279 3 0
    //   160: aload_0
    //   161: iconst_0
    //   162: putfield 42	com/tencent/tencentmap/mapsdk/a/fu:j	I
    //   165: aload 7
    //   167: invokeinterface 280 1 0
    //   172: aload_0
    //   173: aload 7
    //   175: invokeinterface 282 1 0
    //   180: putfield 40	com/tencent/tencentmap/mapsdk/a/fu:i	I
    //   183: aload_0
    //   184: aload 7
    //   186: invokeinterface 284 1 0
    //   191: putfield 42	com/tencent/tencentmap/mapsdk/a/fu:j	I
    //   194: aload_0
    //   195: getfield 57	com/tencent/tencentmap/mapsdk/a/fu:e	Lcom/tencent/tencentmap/mapsdk/a/fv;
    //   198: aload_0
    //   199: getfield 40	com/tencent/tencentmap/mapsdk/a/fu:i	I
    //   202: putfield 286	com/tencent/tencentmap/mapsdk/a/fv:e	I
    //   205: aload_0
    //   206: getfield 57	com/tencent/tencentmap/mapsdk/a/fu:e	Lcom/tencent/tencentmap/mapsdk/a/fv;
    //   209: aload_0
    //   210: getfield 42	com/tencent/tencentmap/mapsdk/a/fu:j	I
    //   213: putfield 199	com/tencent/tencentmap/mapsdk/a/fv:d	I
    //   216: aload 7
    //   218: invokeinterface 288 1 0
    //   223: ifne +355 -> 578
    //   226: aload_0
    //   227: aload 7
    //   229: invokeinterface 291 1 0
    //   234: putfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   237: aload_0
    //   238: aload 7
    //   240: invokeinterface 294 1 0
    //   245: putfield 296	com/tencent/tencentmap/mapsdk/a/fu:f	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   248: aload_0
    //   249: getfield 57	com/tencent/tencentmap/mapsdk/a/fu:e	Lcom/tencent/tencentmap/mapsdk/a/fv;
    //   252: aload_0
    //   253: getfield 296	com/tencent/tencentmap/mapsdk/a/fu:f	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   256: putfield 298	com/tencent/tencentmap/mapsdk/a/fv:h	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   259: ldc 80
    //   261: new 82	java/lang/StringBuilder
    //   264: dup
    //   265: ldc_w 300
    //   268: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   271: aload_0
    //   272: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   275: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   278: ldc_w 302
    //   281: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: aload_0
    //   285: getfield 296	com/tencent/tencentmap/mapsdk/a/fu:f	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   288: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: invokestatic 180	com/tencent/tencentmap/mapsdk/a/fx:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: aload_0
    //   298: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   301: ifnull +210 -> 511
    //   304: aload_0
    //   305: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   308: invokevirtual 204	java/net/Socket:isConnected	()Z
    //   311: ifeq +200 -> 511
    //   314: aload_0
    //   315: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   318: invokevirtual 207	java/net/Socket:isClosed	()Z
    //   321: istore_2
    //   322: iload_2
    //   323: ifne +188 -> 511
    //   326: aload_0
    //   327: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   330: aload_0
    //   331: getfield 36	com/tencent/tencentmap/mapsdk/a/fu:b	I
    //   334: invokevirtual 305	java/net/Socket:setSoTimeout	(I)V
    //   337: aload_0
    //   338: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   341: ldc -94
    //   343: invokevirtual 308	java/net/Socket:setReceiveBufferSize	(I)V
    //   346: aload_0
    //   347: aload_0
    //   348: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   351: invokevirtual 312	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   354: putfield 118	com/tencent/tencentmap/mapsdk/a/fu:g	Ljava/io/OutputStream;
    //   357: aload_0
    //   358: aload_0
    //   359: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   362: invokevirtual 316	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   365: putfield 152	com/tencent/tencentmap/mapsdk/a/fu:h	Ljava/io/InputStream;
    //   368: ldc 80
    //   370: new 82	java/lang/StringBuilder
    //   373: dup
    //   374: ldc_w 318
    //   377: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   380: aload_0
    //   381: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   384: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   387: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   390: invokestatic 113	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   393: aload_0
    //   394: monitorexit
    //   395: return
    //   396: aload 7
    //   398: invokestatic 225	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   401: getfield 228	com/tencent/tencentmap/mapsdk/a/dx:b	Lcom/tencent/tencentmap/mapsdk/a/dz;
    //   404: getfield 320	com/tencent/tencentmap/mapsdk/a/dz:a	I
    //   407: invokeinterface 220 2 0
    //   412: goto -368 -> 44
    //   415: astore 7
    //   417: aload_0
    //   418: monitorexit
    //   419: aload 7
    //   421: athrow
    //   422: invokestatic 72	java/lang/System:currentTimeMillis	()J
    //   425: lstore 5
    //   427: invokestatic 225	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   430: getfield 228	com/tencent/tencentmap/mapsdk/a/dx:b	Lcom/tencent/tencentmap/mapsdk/a/dz;
    //   433: getfield 321	com/tencent/tencentmap/mapsdk/a/dz:e	I
    //   436: istore_1
    //   437: lload_3
    //   438: iload_1
    //   439: bipush 60
    //   441: imul
    //   442: sipush 1000
    //   445: imul
    //   446: i2l
    //   447: ladd
    //   448: lload 5
    //   450: lcmp
    //   451: iflt -308 -> 143
    //   454: iconst_0
    //   455: istore_2
    //   456: goto -313 -> 143
    //   459: astore 7
    //   461: ldc 80
    //   463: new 82	java/lang/StringBuilder
    //   466: dup
    //   467: ldc_w 323
    //   470: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   473: aload_0
    //   474: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   477: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   480: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   483: aload 7
    //   485: invokestatic 326	com/tencent/tencentmap/mapsdk/a/fx:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   488: aload_0
    //   489: bipush -3
    //   491: aload 7
    //   493: invokestatic 136	com/tencent/tencentmap/mapsdk/a/fz:a	(Ljava/lang/Exception;)Ljava/lang/String;
    //   496: invokespecial 55	com/tencent/tencentmap/mapsdk/a/fu:a	(ILjava/lang/String;)V
    //   499: aload_0
    //   500: invokespecial 328	com/tencent/tencentmap/mapsdk/a/fu:d	()V
    //   503: goto -110 -> 393
    //   506: astore 7
    //   508: aload 7
    //   510: athrow
    //   511: aload_0
    //   512: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   515: ifnonnull +15 -> 530
    //   518: aload_0
    //   519: bipush -3
    //   521: ldc_w 330
    //   524: invokespecial 55	com/tencent/tencentmap/mapsdk/a/fu:a	(ILjava/lang/String;)V
    //   527: goto -134 -> 393
    //   530: aload_0
    //   531: bipush -3
    //   533: new 82	java/lang/StringBuilder
    //   536: dup
    //   537: ldc_w 332
    //   540: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   543: aload_0
    //   544: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   547: invokevirtual 204	java/net/Socket:isConnected	()Z
    //   550: invokevirtual 335	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   553: ldc_w 337
    //   556: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: aload_0
    //   560: getfield 101	com/tencent/tencentmap/mapsdk/a/fu:c	Ljava/net/Socket;
    //   563: invokevirtual 207	java/net/Socket:isClosed	()Z
    //   566: invokevirtual 335	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   569: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   572: invokespecial 55	com/tencent/tencentmap/mapsdk/a/fu:a	(ILjava/lang/String;)V
    //   575: goto -182 -> 393
    //   578: invokestatic 341	com/tencent/tencentmap/mapsdk/a/fw:e	()Z
    //   581: ifeq +74 -> 655
    //   584: ldc_w 343
    //   587: bipush 80
    //   589: sipush 5000
    //   592: invokestatic 348	com/tencent/tencentmap/mapsdk/a/ee:a	(Ljava/lang/String;II)Z
    //   595: ifeq +51 -> 646
    //   598: aload_0
    //   599: bipush -3
    //   601: new 82	java/lang/StringBuilder
    //   604: dup
    //   605: ldc_w 350
    //   608: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   611: aload 7
    //   613: invokeinterface 288 1 0
    //   618: invokevirtual 94	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   621: ldc_w 352
    //   624: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: aload 7
    //   629: invokeinterface 354 1 0
    //   634: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   640: invokespecial 55	com/tencent/tencentmap/mapsdk/a/fu:a	(ILjava/lang/String;)V
    //   643: goto -250 -> 393
    //   646: aload_0
    //   647: bipush -16
    //   649: invokespecial 138	com/tencent/tencentmap/mapsdk/a/fu:a	(I)V
    //   652: goto -259 -> 393
    //   655: aload_0
    //   656: bipush -4
    //   658: invokespecial 138	com/tencent/tencentmap/mapsdk/a/fu:a	(I)V
    //   661: goto -268 -> 393
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	664	0	this	fu
    //   436	6	1	n	int
    //   1	455	2	bool	boolean
    //   136	302	3	l1	long
    //   425	24	5	l2	long
    //   18	379	7	localft	ft
    //   415	5	7	localObject1	Object
    //   459	33	7	localException	Exception
    //   506	122	7	localObject2	Object
    //   63	47	8	localObject3	Object
    //   105	16	9	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   4	44	415	finally
    //   44	93	415	finally
    //   98	127	415	finally
    //   127	137	415	finally
    //   143	322	415	finally
    //   396	412	415	finally
    //   422	437	415	finally
    //   508	511	415	finally
    //   511	527	415	finally
    //   530	575	415	finally
    //   578	643	415	finally
    //   646	652	415	finally
    //   655	661	415	finally
    //   326	393	459	java/lang/Exception
    //   326	393	506	finally
    //   461	503	506	finally
  }
  
  public final void a(fv paramfv, int paramInt)
  {
    if (paramfv == null) {}
    for (;;)
    {
      return;
      try
      {
        this.e = paramfv;
        this.e.i = System.currentTimeMillis();
        this.e.j = (paramInt * 1000);
        e();
        if (c())
        {
          a(paramfv);
          b();
          d();
          return;
        }
      }
      catch (Exception paramfv) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */