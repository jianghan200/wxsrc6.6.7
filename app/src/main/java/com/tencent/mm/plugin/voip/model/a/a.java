package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.byv;
import com.tencent.mm.protocal.c.byw;
import com.tencent.mm.protocal.c.cak;

public final class a
  extends n<byv, byw>
{
  String TAG = "MicroMsg.NetSceneVoipAck";
  
  public a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new byv();
    ((b.a)localObject).dIH = new byw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipack";
    ((b.a)localObject).dIF = 305;
    ((b.a)localObject).dII = 123;
    ((b.a)localObject).dIJ = 1000000123;
    this.diG = ((b.a)localObject).KT();
    localObject = (byv)this.diG.dID.dIL;
    ((byv)localObject).rxG = paramInt1;
    ((byv)localObject).rxH = paramLong;
    ((byv)localObject).suN = paramInt2;
    if (paramInt2 != 1)
    {
      ((byv)localObject).suJ = 0;
      return;
    }
    ((byv)localObject).suM = paramString;
    paramString = new cak();
    paramString.hcE = 2;
    bhy localbhy = new bhy();
    localbhy.bq(paramArrayOfByte1);
    paramString.rfy = localbhy;
    ((byv)localObject).suK = paramString;
    paramArrayOfByte1 = new cak();
    paramArrayOfByte1.hcE = 3;
    paramString = new bhy();
    paramString.bq(paramArrayOfByte2);
    paramArrayOfByte1.rfy = paramString;
    ((byv)localObject).suL = paramArrayOfByte1;
    ((byv)localObject).suO = System.currentTimeMillis();
    ((byv)localObject).suJ = 1;
  }
  
  public final e bLm()
  {
    return new a.1(this);
  }
  
  public final int getType()
  {
    return 305;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */