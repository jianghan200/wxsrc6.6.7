package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bmk
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public String eJQ;
  public String eJR;
  public String hbL;
  public String hcS;
  public String rEJ;
  public String rKZ;
  public String rTd;
  public int rTe;
  public String rTf;
  public String rTg;
  public String rTh;
  public int rTi;
  public int rTj;
  public bqd rTk;
  public qt rTl;
  public int rcm;
  public String rqZ;
  public String rra;
  public int skC;
  public bhy skD;
  public int skE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.skD == null) {
        throw new b("Not all required fields were included: ImgBuffer");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.eJI != null) {
        paramVarArgs.g(3, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(4, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(5, this.eJK);
      }
      if (this.rTd != null) {
        paramVarArgs.g(6, this.rTd);
      }
      paramVarArgs.fT(7, this.eJH);
      paramVarArgs.fT(8, this.rcm);
      paramVarArgs.fT(9, this.skC);
      if (this.skD != null)
      {
        paramVarArgs.fV(10, this.skD.boi());
        this.skD.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.skE);
      if (this.rTg != null) {
        paramVarArgs.g(12, this.rTg);
      }
      if (this.rTh != null) {
        paramVarArgs.g(13, this.rTh);
      }
      paramVarArgs.fT(14, this.rTi);
      paramVarArgs.fT(15, this.rTe);
      if (this.rTf != null) {
        paramVarArgs.g(16, this.rTf);
      }
      if (this.rKZ != null) {
        paramVarArgs.g(17, this.rKZ);
      }
      paramVarArgs.fT(21, this.rTj);
      if (this.rTk != null)
      {
        paramVarArgs.fV(22, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(23, this.eJQ);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(24, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(25, this.rra);
      }
      if (this.eJR != null) {
        paramVarArgs.g(26, this.eJR);
      }
      if (this.rTl != null)
      {
        paramVarArgs.fV(27, this.rTl.boi());
        this.rTl.a(paramVarArgs);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(28, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label1745;
      }
    }
    label1745:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.eJI != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eJI);
      }
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.eJJ);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eJK);
      }
      paramInt = i;
      if (this.rTd != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rTd);
      }
      i = paramInt + f.a.a.a.fQ(7, this.eJH) + f.a.a.a.fQ(8, this.rcm) + f.a.a.a.fQ(9, this.skC);
      paramInt = i;
      if (this.skD != null) {
        paramInt = i + f.a.a.a.fS(10, this.skD.boi());
      }
      i = paramInt + f.a.a.a.fQ(11, this.skE);
      paramInt = i;
      if (this.rTg != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rTg);
      }
      i = paramInt;
      if (this.rTh != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.rTh);
      }
      i = i + f.a.a.a.fQ(14, this.rTi) + f.a.a.a.fQ(15, this.rTe);
      paramInt = i;
      if (this.rTf != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rTf);
      }
      i = paramInt;
      if (this.rKZ != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.rKZ);
      }
      i += f.a.a.a.fQ(21, this.rTj);
      paramInt = i;
      if (this.rTk != null) {
        paramInt = i + f.a.a.a.fS(22, this.rTk.boi());
      }
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + f.a.a.b.b.a.h(23, this.eJQ);
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(24, this.rqZ);
      }
      i = paramInt;
      if (this.rra != null) {
        i = paramInt + f.a.a.b.b.a.h(25, this.rra);
      }
      paramInt = i;
      if (this.eJR != null) {
        paramInt = i + f.a.a.b.b.a.h(26, this.eJR);
      }
      i = paramInt;
      if (this.rTl != null) {
        i = paramInt + f.a.a.a.fS(27, this.rTl.boi());
      }
      paramInt = i;
      if (this.rEJ != null) {
        paramInt = i + f.a.a.b.b.a.h(28, this.rEJ);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.skD != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bmk localbmk = (bmk)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 18: 
        case 19: 
        case 20: 
        default: 
          return -1;
        case 1: 
          localbmk.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbmk.hcS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbmk.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbmk.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbmk.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbmk.rTd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbmk.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbmk.rcm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbmk.skC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbmk.skD = ((bhy)localObject1);
            paramInt += 1;
          }
        case 11: 
          localbmk.skE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbmk.rTg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbmk.rTh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbmk.rTi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localbmk.rTe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localbmk.rTf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localbmk.rKZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localbmk.rTj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbmk.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 23: 
          localbmk.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 24: 
          localbmk.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 25: 
          localbmk.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 26: 
          localbmk.eJR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 27: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbmk.rTl = ((qt)localObject1);
            paramInt += 1;
          }
        }
        localbmk.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */