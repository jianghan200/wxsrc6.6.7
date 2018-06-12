package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class adg
  extends bhd
{
  public int otY;
  public int rHA;
  public bhy rcT;
  public int rgA;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcT == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rcT != null)
      {
        paramVarArgs.fV(2, this.rcT.boi());
        this.rcT.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.rgA);
      paramVarArgs.fT(4, this.otY);
      paramVarArgs.fT(5, this.rHA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label563;
      }
    }
    label563:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcT != null) {
        i = paramInt + f.a.a.a.fS(2, this.rcT.boi());
      }
      return i + f.a.a.a.fQ(3, this.rgA) + f.a.a.a.fQ(4, this.otY) + f.a.a.a.fQ(5, this.rHA);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcT != null) {
          break;
        }
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        adg localadg = (adg)paramVarArgs[1];
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
            localadg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localadg.rcT = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localadg.rgA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localadg.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localadg.rHA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/adg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */