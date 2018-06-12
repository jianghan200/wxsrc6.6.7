package com.tencent.mm.plugin.appbrand.debugger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.protocal.c.ahh;
import com.tencent.mm.protocal.c.ahi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class n
  extends com.tencent.mm.plugin.appbrand.l
{
  j ftC;
  h ftb;
  
  public final void E(int paramInt, String paramString)
  {
    String str = paramString;
    if (bi.oW(paramString)) {
      str = "{}";
    }
    this.ftC.ftf.D(paramInt, str);
    this.fEE.H(paramInt, str);
  }
  
  public final int a(com.tencent.mm.plugin.appbrand.g.b paramb, int paramInt)
  {
    return paramInt;
  }
  
  protected final com.tencent.mm.plugin.appbrand.g.b aaE()
  {
    this.ftC = new j();
    return this.ftC;
  }
  
  protected final void aaJ() {}
  
  public final String aeI()
  {
    JSONObject localJSONObject = aaK();
    String str = this.fdO.fcv.foU;
    return String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[] { localJSONObject.toString(), str });
  }
  
  public final void h(g paramg)
  {
    super.h(paramg);
    if (p.ftI != null)
    {
      this.ftb = p.ftI;
      p.ftI = null;
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      paramg = this.ftb;
      localObject1 = this.fdO.fct.extInfo;
      paramg.fsw = this;
      paramg.fsC = p.sr((String)localObject1);
      localObject1 = paramg.fsw.fdO.fcu;
      if (localObject1 != null)
      {
        ((AppBrandSysConfig)localObject1).fqO = paramg.fsC.fqO;
        ((AppBrandSysConfig)localObject1).fqw = true;
      }
      paramg = this.ftC;
      paramg.ftb = this.ftb;
      paramg.fcy = paramg.ftb.fsw;
      paramg.ftd = paramg.fcy.getContext();
      paramg.ftg = new q(paramg.ftd, paramg.ftb, new j.1(paramg));
      localObject1 = paramg.ftg;
      ((q)localObject1).ftJ = ((ViewGroup)paramg.fcy.fdO.fcA.getParent());
      int i = 0;
      while (i < ((q)localObject1).ftJ.getChildCount())
      {
        localObject2 = ((q)localObject1).ftJ.getChildAt(i);
        if ((localObject2 instanceof q)) {
          ((q)localObject1).ftJ.removeView((View)localObject2);
        }
        i += 1;
      }
      this.ftb = new h();
    }
    ((q)localObject1).ftJ.addView((View)localObject1);
    ((q)localObject1).ftJ.bringChildToFront((View)localObject1);
    ((q)localObject1).ftK = ((RemoteDebugMoveView)LayoutInflater.from(((q)localObject1).getContext()).inflate(s.h.app_brand_remote_debug_move_view, null));
    ((q)localObject1).ftN = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_connect_tv));
    ((q)localObject1).ftM = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_server_tv));
    ((q)localObject1).ftO = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_info_tv));
    ((q)localObject1).ftP = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_quit_tv));
    ((q)localObject1).ftQ = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_expand_tv));
    ((q)localObject1).ftR = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_collapse_tv));
    ((q)localObject1).ftS = ((TextView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_error_tv));
    ((q)localObject1).ftU = ((ImageView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_connect_dot));
    ((q)localObject1).ftT = ((ImageView)((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_server_dot));
    ((q)localObject1).ftV = ((q)localObject1).ftK.findViewById(s.g.app_brand_remote_debug_detail_layout);
    ((q)localObject1).show();
    ((q)localObject1).ftQ.setOnClickListener(((q)localObject1).mOnClickListener);
    ((q)localObject1).ftR.setOnClickListener(((q)localObject1).mOnClickListener);
    ((q)localObject1).ftP.setOnClickListener(((q)localObject1).mOnClickListener);
    ((q)localObject1).postDelayed(new q.1((q)localObject1), 100L);
    paramg.connect();
    if (bi.oW(paramg.ftb.aeu()))
    {
      x.i("MicroMsg.RemoteDebugJsEngine", "getRemoteDebugTicket");
      localObject1 = new ahh();
      localObject2 = new b.a();
      ((b.a)localObject2).dIG = ((com.tencent.mm.bk.a)localObject1);
      ((b.a)localObject2).dIH = new ahi();
      ((b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket";
      ((b.a)localObject2).dIF = 1862;
      ((b.a)localObject2).dII = 0;
      ((b.a)localObject2).dIJ = 0;
      com.tencent.mm.ipcinvoker.wx_extension.b.a(((b.a)localObject2).KT(), new j.3(paramg));
    }
  }
  
  public final void init() {}
  
  public final void j(String paramString1, String paramString2, int paramInt)
  {
    String str = paramString2;
    if (bi.oW(paramString2)) {
      str = "{}";
    }
    x.d("MicroMsg.RemoteDebugService", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(str.length()), Integer.valueOf(paramInt) });
    this.ftC.ftc = paramString1;
    j localj = this.ftC;
    if (paramInt == 0) {}
    for (paramString2 = "undefined";; paramString2 = String.valueOf(paramInt))
    {
      localj.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\" , %s, %s, %s)", new Object[] { paramString1, str, paramString2, Db() }), null);
      return;
    }
  }
  
  public final void onResume()
  {
    this.ftC.ftg.bringToFront();
  }
  
  public final void qw(String paramString) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */