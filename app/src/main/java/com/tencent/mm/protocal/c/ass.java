package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ass
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public sx reZ;
  public bhy rhB;
  public String rhI;
  public String rhU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rhB == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.reZ == null) {
        throw new b("Not all required fields were included: CliPubECDHKey");
      }
      if (this.rhB != null)
      {
        paramVarArgs.fV(1, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      if (this.reZ != null)
      {
        paramVarArgs.fV(2, this.reZ.boi());
        this.reZ.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      if (this.rhI != null) {
        paramVarArgs.g(4, this.rhI);
      }
      if (this.rhU != null) {
        paramVarArgs.g(5, this.rhU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rhB == null) {
        break label651;
      }
    }
    label651:
    for (int i = f.a.a.a.fS(1, this.rhB.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.reZ != null) {
        paramInt = i + f.a.a.a.fS(2, this.reZ.boi());
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      paramInt = i;
      if (this.rhI != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhI);
      }
      i = paramInt;
      if (this.rhU != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rhU);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rhB == null) {
          throw new b("Not all required fields were included: RandomEncryKey");
        }
        if (this.reZ != null) {
          break;
        }
        throw new b("Not all required fields were included: CliPubECDHKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ass localass = (ass)paramVarArgs[1];
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
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localass.rhB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new sx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localass.reZ = ((sx)localObject1);
            paramInt += 1;
          }
        case 3: 
          localass.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localass.rhI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localass.rhU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */