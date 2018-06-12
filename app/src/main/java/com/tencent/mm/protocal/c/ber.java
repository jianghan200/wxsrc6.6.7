package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ber
  extends bhd
{
  public int qZc;
  public float rmr;
  public float rms;
  public int ryV;
  public String ryW;
  public String ryX;
  public int ryY;
  
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
      paramVarArgs.fT(2, this.qZc);
      paramVarArgs.l(3, this.rmr);
      paramVarArgs.l(4, this.rms);
      paramVarArgs.fT(5, this.ryV);
      if (this.ryW != null) {
        paramVarArgs.g(6, this.ryW);
      }
      if (this.ryX != null) {
        paramVarArgs.g(7, this.ryX);
      }
      paramVarArgs.fT(8, this.ryY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label570;
      }
    }
    label570:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZc) + (f.a.a.b.b.a.ec(3) + 4) + (f.a.a.b.b.a.ec(4) + 4) + f.a.a.a.fQ(5, this.ryV);
      paramInt = i;
      if (this.ryW != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ryW);
      }
      i = paramInt;
      if (this.ryX != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.ryX);
      }
      return i + f.a.a.a.fQ(8, this.ryY);
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
        ber localber = (ber)paramVarArgs[1];
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
            localber.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localber.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localber.rmr = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localber.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 5: 
          localber.ryV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localber.ryW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localber.ryX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localber.ryY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */