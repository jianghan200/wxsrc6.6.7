package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bmp
  extends bhd
{
  public int qZc;
  public bhy rTr;
  public float rmr;
  public float rms;
  public int ryV;
  public String ryW;
  public String ryX;
  public int ryY;
  public int skU;
  public int skV;
  
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
      paramVarArgs.fT(8, this.skU);
      paramVarArgs.fT(9, this.skV);
      paramVarArgs.fT(10, this.ryY);
      if (this.rTr != null)
      {
        paramVarArgs.fV(11, this.rTr.boi());
        this.rTr.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label801;
      }
    }
    label801:
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
      i = i + f.a.a.a.fQ(8, this.skU) + f.a.a.a.fQ(9, this.skV) + f.a.a.a.fQ(10, this.ryY);
      paramInt = i;
      if (this.rTr != null) {
        paramInt = i + f.a.a.a.fS(11, this.rTr.boi());
      }
      return paramInt;
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
        bmp localbmp = (bmp)paramVarArgs[1];
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
            localbmp.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbmp.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbmp.rmr = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 4: 
          localbmp.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 5: 
          localbmp.ryV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbmp.ryW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbmp.ryX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbmp.skU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbmp.skV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbmp.ryY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbmp.rTr = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */