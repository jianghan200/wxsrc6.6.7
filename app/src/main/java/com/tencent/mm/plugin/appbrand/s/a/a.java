package com.tencent.mm.plugin.appbrand.s.a;

import com.tencent.mm.plugin.appbrand.s.a.b;
import com.tencent.mm.plugin.appbrand.s.c;
import com.tencent.mm.plugin.appbrand.s.e.f;
import com.tencent.mm.plugin.appbrand.s.e.h;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public abstract class a
  extends com.tencent.mm.plugin.appbrand.s.b
  implements com.tencent.mm.plugin.appbrand.s.a, Runnable
{
  public Timer bno = null;
  public String fEl;
  private com.tencent.mm.plugin.appbrand.s.b.a gCT;
  protected URI gDc = null;
  public c gDd = null;
  private Socket gDe = null;
  private InputStream gDf;
  OutputStream gDg;
  private Proxy gDh = Proxy.NO_PROXY;
  public Runnable gDi;
  private Map<String, String> gDj;
  private CountDownLatch gDk = new CountDownLatch(1);
  private CountDownLatch gDl = new CountDownLatch(1);
  private int gDm = 0;
  
  public a(URI paramURI, com.tencent.mm.plugin.appbrand.s.b.a parama, Map<String, String> paramMap, int paramInt)
  {
    if (paramURI == null) {
      throw new IllegalArgumentException();
    }
    if (parama == null) {
      throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
    this.gDc = paramURI;
    this.gCT = parama;
    this.gDj = paramMap;
    this.gDm = paramInt;
    this.gDd = new c(this, parama);
    this.gCI = false;
  }
  
  private void aoG()
  {
    Object localObject2 = this.gDc.getPath();
    Object localObject3 = this.gDc.getQuery();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject1 = "/";
    }
    localObject2 = localObject1;
    if (localObject3 != null) {
      localObject2 = (String)localObject1 + "?" + (String)localObject3;
    }
    int i = getPort();
    localObject3 = new StringBuilder().append(this.gDc.getHost());
    if (i != 80) {}
    for (Object localObject1 = ":" + i;; localObject1 = "")
    {
      localObject3 = (String)localObject1;
      localObject1 = new com.tencent.mm.plugin.appbrand.s.e.d();
      ((com.tencent.mm.plugin.appbrand.s.e.d)localObject1).vY((String)localObject2);
      ((com.tencent.mm.plugin.appbrand.s.e.d)localObject1).put("Host", (String)localObject3);
      if (this.gDj == null) {
        break;
      }
      localObject2 = this.gDj.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        ((com.tencent.mm.plugin.appbrand.s.e.d)localObject1).put((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
      }
    }
    localObject2 = this.gDd;
    ((c)localObject2).gCX = ((c)localObject2).gCT.a((com.tencent.mm.plugin.appbrand.s.e.b)localObject1);
    ((c)localObject2).gDb = ((com.tencent.mm.plugin.appbrand.s.e.b)localObject1).aoO();
    if (((c)localObject2).gDb != null) {}
    try
    {
      ((c)localObject2).gCR.b(((c)localObject2).gCX);
      localObject1 = ((c)localObject2).gCT;
      localObject1 = ((c)localObject2).gCX;
      i = ((c)localObject2).gCU;
      ((c)localObject2).ar(com.tencent.mm.plugin.appbrand.s.b.a.e((f)localObject1));
      return;
    }
    catch (com.tencent.mm.plugin.appbrand.s.c.b localb)
    {
      throw new com.tencent.mm.plugin.appbrand.s.c.d("Handshake data rejected by client.");
    }
    catch (RuntimeException localRuntimeException)
    {
      ((c)localObject2).gCR.f(localRuntimeException);
      throw new com.tencent.mm.plugin.appbrand.s.c.d("rejected because of" + localRuntimeException);
    }
  }
  
  private int getPort()
  {
    int j = this.gDc.getPort();
    int i = j;
    String str;
    if (j == -1)
    {
      str = this.gDc.getScheme();
      if (str.equals("wss")) {
        i = 443;
      }
    }
    else
    {
      return i;
    }
    if (str.equals("ws")) {
      return 80;
    }
    throw new RuntimeException("unkonow scheme" + str);
  }
  
  public abstract void F(int paramInt, String paramString);
  
  public final void R(int paramInt, String paramString)
  {
    this.gDk.countDown();
    this.gDl.countDown();
    if (this.gDi != null) {
      e.S(this.gDi);
    }
    try
    {
      if (this.gDe != null) {
        this.gDe.close();
      }
      F(paramInt, paramString);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        c(localIOException);
      }
    }
  }
  
  public final void S(int paramInt, String paramString)
  {
    this.gDd.d(paramInt, paramString, false);
  }
  
  public void a(com.tencent.mm.plugin.appbrand.s.d.d paramd) {}
  
  public final void a(Socket paramSocket)
  {
    if (this.gDe != null)
    {
      x.i("MicroMsg.AppBrandNetWork.WebSocketClient", "socket has already been set");
      return;
    }
    this.gDe = paramSocket;
  }
  
  public final void b(com.tencent.mm.plugin.appbrand.s.d.d paramd)
  {
    this.gDd.b(paramd);
  }
  
  public abstract void b(h paramh);
  
  public final void c(com.tencent.mm.plugin.appbrand.s.d.d paramd)
  {
    a(paramd);
  }
  
  public abstract void c(Exception paramException);
  
  public final void close()
  {
    if (this.gDi != null) {
      this.gDd.d(1000, "", false);
    }
  }
  
  public final void connect()
  {
    if (this.gDi != null)
    {
      x.i("MicroMsg.AppBrandNetWork.WebSocketClient", "WebSocketClient objects are not reuseable");
      return;
    }
    this.gDi = this;
    e.post(this.gDi, "WebsocketWriteThread");
  }
  
  public final void d(f paramf)
  {
    this.gDk.countDown();
    b((h)paramf);
  }
  
  public final void f(Exception paramException)
  {
    c(paramException);
  }
  
  public void g(ByteBuffer paramByteBuffer) {}
  
  public final void p(ByteBuffer paramByteBuffer)
  {
    g(paramByteBuffer);
  }
  
  public final void q(ByteBuffer paramByteBuffer)
  {
    c localc = this.gDd;
    if (paramByteBuffer == null)
    {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
      return;
    }
    com.tencent.mm.plugin.appbrand.s.b.a locala = localc.gCT;
    if (localc.gCU == a.b.gCF) {}
    for (boolean bool = true;; bool = false)
    {
      localc.d(locala.a(paramByteBuffer, bool));
      return;
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   4: ifnonnull +182 -> 186
    //   7: aload_0
    //   8: new 243	java/net/Socket
    //   11: dup
    //   12: aload_0
    //   13: getfield 57	com/tencent/mm/plugin/appbrand/s/a/a:gDh	Ljava/net/Proxy;
    //   16: invokespecial 340	java/net/Socket:<init>	(Ljava/net/Proxy;)V
    //   19: putfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   22: aload_0
    //   23: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   26: aload_0
    //   27: getfield 91	com/tencent/mm/plugin/appbrand/s/b:gCI	Z
    //   30: invokevirtual 344	java/net/Socket:setTcpNoDelay	(Z)V
    //   33: aload_0
    //   34: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   37: invokevirtual 347	java/net/Socket:isBound	()Z
    //   40: ifne +32 -> 72
    //   43: aload_0
    //   44: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   47: new 349	java/net/InetSocketAddress
    //   50: dup
    //   51: aload_0
    //   52: getfield 46	com/tencent/mm/plugin/appbrand/s/a/a:gDc	Ljava/net/URI;
    //   55: invokevirtual 134	java/net/URI:getHost	()Ljava/lang/String;
    //   58: aload_0
    //   59: invokespecial 131	com/tencent/mm/plugin/appbrand/s/a/a:getPort	()I
    //   62: invokespecial 352	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   65: aload_0
    //   66: getfield 68	com/tencent/mm/plugin/appbrand/s/a/a:gDm	I
    //   69: invokevirtual 355	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   72: aload_0
    //   73: aload_0
    //   74: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   77: invokevirtual 359	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   80: putfield 361	com/tencent/mm/plugin/appbrand/s/a/a:gDf	Ljava/io/InputStream;
    //   83: aload_0
    //   84: aload_0
    //   85: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   88: invokevirtual 365	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   91: putfield 367	com/tencent/mm/plugin/appbrand/s/a/a:gDg	Ljava/io/OutputStream;
    //   94: aload_0
    //   95: invokespecial 369	com/tencent/mm/plugin/appbrand/s/a/a:aoG	()V
    //   98: aload_0
    //   99: new 10	com/tencent/mm/plugin/appbrand/s/a/a$a
    //   102: dup
    //   103: aload_0
    //   104: iconst_0
    //   105: invokespecial 372	com/tencent/mm/plugin/appbrand/s/a/a$a:<init>	(Lcom/tencent/mm/plugin/appbrand/s/a/a;B)V
    //   108: putfield 272	com/tencent/mm/plugin/appbrand/s/a/a:gDi	Ljava/lang/Runnable;
    //   111: aload_0
    //   112: getfield 272	com/tencent/mm/plugin/appbrand/s/a/a:gDi	Ljava/lang/Runnable;
    //   115: ldc_w 304
    //   118: invokestatic 308	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   121: getstatic 375	com/tencent/mm/plugin/appbrand/s/c:gCJ	I
    //   124: newarray <illegal type>
    //   126: astore_2
    //   127: aload_0
    //   128: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   131: invokevirtual 378	com/tencent/mm/plugin/appbrand/s/c:aoF	()Z
    //   134: ifne +84 -> 218
    //   137: aload_0
    //   138: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   141: invokevirtual 381	com/tencent/mm/plugin/appbrand/s/c:isClosed	()Z
    //   144: ifne +74 -> 218
    //   147: aload_0
    //   148: getfield 361	com/tencent/mm/plugin/appbrand/s/a/a:gDf	Ljava/io/InputStream;
    //   151: aload_2
    //   152: invokevirtual 387	java/io/InputStream:read	([B)I
    //   155: istore_1
    //   156: iload_1
    //   157: iconst_m1
    //   158: if_icmpeq +60 -> 218
    //   161: aload_0
    //   162: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   165: aload_2
    //   166: iconst_0
    //   167: iload_1
    //   168: invokestatic 393	java/nio/ByteBuffer:wrap	([BII)Ljava/nio/ByteBuffer;
    //   171: invokevirtual 396	com/tencent/mm/plugin/appbrand/s/c:l	(Ljava/nio/ByteBuffer;)V
    //   174: goto -47 -> 127
    //   177: astore_2
    //   178: aload_0
    //   179: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   182: invokevirtual 399	com/tencent/mm/plugin/appbrand/s/c:aoE	()V
    //   185: return
    //   186: aload_0
    //   187: getfield 50	com/tencent/mm/plugin/appbrand/s/a/a:gDe	Ljava/net/Socket;
    //   190: invokevirtual 400	java/net/Socket:isClosed	()Z
    //   193: ifeq -171 -> 22
    //   196: new 241	java/io/IOException
    //   199: dup
    //   200: invokespecial 401	java/io/IOException:<init>	()V
    //   203: athrow
    //   204: astore_2
    //   205: aload_0
    //   206: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   209: iconst_m1
    //   210: aload_2
    //   211: invokevirtual 404	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   214: invokevirtual 407	com/tencent/mm/plugin/appbrand/s/c:Q	(ILjava/lang/String;)V
    //   217: return
    //   218: aload_0
    //   219: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   222: invokevirtual 399	com/tencent/mm/plugin/appbrand/s/c:aoE	()V
    //   225: return
    //   226: astore_2
    //   227: aload_0
    //   228: aload_2
    //   229: invokevirtual 249	com/tencent/mm/plugin/appbrand/s/a/a:c	(Ljava/lang/Exception;)V
    //   232: aload_0
    //   233: getfield 48	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
    //   236: sipush 1006
    //   239: aload_2
    //   240: invokevirtual 408	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 407	com/tencent/mm/plugin/appbrand/s/c:Q	(ILjava/lang/String;)V
    //   246: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	a
    //   155	13	1	i	int
    //   126	40	2	arrayOfByte	byte[]
    //   177	1	2	localIOException	IOException
    //   204	7	2	localException	Exception
    //   226	14	2	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   127	156	177	java/io/IOException
    //   161	174	177	java/io/IOException
    //   218	225	177	java/io/IOException
    //   0	22	204	java/lang/Exception
    //   22	72	204	java/lang/Exception
    //   72	98	204	java/lang/Exception
    //   186	204	204	java/lang/Exception
    //   127	156	226	java/lang/RuntimeException
    //   161	174	226	java/lang/RuntimeException
    //   218	225	226	java/lang/RuntimeException
  }
  
  public abstract void sq(String paramString);
  
  public final void vV(String paramString)
  {
    sq(paramString);
  }
  
  public final void vW(String paramString)
  {
    c localc = this.gDd;
    if (paramString == null)
    {
      x.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
      return;
    }
    com.tencent.mm.plugin.appbrand.s.b.a locala = localc.gCT;
    if (localc.gCU == a.b.gCF) {}
    for (boolean bool = true;; bool = false)
    {
      localc.d(locala.ae(paramString, bool));
      return;
    }
  }
  
  private final class a
    implements Runnable
  {
    private a() {}
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: invokestatic 33	java/lang/Thread:interrupted	()Z
      //   3: ifne +155 -> 158
      //   6: aload_0
      //   7: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   10: getfield 37	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
      //   13: getfield 43	com/tencent/mm/plugin/appbrand/s/c:gCN	Ljava/util/concurrent/BlockingQueue;
      //   16: invokeinterface 49 1 0
      //   21: checkcast 51	java/nio/ByteBuffer
      //   24: astore_1
      //   25: aload_0
      //   26: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   29: getfield 55	com/tencent/mm/plugin/appbrand/s/a/a:gDg	Ljava/io/OutputStream;
      //   32: aload_1
      //   33: invokevirtual 59	java/nio/ByteBuffer:array	()[B
      //   36: iconst_0
      //   37: aload_1
      //   38: invokevirtual 63	java/nio/ByteBuffer:limit	()I
      //   41: invokevirtual 69	java/io/OutputStream:write	([BII)V
      //   44: aload_0
      //   45: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   48: getfield 55	com/tencent/mm/plugin/appbrand/s/a/a:gDg	Ljava/io/OutputStream;
      //   51: invokevirtual 72	java/io/OutputStream:flush	()V
      //   54: goto -54 -> 0
      //   57: astore_1
      //   58: aload_0
      //   59: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   62: getfield 37	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
      //   65: getfield 43	com/tencent/mm/plugin/appbrand/s/c:gCN	Ljava/util/concurrent/BlockingQueue;
      //   68: invokeinterface 76 1 0
      //   73: astore_1
      //   74: aload_1
      //   75: invokeinterface 81 1 0
      //   80: ifeq +78 -> 158
      //   83: aload_1
      //   84: invokeinterface 84 1 0
      //   89: checkcast 51	java/nio/ByteBuffer
      //   92: astore_2
      //   93: aload_0
      //   94: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   97: getfield 55	com/tencent/mm/plugin/appbrand/s/a/a:gDg	Ljava/io/OutputStream;
      //   100: aload_2
      //   101: invokevirtual 59	java/nio/ByteBuffer:array	()[B
      //   104: iconst_0
      //   105: aload_2
      //   106: invokevirtual 63	java/nio/ByteBuffer:limit	()I
      //   109: invokevirtual 69	java/io/OutputStream:write	([BII)V
      //   112: aload_0
      //   113: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   116: getfield 55	com/tencent/mm/plugin/appbrand/s/a/a:gDg	Ljava/io/OutputStream;
      //   119: invokevirtual 72	java/io/OutputStream:flush	()V
      //   122: goto -48 -> 74
      //   125: astore_1
      //   126: aload_0
      //   127: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   130: astore_2
      //   131: aload_1
      //   132: instanceof 86
      //   135: ifeq +8 -> 143
      //   138: aload_2
      //   139: aload_1
      //   140: invokevirtual 90	com/tencent/mm/plugin/appbrand/s/a/a:c	(Ljava/lang/Exception;)V
      //   143: aload_2
      //   144: getfield 37	com/tencent/mm/plugin/appbrand/s/a/a:gDd	Lcom/tencent/mm/plugin/appbrand/s/c;
      //   147: invokevirtual 93	com/tencent/mm/plugin/appbrand/s/c:aoE	()V
      //   150: aload_0
      //   151: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   154: invokestatic 96	com/tencent/mm/plugin/appbrand/s/a/a:d	(Lcom/tencent/mm/plugin/appbrand/s/a/a;)V
      //   157: return
      //   158: aload_0
      //   159: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   162: invokestatic 96	com/tencent/mm/plugin/appbrand/s/a/a:d	(Lcom/tencent/mm/plugin/appbrand/s/a/a;)V
      //   165: return
      //   166: astore_1
      //   167: aload_0
      //   168: getfield 15	com/tencent/mm/plugin/appbrand/s/a/a$a:gDn	Lcom/tencent/mm/plugin/appbrand/s/a/a;
      //   171: invokestatic 96	com/tencent/mm/plugin/appbrand/s/a/a:d	(Lcom/tencent/mm/plugin/appbrand/s/a/a;)V
      //   174: aload_1
      //   175: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	176	0	this	a
      //   24	14	1	localByteBuffer	ByteBuffer
      //   57	1	1	localInterruptedException	InterruptedException
      //   73	11	1	localIterator	Iterator
      //   125	15	1	localIOException	IOException
      //   166	9	1	localObject1	Object
      //   92	52	2	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   0	54	57	java/lang/InterruptedException
      //   0	54	125	java/io/IOException
      //   58	74	125	java/io/IOException
      //   74	122	125	java/io/IOException
      //   0	54	166	finally
      //   58	74	166	finally
      //   74	122	166	finally
      //   126	143	166	finally
      //   143	150	166	finally
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */