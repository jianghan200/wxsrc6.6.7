package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aeb
  extends bhd
{
  public String hbL;
  public int rIm;
  public int rIn;
  public String rIo;
  public int rIp;
  public int rdV;
  public int rdW;
  
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
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      paramVarArgs.fT(3, this.rIm);
      paramVarArgs.fT(4, this.rIn);
      if (this.rIo != null) {
        paramVarArgs.g(5, this.rIo);
      }
      paramVarArgs.fT(6, this.rdV);
      paramVarArgs.fT(7, this.rdW);
      paramVarArgs.fT(8, this.rIp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label574;
      }
    }
    label574:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = i + f.a.a.a.fQ(3, this.rIm) + f.a.a.a.fQ(4, this.rIn);
      paramInt = i;
      if (this.rIo != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rIo);
      }
      return paramInt + f.a.a.a.fQ(6, this.rdV) + f.a.a.a.fQ(7, this.rdW) + f.a.a.a.fQ(8, this.rIp);
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
        aeb localaeb = (aeb)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaeb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaeb.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaeb.rIm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaeb.rIn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaeb.rIo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaeb.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localaeb.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaeb.rIp = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/aeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */