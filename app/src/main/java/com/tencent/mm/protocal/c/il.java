package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class il
  extends bhd
{
  public int otY;
  public int rgC;
  public int rhX;
  public bhy rjA;
  public int rjB;
  public int rjC;
  public int rjD;
  public int rjE;
  public int rjz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rjA == null) {
        throw new b("Not all required fields were included: ImageBuffer");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rjz);
      if (this.rjA != null)
      {
        paramVarArgs.fV(3, this.rjA.boi());
        this.rjA.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rjB);
      paramVarArgs.fT(5, this.rjC);
      paramVarArgs.fT(6, this.rgC);
      paramVarArgs.fT(7, this.rjD);
      paramVarArgs.fT(8, this.rhX);
      paramVarArgs.fT(9, this.rjE);
      paramVarArgs.fT(10, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label762;
      }
    }
    label762:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rjz);
      paramInt = i;
      if (this.rjA != null) {
        paramInt = i + f.a.a.a.fS(3, this.rjA.boi());
      }
      return paramInt + f.a.a.a.fQ(4, this.rjB) + f.a.a.a.fQ(5, this.rjC) + f.a.a.a.fQ(6, this.rgC) + f.a.a.a.fQ(7, this.rjD) + f.a.a.a.fQ(8, this.rhX) + f.a.a.a.fQ(9, this.rjE) + f.a.a.a.fQ(10, this.otY);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rjA != null) {
          break;
        }
        throw new b("Not all required fields were included: ImageBuffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        il localil = (il)paramVarArgs[1];
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
            localil.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localil.rjz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localil.rjA = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localil.rjB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localil.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localil.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localil.rjD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localil.rhX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localil.rjE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localil.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */