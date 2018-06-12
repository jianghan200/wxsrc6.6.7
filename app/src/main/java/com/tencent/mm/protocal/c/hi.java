package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class hi
  extends bhd
{
  public bhy rgk;
  public String rhA;
  public String rhI;
  public int rhT;
  public String rhU;
  public String rhV;
  public String rhW;
  public int rhX;
  public bhz rhY;
  public bhy rhZ;
  public String rhz;
  public int ria;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rhT);
      if (this.rhI != null) {
        paramVarArgs.g(3, this.rhI);
      }
      if (this.rhU != null) {
        paramVarArgs.g(4, this.rhU);
      }
      if (this.rhV != null) {
        paramVarArgs.g(5, this.rhV);
      }
      if (this.rhW != null) {
        paramVarArgs.g(6, this.rhW);
      }
      paramVarArgs.fT(7, this.rhX);
      if (this.rhY != null)
      {
        paramVarArgs.fV(8, this.rhY.boi());
        this.rhY.a(paramVarArgs);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(9, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.ria);
      if (this.rhz != null) {
        paramVarArgs.g(11, this.rhz);
      }
      if (this.rhA != null) {
        paramVarArgs.g(12, this.rhA);
      }
      if (this.rgk != null)
      {
        paramVarArgs.fV(13, this.rgk.boi());
        this.rgk.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1175;
      }
    }
    label1175:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rhT);
      paramInt = i;
      if (this.rhI != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rhI);
      }
      i = paramInt;
      if (this.rhU != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rhU);
      }
      paramInt = i;
      if (this.rhV != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rhV);
      }
      i = paramInt;
      if (this.rhW != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rhW);
      }
      i += f.a.a.a.fQ(7, this.rhX);
      paramInt = i;
      if (this.rhY != null) {
        paramInt = i + f.a.a.a.fS(8, this.rhY.boi());
      }
      i = paramInt;
      if (this.rhZ != null) {
        i = paramInt + f.a.a.a.fS(9, this.rhZ.boi());
      }
      i += f.a.a.a.fQ(10, this.ria);
      paramInt = i;
      if (this.rhz != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rhz);
      }
      i = paramInt;
      if (this.rhA != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rhA);
      }
      paramInt = i;
      if (this.rgk != null) {
        paramInt = i + f.a.a.a.fS(13, this.rgk.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        hi localhi = (hi)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localhi.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhi.rhT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localhi.rhI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localhi.rhU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localhi.rhV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localhi.rhW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localhi.rhX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localhi.rhY = ((bhz)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localhi.rhZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 10: 
          localhi.ria = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localhi.rhz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localhi.rhA = ((f.a.a.a.a)localObject1).vHC.readString();
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
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localhi.rgk = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */