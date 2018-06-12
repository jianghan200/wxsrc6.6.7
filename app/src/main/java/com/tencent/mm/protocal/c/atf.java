package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class atf
  extends com.tencent.mm.bk.a
{
  public String bJK;
  public String bZM;
  public int ceS;
  public int dHg;
  public int rVG;
  public int rWa;
  public int rWb;
  public LinkedList<ari> rWc = new LinkedList();
  public LinkedList<bqg> rWd = new LinkedList();
  public int rWe;
  public long rWf;
  public int rWg;
  public LinkedList<Long> rWh = new LinkedList();
  public int rWi;
  public int rWj;
  public String rWk;
  public int rWl;
  public LinkedList<bhz> rWm = new LinkedList();
  public bpi rWn;
  public LinkedList<bpo> rWo = new LinkedList();
  public String rWp;
  public long rWq;
  public String rWr;
  public boolean rWs;
  public boj rWt;
  public String rcc;
  public String rwj;
  public String token;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rWa);
      paramVarArgs.fT(2, this.rWb);
      paramVarArgs.fT(3, this.rVG);
      if (this.rcc != null) {
        paramVarArgs.g(4, this.rcc);
      }
      paramVarArgs.d(5, 8, this.rWc);
      paramVarArgs.d(6, 8, this.rWd);
      paramVarArgs.fT(7, this.rWe);
      paramVarArgs.fT(8, this.dHg);
      paramVarArgs.T(9, this.rWf);
      paramVarArgs.fT(10, this.rWg);
      paramVarArgs.d(11, 3, this.rWh);
      paramVarArgs.fT(12, this.rWi);
      paramVarArgs.fT(13, this.rWj);
      if (this.token != null) {
        paramVarArgs.g(14, this.token);
      }
      if (this.rWk != null) {
        paramVarArgs.g(15, this.rWk);
      }
      paramVarArgs.fT(16, this.rWl);
      paramVarArgs.d(17, 8, this.rWm);
      if (this.rWn != null)
      {
        paramVarArgs.fV(18, this.rWn.boi());
        this.rWn.a(paramVarArgs);
      }
      if (this.bZM != null) {
        paramVarArgs.g(19, this.bZM);
      }
      paramVarArgs.d(20, 8, this.rWo);
      if (this.bJK != null) {
        paramVarArgs.g(21, this.bJK);
      }
      if (this.rWp != null) {
        paramVarArgs.g(22, this.rWp);
      }
      if (this.rwj != null) {
        paramVarArgs.g(23, this.rwj);
      }
      paramVarArgs.fT(24, this.ceS);
      paramVarArgs.T(25, this.rWq);
      if (this.rWr != null) {
        paramVarArgs.g(26, this.rWr);
      }
      paramVarArgs.av(27, this.rWs);
      if (this.rWt != null)
      {
        paramVarArgs.fV(28, this.rWt.boi());
        this.rWt.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.rWa) + 0 + f.a.a.a.fQ(2, this.rWb) + f.a.a.a.fQ(3, this.rVG);
      paramInt = i;
      if (this.rcc != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rcc);
      }
      i = paramInt + f.a.a.a.c(5, 8, this.rWc) + f.a.a.a.c(6, 8, this.rWd) + f.a.a.a.fQ(7, this.rWe) + f.a.a.a.fQ(8, this.dHg) + f.a.a.a.S(9, this.rWf) + f.a.a.a.fQ(10, this.rWg) + f.a.a.a.c(11, 3, this.rWh) + f.a.a.a.fQ(12, this.rWi) + f.a.a.a.fQ(13, this.rWj);
      paramInt = i;
      if (this.token != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.token);
      }
      i = paramInt;
      if (this.rWk != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rWk);
      }
      i = i + f.a.a.a.fQ(16, this.rWl) + f.a.a.a.c(17, 8, this.rWm);
      paramInt = i;
      if (this.rWn != null) {
        paramInt = i + f.a.a.a.fS(18, this.rWn.boi());
      }
      i = paramInt;
      if (this.bZM != null) {
        i = paramInt + f.a.a.b.b.a.h(19, this.bZM);
      }
      i += f.a.a.a.c(20, 8, this.rWo);
      paramInt = i;
      if (this.bJK != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.bJK);
      }
      i = paramInt;
      if (this.rWp != null) {
        i = paramInt + f.a.a.b.b.a.h(22, this.rWp);
      }
      paramInt = i;
      if (this.rwj != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.rwj);
      }
      i = paramInt + f.a.a.a.fQ(24, this.ceS) + f.a.a.a.S(25, this.rWq);
      paramInt = i;
      if (this.rWr != null) {
        paramInt = i + f.a.a.b.b.a.h(26, this.rWr);
      }
      i = paramInt + (f.a.a.b.b.a.ec(27) + 1);
      paramInt = i;
    } while (this.rWt == null);
    return i + f.a.a.a.fS(28, this.rWt.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rWc.clear();
      this.rWd.clear();
      this.rWh.clear();
      this.rWm.clear();
      this.rWo.clear();
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
      atf localatf = (atf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localatf.rWa = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localatf.rWb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localatf.rVG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localatf.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ari();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ari)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatf.rWc.add(localObject1);
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
          localObject1 = new bqg();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatf.rWd.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        localatf.rWe = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localatf.dHg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localatf.rWf = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 10: 
        localatf.rWg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localatf.rWh.add(Long.valueOf(((f.a.a.a.a)localObject1).vHC.rZ()));
        return 0;
      case 12: 
        localatf.rWi = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 13: 
        localatf.rWj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 14: 
        localatf.token = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 15: 
        localatf.rWk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 16: 
        localatf.rWl = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 17: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatf.rWm.add(localObject1);
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
          localObject1 = new bpi();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatf.rWn = ((bpi)localObject1);
          paramInt += 1;
        }
        return 0;
      case 19: 
        localatf.bZM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 20: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpo();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatf.rWo.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 21: 
        localatf.bJK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 22: 
        localatf.rWp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 23: 
        localatf.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 24: 
        localatf.ceS = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 25: 
        localatf.rWq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 26: 
        localatf.rWr = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 27: 
        localatf.rWs = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new boj();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((boj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localatf.rWt = ((boj)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/atf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */