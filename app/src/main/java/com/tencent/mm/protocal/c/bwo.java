package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bwo
  extends bhd
{
  public double altitude;
  public int bjj;
  public double latitude;
  public double longitude;
  public double ssO;
  public double ssP;
  
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
      paramVarArgs.c(2, this.latitude);
      paramVarArgs.c(3, this.longitude);
      paramVarArgs.c(4, this.altitude);
      paramVarArgs.c(5, this.ssO);
      paramVarArgs.c(6, this.ssP);
      paramVarArgs.fT(7, this.bjj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label491;
      }
    }
    label491:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      return paramInt + (f.a.a.b.b.a.ec(2) + 8) + (f.a.a.b.b.a.ec(3) + 8) + (f.a.a.b.b.a.ec(4) + 8) + (f.a.a.b.b.a.ec(5) + 8) + (f.a.a.b.b.a.ec(6) + 8) + f.a.a.a.fQ(7, this.bjj);
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
        bwo localbwo = (bwo)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwo.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwo.latitude = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 3: 
          localbwo.longitude = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 4: 
          localbwo.altitude = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 5: 
          localbwo.ssO = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 6: 
          localbwo.ssP = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        }
        localbwo.bjj = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */