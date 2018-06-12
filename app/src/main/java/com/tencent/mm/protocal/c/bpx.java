package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bpx
  extends bhd
{
  public String jSt;
  public int qZc;
  public long snO;
  
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
      paramVarArgs.T(3, this.snO);
      if (this.jSt != null) {
        paramVarArgs.g(4, this.jSt);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZc) + f.a.a.a.S(3, this.snO);
      paramInt = i;
      if (this.jSt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSt);
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
        bpx localbpx = (bpx)paramVarArgs[1];
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
            localbpx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbpx.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbpx.snO = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbpx.jSt = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */