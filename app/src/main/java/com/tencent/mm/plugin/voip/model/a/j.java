package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bqo;
import com.tencent.mm.protocal.c.byx;
import com.tencent.mm.protocal.c.cao;
import com.tencent.mm.protocal.c.cap;
import java.util.LinkedList;

public final class j
  extends n<cao, cap>
{
  public j(long paramLong1, long paramLong2, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cao();
    ((b.a)localObject).dIH = new cap();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedresult";
    ((b.a)localObject).dIF = 901;
    ((b.a)localObject).dII = 901;
    ((b.a)localObject).dIJ = 1000000901;
    this.diG = ((b.a)localObject).KT();
    localObject = (cao)this.diG.dID.dIL;
    ((cao)localObject).swW = paramLong1;
    ((cao)localObject).rxH = paramLong2;
    ((cao)localObject).rth = paramInt1;
    ((cao)localObject).swX = new bhz().VO(paramString1);
    ((cao)localObject).swY = new bhz().VO(paramString2);
    ((cao)localObject).rji = 0.0D;
    ((cao)localObject).rjj = 0.0D;
    ((cao)localObject).rxG = paramInt2;
    ((cao)localObject).swZ = paramInt3;
    paramInt1 = 0;
    int i = 0;
    while (i < paramInt3)
    {
      paramString1 = new bqo();
      paramInt2 = paramInt1 + 1;
      paramString1.som = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.son = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt1 + 1;
      paramString1.soo = paramArrayOfInt[paramInt1];
      paramString1.sop = new byx();
      paramString2 = paramString1.sop;
      paramInt1 = paramInt2 + 1;
      paramString2.spR = paramArrayOfInt[paramInt2];
      paramString2 = paramString1.sop;
      paramInt2 = paramInt1 + 1;
      paramString2.sed = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.soq = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt1 + 1;
      paramString1.sor = paramArrayOfInt[paramInt1];
      int j = paramInt2 + 1;
      paramString1.sos = paramArrayOfInt[paramInt2];
      paramInt1 = j + 1;
      paramString1.sot = paramArrayOfInt[j];
      paramInt2 = 0;
      while (paramInt2 < paramString1.sot)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.sou.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.sov = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      paramInt1 = paramInt2;
      paramInt2 = j;
      while (paramInt2 < paramString1.sov)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.sow.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.sox = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      paramInt1 = paramInt2;
      paramInt2 = j;
      while (paramInt2 < paramString1.sox)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.soy.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
      a.eU("MicroMsg.NetSceneVoipSpeedResult", "SpeedResult: pkt_size[" + paramString1.son + "], pkt_count[" + paramString1.soo + "], svr_ip[" + paramString1.sop.spR + "], avg_rtt[" + paramString1.soq + "], min_rtt[" + paramString1.sor + "], max_rtt[" + paramString1.sos + "], rtt_count[" + paramString1.sot + "], down_seq_count[" + paramString1.sov + "], up_seq_count[" + paramString1.sox + "]");
      ((cao)localObject).rIv.add(paramString1);
      i += 1;
    }
  }
  
  public final e bLm()
  {
    return new j.1(this);
  }
  
  public final int getType()
  {
    return 901;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */