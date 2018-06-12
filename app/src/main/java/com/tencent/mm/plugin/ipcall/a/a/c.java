package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.bbu;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public String bZR;
  public String cbH;
  public int fOu;
  public LinkedList<bbu> gUH = new LinkedList();
  public int iwS;
  public String iwT;
  public boolean kpA = false;
  public boolean kpB = false;
  public boolean kpC = false;
  public boolean kpD = true;
  public int kpE = 0;
  public int kpF;
  public int kpG;
  public int kpH;
  public b kpI;
  public int kpJ;
  public int kpK;
  public b kpL;
  public LinkedList<bbu> kpM = new LinkedList();
  public int kpN = 999;
  public LinkedList<d> kpO = new LinkedList();
  public String kpP;
  public String kpQ;
  public String kpR;
  public int kpS;
  public boolean kpT = false;
  public int kpo;
  public long kpp;
  public long kpq;
  public int kpr;
  public int kps;
  public int kpt;
  public int kpu;
  public String kpv;
  public int kpw;
  public int kpx;
  public int kpy;
  public int kpz;
  public String nickname;
  
  public final int aXG()
  {
    if ((this.kpO != null) && (this.kpO.size() > 0)) {
      return ((d)this.kpO.get(0)).kpx;
    }
    return this.kpx;
  }
  
  public final int aXH()
  {
    if ((this.kpO != null) && (this.kpO.size() > 0)) {
      return ((d)this.kpO.get(0)).dpx;
    }
    return this.fOu;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append("IPCallInfo: ");
    localStringBuilder.append(String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", new Object[] { Integer.valueOf(this.kpo), Long.valueOf(this.kpp), Long.valueOf(this.kpq), Integer.valueOf(this.kpr), Integer.valueOf(this.kpw), Integer.valueOf(this.kpx), Integer.valueOf(this.kpy), Integer.valueOf(this.fOu), this.iwT, Integer.valueOf(this.iwS), Integer.valueOf(this.kpu) }));
    localStringBuilder.append(String.format("[toUsername: %s, toPhoneNumber: %s]\n", new Object[] { this.bZR, this.kpQ }));
    localStringBuilder.append("[addrList: ");
    Iterator localIterator = this.gUH.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (bbu)localIterator.next();
      localStringBuilder.append(String.format("{IP: %s, port: %d}", new Object[] { ((bbu)localObject).rTO, Integer.valueOf(((bbu)localObject).sed) }));
    }
    localStringBuilder.append("]");
    localStringBuilder.append("\n");
    if ((this.kpO != null) && (this.kpO.size() > 0))
    {
      localStringBuilder.append("[userInfoList: ");
      localIterator = this.kpO.iterator();
      while (localIterator.hasNext())
      {
        localObject = (d)localIterator.next();
        localStringBuilder.append("{");
        localStringBuilder.append(((d)localObject).toString());
        localStringBuilder.append("}");
      }
      localStringBuilder.append("]");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("userInfoList is empty");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */