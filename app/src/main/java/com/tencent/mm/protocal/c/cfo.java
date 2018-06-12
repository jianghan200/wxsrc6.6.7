package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cfo
  extends com.tencent.mm.bk.a
{
  public String iwP;
  public int otY;
  public bsg pKY;
  public String rDH;
  public aqs rUI;
  public int rjC;
  public long rll;
  public String rlo;
  public LinkedList<String> sAa = new LinkedList();
  public LinkedList<awg> sAb = new LinkedList();
  public com.tencent.mm.bk.b sAc;
  public com.tencent.mm.bk.b sAd;
  public boq sAe;
  public qv sAf;
  public bbb sAg;
  public int shN;
  public LinkedList<bxd> sjr = new LinkedList();
  public int syH;
  public int syI = 2;
  public String syL;
  public int szP;
  public LinkedList<ps> szQ = new LinkedList();
  public String szX;
  public String szY;
  public int szZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rDH == null) {
        throw new f.a.a.b("Not all required fields were included: Keyword");
      }
      paramVarArgs.fT(1, this.shN);
      if (this.rDH != null) {
        paramVarArgs.g(2, this.rDH);
      }
      paramVarArgs.fT(3, this.rjC);
      paramVarArgs.T(4, this.rll);
      paramVarArgs.fT(5, this.syH);
      if (this.rUI != null)
      {
        paramVarArgs.fV(6, this.rUI.boi());
        this.rUI.a(paramVarArgs);
      }
      paramVarArgs.d(7, 8, this.sjr);
      paramVarArgs.fT(8, this.otY);
      if (this.rlo != null) {
        paramVarArgs.g(9, this.rlo);
      }
      paramVarArgs.fT(10, this.szP);
      if (this.szX != null) {
        paramVarArgs.g(11, this.szX);
      }
      if (this.szY != null) {
        paramVarArgs.g(12, this.szY);
      }
      paramVarArgs.fT(13, this.szZ);
      paramVarArgs.d(14, 1, this.sAa);
      paramVarArgs.fT(15, this.syI);
      if (this.pKY != null)
      {
        paramVarArgs.fV(16, this.pKY.boi());
        this.pKY.a(paramVarArgs);
      }
      paramVarArgs.d(17, 8, this.szQ);
      paramVarArgs.d(18, 8, this.sAb);
      if (this.iwP != null) {
        paramVarArgs.g(19, this.iwP);
      }
      if (this.sAc != null) {
        paramVarArgs.b(20, this.sAc);
      }
      if (this.syL != null) {
        paramVarArgs.g(21, this.syL);
      }
      if (this.sAd != null) {
        paramVarArgs.b(22, this.sAd);
      }
      if (this.sAe != null)
      {
        paramVarArgs.fV(23, this.sAe.boi());
        this.sAe.a(paramVarArgs);
      }
      if (this.sAf != null)
      {
        paramVarArgs.fV(24, this.sAf.boi());
        this.sAf.a(paramVarArgs);
      }
      if (this.sAg != null)
      {
        paramVarArgs.fV(25, this.sAg.boi());
        this.sAg.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.shN) + 0;
      paramInt = i;
      if (this.rDH != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rDH);
      }
      i = paramInt + f.a.a.a.fQ(3, this.rjC) + f.a.a.a.S(4, this.rll) + f.a.a.a.fQ(5, this.syH);
      paramInt = i;
      if (this.rUI != null) {
        paramInt = i + f.a.a.a.fS(6, this.rUI.boi());
      }
      i = paramInt + f.a.a.a.c(7, 8, this.sjr) + f.a.a.a.fQ(8, this.otY);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rlo);
      }
      i = paramInt + f.a.a.a.fQ(10, this.szP);
      paramInt = i;
      if (this.szX != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.szX);
      }
      i = paramInt;
      if (this.szY != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.szY);
      }
      i = i + f.a.a.a.fQ(13, this.szZ) + f.a.a.a.c(14, 1, this.sAa) + f.a.a.a.fQ(15, this.syI);
      paramInt = i;
      if (this.pKY != null) {
        paramInt = i + f.a.a.a.fS(16, this.pKY.boi());
      }
      i = paramInt + f.a.a.a.c(17, 8, this.szQ) + f.a.a.a.c(18, 8, this.sAb);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.iwP);
      }
      i = paramInt;
      if (this.sAc != null) {
        i = paramInt + f.a.a.a.a(20, this.sAc);
      }
      paramInt = i;
      if (this.syL != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.syL);
      }
      i = paramInt;
      if (this.sAd != null) {
        i = paramInt + f.a.a.a.a(22, this.sAd);
      }
      paramInt = i;
      if (this.sAe != null) {
        paramInt = i + f.a.a.a.fS(23, this.sAe.boi());
      }
      i = paramInt;
      if (this.sAf != null) {
        i = paramInt + f.a.a.a.fS(24, this.sAf.boi());
      }
      paramInt = i;
    } while (this.sAg == null);
    return i + f.a.a.a.fS(25, this.sAg.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.sjr.clear();
      this.sAa.clear();
      this.szQ.clear();
      this.sAb.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rDH == null) {
        throw new f.a.a.b("Not all required fields were included: Keyword");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      cfo localcfo = (cfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localcfo.shN = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localcfo.rDH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localcfo.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localcfo.rll = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 5: 
        localcfo.syH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.rUI = ((aqs)localObject1);
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
          localObject1 = new bxd();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bxd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.sjr.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 8: 
        localcfo.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localcfo.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 10: 
        localcfo.szP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localcfo.szX = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 12: 
        localcfo.szY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 13: 
        localcfo.szZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        localcfo.sAa.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      case 15: 
        localcfo.syI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 16: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bsg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bsg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.pKY = ((bsg)localObject1);
          paramInt += 1;
        }
        return 0;
      case 17: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ps();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ps)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.szQ.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 18: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.sAb.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 19: 
        localcfo.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 20: 
        localcfo.sAc = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      case 21: 
        localcfo.syL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 22: 
        localcfo.sAd = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      case 23: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.sAe = ((boq)localObject1);
          paramInt += 1;
        }
        return 0;
      case 24: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qv();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcfo.sAf = ((qv)localObject1);
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
        localObject1 = new bbb();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bbb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localcfo.sAg = ((bbb)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */