package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.model.a;
import com.tencent.mm.protocal.c.bfl;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpm;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.math.BigInteger;

public final class l
  implements bv.a
{
  private static String W(String paramString1, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (bi.oW(paramString3))) {
      return "";
    }
    int j = paramString1.indexOf(paramString2);
    if (j >= 0) {}
    for (int i = paramString1.indexOf(paramString3); (j >= 0) && (i > j); i = -1) {
      return paramString1.substring(j, i + paramString3.length());
    }
    return "";
  }
  
  public final void a(d.a parama)
  {
    if ((parama == null) || (parama.dIN == null) || (parama.dIN.rcl == null))
    {
      x.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
      return;
    }
    Object localObject2 = ab.a(parama.dIN.rcl);
    x.d("MicroMsg.SimpleExperimentLsn", "recv addMsg " + (String)localObject2);
    parama = W((String)localObject2, "<TimelineObject", "</TimelineObject>");
    if (bi.oW(parama))
    {
      x.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
      return;
    }
    Object localObject1 = W((String)localObject2, "<RecXml", "</RecXml>");
    if (bi.oW((String)localObject1))
    {
      x.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
      return;
    }
    Object localObject3 = W((String)localObject2, "<ADInfo", "</ADInfo>");
    if (bi.oW((String)localObject3))
    {
      x.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
      return;
    }
    localObject2 = e.ng(parama);
    bfl localbfl = new bfl();
    localbfl.sgL = ab.oT((String)localObject3);
    localObject3 = new bpm();
    localbfl.sgK = ((bpm)localObject3);
    ((bpm)localObject3).snA = ab.oT((String)localObject1);
    localObject1 = new boy();
    ((boy)localObject1).rlK = new BigInteger(((bsu)localObject2).ksA).longValue();
    ((boy)localObject1).lOH = ((bsu)localObject2).lOH;
    ((boy)localObject1).rdS = ((bsu)localObject2).hbL;
    ((boy)localObject1).smH = ab.O(parama.getBytes());
    ((bpm)localObject3).slX = ((boy)localObject1);
    a.b(localbfl);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */