package com.tencent.mm.plugin.appbrand.game;

import android.webkit.ValueCallback;
import com.tencent.magicbrush.engine.b;
import com.tencent.mm.plugin.appbrand.g.a;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.d;
import java.net.URL;

public final class f
  implements a
{
  private int fzX;
  b fzY;
  private boolean fzZ;
  
  public f(boolean paramBoolean, b paramb, int paramInt)
  {
    this.fzY = paramb;
    this.fzX = paramInt;
    this.fzZ = paramBoolean;
  }
  
  public final void a(a parama, String paramString)
  {
    if ((parama == null) || (bi.oW(paramString)))
    {
      x.e("MicroMsg.WAGameJsContextImpl", "shareObject object name is null [%s], [%s]", new Object[] { parama, paramString });
      return;
    }
    if (!(parama instanceof f))
    {
      x.e("MicroMsg.WAGameJsContextImpl", "share Object with different JSContext type , [%s]", new Object[] { parama });
      return;
    }
    this.fzY.a(((f)parama).fzY, paramString);
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    if (paramURL == null) {
      evaluateJavascript(paramString, paramValueCallback);
    }
    do
    {
      do
      {
        return;
        if ((this.fzY != null) && (!bi.oW(paramString))) {
          break;
        }
        x.e("MicroMsg.WAGameJsContextImpl", "evaluate Error : [%s], [%s]", new Object[] { this.fzY, paramString });
      } while (paramValueCallback == null);
      paramValueCallback.onReceiveValue("");
      return;
      paramURL = this.fzY.r(paramString, paramURL.toString());
    } while (paramValueCallback == null);
    paramValueCallback.onReceiveValue(bi.oV(paramURL));
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    if (this.fzY == null) {
      return;
    }
    this.fzY.d(paramObject, paramString);
  }
  
  public final boolean afV()
  {
    return this.fzZ;
  }
  
  public final int afW()
  {
    return this.fzX;
  }
  
  public final void destroy()
  {
    if (this.fzY != null) {
      this.fzY.dispose();
    }
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if ((this.fzY == null) || (bi.oW(paramString)))
    {
      x.e("MicroMsg.WAGameJsContextImpl", "evaluate Error : [%s], [%s]", new Object[] { this.fzY, paramString });
      if (paramValueCallback != null) {
        paramValueCallback.onReceiveValue("");
      }
    }
    do
    {
      return;
      paramString = this.fzY.bP(paramString);
    } while (paramValueCallback == null);
    paramValueCallback.onReceiveValue(bi.oV(paramString));
  }
  
  public final void setJsExceptionHandler(d paramd) {}
  
  public final <T extends c> T y(Class<T> paramClass)
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */