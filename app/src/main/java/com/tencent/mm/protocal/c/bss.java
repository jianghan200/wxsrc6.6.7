package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bss
  extends bhd
{
  public int jQd;
  public String rVk;
  public int rdV;
  public int rdW;
  public bhy ruy;
  public int rvX;
  public int sde;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruy == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.jQd);
      paramVarArgs.fT(3, this.sde);
      if (this.ruy != null)
      {
        paramVarArgs.fV(4, this.ruy.boi());
        this.ruy.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rdW);
      paramVarArgs.fT(6, this.rdV);
      if (this.rVk != null) {
        paramVarArgs.g(7, this.rVk);
      }
      paramVarArgs.fT(8, this.rvX);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label704;
      }
    }
    label704:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jQd) + f.a.a.a.fQ(3, this.sde);
      paramInt = i;
      if (this.ruy != null) {
        paramInt = i + f.a.a.a.fS(4, this.ruy.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.rdW) + f.a.a.a.fQ(6, this.rdV);
      paramInt = i;
      if (this.rVk != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rVk);
      }
      return paramInt + f.a.a.a.fQ(8, this.rvX);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ruy != null) {
          break;
        }
        throw new b("Not all required fields were included: Content");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bss localbss = (bss)paramVarArgs[1];
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
            localbss.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbss.jQd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbss.sde = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbss.ruy = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbss.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbss.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbss.rVk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbss.rvX = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */