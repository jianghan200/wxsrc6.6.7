package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class chb
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b riB;
  public LinkedList<cgy> riC = new LinkedList();
  public String spJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.spJ == null) {
        throw new f.a.a.b("Not all required fields were included: WxaUserName");
      }
      if (this.spJ != null) {
        paramVarArgs.g(1, this.spJ);
      }
      if (this.riB != null) {
        paramVarArgs.b(2, this.riB);
      }
      paramVarArgs.d(3, 8, this.riC);
      return 0;
    }
    if (paramInt == 1) {
      if (this.spJ == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = f.a.a.b.b.a.h(1, this.spJ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.riB != null) {
        i = paramInt + f.a.a.a.a(2, this.riB);
      }
      return i + f.a.a.a.c(3, 8, this.riC);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.riC.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.spJ != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: WxaUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        chb localchb = (chb)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localchb.spJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localchb.riB = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cgy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((cgy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localchb.riC.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/chb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */