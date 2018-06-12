package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class abc
  extends bhp
{
  public kg roC;
  public kg roD;
  public kg roE;
  public bhy roF;
  public bhy roG;
  public kg roH;
  public int roI;
  public kf roJ;
  public kf roK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.roC == null) {
        throw new b("Not all required fields were included: DnsInfo");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.roC != null)
      {
        paramVarArgs.fV(2, this.roC.boi());
        this.roC.a(paramVarArgs);
      }
      if (this.roD != null)
      {
        paramVarArgs.fV(3, this.roD.boi());
        this.roD.a(paramVarArgs);
      }
      if (this.roE != null)
      {
        paramVarArgs.fV(4, this.roE.boi());
        this.roE.a(paramVarArgs);
      }
      if (this.roF != null)
      {
        paramVarArgs.fV(5, this.roF.boi());
        this.roF.a(paramVarArgs);
      }
      if (this.roG != null)
      {
        paramVarArgs.fV(6, this.roG.boi());
        this.roG.a(paramVarArgs);
      }
      if (this.roH != null)
      {
        paramVarArgs.fV(7, this.roH.boi());
        this.roH.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.roI);
      if (this.roJ != null)
      {
        paramVarArgs.fV(9, this.roJ.boi());
        this.roJ.a(paramVarArgs);
      }
      if (this.roK != null)
      {
        paramVarArgs.fV(10, this.roK.boi());
        this.roK.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1564;
      }
    }
    label1564:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.roC != null) {
        paramInt = i + f.a.a.a.fS(2, this.roC.boi());
      }
      i = paramInt;
      if (this.roD != null) {
        i = paramInt + f.a.a.a.fS(3, this.roD.boi());
      }
      paramInt = i;
      if (this.roE != null) {
        paramInt = i + f.a.a.a.fS(4, this.roE.boi());
      }
      i = paramInt;
      if (this.roF != null) {
        i = paramInt + f.a.a.a.fS(5, this.roF.boi());
      }
      paramInt = i;
      if (this.roG != null) {
        paramInt = i + f.a.a.a.fS(6, this.roG.boi());
      }
      i = paramInt;
      if (this.roH != null) {
        i = paramInt + f.a.a.a.fS(7, this.roH.boi());
      }
      i += f.a.a.a.fQ(8, this.roI);
      paramInt = i;
      if (this.roJ != null) {
        paramInt = i + f.a.a.a.fS(9, this.roJ.boi());
      }
      i = paramInt;
      if (this.roK != null) {
        i = paramInt + f.a.a.a.fS(10, this.roK.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.roC != null) {
          break;
        }
        throw new b("Not all required fields were included: DnsInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        abc localabc = (abc)paramVarArgs[1];
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
            localabc.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roC = ((kg)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roD = ((kg)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roE = ((kg)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roF = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roG = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roH = ((kg)localObject1);
            paramInt += 1;
          }
        case 8: 
          localabc.roI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localabc.roJ = ((kf)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localabc.roK = ((kf)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/abc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */