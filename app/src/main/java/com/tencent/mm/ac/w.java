package com.tencent.mm.ac;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apt;
import com.tencent.mm.protocal.c.apu;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class w
  extends l
  implements k
{
  public String dMD;
  public int dME = 1;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  public String tag;
  
  public w(String paramString, LinkedList<String> paramLinkedList)
  {
    this(paramString, paramLinkedList, (byte)0);
  }
  
  private w(String paramString, LinkedList<String> paramLinkedList, byte paramByte)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new apt();
    ((b.a)localObject).dIH = new apu();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetinfolist";
    ((b.a)localObject).dIF = 675;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (apt)this.diG.dID.dIL;
    ((apt)localObject).rSp = paramString;
    ((apt)localObject).rSs = paramLinkedList;
    this.dMD = paramString;
    this.dME = 1;
  }
  
  public final apu MV()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (apu)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneKFGetInfoList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 675;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */