package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ajf
  extends bhp
{
  public String bhd;
  public int iEk;
  public boolean ixG;
  public String ixv;
  public String ixx;
  public String rLQ;
  public cig rLR;
  public LinkedList<cii> rLS = new LinkedList();
  public LinkedList<cih> rLT = new LinkedList();
  public LinkedList<String> rLU = new LinkedList();
  public String rLV;
  public String rLW;
  public LinkedList<kc> rLX = new LinkedList();
  public boolean rLY;
  public LinkedList<bre> rcK = new LinkedList();
  public LinkedList<xj> rch = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rLQ == null) {
        throw new b("Not all required fields were included: coverurl");
      }
      if (this.ixx == null) {
        throw new b("Not all required fields were included: motto");
      }
      if (this.rLR == null) {
        throw new b("Not all required fields were included: rankdesc");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rLQ != null) {
        paramVarArgs.g(2, this.rLQ);
      }
      if (this.ixx != null) {
        paramVarArgs.g(3, this.ixx);
      }
      if (this.rLR != null)
      {
        paramVarArgs.fV(4, this.rLR.boi());
        this.rLR.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.rLS);
      paramVarArgs.d(6, 8, this.rLT);
      if (this.bhd != null) {
        paramVarArgs.g(7, this.bhd);
      }
      paramVarArgs.d(8, 1, this.rLU);
      if (this.rLV != null) {
        paramVarArgs.g(9, this.rLV);
      }
      if (this.rLW != null) {
        paramVarArgs.g(10, this.rLW);
      }
      paramVarArgs.d(14, 8, this.rcK);
      paramVarArgs.d(15, 8, this.rch);
      paramVarArgs.av(16, this.ixG);
      paramVarArgs.d(17, 8, this.rLX);
      paramVarArgs.av(18, this.rLY);
      paramVarArgs.fT(19, this.iEk);
      if (this.ixv != null) {
        paramVarArgs.g(20, this.ixv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1731;
      }
    }
    label1731:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rLQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rLQ);
      }
      i = paramInt;
      if (this.ixx != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ixx);
      }
      paramInt = i;
      if (this.rLR != null) {
        paramInt = i + f.a.a.a.fS(4, this.rLR.boi());
      }
      i = paramInt + f.a.a.a.c(5, 8, this.rLS) + f.a.a.a.c(6, 8, this.rLT);
      paramInt = i;
      if (this.bhd != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.bhd);
      }
      i = paramInt + f.a.a.a.c(8, 1, this.rLU);
      paramInt = i;
      if (this.rLV != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rLV);
      }
      i = paramInt;
      if (this.rLW != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rLW);
      }
      i = i + f.a.a.a.c(14, 8, this.rcK) + f.a.a.a.c(15, 8, this.rch) + (f.a.a.b.b.a.ec(16) + 1) + f.a.a.a.c(17, 8, this.rLX) + (f.a.a.b.b.a.ec(18) + 1) + f.a.a.a.fQ(19, this.iEk);
      paramInt = i;
      if (this.ixv != null) {
        paramInt = i + f.a.a.b.b.a.h(20, this.ixv);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rLS.clear();
        this.rLT.clear();
        this.rLU.clear();
        this.rcK.clear();
        this.rch.clear();
        this.rLX.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rLQ == null) {
          throw new b("Not all required fields were included: coverurl");
        }
        if (this.ixx == null) {
          throw new b("Not all required fields were included: motto");
        }
        if (this.rLR != null) {
          break;
        }
        throw new b("Not all required fields were included: rankdesc");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ajf localajf = (ajf)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 11: 
        case 12: 
        case 13: 
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
            localajf.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localajf.rLQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localajf.ixx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cig();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cig)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rLR = ((cig)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cii();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cii)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rLS.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cih();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cih)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rLT.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localajf.bhd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localajf.rLU.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 9: 
          localajf.rLV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localajf.rLW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bre();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bre)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rcK.add(localObject1);
            paramInt += 1;
          }
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rch.add(localObject1);
            paramInt += 1;
          }
        case 16: 
          localajf.ixG = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localajf.rLX.add(localObject1);
            paramInt += 1;
          }
        case 18: 
          localajf.rLY = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 19: 
          localajf.iEk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localajf.ixv = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ajf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */