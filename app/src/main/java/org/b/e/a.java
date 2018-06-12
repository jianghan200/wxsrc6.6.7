package org.b.e;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.b.c.e;
import org.b.c.f;
import org.b.d.i;
import org.b.d.j;
import org.b.d.k;

public final class a
  implements b
{
  private org.b.d.a vKR;
  private org.b.a.a.b vKS;
  
  public a(org.b.a.a.b paramb, org.b.d.a parama)
  {
    this.vKS = paramb;
    this.vKR = parama;
  }
  
  private void a(org.b.d.c paramc, i parami)
  {
    paramc.gC("oauth_timestamp", new org.b.f.d().cKE());
    paramc.gC("oauth_nonce", new org.b.f.d().getNonce());
    paramc.gC("oauth_consumer_key", this.vKR.vKl);
    paramc.gC("oauth_signature_method", new org.b.f.a().cKD());
    paramc.gC("oauth_version", "1.0");
    if (this.vKR.scope != null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        paramc.gC("scope", this.vKR.scope);
      }
      this.vKR.sL("generating signature...");
      String str = new org.b.c.c().a(paramc);
      parami = new org.b.f.a().aw(str, this.vKR.vKm, parami.rWk);
      this.vKR.sL("base string is: " + str);
      this.vKR.sL("signature is: " + parami);
      paramc.gC("oauth_signature", parami);
      this.vKR.sL("appended additional OAuth parameters: " + org.b.g.b.y(paramc.vKu));
      return;
    }
  }
  
  private void b(org.b.d.c paramc)
  {
    switch (cKC()[this.vKR.vKp.ordinal()])
    {
    }
    for (;;)
    {
      return;
      this.vKR.sL("using Http Header signature");
      paramc.addHeader("Authorization", new e().a(paramc));
      return;
      this.vKR.sL("using Querystring signature");
      Iterator localIterator = paramc.vKu.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramc.gD((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }
  
  public final i a(i parami, k paramk)
  {
    this.vKR.sL("obtaining access token from " + this.vKS.cKr());
    org.b.d.c localc = new org.b.d.c(j.vKJ, this.vKS.cKr());
    localc.gC("oauth_token", parami.token);
    localc.gC("oauth_verifier", paramk.value);
    this.vKR.sL("setting token to: " + parami + " and verifier to: " + paramk);
    a(localc, parami);
    b(localc);
    parami = localc.cKw();
    return new org.b.c.g().adT(parami.getBody());
  }
  
  public final void a(i parami, org.b.d.c paramc)
  {
    this.vKR.sL("signing request: " + paramc.cKu());
    if (("".equals(parami.token)) && ("".equals(parami.rWk))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        paramc.gC("oauth_token", parami.token);
      }
      this.vKR.sL("setting token to: " + parami);
      a(paramc, parami);
      b(paramc);
      return;
    }
  }
  
  public final String b(i parami)
  {
    return this.vKS.b(parami);
  }
  
  public final i cKB()
  {
    this.vKR.sL("obtaining request token from " + this.vKS.cKq());
    Object localObject = new org.b.d.c(j.vKJ, this.vKS.cKq());
    this.vKR.sL("setting oauth_callback to " + this.vKR.vKn);
    ((org.b.d.c)localObject).gC("oauth_callback", this.vKR.vKn);
    a((org.b.d.c)localObject, org.b.d.b.vKt);
    b((org.b.d.c)localObject);
    this.vKR.sL("sending request...");
    localObject = ((org.b.d.c)localObject).cKw();
    String str = ((org.b.d.g)localObject).getBody();
    this.vKR.sL("response status code: " + ((org.b.d.g)localObject).code);
    this.vKR.sL("response body: " + str);
    return new org.b.c.g().adT(str);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/b/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */