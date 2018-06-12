package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.by.f;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhp;

public abstract class a<Req extends bhd, Resp extends bhp>
{
  private com.tencent.mm.ab.a kKL;
  Req kKM;
  private Resp kKN;
  
  protected abstract int If();
  
  public final <T> f<T> b(com.tencent.mm.vending.c.a<T, a.a<Resp>> parama)
  {
    boolean bool2 = true;
    bay();
    this.kKN = bax();
    this.kKL = new com.tencent.mm.ab.a();
    com.tencent.mm.ab.a locala = this.kKL;
    bhd localbhd = this.kKM;
    bhp localbhp = this.kKN;
    if ((localbhd == null) || (localbhp == null))
    {
      parama = new StringBuilder("CgiBase called withoud req or resp req?[");
      if (localbhd == null)
      {
        bool1 = true;
        parama = parama.append(bool1).append("] resp?[");
        if (localbhp != null) {
          break label114;
        }
      }
      label114:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        throw new IllegalStateException(bool1 + "]");
        bool1 = false;
        break;
      }
    }
    b.a locala1 = new b.a();
    locala1.dIF = If();
    locala1.uri = getUri();
    locala1.dIG = localbhd;
    locala1.dIH = localbhp;
    locala.diG = locala1.KT();
    return this.kKL.KM().g(new a.1(this)).b(parama);
  }
  
  protected abstract Resp bax();
  
  protected void bay() {}
  
  protected void baz() {}
  
  protected abstract String getUri();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */