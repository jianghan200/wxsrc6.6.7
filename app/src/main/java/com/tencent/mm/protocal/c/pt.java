package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class pt
  extends bhd
{
  public String rcc;
  public int rdV;
  public int rdW;
  public int rdX;
  public bhy rtW;
  public String rtX;
  public String rtY;
  public int rtZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rcc != null) {
        paramVarArgs.g(2, this.rcc);
      }
      paramVarArgs.fT(3, this.rdV);
      paramVarArgs.fT(4, this.rdW);
      paramVarArgs.fT(5, this.rdX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(6, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      if (this.rtX != null) {
        paramVarArgs.g(7, this.rtX);
      }
      if (this.rtY != null) {
        paramVarArgs.g(9, this.rtY);
      }
      paramVarArgs.fT(10, this.rtZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label779;
      }
    }
    label779:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rcc);
      }
      i = i + f.a.a.a.fQ(3, this.rdV) + f.a.a.a.fQ(4, this.rdW) + f.a.a.a.fQ(5, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(6, this.rtW.boi());
      }
      i = paramInt;
      if (this.rtX != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rtX);
      }
      paramInt = i;
      if (this.rtY != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rtY);
      }
      return paramInt + f.a.a.a.fQ(10, this.rtZ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        pt localpt = (pt)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 8: 
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
            localpt.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localpt.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localpt.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localpt.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localpt.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localpt.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          localpt.rtX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localpt.rtY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localpt.rtZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */