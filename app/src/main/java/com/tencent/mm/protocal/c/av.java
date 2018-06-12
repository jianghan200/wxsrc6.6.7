package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class av
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jPK;
  public int otY;
  public String raP;
  public String raQ;
  public String raR;
  public at raS;
  public String raT;
  public ct raU;
  public de raV;
  public dd raW;
  public dd raX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcE);
      if (this.jPK != null) {
        paramVarArgs.g(2, this.jPK);
      }
      paramVarArgs.fT(3, this.otY);
      if (this.raP != null) {
        paramVarArgs.g(4, this.raP);
      }
      if (this.raQ != null) {
        paramVarArgs.g(5, this.raQ);
      }
      if (this.raR != null) {
        paramVarArgs.g(6, this.raR);
      }
      if (this.raS != null)
      {
        paramVarArgs.fV(7, this.raS.boi());
        this.raS.a(paramVarArgs);
      }
      if (this.raT != null) {
        paramVarArgs.g(8, this.raT);
      }
      if (this.raU != null)
      {
        paramVarArgs.fV(9, this.raU.boi());
        this.raU.a(paramVarArgs);
      }
      if (this.raV != null)
      {
        paramVarArgs.fV(10, this.raV.boi());
        this.raV.a(paramVarArgs);
      }
      if (this.raW != null)
      {
        paramVarArgs.fV(11, this.raW.boi());
        this.raW.a(paramVarArgs);
      }
      if (this.raX != null)
      {
        paramVarArgs.fV(12, this.raX.boi());
        this.raX.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.hcE) + 0;
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPK);
      }
      i = paramInt + f.a.a.a.fQ(3, this.otY);
      paramInt = i;
      if (this.raP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.raP);
      }
      i = paramInt;
      if (this.raQ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.raQ);
      }
      paramInt = i;
      if (this.raR != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.raR);
      }
      i = paramInt;
      if (this.raS != null) {
        i = paramInt + f.a.a.a.fS(7, this.raS.boi());
      }
      paramInt = i;
      if (this.raT != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.raT);
      }
      i = paramInt;
      if (this.raU != null) {
        i = paramInt + f.a.a.a.fS(9, this.raU.boi());
      }
      paramInt = i;
      if (this.raV != null) {
        paramInt = i + f.a.a.a.fS(10, this.raV.boi());
      }
      i = paramInt;
      if (this.raW != null) {
        i = paramInt + f.a.a.a.fS(11, this.raW.boi());
      }
      paramInt = i;
    } while (this.raX == null);
    return i + f.a.a.a.fS(12, this.raX.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      av localav = (av)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localav.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localav.jPK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localav.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        localav.raP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localav.raQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localav.raR = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localav.raS = ((at)localObject1);
          paramInt += 1;
        }
        return 0;
      case 8: 
        localav.raT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ct();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ct)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localav.raU = ((ct)localObject1);
          paramInt += 1;
        }
        return 0;
      case 10: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new de();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((de)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localav.raV = ((de)localObject1);
          paramInt += 1;
        }
        return 0;
      case 11: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dd();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localav.raW = ((dd)localObject1);
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
        localObject1 = new dd();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((dd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localav.raX = ((dd)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */