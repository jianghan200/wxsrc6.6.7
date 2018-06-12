package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.a;
import com.tencent.mm.model.au;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acu;
import com.tencent.mm.protocal.c.acv;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private static Map<String, Long> efl = new HashMap();
  private static Map<String, String> efm;
  private boolean bQq = false;
  private com.tencent.mm.ab.e diJ;
  private final b efk;
  private c<a> efn;
  
  public k(int paramInt, boolean paramBoolean)
  {
    b.a locala = new b.a();
    locala.dIG = new acu();
    locala.dIH = new acv();
    locala.uri = "/cgi-bin/micromsg-bin/getdisasterinfo";
    locala.dIF = 775;
    locala.dII = 0;
    locala.dIJ = 0;
    this.efk = locala.KT();
    this.efk.cdn = 1;
    ((acu)this.efk.dID.dIL).bQp = paramInt;
    this.bQq = paramBoolean;
    QU();
    x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.bQq), bi.cjd() });
  }
  
  private void J(String paramString, boolean paramBoolean)
  {
    au.Em().H(new k.1(this, paramString, paramBoolean));
  }
  
  private void QU()
  {
    for (;;)
    {
      int i;
      Object localObject4;
      try
      {
        if (efm != null) {
          break label363;
        }
        x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
        efm = new HashMap();
        SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("disaster_pref", 4);
        Object localObject1 = localSharedPreferences.getString("disaster_new_noticeid_list_key", "");
        if (bi.oW((String)localObject1)) {
          break label346;
        }
        String[] arrayOfString1 = ((String)localObject1).split(";");
        if ((arrayOfString1 == null) || (arrayOfString1.length <= 0)) {
          break label346;
        }
        String str1 = "";
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        int j = arrayOfString1.length;
        i = 0;
        if (i < j)
        {
          String[] arrayOfString2 = arrayOfString1[i].split(",");
          localObject1 = str1;
          localObject4 = str1;
          try
          {
            if (bi.getLong(arrayOfString2[0], 0L) <= 0L) {
              break label366;
            }
            localObject1 = str1;
            if (bi.bG(bi.getLong(arrayOfString2[1], 0L)) < 86400L)
            {
              localObject1 = str1;
              String str2 = localSharedPreferences.getString(arrayOfString2[0], "");
              localObject1 = str1;
              localObject4 = str1;
              if (!bi.oW(str2))
              {
                localObject1 = str1;
                localObject4 = str1 + arrayOfString2[0] + "," + arrayOfString2[1] + ";";
                localObject1 = localObject4;
                efm.put(arrayOfString2[0], str2);
              }
            }
            else
            {
              localObject1 = str1;
              localEditor.remove(arrayOfString2[0]).commit();
              localObject4 = str1;
            }
          }
          catch (Exception localException)
          {
            x.e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", new Object[] { localException.getMessage() });
            localObject4 = localObject1;
          }
        }
        localEditor.putString("disaster_new_noticeid_list_key", localException).commit();
      }
      finally {}
      x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", new Object[] { localException, efl });
      label346:
      x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", new Object[] { efm });
      label363:
      return;
      label366:
      i += 1;
      Object localObject3 = localObject4;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    acu localacu = (acu)this.efk.dID.dIL;
    long l = bi.a((Long)efl.get(localacu.bQp), 0L);
    x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", new Object[] { Integer.valueOf(localacu.bQp), Long.valueOf(l), efl });
    if ((l != 0L) && (bi.bI(l) < 1800000L))
    {
      x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", new Object[] { Integer.valueOf(localacu.bQp) });
      return -1;
    }
    String str = bi.aG((String)efm.get(localacu.bQp), "");
    if (!bi.oW(str))
    {
      x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", new Object[] { Integer.valueOf(localacu.bQp), str });
      J(str, false);
      return -1;
    }
    this.diJ = parame1;
    return a(parame, this.efk, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      J(((acv)this.efk.dIE.dIL).content, true);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 775;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsimple/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */