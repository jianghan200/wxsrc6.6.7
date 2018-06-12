package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class acf
  extends com.tencent.mm.bk.a
  implements bnu
{
  public int rGN;
  public int rGO;
  public int rGP;
  public LinkedList<brg> rGQ = new LinkedList();
  public LinkedList<brg> rGR = new LinkedList();
  public LinkedList<brg> rGS = new LinkedList();
  public int rfn;
  public int rto;
  public int rtp;
  public int rtq;
  public LinkedList<brg> rtr = new LinkedList();
  public LinkedList<brg> rts = new LinkedList();
  public LinkedList<brg> rtt = new LinkedList();
  public int rtu;
  public int rtv;
  public int rtw;
  public amj rtx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rfn);
      paramVarArgs.fT(2, this.rto);
      paramVarArgs.fT(3, this.rtp);
      paramVarArgs.fT(4, this.rtq);
      paramVarArgs.d(5, 8, this.rtr);
      paramVarArgs.d(6, 8, this.rts);
      paramVarArgs.d(7, 8, this.rtt);
      paramVarArgs.fT(8, this.rtu);
      paramVarArgs.fT(9, this.rtv);
      paramVarArgs.fT(10, this.rtw);
      paramVarArgs.fT(11, this.rGN);
      paramVarArgs.fT(12, this.rGO);
      paramVarArgs.fT(13, this.rGP);
      paramVarArgs.d(14, 8, this.rGQ);
      paramVarArgs.d(15, 8, this.rGR);
      paramVarArgs.d(16, 8, this.rGS);
      if (this.rtx != null)
      {
        paramVarArgs.fV(17, this.rtx.boi());
        this.rtx.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rfn) + 0 + f.a.a.a.fQ(2, this.rto) + f.a.a.a.fQ(3, this.rtp) + f.a.a.a.fQ(4, this.rtq) + f.a.a.a.c(5, 8, this.rtr) + f.a.a.a.c(6, 8, this.rts) + f.a.a.a.c(7, 8, this.rtt) + f.a.a.a.fQ(8, this.rtu) + f.a.a.a.fQ(9, this.rtv) + f.a.a.a.fQ(10, this.rtw) + f.a.a.a.fQ(11, this.rGN) + f.a.a.a.fQ(12, this.rGO) + f.a.a.a.fQ(13, this.rGP) + f.a.a.a.c(14, 8, this.rGQ) + f.a.a.a.c(15, 8, this.rGR) + f.a.a.a.c(16, 8, this.rGS);
      paramInt = i;
    } while (this.rtx == null);
    return i + f.a.a.a.fS(17, this.rtx.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rtr.clear();
      this.rts.clear();
      this.rtt.clear();
      this.rGQ.clear();
      this.rGR.clear();
      this.rGS.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      acf localacf = (acf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localacf.rfn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localacf.rto = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localacf.rtp = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localacf.rtq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rtr.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rts.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rtt.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 8: 
        localacf.rtu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localacf.rtv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        localacf.rtw = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localacf.rGN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 12: 
        localacf.rGO = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 13: 
        localacf.rGP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rGQ.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 15: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rGR.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 16: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new brg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((brg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localacf.rGS.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new amj();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((amj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localacf.rtx = ((amj)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
  
  public final int getRet()
  {
    return this.rfn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/acf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */