package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.protocal.c.cab;
import com.tencent.mm.protocal.c.cac;

public final class f
  extends n<cab, cac>
{
  String TAG = "MicroMsg.NetSceneVoipHeartBeat";
  
  public f(int paramInt1, long paramLong, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cab();
    ((b.a)localObject).dIH = new cac();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipheartbeat";
    ((b.a)localObject).dIF = 178;
    ((b.a)localObject).dII = 81;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (cab)this.diG.dID.dIL;
    ((cab)localObject).rxG = paramInt1;
    ((cab)localObject).rxH = paramLong;
    ((cab)localObject).suO = System.currentTimeMillis();
    ((cab)localObject).svU = paramInt2;
  }
  
  public final e bLm()
  {
    return new f.1(this);
  }
  
  public final int getType()
  {
    return 178;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/model/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */