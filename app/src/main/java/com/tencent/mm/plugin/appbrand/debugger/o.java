package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.mm.plugin.appbrand.k.i;
import com.tencent.mm.plugin.appbrand.s.a.a;
import com.tencent.mm.plugin.appbrand.s.c;
import com.tencent.mm.protocal.c.cbd;
import com.tencent.mm.sdk.platformtools.x;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class o
{
  a ftD;
  private SSLSocketFactory ftE;
  
  public o(String paramString)
  {
    paramString = i.uP(paramString);
    if (paramString != null) {
      this.ftE = paramString.getSocketFactory();
    }
  }
  
  /* Error */
  public final void a(String paramString, com.tencent.mm.plugin.appbrand.k.j.a parama)
  {
    // Byte code:
    //   0: ldc 34
    //   2: ldc 36
    //   4: iconst_1
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_1
    //   11: aastore
    //   12: invokestatic 42	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: new 44	java/net/URI
    //   18: dup
    //   19: aload_1
    //   20: invokespecial 46	java/net/URI:<init>	(Ljava/lang/String;)V
    //   23: astore_3
    //   24: new 48	java/util/HashMap
    //   27: dup
    //   28: invokespecial 49	java/util/HashMap:<init>	()V
    //   31: astore 4
    //   33: aload_1
    //   34: ldc 51
    //   36: invokevirtual 57	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   39: ifeq +15 -> 54
    //   42: aload 4
    //   44: ldc 59
    //   46: ldc 61
    //   48: invokeinterface 67 3 0
    //   53: pop
    //   54: aload_0
    //   55: new 69	com/tencent/mm/plugin/appbrand/debugger/o$1
    //   58: dup
    //   59: aload_0
    //   60: aload_3
    //   61: new 71	com/tencent/mm/plugin/appbrand/s/b/d
    //   64: dup
    //   65: invokespecial 72	com/tencent/mm/plugin/appbrand/s/b/d:<init>	()V
    //   68: aload 4
    //   70: aload_2
    //   71: invokespecial 75	com/tencent/mm/plugin/appbrand/debugger/o$1:<init>	(Lcom/tencent/mm/plugin/appbrand/debugger/o;Ljava/net/URI;Lcom/tencent/mm/plugin/appbrand/s/b/a;Ljava/util/Map;Lcom/tencent/mm/plugin/appbrand/k/j$a;)V
    //   74: putfield 77	com/tencent/mm/plugin/appbrand/debugger/o:ftD	Lcom/tencent/mm/plugin/appbrand/s/a/a;
    //   77: aload_1
    //   78: ldc 79
    //   80: invokestatic 85	com/tencent/mm/pluginsdk/ui/tools/s:fj	(Ljava/lang/String;Ljava/lang/String;)Z
    //   83: ifeq +58 -> 141
    //   86: new 87	java/net/Socket
    //   89: dup
    //   90: getstatic 93	java/net/Proxy:NO_PROXY	Ljava/net/Proxy;
    //   93: invokespecial 96	java/net/Socket:<init>	(Ljava/net/Proxy;)V
    //   96: astore_1
    //   97: aload_0
    //   98: getfield 77	com/tencent/mm/plugin/appbrand/debugger/o:ftD	Lcom/tencent/mm/plugin/appbrand/s/a/a;
    //   101: aload_1
    //   102: invokevirtual 101	com/tencent/mm/plugin/appbrand/s/a/a:a	(Ljava/net/Socket;)V
    //   105: aload_0
    //   106: getfield 77	com/tencent/mm/plugin/appbrand/debugger/o:ftD	Lcom/tencent/mm/plugin/appbrand/s/a/a;
    //   109: invokevirtual 104	com/tencent/mm/plugin/appbrand/s/a/a:connect	()V
    //   112: return
    //   113: astore_1
    //   114: ldc 34
    //   116: ldc 106
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_1
    //   125: invokevirtual 110	java/lang/Exception:toString	()Ljava/lang/String;
    //   128: aastore
    //   129: invokestatic 113	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload_2
    //   133: ldc 115
    //   135: invokeinterface 120 2 0
    //   140: return
    //   141: aload_0
    //   142: getfield 27	com/tencent/mm/plugin/appbrand/debugger/o:ftE	Ljavax/net/ssl/SSLSocketFactory;
    //   145: ifnull +49 -> 194
    //   148: aload_0
    //   149: getfield 27	com/tencent/mm/plugin/appbrand/debugger/o:ftE	Ljavax/net/ssl/SSLSocketFactory;
    //   152: astore_1
    //   153: aload_1
    //   154: invokevirtual 126	javax/net/ssl/SSLSocketFactory:createSocket	()Ljava/net/Socket;
    //   157: astore_1
    //   158: aload_0
    //   159: getfield 77	com/tencent/mm/plugin/appbrand/debugger/o:ftD	Lcom/tencent/mm/plugin/appbrand/s/a/a;
    //   162: aload_1
    //   163: invokevirtual 101	com/tencent/mm/plugin/appbrand/s/a/a:a	(Ljava/net/Socket;)V
    //   166: aload_0
    //   167: getfield 77	com/tencent/mm/plugin/appbrand/debugger/o:ftD	Lcom/tencent/mm/plugin/appbrand/s/a/a;
    //   170: invokevirtual 104	com/tencent/mm/plugin/appbrand/s/a/a:connect	()V
    //   173: return
    //   174: astore_1
    //   175: ldc 34
    //   177: ldc -128
    //   179: iconst_1
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload_1
    //   186: invokestatic 134	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   189: aastore
    //   190: invokestatic 113	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: return
    //   194: invokestatic 138	javax/net/ssl/SSLSocketFactory:getDefault	()Ljavax/net/SocketFactory;
    //   197: checkcast 122	javax/net/ssl/SSLSocketFactory
    //   200: astore_1
    //   201: goto -48 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	o
    //   0	204	1	paramString	String
    //   0	204	2	parama	com.tencent.mm.plugin.appbrand.k.j.a
    //   23	38	3	localURI	java.net.URI
    //   31	38	4	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   15	24	113	java/lang/Exception
    //   54	112	174	java/lang/Exception
    //   141	153	174	java/lang/Exception
    //   153	173	174	java/lang/Exception
    //   194	201	174	java/lang/Exception
  }
  
  public final boolean a(cbd paramcbd)
  {
    x.d("MicroMsg.RemoteDebugSocket", "sendSocketMsg");
    if (!isOpen())
    {
      x.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail, not open");
      return false;
    }
    if (paramcbd == null)
    {
      x.w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail");
      return false;
    }
    paramcbd = p.c(paramcbd);
    this.ftD.q(paramcbd);
    return true;
  }
  
  public final boolean isOpen()
  {
    if (this.ftD == null) {
      return false;
    }
    return this.ftD.gDd.isOpen();
  }
  
  public final boolean sp(String paramString)
  {
    if (this.ftD == null)
    {
      x.w("MicroMsg.RemoteDebugSocket", "client is null");
      return false;
    }
    this.ftD.S(1000, paramString);
    x.d("MicroMsg.RemoteDebugSocket", "closeSocket code %d, reason %s", new Object[] { Integer.valueOf(1000), paramString });
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */