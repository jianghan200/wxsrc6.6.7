package com.tencent.mm.plugin.sns.model;

import android.util.Base64;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.boc;
import com.tencent.mm.protocal.c.bod;
import com.tencent.mm.protocal.c.boe;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class m
  extends l
  implements com.tencent.mm.network.k
{
  public static List<Long> nnQ = Collections.synchronizedList(new LinkedList());
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private String elA;
  private long nkI;
  
  public m(long paramLong, int paramInt, String paramString)
  {
    this.nkI = paramLong;
    Object localObject3 = new b.a();
    ((b.a)localObject3).dIG = new bod();
    ((b.a)localObject3).dIH = new boe();
    ((b.a)localObject3).uri = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
    ((b.a)localObject3).dIF = 683;
    Object localObject2 = new StringBuilder();
    g.Ek();
    this.elA = (g.Ei().cachePath + "ad_detail_session");
    localObject2 = FileOp.e(this.elA, 0, -1);
    this.diG = ((b.a)localObject3).KT();
    ((bod)this.diG.dID.dIL).rlK = paramLong;
    ((bod)this.diG.dID.dIL).slZ = ab.O((byte[])localObject2);
    ((bod)this.diG.dID.dIL).otY = paramInt;
    if ((paramString != null) && (paramString.length() > 0))
    {
      localObject3 = (bod)this.diG.dID.dIL;
      if (paramString == null) {
        ((bod)localObject3).sma = ((bhy)localObject1);
      }
    }
    else
    {
      localObject1 = new StringBuilder("req snsId ").append(paramLong).append(" ").append(com.tencent.mm.plugin.sns.data.i.eF(paramLong)).append(" scene ").append(paramInt).append(" buf is null? ");
      if (localObject2 != null) {
        break label339;
      }
    }
    label339:
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.NetSceneSnsAdObjectDetial", bool);
      x.i("MicroMsg.NetSceneSnsAdObjectDetial", "do adObjectDetail snsId[%d] scene[%d] syncBuffer[%s]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt), paramString });
      return;
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      if (arrayOfByte == null) {
        break;
      }
      localObject1 = new bhy();
      ((bhy)localObject1).bq(arrayOfByte);
      break;
    }
  }
  
  public static boolean eK(long paramLong)
  {
    if (nnQ.contains(Long.valueOf(paramLong))) {
      return false;
    }
    nnQ.add(Long.valueOf(paramLong));
    return true;
  }
  
  private static boolean eL(long paramLong)
  {
    nnQ.remove(Long.valueOf(paramLong));
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramInt1 = 1;
    x.i("MicroMsg.NetSceneSnsAdObjectDetial", "errType " + paramInt2 + " errCode " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    for (;;)
    {
      if (paramInt1 == 0)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        eL(this.nkI);
        return;
        if ((paramInt2 == 4) && (paramInt3 == 1))
        {
          paramq = ab.a(((boe)this.diG.dIE.dIL).slZ);
          if (paramq != null)
          {
            FileOp.deleteFile(this.elA);
            FileOp.b(this.elA, paramq, paramq.length);
          }
          paramInt1 = 0;
        }
      }
      else
      {
        paramq = ab.a(((boe)this.diG.dIE.dIL).slZ);
        FileOp.deleteFile(this.elA);
        FileOp.b(this.elA, paramq, paramq.length);
        paramq = ((boe)this.diG.dIE.dIL).smb;
        paramArrayOfByte = ((boe)this.diG.dIE.dIL).smc;
        if (paramq != null)
        {
          x.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail xml " + ab.b(paramq.slX.smH));
          x.i("MicroMsg.NetSceneSnsAdObjectDetial", "adxml " + paramq.slY);
        }
        if ((paramq != null) && (paramq.slX != null) && (paramq.slX.rXs > 0))
        {
          x.i("MicroMsg.NetSceneSnsAdObjectDetial", paramq.slX.rlK + " will remove by get detail ");
          eL(this.nkI);
          af.byr().delete(paramq.slX.rlK);
          af.byt().fd(paramq.slX.rlK);
          com.tencent.mm.plugin.sns.storage.i.fc(paramq.slX.rlK);
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          return;
        }
        if ((paramq != null) && (paramq.slX != null)) {
          x.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment:" + paramq.slX.smO.size() + " like: " + paramq.slX.smL.size());
        }
        a.a(paramq, paramArrayOfByte);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        eL(this.nkI);
        return;
      }
      paramInt1 = 0;
    }
  }
  
  public final int getType()
  {
    return 683;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */