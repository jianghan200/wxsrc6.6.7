package com.tencent.mm.plugin.appbrand.debugger;

import android.app.Activity;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.k.j.a;
import com.tencent.mm.protocal.c.cbi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public final class j
  implements b
{
  com.tencent.mm.plugin.appbrand.l fcy;
  h ftb;
  String ftc;
  Activity ftd;
  o fte;
  l ftf = new l();
  q ftg;
  j.a fth = new j.2(this);
  
  public j()
  {
    com.tencent.mm.sdk.b.a.sFg.a(new j.4(this));
  }
  
  public final void a(k paramk)
  {
    this.ftf.a(paramk);
  }
  
  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString) {}
  
  final void connect()
  {
    if (this.fte == null)
    {
      this.fte = new o(this.fcy.mAppId);
      l locall = this.ftf;
      o localo = this.fte;
      h localh = this.ftb;
      Activity localActivity = this.ftd;
      com.tencent.mm.plugin.appbrand.jsapi.d locald = this.fcy.fdP;
      q localq = this.ftg;
      locall.fte = localo;
      locall.ftb = localh;
      locall.mContext = localActivity;
      locall.fdP = locald;
      locall.ftg = localq;
    }
    if (this.ftb.aez())
    {
      this.fte.a("ws://localhost:" + this.ftb.fsC.fsZ, this.fth);
      return;
    }
    this.fte.a("wss://wxagame.weixin.qq.com/remote/", this.fth);
  }
  
  public final void destroy()
  {
    if (this.fcy.fEH)
    {
      p.ftI = this.ftb;
      this.fte.sp("destroy");
    }
    for (;;)
    {
      this.ftf.aeF();
      return;
      this.ftf.quit();
    }
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.ftb.aex()) {
      return;
    }
    if (!this.ftb.hv())
    {
      this.ftb.fsN.add(new Pair(paramString, paramValueCallback));
      this.ftc = null;
      return;
    }
    Object localObject = new cbi();
    ((cbi)localObject).sxA = this.ftb.fsI.incrementAndGet();
    ((cbi)localObject).script = paramString;
    k localk = p.a((com.tencent.mm.bk.a)localObject, this.ftb, "evaluateJavascript");
    this.ftf.a(localk);
    int i = ((cbi)localObject).sxA;
    localObject = new a();
    if (!bi.oW(this.ftc))
    {
      ((a)localObject).bHA = this.ftc;
      this.ftc = null;
    }
    for (;;)
    {
      ((a)localObject).fsv = System.currentTimeMillis();
      ((a)localObject).size = paramString.length();
      ((a)localObject).fsu = paramValueCallback;
      this.ftb.fsR.put(Integer.valueOf(i), localObject);
      return;
      ((a)localObject).bHA = m.so(paramString);
    }
  }
  
  final void onReady()
  {
    x.i("MicroMsg.RemoteDebugJsEngine", "onReady");
    this.ftb.setStatus(3);
    x.i("MicroMsg.RemoteDebugJsEngine", "clearPendingScript");
    Iterator localIterator = this.ftb.fsN.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
    }
    this.ftb.fsN.clear();
    this.ftf.bF(this.ftb.aev(), Integer.MAX_VALUE);
    this.ftg.aeN();
  }
  
  public final void setJsExceptionHandler(com.tencent.xweb.d paramd) {}
  
  public final <T extends com.tencent.mm.plugin.appbrand.g.c> T y(Class<T> paramClass)
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */