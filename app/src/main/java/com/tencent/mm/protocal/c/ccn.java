package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ccn
  extends com.tencent.mm.bk.a
{
  public String rhV;
  public String rhW;
  public bhy rhZ;
  public String syo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rhZ == null) {
        throw new b("Not all required fields were included: KSid");
      }
      if (this.rhV != null) {
        paramVarArgs.g(1, this.rhV);
      }
      if (this.rhW != null) {
        paramVarArgs.g(2, this.rhW);
      }
      if (this.syo != null) {
        paramVarArgs.g(3, this.syo);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(4, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rhV == null) {
        break label470;
      }
    }
    label470:
    for (int i = f.a.a.b.b.a.h(1, this.rhV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhW != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rhW);
      }
      i = paramInt;
      if (this.syo != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.syo);
      }
      paramInt = i;
      if (this.rhZ != null) {
        paramInt = i + f.a.a.a.fS(4, this.rhZ.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rhZ != null) {
          break;
        }
        throw new b("Not all required fields were included: KSid");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ccn localccn = (ccn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localccn.rhV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localccn.rhW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localccn.syo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localccn.rhZ = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ccn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */