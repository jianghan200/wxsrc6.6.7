package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cbt
  extends com.tencent.mm.bk.a
{
  public cbp sxR;
  public cbf sxS;
  public String sxT;
  public String sxU;
  public String sxV;
  public int sxW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxR != null)
      {
        paramVarArgs.fV(1, this.sxR.boi());
        this.sxR.a(paramVarArgs);
      }
      if (this.sxS != null)
      {
        paramVarArgs.fV(2, this.sxS.boi());
        this.sxS.a(paramVarArgs);
      }
      if (this.sxT != null) {
        paramVarArgs.g(3, this.sxT);
      }
      if (this.sxU != null) {
        paramVarArgs.g(4, this.sxU);
      }
      if (this.sxV != null) {
        paramVarArgs.g(5, this.sxV);
      }
      paramVarArgs.fT(6, this.sxW);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxR == null) {
        break label622;
      }
    }
    label622:
    for (int i = f.a.a.a.fS(1, this.sxR.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sxS != null) {
        paramInt = i + f.a.a.a.fS(2, this.sxS.boi());
      }
      i = paramInt;
      if (this.sxT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sxT);
      }
      paramInt = i;
      if (this.sxU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sxU);
      }
      i = paramInt;
      if (this.sxV != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sxV);
      }
      return i + f.a.a.a.fQ(6, this.sxW);
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
        cbt localcbt = (cbt)paramVarArgs[1];
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
            localObject1 = new cbp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcbt.sxR = ((cbp)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cbf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcbt.sxS = ((cbf)localObject1);
            paramInt += 1;
          }
        case 3: 
          localcbt.sxT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localcbt.sxU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localcbt.sxV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localcbt.sxW = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */