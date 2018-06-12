package com.tencent.mm.plugin.webview.ui.tools.bag;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class m
  implements InvocationHandler
{
  private boolean mEnable;
  private l qcI;
  private g qcJ = new m.1(this);
  
  private m() {}
  
  private m(MMActivity paramMMActivity, MMWebView paramMMWebView, boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
    if (paramBoolean) {
      this.qcI = new l(paramMMActivity, paramMMWebView);
    }
  }
  
  public static g a(MMActivity paramMMActivity, MMWebView paramMMWebView, boolean paramBoolean)
  {
    paramMMActivity = new m(paramMMActivity, paramMMWebView, paramBoolean);
    return (g)Proxy.newProxyInstance(m.class.getClassLoader(), new Class[] { g.class }, paramMMActivity);
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (!this.mEnable) {
      try
      {
        paramObject = paramMethod.invoke(this.qcJ, paramArrayOfObject);
        return paramObject;
      }
      catch (InvocationTargetException paramObject)
      {
        x.i("MicroMsg.WebViewUIBagHelperProxy", "not enable mEmptyHelper invoke e:%s", new Object[] { paramObject });
        throw ((InvocationTargetException)paramObject).getCause();
      }
    }
    try
    {
      paramObject = paramMethod.invoke(this.qcI, paramArrayOfObject);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      x.i("MicroMsg.WebViewUIBagHelperProxy", "mWebViewUIBagHelper invoke e:%s", new Object[] { paramObject });
      throw ((InvocationTargetException)paramObject).getCause();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */