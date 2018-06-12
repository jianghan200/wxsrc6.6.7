package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bxo
  extends bhd
{
  public String rFO;
  public long rFP;
  public bhy rhB;
  public String sha;
  public String shb;
  
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
      if (this.rFO != null) {
        paramVarArgs.g(2, this.rFO);
      }
      paramVarArgs.T(3, this.rFP);
      if (this.rhB != null)
      {
        paramVarArgs.fV(4, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      if (this.sha != null) {
        paramVarArgs.g(5, this.sha);
      }
      if (this.shb != null) {
        paramVarArgs.g(6, this.shb);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label626;
      }
    }
    label626:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rFO != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rFO);
      }
      i += f.a.a.a.S(3, this.rFP);
      paramInt = i;
      if (this.rhB != null) {
        paramInt = i + f.a.a.a.fS(4, this.rhB.boi());
      }
      i = paramInt;
      if (this.sha != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sha);
      }
      paramInt = i;
      if (this.shb != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.shb);
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
        bxo localbxo = (bxo)paramVarArgs[1];
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
            localbxo.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbxo.rFO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbxo.rFP = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxo.rhB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localbxo.sha = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbxo.shb = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bxo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */