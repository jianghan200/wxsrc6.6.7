package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.d;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.protocal.c.afl;
import com.tencent.mm.protocal.c.afm;
import com.tencent.mm.protocal.c.yw;
import com.tencent.mm.protocal.c.yx;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static final i nIR = new i();
  private Map<Long, String> jjd = new HashMap();
  private d nIS = af.byp();
  public y nIT = af.byq();
  public Map<String, String> nIU = new HashMap();
  
  private i()
  {
    HandlerThread localHandlerThread = e.Xs("OpenCanvasMgr");
    localHandlerThread.start();
    new ag(localHandlerThread.getLooper()).postDelayed(new Runnable()
    {
      public final void run()
      {
        i.a(i.this);
      }
    }, 5000L);
  }
  
  public static i bAE()
  {
    return nIR;
  }
  
  public final String h(long paramLong, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("OpenCanvasMgr", "open pageId %d, preLoad %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1) });
    Object localObject2;
    if (paramLong <= 0L)
    {
      localObject2 = "";
      return (String)localObject2;
    }
    Object localObject1 = "";
    if (paramInt2 != 1)
    {
      if (!this.jjd.containsKey(Long.valueOf(paramLong))) {
        break label209;
      }
      localObject1 = (String)this.jjd.get(Long.valueOf(paramLong));
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (paramInt1 != 1) {
        break;
      }
      localObject2 = localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        break;
      }
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      localObject2 = new b.a();
      ((b.a)localObject2).dIG = new yw();
      ((b.a)localObject2).dIH = new yx();
      ((b.a)localObject2).uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
      ((b.a)localObject2).dIF = 1286;
      localObject2 = ((b.a)localObject2).KT();
      ((yw)((b)localObject2).dID.dIL).rEZ = paramLong;
      v.a((b)localObject2, new i.2(this, paramLong, paramInt1, (com.tencent.mm.plugin.sns.storage.c)localObject1));
      return "";
      label209:
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      this.nIS.b((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml))
      {
        this.jjd.put(Long.valueOf(paramLong), ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml);
        localObject1 = ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml;
      }
      else
      {
        localObject1 = "";
      }
    }
  }
  
  public final String k(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("OpenCanvasMgr", "open pageId %s, canvasExt %s, preLoad %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
    Object localObject2;
    if (bi.oW(paramString1))
    {
      localObject2 = "";
      return (String)localObject2;
    }
    Object localObject1 = "";
    if (paramInt2 != 1) {
      if (bi.oW(paramString2)) {
        break label338;
      }
    }
    label338:
    for (localObject1 = paramString1 + paramString2;; localObject1 = paramString1)
    {
      if (this.nIU.containsKey(localObject1)) {
        localObject1 = (String)this.nIU.get(localObject1);
      }
      for (;;)
      {
        localObject2 = localObject1;
        if (paramInt1 != 1) {
          break;
        }
        localObject2 = localObject1;
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          break;
        }
        localObject1 = new com.tencent.mm.plugin.sns.storage.x();
        ((com.tencent.mm.plugin.sns.storage.x)localObject1).field_canvasId = paramString1;
        localObject2 = new b.a();
        ((b.a)localObject2).dIG = new afl();
        ((b.a)localObject2).dIH = new afm();
        ((b.a)localObject2).uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
        ((b.a)localObject2).dIF = 1890;
        localObject2 = ((b.a)localObject2).KT();
        afl localafl = (afl)((b)localObject2).dID.dIL;
        localafl.rJs = paramString1;
        localafl.rJt = paramString2;
        v.a((b)localObject2, new i.3(this, paramString1, paramInt1, (com.tencent.mm.plugin.sns.storage.x)localObject1));
        return "";
        localObject2 = new com.tencent.mm.plugin.sns.storage.x();
        ((com.tencent.mm.plugin.sns.storage.x)localObject2).field_canvasId = paramString1;
        ((com.tencent.mm.plugin.sns.storage.x)localObject2).field_canvasExt = paramString2;
        this.nIT.b((com.tencent.mm.sdk.e.c)localObject2, new String[] { "canvasId", "canvasExt" });
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.x)localObject2).field_canvasXml))
        {
          this.nIU.put(localObject1, ((com.tencent.mm.plugin.sns.storage.x)localObject2).field_canvasXml);
          localObject1 = ((com.tencent.mm.plugin.sns.storage.x)localObject2).field_canvasXml;
        }
        else
        {
          localObject1 = "";
        }
      }
    }
  }
  
  public final void p(long paramLong, String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramLong > 0L))
    {
      this.jjd.put(Long.valueOf(paramLong), paramString);
      com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
      localc.field_canvasId = paramLong;
      localc.field_canvasXml = paramString;
      this.nIS.a(localc);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */