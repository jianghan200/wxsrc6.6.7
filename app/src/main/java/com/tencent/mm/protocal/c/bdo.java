package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bdo
  extends bhp
{
  public int balance;
  public int cej;
  public int hwV;
  public String hwW;
  public int rtK;
  public String seK;
  public String seM;
  public String sfA;
  public int sfB;
  public LinkedList<sj> sfC = new LinkedList();
  public int sfD;
  public LinkedList<sj> sfE = new LinkedList();
  public sj sfF;
  public LinkedList<sj> sfG = new LinkedList();
  public sj sfH;
  public atr sfI;
  public String sfJ;
  public int sfK;
  public String sfL;
  public int sfM;
  public boolean sfN;
  public String sfO;
  public String sfP;
  public String sfx;
  public String sfy;
  public String sfz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.fT(4, this.balance);
      if (this.sfy != null) {
        paramVarArgs.g(5, this.sfy);
      }
      if (this.sfz != null) {
        paramVarArgs.g(6, this.sfz);
      }
      if (this.sfA != null) {
        paramVarArgs.g(7, this.sfA);
      }
      paramVarArgs.fT(8, this.sfB);
      paramVarArgs.d(9, 8, this.sfC);
      paramVarArgs.fT(10, this.cej);
      paramVarArgs.fT(11, this.sfD);
      paramVarArgs.d(12, 8, this.sfE);
      if (this.seK != null) {
        paramVarArgs.g(13, this.seK);
      }
      if (this.sfF != null)
      {
        paramVarArgs.fV(14, this.sfF.boi());
        this.sfF.a(paramVarArgs);
      }
      paramVarArgs.d(15, 8, this.sfG);
      if (this.sfH != null)
      {
        paramVarArgs.fV(16, this.sfH.boi());
        this.sfH.a(paramVarArgs);
      }
      if (this.sfI != null)
      {
        paramVarArgs.fV(17, this.sfI.boi());
        this.sfI.a(paramVarArgs);
      }
      if (this.sfJ != null) {
        paramVarArgs.g(18, this.sfJ);
      }
      paramVarArgs.fT(19, this.sfK);
      if (this.sfL != null) {
        paramVarArgs.g(20, this.sfL);
      }
      if (this.sfx != null) {
        paramVarArgs.g(21, this.sfx);
      }
      paramVarArgs.fT(22, this.sfM);
      paramVarArgs.av(23, this.sfN);
      paramVarArgs.fT(24, this.rtK);
      if (this.seM != null) {
        paramVarArgs.g(25, this.seM);
      }
      if (this.sfO != null) {
        paramVarArgs.g(26, this.sfO);
      }
      if (this.sfP != null) {
        paramVarArgs.g(27, this.sfP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label2128;
      }
    }
    label2128:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.fQ(4, this.balance);
      paramInt = i;
      if (this.sfy != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sfy);
      }
      i = paramInt;
      if (this.sfz != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.sfz);
      }
      paramInt = i;
      if (this.sfA != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sfA);
      }
      i = paramInt + f.a.a.a.fQ(8, this.sfB) + f.a.a.a.c(9, 8, this.sfC) + f.a.a.a.fQ(10, this.cej) + f.a.a.a.fQ(11, this.sfD) + f.a.a.a.c(12, 8, this.sfE);
      paramInt = i;
      if (this.seK != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.seK);
      }
      i = paramInt;
      if (this.sfF != null) {
        i = paramInt + f.a.a.a.fS(14, this.sfF.boi());
      }
      i += f.a.a.a.c(15, 8, this.sfG);
      paramInt = i;
      if (this.sfH != null) {
        paramInt = i + f.a.a.a.fS(16, this.sfH.boi());
      }
      i = paramInt;
      if (this.sfI != null) {
        i = paramInt + f.a.a.a.fS(17, this.sfI.boi());
      }
      paramInt = i;
      if (this.sfJ != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.sfJ);
      }
      i = paramInt + f.a.a.a.fQ(19, this.sfK);
      paramInt = i;
      if (this.sfL != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.sfL);
      }
      i = paramInt;
      if (this.sfx != null) {
        i = paramInt + f.a.a.b.b.a.h(21, this.sfx);
      }
      i = i + f.a.a.a.fQ(22, this.sfM) + (f.a.a.b.b.a.ec(23) + 1) + f.a.a.a.fQ(24, this.rtK);
      paramInt = i;
      if (this.seM != null) {
        paramInt = i + f.a.a.b.b.a.h(25, this.seM);
      }
      i = paramInt;
      if (this.sfO != null) {
        i = paramInt + f.a.a.b.b.a.h(26, this.sfO);
      }
      paramInt = i;
      if (this.sfP != null) {
        paramInt = i + f.a.a.b.b.a.h(27, this.sfP);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sfC.clear();
        this.sfE.clear();
        this.sfG.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bdo localbdo = (bdo)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbdo.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbdo.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbdo.balance = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbdo.sfy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbdo.sfz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbdo.sfA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbdo.sfB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfC.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localbdo.cej = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbdo.sfD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfE.add(localObject1);
            paramInt += 1;
          }
        case 13: 
          localbdo.seK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfF = ((sj)localObject1);
            paramInt += 1;
          }
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfG.add(localObject1);
            paramInt += 1;
          }
        case 16: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfH = ((sj)localObject1);
            paramInt += 1;
          }
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbdo.sfI = ((atr)localObject1);
            paramInt += 1;
          }
        case 18: 
          localbdo.sfJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localbdo.sfK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localbdo.sfL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localbdo.sfx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localbdo.sfM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localbdo.sfN = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 24: 
          localbdo.rtK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          localbdo.seM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 26: 
          localbdo.sfO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbdo.sfP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */