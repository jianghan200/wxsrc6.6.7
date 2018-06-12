package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class biy
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
  public String rEJ;
  public bhz rQz;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public bqd rTk;
  public qt rTl;
  public bhy rcn;
  public String rqZ;
  public String rra;
  public bhz ruT;
  public bhz ruU;
  public bhz rvi;
  public int sjj;
  
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
      if (this.eJI != null) {
        paramVarArgs.g(7, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(8, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(9, this.eJK);
      }
      paramVarArgs.fT(10, this.eJL);
      paramVarArgs.fT(11, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(12, this.rTf);
      }
      if (this.rTg != null) {
        paramVarArgs.g(13, this.rTg);
      }
      if (this.eJM != null) {
        paramVarArgs.g(14, this.eJM);
      }
      if (this.rTh != null) {
        paramVarArgs.g(15, this.rTh);
      }
      paramVarArgs.fT(16, this.rTi);
      paramVarArgs.fT(17, this.eJO);
      paramVarArgs.fT(18, this.eJN);
      if (this.eJP != null) {
        paramVarArgs.g(19, this.eJP);
      }
      if (this.rTk != null)
      {
        paramVarArgs.fV(20, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(21, this.eJQ);
      }
      if (this.eJR != null) {
        paramVarArgs.g(22, this.eJR);
      }
      if (this.rTl != null)
      {
        paramVarArgs.fV(23, this.rTl.boi());
        this.rTl.a(paramVarArgs);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(24, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(25, this.rra);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(26, this.rEJ);
      }
      paramVarArgs.fT(27, this.sjj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rvi == null) {
        break label2347;
      }
    }
    label2347:
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
      i = paramInt;
      if (this.eJI != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.eJI);
      }
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.eJJ);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.eJK);
      }
      i = i + f.a.a.a.fQ(10, this.eJL) + f.a.a.a.fQ(11, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rTf);
      }
      i = paramInt;
      if (this.rTg != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rTg);
      }
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.eJM);
      }
      i = paramInt;
      if (this.rTh != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.rTh);
      }
      i = i + f.a.a.a.fQ(16, this.rTi) + f.a.a.a.fQ(17, this.eJO) + f.a.a.a.fQ(18, this.eJN);
      paramInt = i;
      if (this.eJP != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.eJP);
      }
      i = paramInt;
      if (this.rTk != null) {
        i = paramInt + f.a.a.a.fS(20, this.rTk.boi());
      }
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.eJQ);
      }
      i = paramInt;
      if (this.eJR != null) {
        i = paramInt + f.a.a.b.b.a.h(22, this.eJR);
      }
      paramInt = i;
      if (this.rTl != null) {
        paramInt = i + f.a.a.a.fS(23, this.rTl.boi());
      }
      i = paramInt;
      if (this.rqZ != null) {
        i = paramInt + f.a.a.b.b.a.h(24, this.rqZ);
      }
      paramInt = i;
      if (this.rra != null) {
        paramInt = i + f.a.a.b.b.a.h(25, this.rra);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(26, this.rEJ);
      }
      return i + f.a.a.a.fQ(27, this.sjj);
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
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        biy localbiy = (biy)paramVarArgs[1];
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
            localbiy.rvi = ((bhz)localObject1);
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
            localbiy.rQz = ((bhz)localObject1);
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
            localbiy.ruT = ((bhz)localObject1);
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
            localbiy.ruU = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbiy.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
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
            localbiy.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          localbiy.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbiy.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbiy.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbiy.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbiy.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbiy.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbiy.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbiy.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbiy.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localbiy.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localbiy.eJO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localbiy.eJN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localbiy.eJP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbiy.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 21: 
          localbiy.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localbiy.eJR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbiy.rTl = ((qt)localObject1);
            paramInt += 1;
          }
        case 24: 
          localbiy.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 25: 
          localbiy.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 26: 
          localbiy.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbiy.sjj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/biy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */