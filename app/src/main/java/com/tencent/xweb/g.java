package com.tencent.xweb;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.c.d;
import com.tencent.xweb.c.i;
import com.tencent.xweb.c.i.a;
import com.tencent.xweb.xwalk.b;
import org.xwalk.core.XWalkEnvironment;

public final class g
{
  private static String vAa = "";
  public static a vzY;
  public volatile boolean fwD = false;
  public com.tencent.xweb.c.g vzZ;
  
  private g(a parama, String paramString, Context paramContext)
  {
    org.xwalk.core.Log.i("JsRuntime", String.format("init JsRuntime (%s)", new Object[] { android.util.Log.getStackTraceString(new Throwable()) }));
    paramString = b(parama, paramString, paramContext);
    switch (g.1.vAb[paramString.ordinal()])
    {
    default: 
      if (this.vzZ == null) {
        if ((a.vAd == paramString) || (a.vAh == paramString))
        {
          parama = a.vAg;
          this.vzZ = new d();
        }
      }
      break;
    }
    for (;;)
    {
      vzY = parama;
      org.xwalk.core.Log.d("JsRuntime", "xxx IJsRuntime  request=" + parama.toString() + ", create=" + vAa);
      return;
      this.vzZ = i.b(WebView.d.vAQ).getJsCore(paramString, paramContext);
      if (this.vzZ == null) {
        break;
      }
      vAa = "x5";
      break;
      this.vzZ = i.b(WebView.d.vAP).getJsCore(paramString, paramContext);
      if (this.vzZ == null) {
        break;
      }
      if (paramString == a.vAi) {}
      for (parama = "j2v8";; parama = "nativeScript")
      {
        vAa = parama;
        break;
      }
      this.vzZ = new b();
      this.vzZ.init(0);
      vAa = "mmv8";
      break;
      parama = a.vAk;
      this.vzZ = new b();
      this.vzZ.init(0);
      vAa = "mmv8";
      continue;
      parama = paramString;
    }
  }
  
  public static g a(a parama, String paramString, Context paramContext)
  {
    return new g(parama, paramString, paramContext);
  }
  
  public static a b(a parama, String paramString, Context paramContext)
  {
    k.ik(paramContext);
    paramContext = paramString;
    if (paramString == null) {
      paramContext = "";
    }
    if (k.cIn().vAu != a.vAc)
    {
      parama = k.cIn().vAu;
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "use hardcode jscore type = " + parama);
      if (WebView.getCurWebType() != WebView.d.vAQ) {
        break label134;
      }
      paramString = parama;
      if (a.vAd != parama)
      {
        paramString = parama;
        if (a.vAk != parama) {
          paramString = a.vAh;
        }
      }
    }
    label134:
    label174:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return paramString;
              if (a.adw(paramContext) == a.vAc) {
                break;
              }
              parama = a.adw(paramContext);
              XWalkEnvironment.addXWalkInitializeLog("XWeb", "module " + paramContext + "use cmd jscore type = " + parama);
              break;
              if (WebView.getCurWebType() != WebView.d.vAP) {
                break label174;
              }
              paramString = parama;
            } while (a.vAj == parama);
            paramString = parama;
          } while (a.vAi == parama);
          paramString = parama;
        } while (a.vAd == parama);
        return a.vAk;
        paramString = parama;
      } while (WebView.getCurWebType() != WebView.d.vAR);
      paramString = parama;
    } while (a.vAd == parama);
    return a.vAk;
  }
  
  public static a cIl()
  {
    return vzY;
  }
  
  public static String cIm()
  {
    return vAa;
  }
  
  public final boolean CY()
  {
    return this.vzZ.CY();
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.vzZ.addJavascriptInterface(paramObject, paramString);
  }
  
  public final void cleanup()
  {
    if (!this.fwD) {
      this.vzZ.cleanup();
    }
    this.fwD = true;
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.fwD) {
      return;
    }
    this.vzZ.evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final boolean isValid()
  {
    return (this.vzZ != null) && (vzY != a.vAc) && (vzY != a.vAg);
  }
  
  public final void pause()
  {
    this.vzZ.pause();
  }
  
  public final void resume()
  {
    this.vzZ.resume();
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/xweb/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */