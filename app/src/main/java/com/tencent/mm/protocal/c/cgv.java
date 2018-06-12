package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cgv
  extends com.tencent.mm.bk.a
{
  public boolean sAJ;
  public String sAZ;
  public bnh sBa;
  public String slo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sAZ != null) {
        paramVarArgs.g(1, this.sAZ);
      }
      if (this.slo != null) {
        paramVarArgs.g(2, this.slo);
      }
      if (this.sBa != null)
      {
        paramVarArgs.fV(3, this.sBa.boi());
        this.sBa.a(paramVarArgs);
      }
      paramVarArgs.av(4, this.sAJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sAZ == null) {
        break label415;
      }
    }
    label415:
    for (int i = f.a.a.b.b.a.h(1, this.sAZ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.slo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.slo);
      }
      i = paramInt;
      if (this.sBa != null) {
        i = paramInt + f.a.a.a.fS(3, this.sBa.boi());
      }
      return i + (f.a.a.b.b.a.ec(4) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cgv localcgv = (cgv)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcgv.sAZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localcgv.slo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnh();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bnh)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcgv.sBa = ((bnh)localObject1);
            paramInt += 1;
          }
        }
        localcgv.sAJ = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */