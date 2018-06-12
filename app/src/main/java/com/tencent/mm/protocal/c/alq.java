package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class alq
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public int huV;
  public String hwg;
  public String hyz;
  public alp rIy;
  public boolean rOf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hwg != null) {
        paramVarArgs.g(1, this.hwg);
      }
      if (this.hyz != null) {
        paramVarArgs.g(2, this.hyz);
      }
      if (this.bWP != null) {
        paramVarArgs.g(3, this.bWP);
      }
      paramVarArgs.av(4, this.rOf);
      paramVarArgs.fT(5, this.huV);
      if (this.rIy != null)
      {
        paramVarArgs.fV(6, this.rIy.boi());
        this.rIy.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hwg == null) {
        break label509;
      }
    }
    label509:
    for (int i = f.a.a.b.b.a.h(1, this.hwg) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hyz != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hyz);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWP);
      }
      i = i + (f.a.a.b.b.a.ec(4) + 1) + f.a.a.a.fQ(5, this.huV);
      paramInt = i;
      if (this.rIy != null) {
        paramInt = i + f.a.a.a.fS(6, this.rIy.boi());
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        alq localalq = (alq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localalq.hwg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localalq.hyz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localalq.bWP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localalq.rOf = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 5: 
          localalq.huV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alp();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((alp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localalq.rIy = ((alp)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/alq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */