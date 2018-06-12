package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class atz
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public int eJL;
  public String eJM;
  public int eJN;
  public int eJO;
  public String eJP;
  public String eJQ;
  public String eJR;
  public String rKZ;
  public bhz rQz;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public bqd rTk;
  public qt rTl;
  public bhz rWH;
  public bhz rWI;
  public bhz rWJ;
  public int rWZ;
  public bhy rcn;
  public String rqZ;
  public String rra;
  public bhz ruT;
  public bhz ruU;
  public int rup;
  public bhz rvi;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.rQz == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.ruT == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ruU == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.rWH == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.rWI == null) {
        throw new b("Not all required fields were included: RemarkPYInitial");
      }
      if (this.rWJ == null) {
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (this.rvi != null)
      {
        paramVarArgs.fV(1, this.rvi.boi());
        this.rvi.a(paramVarArgs);
      }
      if (this.rQz != null)
      {
        paramVarArgs.fV(2, this.rQz.boi());
        this.rQz.a(paramVarArgs);
      }
      if (this.ruT != null)
      {
        paramVarArgs.fV(3, this.ruT.boi());
        this.ruT.a(paramVarArgs);
      }
      if (this.ruU != null)
      {
        paramVarArgs.fV(4, this.ruU.boi());
        this.ruU.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.eJH);
      if (this.rcn != null)
      {
        paramVarArgs.fV(6, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.rWZ);
      if (this.rWH != null)
      {
        paramVarArgs.fV(8, this.rWH.boi());
        this.rWH.a(paramVarArgs);
      }
      if (this.rWI != null)
      {
        paramVarArgs.fV(9, this.rWI.boi());
        this.rWI.a(paramVarArgs);
      }
      if (this.rWJ != null)
      {
        paramVarArgs.fV(10, this.rWJ.boi());
        this.rWJ.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.rup);
      if (this.eJI != null) {
        paramVarArgs.g(12, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(13, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(14, this.eJK);
      }
      paramVarArgs.fT(15, this.eJL);
      paramVarArgs.fT(16, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(17, this.rTf);
      }
      if (this.rTg != null) {
        paramVarArgs.g(18, this.rTg);
      }
      if (this.rKZ != null) {
        paramVarArgs.g(19, this.rKZ);
      }
      if (this.rTh != null) {
        paramVarArgs.g(20, this.rTh);
      }
      paramVarArgs.fT(21, this.rTi);
      paramVarArgs.fT(22, this.eJO);
      paramVarArgs.fT(23, this.eJN);
      if (this.eJP != null) {
        paramVarArgs.g(24, this.eJP);
      }
      if (this.eJM != null) {
        paramVarArgs.g(25, this.eJM);
      }
      if (this.rTk != null)
      {
        paramVarArgs.fV(26, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(27, this.eJQ);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(28, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(29, this.rra);
      }
      if (this.eJR != null) {
        paramVarArgs.g(30, this.eJR);
      }
      if (this.rTl != null)
      {
        paramVarArgs.fV(31, this.rTl.boi());
        this.rTl.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rvi == null) {
        break label2941;
      }
    }
    label2941:
    for (int i = f.a.a.a.fS(1, this.rvi.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rQz != null) {
        paramInt = i + f.a.a.a.fS(2, this.rQz.boi());
      }
      i = paramInt;
      if (this.ruT != null) {
        i = paramInt + f.a.a.a.fS(3, this.ruT.boi());
      }
      paramInt = i;
      if (this.ruU != null) {
        paramInt = i + f.a.a.a.fS(4, this.ruU.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.eJH);
      paramInt = i;
      if (this.rcn != null) {
        paramInt = i + f.a.a.a.fS(6, this.rcn.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.rWZ);
      paramInt = i;
      if (this.rWH != null) {
        paramInt = i + f.a.a.a.fS(8, this.rWH.boi());
      }
      i = paramInt;
      if (this.rWI != null) {
        i = paramInt + f.a.a.a.fS(9, this.rWI.boi());
      }
      paramInt = i;
      if (this.rWJ != null) {
        paramInt = i + f.a.a.a.fS(10, this.rWJ.boi());
      }
      i = paramInt + f.a.a.a.fQ(11, this.rup);
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.eJJ);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(15, this.eJL) + f.a.a.a.fQ(16, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rTf);
      }
      i = paramInt;
      if (this.rTg != null) {
        i = paramInt + f.a.a.b.b.a.h(18, this.rTg);
      }
      paramInt = i;
      if (this.rKZ != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.rKZ);
      }
      i = paramInt;
      if (this.rTh != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.rTh);
      }
      i = i + f.a.a.a.fQ(21, this.rTi) + f.a.a.a.fQ(22, this.eJO) + f.a.a.a.fQ(23, this.eJN);
      paramInt = i;
      if (this.eJP != null) {
        paramInt = i + f.a.a.b.b.a.h(24, this.eJP);
      }
      i = paramInt;
      if (this.eJM != null) {
        i = paramInt + f.a.a.b.b.a.h(25, this.eJM);
      }
      paramInt = i;
      if (this.rTk != null) {
        paramInt = i + f.a.a.a.fS(26, this.rTk.boi());
      }
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + f.a.a.b.b.a.h(27, this.eJQ);
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(28, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(29, this.rra);
      }
      paramInt = i;
      if (this.eJR != null) {
        paramInt = i + f.a.a.b.b.a.h(30, this.eJR);
      }
      i = paramInt;
      if (this.rTl != null) {
        i = paramInt + f.a.a.a.fS(31, this.rTl.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rvi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.rQz == null) {
          throw new b("Not all required fields were included: NickName");
        }
        if (this.ruT == null) {
          throw new b("Not all required fields were included: PYInitial");
        }
        if (this.ruU == null) {
          throw new b("Not all required fields were included: QuanPin");
        }
        if (this.rcn == null) {
          throw new b("Not all required fields were included: ImgBuf");
        }
        if (this.rWH == null) {
          throw new b("Not all required fields were included: Remark");
        }
        if (this.rWI == null) {
          throw new b("Not all required fields were included: RemarkPYInitial");
        }
        if (this.rWJ != null) {
          break;
        }
        throw new b("Not all required fields were included: RemarkQuanPin");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        atz localatz = (atz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rvi = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rQz = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.ruT = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.ruU = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localatz.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          localatz.rWZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rWH = ((bhz)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rWI = ((bhz)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rWJ = ((bhz)localObject1);
            paramInt += 1;
          }
        case 11: 
          localatz.rup = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localatz.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localatz.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localatz.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localatz.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localatz.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localatz.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 18: 
          localatz.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localatz.rKZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localatz.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localatz.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localatz.eJO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localatz.eJN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 24: 
          localatz.eJP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 25: 
          localatz.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 26: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localatz.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 27: 
          localatz.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 28: 
          localatz.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 29: 
          localatz.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 30: 
          localatz.eJR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qt();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localatz.rTl = ((qt)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/atz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */