package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bmr
  extends bhd
{
  public int rdn;
  public int rgC;
  public float rms;
  public bhy rtW;
  public int rth;
  public int skI;
  public float skJ;
  public float skK;
  
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
      if (this.rtW != null)
      {
        paramVarArgs.fV(2, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.skI);
      paramVarArgs.fT(4, this.rgC);
      paramVarArgs.l(5, this.skJ);
      paramVarArgs.fT(6, this.rth);
      paramVarArgs.fT(7, this.rdn);
      paramVarArgs.l(8, this.skK);
      paramVarArgs.l(9, this.rms);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label715;
      }
    }
    label715:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(2, this.rtW.boi());
      }
      return i + f.a.a.a.fQ(3, this.skI) + f.a.a.a.fQ(4, this.rgC) + (f.a.a.b.b.a.ec(5) + 4) + f.a.a.a.fQ(6, this.rth) + f.a.a.a.fQ(7, this.rdn) + (f.a.a.b.b.a.ec(8) + 4) + (f.a.a.b.b.a.ec(9) + 4);
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
        bmr localbmr = (bmr)paramVarArgs[1];
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
            localbmr.shX = ((fk)localObject1);
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
            localbmr.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbmr.skI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbmr.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbmr.skJ = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 6: 
          localbmr.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbmr.rdn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbmr.skK = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        }
        localbmr.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */