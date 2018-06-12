package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bgt
  extends bhd
{
  public String cac;
  public String huU;
  public double latitude;
  public double longitude;
  public int shE;
  
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
      paramVarArgs.c(2, this.longitude);
      paramVarArgs.c(3, this.latitude);
      paramVarArgs.fT(4, this.shE);
      if (this.huU != null) {
        paramVarArgs.g(5, this.huU);
      }
      if (this.cac != null) {
        paramVarArgs.g(6, this.cac);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label496;
      }
    }
    label496:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 8) + (f.a.a.b.b.a.ec(3) + 8) + f.a.a.a.fQ(4, this.shE);
      paramInt = i;
      if (this.huU != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.huU);
      }
      i = paramInt;
      if (this.cac != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.cac);
      }
      return i;
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
        bgt localbgt = (bgt)paramVarArgs[1];
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
            localbgt.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbgt.longitude = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 3: 
          localbgt.latitude = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 4: 
          localbgt.shE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbgt.huU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbgt.cac = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */