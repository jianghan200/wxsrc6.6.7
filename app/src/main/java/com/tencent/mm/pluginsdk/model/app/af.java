package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.protocal.c.di;
import com.tencent.mm.protocal.c.dj;
import com.tencent.mm.protocal.c.zj;
import com.tencent.mm.protocal.c.zk;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class af
  extends x
{
  List<String> qAq;
  
  public af(List<String> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new zj();
    ((b.a)localObject).dIH = new zk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappsetting";
    ((b.a)localObject).dIF = 395;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    this.qAq = paramList;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetAppSetting", "<init>, appIdList size = " + paramList.size());
    localObject = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() > 0))
      {
        dj localdj = new dj();
        localdj.jPc = str;
        ((LinkedList)localObject).add(localdj);
      }
    }
    if (((LinkedList)localObject).size() == 0) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
    }
    paramList = (zj)this.ivx.dID.dIL;
    paramList.rFr = ((LinkedList)localObject);
    paramList.rFq = ((LinkedList)localObject).size();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
    }
    for (;;)
    {
      return;
      paramString = (zk)this.ivx.dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, resp appCount = " + paramString.rFq);
      paramq = paramString.rFs;
      if ((paramq == null) || (paramq.size() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
        return;
      }
      paramString = a.bmf();
      paramq = paramq.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (di)paramq.next();
        f localf = g.bl(paramArrayOfByte.jPc, false);
        if (localf != null)
        {
          localf.field_authFlag = paramArrayOfByte.rdF;
          localf.field_openId = paramArrayOfByte.jRd;
          boolean bool = paramString.a(localf, new String[0]);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramArrayOfByte.jPc);
        }
      }
    }
  }
  
  public final void bg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "buf is null");
      return;
    }
    try
    {
      this.ivx.dIE.G(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", paramArrayOfByte, "", new Object[0]);
    }
  }
  
  public final byte[] cbx()
  {
    try
    {
      byte[] arrayOfByte = ((b.b)this.ivx.KV()).Ie();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + localException.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int getType()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */