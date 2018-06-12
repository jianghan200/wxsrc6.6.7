package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afu
  extends bhd
{
  public int otY;
  public int qZc;
  public String rDH;
  public bhy rIW;
  public int rIY;
  public double rJG;
  public double rJH;
  public double rji;
  public double rjj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rIW == null) {
        throw new b("Not all required fields were included: Buff");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.otY);
      paramVarArgs.fT(3, this.qZc);
      if (this.rDH != null) {
        paramVarArgs.g(4, this.rDH);
      }
      if (this.rIW != null)
      {
        paramVarArgs.fV(5, this.rIW.boi());
        this.rIW.a(paramVarArgs);
      }
      paramVarArgs.c(6, this.rji);
      paramVarArgs.c(7, this.rjj);
      paramVarArgs.c(8, this.rJG);
      paramVarArgs.c(9, this.rJH);
      paramVarArgs.fT(10, this.rIY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label774;
      }
    }
    label774:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.otY) + f.a.a.a.fQ(3, this.qZc);
      paramInt = i;
      if (this.rDH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDH);
      }
      i = paramInt;
      if (this.rIW != null) {
        i = paramInt + f.a.a.a.fS(5, this.rIW.boi());
      }
      return i + (f.a.a.b.b.a.ec(6) + 8) + (f.a.a.b.b.a.ec(7) + 8) + (f.a.a.b.b.a.ec(8) + 8) + (f.a.a.b.b.a.ec(9) + 8) + f.a.a.a.fQ(10, this.rIY);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rIW != null) {
          break;
        }
        throw new b("Not all required fields were included: Buff");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        afu localafu = (afu)paramVarArgs[1];
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
            localafu.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafu.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localafu.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localafu.rDH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localafu.rIW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          localafu.rji = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 7: 
          localafu.rjj = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 8: 
          localafu.rJG = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 9: 
          localafu.rJH = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        }
        localafu.rIY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/afu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */