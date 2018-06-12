package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.c.i;
import com.tencent.xweb.c.i.a;
import com.tencent.xweb.util.b;
import com.tencent.xweb.util.e;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkEnvironment;

public final class r
{
  static boolean vAT = false;
  static boolean vAU = false;
  
  public static void a(Context paramContext, b paramb)
  {
    a(paramContext, paramb, null, null);
  }
  
  public static void a(Context paramContext, b paramb, q paramq, WebViewExtensionListener paramWebViewExtensionListener)
  {
    if (paramb != null) {}
    try
    {
      Log.SetLogCallBack(paramb);
      if (paramq != null) {
        e.a(paramq);
      }
      if (((paramContext != null) && (XWalkEnvironment.getApplicationContext() == null)) || (!vAT))
      {
        vAT = true;
        XWalkEnvironment.init(paramContext);
        paramb = i.b(WebView.d.vAP);
        if (paramb != null) {
          paramb.initEnviroment(paramContext);
        }
        paramb = i.b(WebView.d.vAQ);
        if (paramb != null) {
          paramb.initEnviroment(paramContext);
        }
      }
      if (paramWebViewExtensionListener != null) {
        i.b(WebView.d.vAP).initCallback(paramWebViewExtensionListener);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public static void initInterface()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 13	com/tencent/xweb/r:vAU	Z
    //   6: istore_0
    //   7: iload_0
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: iconst_1
    //   16: putstatic 13	com/tencent/xweb/r:vAU	Z
    //   19: getstatic 46	com/tencent/xweb/WebView$d:vAP	Lcom/tencent/xweb/WebView$d;
    //   22: invokestatic 52	com/tencent/xweb/c/i:b	(Lcom/tencent/xweb/WebView$d;)Lcom/tencent/xweb/c/i$a;
    //   25: astore_1
    //   26: aload_1
    //   27: ifnull +9 -> 36
    //   30: aload_1
    //   31: invokeinterface 67 1 0
    //   36: getstatic 60	com/tencent/xweb/WebView$d:vAQ	Lcom/tencent/xweb/WebView$d;
    //   39: invokestatic 52	com/tencent/xweb/c/i:b	(Lcom/tencent/xweb/WebView$d;)Lcom/tencent/xweb/c/i$a;
    //   42: astore_1
    //   43: aload_1
    //   44: ifnull -33 -> 11
    //   47: aload_1
    //   48: invokeinterface 67 1 0
    //   53: goto -42 -> 11
    //   56: astore_1
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	2	0	bool	boolean
    //   25	23	1	locala	i.a
    //   56	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	7	56	finally
    //   15	26	56	finally
    //   30	36	56	finally
    //   36	43	56	finally
    //   47	53	56	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/xweb/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */