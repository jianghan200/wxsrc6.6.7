package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bqp;
import com.tencent.mm.protocal.c.caq;
import com.tencent.mm.protocal.c.car;

public final class k
  extends n<caq, car>
{
  public k(bqp parambqp)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new caq();
    ((b.a)localObject).dIH = new car();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedtest";
    ((b.a)localObject).dIF = 765;
    ((b.a)localObject).dII = 765;
    ((b.a)localObject).dIJ = 1000000765;
    this.diG = ((b.a)localObject).KT();
    localObject = (caq)this.diG.dID.dIL;
    ((caq)localObject).rxG = parambqp.rxG;
    ((caq)localObject).soz = parambqp.soz;
    ((caq)localObject).rth = parambqp.rth;
    ((caq)localObject).soA = parambqp.soA;
    ((caq)localObject).soB = parambqp.soB;
    ((caq)localObject).soC = parambqp.soC;
    ((caq)localObject).soD = parambqp.soD;
    ((caq)localObject).soE = parambqp.soE;
    ((caq)localObject).soF = parambqp.soF;
    ((caq)localObject).soG = parambqp.soG;
    ((caq)localObject).soH = parambqp.soH;
    ((caq)localObject).soI = parambqp.soI;
    ((caq)localObject).soJ = parambqp.soJ;
  }
  
  public final e bLm()
  {
    return new k.1(this);
  }
  
  public final int getType()
  {
    return 765;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */