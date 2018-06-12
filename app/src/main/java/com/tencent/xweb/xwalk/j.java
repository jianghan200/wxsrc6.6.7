package com.tencent.xweb.xwalk;

import android.view.View;
import org.xwalk.core.CustomViewCallback;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;

public class j
  extends XWalkUIClient
{
  public j(XWalkView paramXWalkView)
  {
    super(paramXWalkView);
  }
  
  public final void a(View paramView, CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
  }
  
  public final void a(XWalkView paramXWalkView, String paramString)
  {
    super.onPageLoadStarted(paramXWalkView, paramString);
  }
  
  public final boolean a(XWalkView paramXWalkView, String paramString1, String paramString2, String paramString3, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsPrompt(paramXWalkView, paramString1, paramString2, paramString3, paramXWalkJavascriptResult);
  }
  
  public final boolean a(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsConfirm(paramXWalkView, paramString1, paramString2, paramXWalkJavascriptResult);
  }
  
  public final boolean b(XWalkView paramXWalkView, String paramString1, String paramString2, XWalkJavascriptResult paramXWalkJavascriptResult)
  {
    return super.onJsAlert(paramXWalkView, paramString1, paramString2, paramXWalkJavascriptResult);
  }
  
  public final void cJi()
  {
    super.onHideCustomView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */