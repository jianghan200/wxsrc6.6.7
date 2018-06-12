package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.byz;
import com.tencent.mm.protocal.c.bza;
import com.tencent.mm.protocal.c.cak;

public final class b
  extends n<byz, bza>
{
  String TAG = "MicroMsg.NetSceneVoipAnswer";
  
  public b(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new byz();
    ((b.a)localObject1).dIH = new bza();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipanswer";
    ((b.a)localObject1).dIF = 172;
    ((b.a)localObject1).dII = 65;
    ((b.a)localObject1).dIJ = 1000000065;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (byz)this.diG.dID.dIL;
    ((byz)localObject1).suY = paramInt1;
    ((byz)localObject1).rxG = paramInt3;
    ((byz)localObject1).rth = paramInt2;
    Object localObject2 = new cak();
    ((cak)localObject2).hcE = 2;
    bhy localbhy = new bhy();
    localbhy.bq(paramArrayOfByte1);
    ((cak)localObject2).rfy = localbhy;
    ((byz)localObject1).suK = ((cak)localObject2);
    paramArrayOfByte1 = new cak();
    paramArrayOfByte1.hcE = 3;
    localObject2 = new bhy();
    ((bhy)localObject2).bq(paramArrayOfByte2);
    paramArrayOfByte1.rfy = ((bhy)localObject2);
    ((byz)localObject1).suL = paramArrayOfByte1;
    ((byz)localObject1).rxH = paramLong;
    if (paramBoolean2) {
      if (!paramBoolean1) {
        break label240;
      }
    }
    label240:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      ((byz)localObject1).suZ = paramInt1;
      ((byz)localObject1).suO = System.currentTimeMillis();
      return;
    }
  }
  
  public final e bLm()
  {
    return new b.1(this);
  }
  
  public final int getType()
  {
    return 172;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */