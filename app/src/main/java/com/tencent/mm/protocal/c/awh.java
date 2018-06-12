package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class awh
  extends bhd
{
  public String rZC;
  public String rZD;
  public bhy rjA;
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
      paramVarArgs.fT(4, this.rjD);
      if (this.rZC != null) {
        paramVarArgs.g(5, this.rZC);
      }
      if (this.rZD != null) {
        paramVarArgs.g(6, this.rZD);
      }
      paramVarArgs.fT(7, this.rjE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label681;
      }
    }
    label681:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rjz);
      paramInt = i;
      if (this.rjA != null) {
        paramInt = i + f.a.a.a.fS(3, this.rjA.boi());
      }
      i = paramInt + f.a.a.a.fQ(4, this.rjD);
      paramInt = i;
      if (this.rZC != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rZC);
      }
      i = paramInt;
      if (this.rZD != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rZD);
      }
      return i + f.a.a.a.fQ(7, this.rjE);
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
        awh localawh = (awh)paramVarArgs[1];
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
            localawh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localawh.rjz = ((f.a.a.a.a)localObject1).vHC.rY();
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
            localawh.rjA = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localawh.rjD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localawh.rZC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localawh.rZD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localawh.rjE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/awh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */