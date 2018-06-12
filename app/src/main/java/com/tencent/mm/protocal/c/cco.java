package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cco
  extends com.tencent.mm.bk.a
{
  public bhy rcn;
  public String rhV;
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
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.syo != null) {
        paramVarArgs.g(1, this.syo);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(2, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      if (this.rhV != null) {
        paramVarArgs.g(3, this.rhV);
      }
      if (this.rcn != null)
      {
        paramVarArgs.fV(4, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.syo == null) {
        break label596;
      }
    }
    label596:
    for (int i = f.a.a.b.b.a.h(1, this.syo) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhZ != null) {
        paramInt = i + f.a.a.a.fS(2, this.rhZ.boi());
      }
      i = paramInt;
      if (this.rhV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhV);
      }
      paramInt = i;
      if (this.rcn != null) {
        paramInt = i + f.a.a.a.fS(4, this.rcn.boi());
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
        if (this.rhZ == null) {
          throw new b("Not all required fields were included: KSid");
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cco localcco = (cco)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcco.syo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcco.rhZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localcco.rhV = ((f.a.a.a.a)localObject1).vHC.readString();
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
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localcco.rcn = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */