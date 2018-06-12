package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.ajc;
import com.tencent.mm.protocal.c.ajd;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.pluginsdk.model.app.x
{
  public String qyY;
  
  public l(String paramString, LinkedList<String> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", new Object[] { paramString });
    this.qyY = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ajc();
    ((b.a)localObject).dIH = new ajd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getuserinfoinapp";
    ((b.a)localObject).dIF = 452;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (ajc)this.ivx.dID.dIL;
    ((ajc)localObject).jPc = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bi.oW(str)) {
        paramString.add(ab.oT(str));
      }
    }
    ((ajc)localObject).rgF = paramString;
    ((ajc)localObject).rGU = paramLinkedList.size();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    }
  }
  
  public final void bg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
      return;
    }
    b.c localc = this.ivx.dIE;
    try
    {
      localc.G(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte, "", new Object[0]);
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
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetUserInfoInApp", localException.getMessage());
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int getType()
  {
    return 14;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */