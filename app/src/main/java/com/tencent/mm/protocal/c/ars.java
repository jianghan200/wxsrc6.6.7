package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ars
  extends com.tencent.mm.bk.a
{
  public String eJG;
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
  public String rTW;
  public va rTX;
  public bqd rTk;
  public qt rTl;
  public String rdS;
  public String rqZ;
  public String rra;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdS != null) {
        paramVarArgs.g(1, this.rdS);
      }
      if (this.rTW != null) {
        paramVarArgs.g(2, this.rTW);
      }
      if (this.eJG != null) {
        paramVarArgs.g(3, this.eJG);
      }
      paramVarArgs.fT(4, this.eJH);
      if (this.eJI != null) {
        paramVarArgs.g(5, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(6, this.eJJ);
      }
      if (this.eJK != null) {
        paramVarArgs.g(7, this.eJK);
      }
      paramVarArgs.fT(8, this.eJL);
      if (this.eJM != null) {
        paramVarArgs.g(9, this.eJM);
      }
      if (this.rTX != null)
      {
        paramVarArgs.fV(10, this.rTX.boi());
        this.rTX.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.eJN);
      paramVarArgs.fT(12, this.eJO);
      if (this.eJP != null) {
        paramVarArgs.g(13, this.eJP);
      }
      if (this.rTk != null)
      {
        paramVarArgs.fV(14, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(15, this.eJQ);
      }
      if (this.eJR != null) {
        paramVarArgs.g(16, this.eJR);
      }
      if (this.rTl != null)
      {
        paramVarArgs.fV(17, this.rTl.boi());
        this.rTl.a(paramVarArgs);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(20, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(21, this.rra);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(22, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdS == null) {
        break label1474;
      }
    }
    label1474:
    for (int i = f.a.a.b.b.a.h(1, this.rdS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rTW != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rTW);
      }
      i = paramInt;
      if (this.eJG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eJG);
      }
      i += f.a.a.a.fQ(4, this.eJH);
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.eJJ);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(8, this.eJL);
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.eJM);
      }
      i = paramInt;
      if (this.rTX != null) {
        i = paramInt + f.a.a.a.fS(10, this.rTX.boi());
      }
      i = i + f.a.a.a.fQ(11, this.eJN) + f.a.a.a.fQ(12, this.eJO);
      paramInt = i;
      if (this.eJP != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.eJP);
      }
      i = paramInt;
      if (this.rTk != null) {
        i = paramInt + f.a.a.a.fS(14, this.rTk.boi());
      }
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.eJQ);
      }
      i = paramInt;
      if (this.eJR != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.eJR);
      }
      paramInt = i;
      if (this.rTl != null) {
        paramInt = i + f.a.a.a.fS(17, this.rTl.boi());
      }
      i = paramInt;
      if (this.rqZ != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.rqZ);
      }
      paramInt = i;
      if (this.rra != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.rra);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(22, this.rEJ);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ars localars = (ars)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 18: 
        case 19: 
        default: 
          return -1;
        case 1: 
          localars.rdS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localars.rTW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localars.eJG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localars.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localars.eJI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localars.eJJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localars.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localars.eJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localars.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new va();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((va)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localars.rTX = ((va)localObject1);
            paramInt += 1;
          }
        case 11: 
          localars.eJN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localars.eJO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localars.eJP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localars.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 15: 
          localars.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localars.eJR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new qt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localars.rTl = ((qt)localObject1);
            paramInt += 1;
          }
        case 20: 
          localars.rqZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localars.rra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localars.rEJ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ars.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */