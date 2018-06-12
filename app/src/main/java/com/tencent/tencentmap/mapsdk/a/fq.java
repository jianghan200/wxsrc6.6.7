package com.tencent.tencentmap.mapsdk.a;

import java.io.IOException;
import java.net.Socket;

public class fq
{
  private int a;
  private String b = "";
  private Socket c = null;
  private String d;
  private int e = -1;
  private int f = -1;
  private ep g;
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: ldc 34
    //   5: new 36	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 38
    //   11: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: invokestatic 47	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   17: invokevirtual 51	java/lang/Thread:getName	()Ljava/lang/String;
    //   20: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: ldc 57
    //   25: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokestatic 47	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   31: invokevirtual 61	java/lang/Thread:isDaemon	()Z
    //   34: invokevirtual 64	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   37: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 72	com/tencent/tencentmap/mapsdk/a/fx:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   46: lstore_1
    //   47: aload_0
    //   48: getfield 23	com/tencent/tencentmap/mapsdk/a/fq:b	Ljava/lang/String;
    //   51: invokestatic 84	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   54: istore 5
    //   56: iload 5
    //   58: ifne +180 -> 238
    //   61: aload_0
    //   62: getfield 23	com/tencent/tencentmap/mapsdk/a/fq:b	Ljava/lang/String;
    //   65: invokestatic 90	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   68: astore 7
    //   70: aload 7
    //   72: astore 6
    //   74: aload_0
    //   75: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   78: lload_1
    //   79: lsub
    //   80: l2i
    //   81: putfield 27	com/tencent/tencentmap/mapsdk/a/fq:e	I
    //   84: new 92	java/net/InetSocketAddress
    //   87: dup
    //   88: aload 6
    //   90: invokevirtual 95	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   93: sipush 14000
    //   96: invokespecial 98	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   99: astore 6
    //   101: new 100	java/net/Socket
    //   104: dup
    //   105: invokespecial 101	java/net/Socket:<init>	()V
    //   108: astore 7
    //   110: lconst_0
    //   111: lstore_1
    //   112: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   115: lstore_3
    //   116: lload_3
    //   117: lstore_1
    //   118: aload_0
    //   119: invokestatic 106	com/tencent/tencentmap/mapsdk/a/dx:a	()Lcom/tencent/tencentmap/mapsdk/a/dx;
    //   122: getfield 109	com/tencent/tencentmap/mapsdk/a/dx:b	Lcom/tencent/tencentmap/mapsdk/a/dz;
    //   125: getfield 113	com/tencent/tencentmap/mapsdk/a/dz:a	I
    //   128: putfield 114	com/tencent/tencentmap/mapsdk/a/fq:a	I
    //   131: lload_3
    //   132: lstore_1
    //   133: aload 7
    //   135: aload 6
    //   137: aload_0
    //   138: getfield 114	com/tencent/tencentmap/mapsdk/a/fq:a	I
    //   141: invokevirtual 118	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   144: lload_3
    //   145: lstore_1
    //   146: aload 7
    //   148: invokevirtual 121	java/net/Socket:isConnected	()Z
    //   151: ifeq +33 -> 184
    //   154: lload_3
    //   155: lstore_1
    //   156: aload 7
    //   158: invokevirtual 124	java/net/Socket:isClosed	()Z
    //   161: ifne +23 -> 184
    //   164: lload_3
    //   165: lstore_1
    //   166: aload_0
    //   167: aload 7
    //   169: putfield 25	com/tencent/tencentmap/mapsdk/a/fq:c	Ljava/net/Socket;
    //   172: lload_3
    //   173: lstore_1
    //   174: aload_0
    //   175: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   178: lload_3
    //   179: lsub
    //   180: l2i
    //   181: putfield 29	com/tencent/tencentmap/mapsdk/a/fq:f	I
    //   184: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   187: pop2
    //   188: return
    //   189: astore 7
    //   191: aload 7
    //   193: invokevirtual 128	java/lang/Object:getClass	()Ljava/lang/Class;
    //   196: invokevirtual 133	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   199: pop
    //   200: aload_0
    //   201: new 36	java/lang/StringBuilder
    //   204: dup
    //   205: ldc -121
    //   207: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 23	com/tencent/tencentmap/mapsdk/a/fq:b	Ljava/lang/String;
    //   214: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: putfield 137	com/tencent/tencentmap/mapsdk/a/fq:d	Ljava/lang/String;
    //   223: goto -149 -> 74
    //   226: astore 6
    //   228: aload_0
    //   229: aload 6
    //   231: invokestatic 142	com/tencent/tencentmap/mapsdk/a/fz:a	(Ljava/lang/Exception;)Ljava/lang/String;
    //   234: putfield 137	com/tencent/tencentmap/mapsdk/a/fq:d	Ljava/lang/String;
    //   237: return
    //   238: new 92	java/net/InetSocketAddress
    //   241: dup
    //   242: aload_0
    //   243: getfield 144	com/tencent/tencentmap/mapsdk/a/fq:g	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   246: invokevirtual 148	com/tencent/tencentmap/mapsdk/a/ep:a	()Ljava/lang/String;
    //   249: aload_0
    //   250: getfield 144	com/tencent/tencentmap/mapsdk/a/fq:g	Lcom/tencent/tencentmap/mapsdk/a/ep;
    //   253: invokevirtual 151	com/tencent/tencentmap/mapsdk/a/ep:b	()I
    //   256: invokespecial 98	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   259: astore 6
    //   261: aload_0
    //   262: iconst_0
    //   263: putfield 27	com/tencent/tencentmap/mapsdk/a/fq:e	I
    //   266: goto -165 -> 101
    //   269: astore 6
    //   271: aload 6
    //   273: invokevirtual 128	java/lang/Object:getClass	()Ljava/lang/Class;
    //   276: invokevirtual 133	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   279: pop
    //   280: aload_0
    //   281: aload 6
    //   283: invokestatic 142	com/tencent/tencentmap/mapsdk/a/fz:a	(Ljava/lang/Exception;)Ljava/lang/String;
    //   286: putfield 137	com/tencent/tencentmap/mapsdk/a/fq:d	Ljava/lang/String;
    //   289: aload_0
    //   290: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   293: lload_1
    //   294: lsub
    //   295: l2i
    //   296: putfield 29	com/tencent/tencentmap/mapsdk/a/fq:f	I
    //   299: aload_0
    //   300: aconst_null
    //   301: putfield 25	com/tencent/tencentmap/mapsdk/a/fq:c	Ljava/net/Socket;
    //   304: goto -120 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	fq
    //   46	248	1	l1	long
    //   115	64	3	l2	long
    //   54	3	5	bool	boolean
    //   1	135	6	localObject1	Object
    //   226	4	6	localException1	Exception
    //   259	1	6	localInetSocketAddress	java.net.InetSocketAddress
    //   269	13	6	localException2	Exception
    //   68	100	7	localObject2	Object
    //   189	3	7	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   61	70	189	java/lang/Exception
    //   3	56	226	java/lang/Exception
    //   74	101	226	java/lang/Exception
    //   101	110	226	java/lang/Exception
    //   184	188	226	java/lang/Exception
    //   191	223	226	java/lang/Exception
    //   238	266	226	java/lang/Exception
    //   271	304	226	java/lang/Exception
    //   112	116	269	java/lang/Exception
    //   118	131	269	java/lang/Exception
    //   133	144	269	java/lang/Exception
    //   146	154	269	java/lang/Exception
    //   156	164	269	java/lang/Exception
    //   166	172	269	java/lang/Exception
    //   174	184	269	java/lang/Exception
  }
  
  public void a(ep paramep)
  {
    this.g = paramep;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void b()
  {
    try
    {
      this.c.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public Socket c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */