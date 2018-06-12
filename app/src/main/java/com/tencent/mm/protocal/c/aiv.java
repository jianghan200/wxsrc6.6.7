package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aiv
  extends bhp
{
  public int rLA;
  public LinkedList<bhz> rLB = new LinkedList();
  public String rLC;
  public int rLD;
  public String rLE;
  public int rLF;
  public bhy rLG;
  public int rLw;
  public String rLx;
  public int rLy;
  public String rLz;
  
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
      paramVarArgs.fT(2, this.rLw);
      if (this.rLx != null) {
        paramVarArgs.g(3, this.rLx);
      }
      paramVarArgs.fT(4, this.rLy);
      if (this.rLz != null) {
        paramVarArgs.g(5, this.rLz);
      }
      paramVarArgs.fT(6, this.rLA);
      paramVarArgs.d(7, 8, this.rLB);
      if (this.rLC != null) {
        paramVarArgs.g(8, this.rLC);
      }
      paramVarArgs.fT(9, this.rLD);
      if (this.rLE != null) {
        paramVarArgs.g(10, this.rLE);
      }
      paramVarArgs.fT(11, this.rLF);
      if (this.rLG != null)
      {
        paramVarArgs.fV(12, this.rLG.boi());
        this.rLG.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1014;
      }
    }
    label1014:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rLw);
      paramInt = i;
      if (this.rLx != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rLx);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rLy);
      paramInt = i;
      if (this.rLz != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rLz);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rLA) + f.a.a.a.c(7, 8, this.rLB);
      paramInt = i;
      if (this.rLC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rLC);
      }
      i = paramInt + f.a.a.a.fQ(9, this.rLD);
      paramInt = i;
      if (this.rLE != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rLE);
      }
      i = paramInt + f.a.a.a.fQ(11, this.rLF);
      paramInt = i;
      if (this.rLG != null) {
        paramInt = i + f.a.a.a.fS(12, this.rLG.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rLB.clear();
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
        aiv localaiv = (aiv)paramVarArgs[1];
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
            localaiv.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaiv.rLw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaiv.rLx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaiv.rLy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaiv.rLz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaiv.rLA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaiv.rLB.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localaiv.rLC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaiv.rLD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localaiv.rLE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localaiv.rLF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localaiv.rLG = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */