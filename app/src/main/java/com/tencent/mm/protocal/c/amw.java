package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class amw
  extends com.tencent.mm.bk.a
{
  public int rPC;
  public amz rPD;
  public amy rPE;
  public amx rPF;
  public amv rPG;
  public ana rPH;
  public anb rPI;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rPC);
      if (this.rPD != null)
      {
        paramVarArgs.fV(2, this.rPD.boi());
        this.rPD.a(paramVarArgs);
      }
      if (this.rPE != null)
      {
        paramVarArgs.fV(3, this.rPE.boi());
        this.rPE.a(paramVarArgs);
      }
      if (this.rPF != null)
      {
        paramVarArgs.fV(4, this.rPF.boi());
        this.rPF.a(paramVarArgs);
      }
      if (this.rPG != null)
      {
        paramVarArgs.fV(5, this.rPG.boi());
        this.rPG.a(paramVarArgs);
      }
      if (this.rPH != null)
      {
        paramVarArgs.fV(6, this.rPH.boi());
        this.rPH.a(paramVarArgs);
      }
      if (this.rPI != null)
      {
        paramVarArgs.fV(7, this.rPI.boi());
        this.rPI.a(paramVarArgs);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rPC) + 0;
      paramInt = i;
      if (this.rPD != null) {
        paramInt = i + f.a.a.a.fS(2, this.rPD.boi());
      }
      i = paramInt;
      if (this.rPE != null) {
        i = paramInt + f.a.a.a.fS(3, this.rPE.boi());
      }
      paramInt = i;
      if (this.rPF != null) {
        paramInt = i + f.a.a.a.fS(4, this.rPF.boi());
      }
      i = paramInt;
      if (this.rPG != null) {
        i = paramInt + f.a.a.a.fS(5, this.rPG.boi());
      }
      paramInt = i;
      if (this.rPH != null) {
        paramInt = i + f.a.a.a.fS(6, this.rPH.boi());
      }
      i = paramInt;
    } while (this.rPI == null);
    return paramInt + f.a.a.a.fS(7, this.rPI.boi());
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
      amw localamw = (amw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localamw.rPC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamw.rPD = ((amz)localObject1);
          paramInt += 1;
        }
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamw.rPE = ((amy)localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamw.rPF = ((amx)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amv();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamw.rPG = ((amv)localObject1);
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
          localObject1 = new ana();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ana)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localamw.rPH = ((ana)localObject1);
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
        localObject1 = new anb();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((anb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localamw.rPI = ((anb)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/amw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */