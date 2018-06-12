package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.cad;
import com.tencent.mm.protocal.c.cae;
import com.tencent.mm.protocal.c.cak;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends n<cad, cae>
{
  public g(List<String> paramList, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new cad();
    ((b.a)localObject1).dIH = new cae();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipinvite";
    ((b.a)localObject1).dIF = 170;
    ((b.a)localObject1).dII = 63;
    ((b.a)localObject1).dIJ = 1000000063;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (cad)this.diG.dID.dIL;
    Object localObject2 = new LinkedList();
    int i = 0;
    while (i < paramList.size())
    {
      ((LinkedList)localObject2).add(new bhz().VO((String)paramList.get(i)));
      i += 1;
    }
    ((cad)localObject1).seC = q.GF();
    ((cad)localObject1).svW = ((LinkedList)localObject2);
    ((cad)localObject1).svV = ((LinkedList)localObject2).size();
    ((cad)localObject1).rth = paramInt1;
    ((cad)localObject1).soz = 0;
    ((cad)localObject1).svK = paramInt2;
    ((cad)localObject1).sef = paramInt3;
    paramList = new cak();
    paramList.hcE = 2;
    localObject2 = new bhy();
    ((bhy)localObject2).bq(paramArrayOfByte1);
    paramList.rfy = ((bhy)localObject2);
    ((cad)localObject1).suK = paramList;
    paramList = new cak();
    paramList.hcE = 3;
    paramArrayOfByte1 = new bhy();
    paramArrayOfByte1.bq(paramArrayOfByte2);
    paramList.rfy = paramArrayOfByte1;
    ((cad)localObject1).suL = paramList;
    ((cad)localObject1).suO = System.currentTimeMillis();
  }
  
  public final e bLm()
  {
    return new g.1(this);
  }
  
  public final int getType()
  {
    return 170;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */