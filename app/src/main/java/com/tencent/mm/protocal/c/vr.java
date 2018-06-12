package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class vr
  extends bhd
{
  public int qZc;
  public float rmr;
  public float rms;
  public String rwj;
  public String ryU;
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
      if (this.ryU != null) {
        paramVarArgs.g(3, this.ryU);
      }
      paramVarArgs.l(4, this.rmr);
      paramVarArgs.l(5, this.rms);
      paramVarArgs.fT(6, this.ryV);
      if (this.ryW != null) {
        paramVarArgs.g(7, this.ryW);
      }
      if (this.ryX != null) {
        paramVarArgs.g(8, this.ryX);
      }
      paramVarArgs.fT(9, this.ryY);
      if (this.rwj != null) {
        paramVarArgs.g(10, this.rwj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label688;
      }
    }
    label688:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZc);
      paramInt = i;
      if (this.ryU != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.ryU);
      }
      i = paramInt + (f.a.a.b.b.a.ec(4) + 4) + (f.a.a.b.b.a.ec(5) + 4) + f.a.a.a.fQ(6, this.ryV);
      paramInt = i;
      if (this.ryW != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ryW);
      }
      i = paramInt;
      if (this.ryX != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.ryX);
      }
      i += f.a.a.a.fQ(9, this.ryY);
      paramInt = i;
      if (this.rwj != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rwj);
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
        vr localvr = (vr)paramVarArgs[1];
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
            localvr.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localvr.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localvr.ryU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localvr.rmr = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 5: 
          localvr.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 6: 
          localvr.ryV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localvr.ryW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localvr.ryX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localvr.ryY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localvr.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */