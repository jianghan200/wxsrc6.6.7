package com.tencent.mm.plugin.appbrand.game.c;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.View;
import com.tencent.mm.plugin.appbrand.game.e.g;
import com.tencent.mm.plugin.appbrand.game.m;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import java.util.LinkedList;

public final class b
  extends WebView
{
  boolean fBd = false;
  public View fBe;
  LinkedList<String> fBf;
  boolean fBg = false;
  
  public b(Context paramContext)
  {
    super(paramContext);
    getSettings().setJavaScriptEnabled(true);
    this.fBe = new a(getContext());
    this.fBe.setOnClickListener(new b.1(this));
    setWebViewClient(new b.2(this));
    loadUrl("wagame://WAGameVConsole.html");
    setTranslationY(getDisplayHeight());
  }
  
  private static int getDisplayHeight()
  {
    Point localPoint = new Point();
    m localm = m.fAw;
    m.e(localPoint);
    return localPoint.y;
  }
  
  public final View getConsoleButton()
  {
    return this.fBe;
  }
  
  final void sS(String paramString)
  {
    paramString = g.tc(paramString);
    if (Build.VERSION.SDK_INT >= 19)
    {
      evaluateJavascript("console._log('" + paramString + "')", null);
      return;
    }
    loadUrl("javascript:console._log('" + paramString + "')");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */