package com.tencent.mm.ak.a.f;

public final class a
  implements Runnable
{
  private final com.tencent.mm.ak.a.a.b dWS;
  private final com.tencent.mm.ak.a.a.c dXk;
  private final com.tencent.mm.ak.a.c.a dXm;
  private final com.tencent.mm.ak.a.c.b dXn;
  private final com.tencent.mm.ak.a.b dYi;
  private final com.tencent.mm.ak.a.c.c dYj;
  private final String url;
  
  public a(String paramString, com.tencent.mm.ak.a.a.c paramc, com.tencent.mm.ak.a.b paramb, com.tencent.mm.ak.a.c.c paramc1)
  {
    this.url = paramString;
    this.dYi = paramb;
    this.dWS = this.dYi.dWS;
    if (paramc == null)
    {
      this.dXk = this.dWS.dXk;
      this.dYj = paramc1;
      if (this.dXk.dXn == null) {
        break label87;
      }
    }
    label87:
    for (this.dXn = this.dXk.dXn;; this.dXn = this.dWS.dXn)
    {
      this.dXm = this.dWS.dXm;
      return;
      this.dXk = paramc;
      break;
    }
  }
  
  public final void run()
  {
    new com.tencent.mm.ak.a.d.b();
    com.tencent.mm.ak.a.d.b localb = this.dXn.mb(this.url);
    if (localb == null) {
      this.dYj.a(false, this.dXk.dYc);
    }
    do
    {
      do
      {
        return;
        if (((com.tencent.mm.sdk.platformtools.c.decodeByteArray(localb.data, 10, 10) == null) && (this.dXk.dXZ)) || (!this.dXm.a(this.url, localb.data, this.dXk))) {
          break;
        }
      } while (this.dYj == null);
      this.dYj.a(true, this.dXk.dYc);
      return;
    } while (this.dYj == null);
    this.dYj.a(false, this.dXk.dYc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/a/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */