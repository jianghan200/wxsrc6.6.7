package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class arq
  extends com.tencent.mm.bk.a
{
  public LinkedList<ll> rFB = new LinkedList();
  public String rTR;
  public boolean rTS;
  public fa rTT;
  public String rTU;
  public boolean rTV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rTR != null) {
        paramVarArgs.g(1, this.rTR);
      }
      paramVarArgs.d(2, 8, this.rFB);
      paramVarArgs.av(3, this.rTS);
      if (this.rTT != null)
      {
        paramVarArgs.fV(4, this.rTT.boi());
        this.rTT.a(paramVarArgs);
      }
      if (this.rTU != null) {
        paramVarArgs.g(5, this.rTU);
      }
      paramVarArgs.av(6, this.rTV);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rTR == null) {
        break label580;
      }
    }
    label580:
    for (paramInt = f.a.a.b.b.a.h(1, this.rTR) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rFB) + (f.a.a.b.b.a.ec(3) + 1);
      paramInt = i;
      if (this.rTT != null) {
        paramInt = i + f.a.a.a.fS(4, this.rTT.boi());
      }
      i = paramInt;
      if (this.rTU != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rTU);
      }
      return i + (f.a.a.b.b.a.ec(6) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rFB.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        arq localarq = (arq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localarq.rTR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ll();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ll)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localarq.rFB.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localarq.rTS = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fa();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fa)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localarq.rTT = ((fa)localObject1);
            paramInt += 1;
          }
        case 5: 
          localarq.rTU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localarq.rTV = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/arq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */