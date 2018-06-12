package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import com.tencent.mm.ab.l;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.voip.model.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.w;
import com.tencent.pb.talkroom.sdk.d;

public final class c
  implements com.tencent.mm.ab.e
{
  c.a bEs = new c.a()
  {
    public final void aN(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      x.i("MicroMsg.MT.MultiTalkEngine", "OnPcmRecListener onRecError %d %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
    }
    
    public final void s(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
    {
      if (paramAnonymousInt <= 0) {
        x.e("MicroMsg.MT.MultiTalkEngine", "pcm data len <= 0");
      }
      while (c.this.ltd == null) {
        return;
      }
      c.this.ltd.V(paramAnonymousArrayOfByte, paramAnonymousInt);
    }
  };
  public d lta;
  b ltb;
  com.tencent.mm.e.b.c ltc;
  com.tencent.pb.talkroom.sdk.c ltd;
  com.tencent.pb.talkroom.sdk.b lte;
  a ltf = new c.3(this);
  
  public c()
  {
    x.i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
    Context localContext = ad.getContext();
    com.tencent.wecall.talkroom.model.e locale = com.tencent.wecall.talkroom.model.e.cHL();
    com.tencent.wecall.talkroom.model.e.ig(localContext);
    this.lta = locale;
    this.lta.cEI();
    this.ltb = new b();
    int i = bi.f((Integer)au.HS().get(1));
    this.lta.a(o.bgN(), new c.1(this));
    this.lta.bg(i, q.GF());
    au.DF().a(1918, this);
    au.DF().a(1919, this);
    au.DF().a(1927, this);
    au.DF().a(1928, this);
    au.DF().a(1929, this);
    au.DF().a(1931, this);
    au.DF().a(1932, this);
    au.DF().a(1933, this);
    au.DF().a(1935, this);
    au.DF().a(1937, this);
    au.DF().a(1938, this);
    au.DF().a(1939, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    paramString = (n)paraml;
    x.i("MicroMsg.MT.MultiTalkEngine", "onSceneEnd errtype " + paramInt1 + " errCode " + paramInt2 + " cmdid " + paramString.isz);
    this.lta.c(paramInt2, paramString.isy, paramString.isz, paramString.cdy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */