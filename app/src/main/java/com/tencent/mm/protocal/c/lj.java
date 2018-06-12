package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class lj
  extends com.tencent.mm.bk.a
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
      if (this.roC != null)
      {
        paramVarArgs.fV(1, this.roC.boi());
        this.roC.a(paramVarArgs);
      }
      if (this.roD != null)
      {
        paramVarArgs.fV(2, this.roD.boi());
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
      if (this.roC == null) {
        break label1355;
      }
    }
    label1355:
    for (int i = f.a.a.a.fS(1, this.roC.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.roD != null) {
        paramInt = i + f.a.a.a.fS(2, this.roD.boi());
      }
      i = paramInt;
      if (this.roE != null) {
        i = paramInt + f.a.a.a.fS(4, this.roE.boi());
      }
      paramInt = i;
      if (this.roF != null) {
        paramInt = i + f.a.a.a.fS(5, this.roF.boi());
      }
      i = paramInt;
      if (this.roG != null) {
        i = paramInt + f.a.a.a.fS(6, this.roG.boi());
      }
      paramInt = i;
      if (this.roH != null) {
        paramInt = i + f.a.a.a.fS(7, this.roH.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.roI);
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
        lj locallj = (lj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new kg();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roC = ((kg)localObject1);
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
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roD = ((kg)localObject1);
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
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roE = ((kg)localObject1);
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roF = ((bhy)localObject1);
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roG = ((bhy)localObject1);
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
            for (bool = true; bool; bool = ((kg)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roH = ((kg)localObject1);
            paramInt += 1;
          }
        case 8: 
          locallj.roI = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((kf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locallj.roJ = ((kf)localObject1);
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
          for (bool = true; bool; bool = ((kf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locallj.roK = ((kf)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/lj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */